
	    mkdir -p .
		# Please make sure that 'dot' can be found on PATH
		
			echo processing import_exp.dot ...
			%GRAPHVIZ_BIN%/dot -Tgif import_exp.dot -o ./import_exp.gif
		
	