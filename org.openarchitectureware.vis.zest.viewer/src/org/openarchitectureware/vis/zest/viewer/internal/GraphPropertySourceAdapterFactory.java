package org.openarchitectureware.vis.zest.viewer.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.openarchitectureware.vis.graphmm.GraphmmFactory;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;

/**
 * An adapter factory that creates IPropertySource implementations for graphmm
 * objects. Allows us to fill Eclipse's property view with a model's user data
 * (and maybe more).
 *
 * @author DaWeber
 */
public class GraphPropertySourceAdapterFactory implements IAdapterFactory {

	/**
	 * Adapts a user data map to {@link IPropertySource}, using the provided
	 * key/value pairs.
	 *
	 * @author DaWeber
	 */
	private static final class UserData2PropertySource implements
			IPropertySource {
		private final Map<String, String> userDataMap;

		/**
		 * @param userDataMap
		 *            Will be used as property source.
		 */
		private UserData2PropertySource(Map<String, String> userDataMap) {
			this.userDataMap = userDataMap;
		}

		/**
		 * @return null as properties are read-only in this case
		 */
		public Object getEditableValue() {
			return null;
		}

		/**
		 * Creates property descriptors from the object's user data
		 *
		 * @see org.eclipse.ui.views.properties.IPropertySource#
		 *      getPropertyDescriptors()
		 */
		public IPropertyDescriptor[] getPropertyDescriptors() {
			List<PropertyDescriptor> pds = new ArrayList<PropertyDescriptor>(
					userDataMap.size());
			for (String key : userDataMap.keySet()) {
				pds.add(new PropertyDescriptor(key, toFirstUpper(key)));
			}
			return pds.toArray(PROPERTY_DESCRIPTOR_ARRAY);
		}

		private String toFirstUpper(String key) {
			if (key.length() <= 1) {
				return key.toUpperCase();
			}
			return key.substring(0, 1).toUpperCase() + key.substring(1);
		}

		public Object getPropertyValue(Object id) {
			return userDataMap.get(id);
		}

		public boolean isPropertySet(Object id) {
			return userDataMap.containsKey(id);
		}

		public void resetPropertyValue(Object id) {
			// nothing to do
		}

		public void setPropertyValue(Object id, Object value) {
			// read-only
		}
	}

	private static final IPropertyDescriptor[] PROPERTY_DESCRIPTOR_ARRAY = new IPropertyDescriptor[] {};

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 * java.lang.Class)
	 */
	public Object getAdapter(final Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (adaptableObject instanceof EObject) {
			EObject target = (EObject) adaptableObject;
			// Make sure it is a graphmm EObject
			if (GraphmmFactory.eINSTANCE.getEPackage().getEClassifiers().contains(
					target.eClass())) {
				return new UserData2PropertySource(GraphMMModelWrapper
						.getUserDataMap(target));
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	public Class<?>[] getAdapterList() {
		// this class currently only adapts to IPropertySource
		return new Class[] { IPropertySource.class };
	}
}
