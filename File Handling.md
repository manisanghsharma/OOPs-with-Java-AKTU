# Java.io Package
- Java.io package is used to perform input and output (I/O) in Java.

# Stream
- A stream is a sequence of data.
- I/O represents an input stream and an output stream.
  
## Source
- Initiates the flow of data
- Also called an input stream
- We read the data from the source
- Node Stream

## Sink
- Terminates the flow of data
- Also called an output stream
- We write the data to the sink
- Node Stream

- Stream is closed after the operation is completed.

# I/O Stream
- Used to read from some output and the console
- Uses sockets to communicate with other systems

## Types of Streams

### Byte Streams
- Used to perform input and output of 8-bit bytes.
- It provides classes for the input and output of bytes.
- It is used to read and write data in the form of bytes.
- Uses the `InputStream` and `OutputStream` classes.
- Used to read files such as images, audio, video, etc.

### Character Streams
- Handles by the `Reader` and `Writer` classes.
- Used to read and write data in the form of characters (16 bits).


# Byte Streams

## Reading Data

- Uses the `read()` and `write()` methods to read and write data.

- `available()` method is used to check the number of bytes available to read.

- `skip()` method is used to skip the specified number of bytes.

## Writing Data

- `write()` method is used to write data to the output stream.

- `flush()` method is used to flush the data from the output stream.

- `close()` method is used to close the output stream.

