clean:
	rm -r bin/*

compile:
	javac -d bin src/numbers/*.java
	javac -d bin src/pingpong/*.java

run:
	java -cp bin src/Main.java

.PHONY: clean compile run