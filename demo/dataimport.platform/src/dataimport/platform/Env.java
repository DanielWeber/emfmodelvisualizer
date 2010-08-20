package dataimport.platform;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Env {

	private Map<String, DataBase> symbols = new HashMap<String, DataBase>();
	
	public void add( String name, DataBase data ) {
		symbols.put( name, data);
	}
	
	public DataBase lookup( String name ) {
		return symbols.get(name);
	}
	
	public Env cloneEnv() {
		Env newEnv = new Env();
		for (String key : symbols.keySet()) {
			newEnv.add( key, symbols.get(key));
		}
		return newEnv;
	}
	
	public Collection<DataBase> getEntries() {
		return symbols.values();
	}
	
}
