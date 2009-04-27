package dataimport.platform;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public abstract class DataImporterBase {
	
	private Stack<Env> envStack = new Stack<Env>();
	
	protected List<String> readFile(String filename) throws IOException {
		List<String> lines = new ArrayList<String>();
		FileReader f = new FileReader(filename);
		BufferedReader br = new BufferedReader(f);
		while ( br.ready() ) {
			lines.add( br.readLine() );
		}
		br.close();
		f.close();
		return lines;
	}

	protected abstract void handleRoot( String current, List<String> rest);
	
	public void importFile( String filename ) throws IOException {
		List<String> lines = readFile(filename);
		envStack.push(new Env());
		while ( lines.size() > 0 ) {
			String current = lines.remove(0);
			handleRoot( current, lines );
			printAll();
		}
	}

	protected List<String> extractFields(String line) {
		String contents = line.substring(4);
		StringTokenizer st2 = new StringTokenizer(contents, ",");
		List<String> fields = new ArrayList<String>();
		while ( st2.hasMoreTokens() ) fields.add( st2.nextToken().trim() );
		return fields;
	}

	protected String extractHeader(String line) {
		return line.substring(0,4);
	}
	
	protected Env env() {
		return envStack.peek();
	}
	
	protected Env cloneAndPushEnv() {
		Env newEnv = env().cloneEnv();
		envStack.push(newEnv);
		return newEnv;
	}
	
	protected void popEnv() {
		envStack.pop();
	}
	
	public void printAll() {
		Env e = envStack.peek();
		for (DataBase d : e.getEntries()) {
			d.printTree("");
		}
	}
	
	
}
