# WriteString

## Overview
WriteString is a Java program designed to write a string to a file. It checks if the specified file is empty before writing to it.

## Usage
To use the WriteString program, follow these steps:
1. Compile the WriteString.java file: `javac WriteString.java`
2. Run the compiled program: `java WriteString`

## Features
- Writes a string to a file.
- Checks if the file is empty before writing to it.
- Provides feedback on the status of the file writing process.

## How it works
1. The program takes two arguments: the filename of the file to write to and the content to write.
2. It checks if the specified file is empty.
3. If the file is empty, it creates a FileOutputStream and a PrintStream.
4. It then writes the string to the file using the PrintStream.
5. Finally, it closes the streams.

## Example
```java
WriteString ws = new WriteString("f1.txt", "Hello world");
```

## Requirements
- Java Development Kit (JDK) installed
- Command-line interface for compiling and running Java programs

