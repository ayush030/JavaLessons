clean:
	rm -r bin/*

compile:
	javac -d bin src/numbers/*.java
	javac -d bin src/pingpong/*.java
	javac -d bin src/threadpool/*.java

run:
	java -cp bin src/Main.java $(ARGS) # ex: make run ARGS='numbers'

.PHONY: clean compile run