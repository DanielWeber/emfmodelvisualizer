
		@echo off
	    mkdir .
		echo Using Graphviz in path "%GRAPHVIZ_BIN%/" 
		
			echo processing import_exp.dot ...
			"%GRAPHVIZ_BIN%/dot.exe" -Tgif import_exp.dot -o ./import_exp.gif
		
	