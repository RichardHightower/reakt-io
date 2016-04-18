package io.advantageous.nektwork;


import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * This interface is heavily influenced by the Buffer interface in Netty and Vert.x.
 * A Buffer is bytes of data from a network packet or some other stream.
 *
 * Streaming IO APIs will pass around buffers of data.
 *
 * Buffers will be implemented by libraries like Undertow, Netty, Vert.x and Conekt.
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface Buffer {

    /**
     * Returns a {@code String} representation of the Buffer with the {@code UTF-8 }encoding
     */
    String toString();

    /**
     * Returns a {@code String} representation of the Buffer with the encoding specified by {@code enc}
     */
    String toString(Charset encoding);

    /**
     * Get a byte
     *
     * @throws IndexOutOfBoundsException if position out of range.
     */
    byte getByte(int position);

    /**
     * Get unsigned byte
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    short getUnsignedByte(int position);

    /**
     * Get Int
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    int getInt(int position);

    /**
     * Get Unsigned Byte
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    long getUnsignedInt(int position);

    /**
     * Get Long.
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    long getLong(int position);

    /**
     * Get Double
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    double getDouble(int position);

    /**
     * Get Float
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    float getFloat(int position);

    /**
     * Get Short
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    short getShort(int position);

    /**
     * Get Unsigned short.
     *
     * @throws IndexOutOfBoundsException if position out of range
     */
    int getUnsignedShort(int position);

    /**
     * Gets entire buffer as byte array.
     */
    byte[] getBytes();

    /**
     * Copies a slice of the buffer.
     *
     * @param startPosition start Position byte location
     * @param endPosition   end Position byte location
     */
    byte[] getBytes(int startPosition, int endPosition);

    /**
     * @param destination the destination byte array
     * @return this, fluent API
     * @throws IndexOutOfBoundsException if the remaining can't fit into the byte array.
     */
    Buffer getBytes(byte[] destination);

    /**
     * Transfers Buffer contents into destination byte array.
     *
     * @param destination      the destination byte array
     * @param destinationIndex position into the byte array where the copy should start.
     * @return this, fluent API
     * @throws IndexOutOfBoundsException if the remaining can't fit into the destination byte array.
     */
    Buffer getBytes(byte[] destination, int destinationIndex);


    /**
     * Get Bytes.
     *
     * @param startPosition start position
     * @param endPosition   end position
     * @param destination   destination byte array
     * @return this, fluent API
     */
    Buffer getBytes(int startPosition, int endPosition, byte[] destination);

    /**
     * Transfers Buffer content starting at position and ending at the end position position endPosition - 1
     * into the destination.
     *
     */

    /**
     * @param startPosition    start position
     * @param endPosition      end position
     * @param destination      the destination byte array
     * @param destinationIndex destination index
     * @return this, fluent API
     * @throws IndexOutOfBoundsException if position out of range if the content of the Buffer cannot fit into the destination byte array
     */
    Buffer getBytes(int startPosition, int endPosition, byte[] destination, int destinationIndex);


    /**
     * Copies portion of the buffer.
     *
     * @param startPosition start position
     * @param endPosition   end position (goes to end position -1 )
     * @return this, fluent API
     */
    Buffer getBuffer(int startPosition, int endPosition);

    /**
     * Get a String
     *
     * @param startPosition start position
     * @param endPosition   end position (goes to end position -1 )
     * @param encoding      string encoding, e.g., UTF-8
     * @return this, fluent API
     */
    String getString(int startPosition, int endPosition, String encoding);

    /**
     * @param startPosition start position
     * @param endPosition   end position (goes to end position -1 )
     * @return this, fluent API
     */
    String getString(int startPosition, int endPosition);

    /**
     * Add the buffer to the end of this buffer.  The buffer expands as needed to fit the otherBuffer
     *
     * @param otherBuffer other buffer
     * @return this, fluent API
     */
    Buffer appendBuffer(Buffer otherBuffer);

    /**
     * Copy a portion of the other buffer to this buffer. Starting at offset and up the the length.
     *
     * @param otherBuffer other buffer
     * @param offset      offset into otherBuffer
     * @param length      how much of other buffer to copy into this buffer.
     * @return this, fluent API
     */
    Buffer appendBuffer(Buffer otherBuffer, int offset, int length);

    /**
     * Append bytes
     *
     * @param bytes bytes to append
     * @return this, fluent API
     */
    Buffer appendBytes(byte[] bytes);

    /**
     * Append bytes
     *
     * @param bytes  byte array to append from
     * @param offset offset into otherBuffer
     * @param length how much of other buffer to copy into this buffer.
     * @return this, fluent API
     */
    Buffer appendBytes(byte[] bytes, int offset, int length);

    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendByte(byte value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendUnsignedByte(short value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendInt(int value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendUnsignedInt(long value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendLong(long value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendShort(short value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendUnsignedShort(int value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendFloat(float value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendDouble(double value);


    /**
     * Append value to end of Buffer
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendString(String value, String encoding);


    /**
     * Append value to end of Buffer.
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer appendString(String value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setByte(int position, byte value);

    /**
     * Set value into Buffer at position.
     *
     * @param value value
     * @return this, fluent API
     */
    Buffer setUnsignedByte(int position, short value);

    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setInt(int position, int value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setUnsignedInt(int position, long value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setLong(int position, long value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setDouble(int position, double value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setFloat(int position, float value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setShort(int position, short value);


    /**
     * Set value into Buffer at position.
     *
     * @param position position into buffer
     * @param value    value
     * @return this, fluent API
     */
    Buffer setUnsignedShort(int position, int value);


    /**
     * Set string into Buffer at position.
     *
     * @param position position into buffer
     * @param string   string
     * @return this, fluent API
     */
    Buffer setString(int position, String string);

    /**
     * Set string into Buffer at position using string encoding.
     *
     * @param position position into buffer
     * @param string   string
     * @return this, fluent API
     */
    Buffer setString(int position, String string, String encoding);

    /**
     * Set other buffer into this Buffer at position..
     *
     * @param position    position into this buffer
     * @param otherBuffer other buffer
     * @return this, fluent API
     */
    Buffer setBuffer(int position, Buffer otherBuffer);


    /**
     * Set other buffer into this Buffer at position start at other buffer's offset
     * and copy as much as lenght.
     *
     * @param position    position into this buffer
     * @param otherBuffer other buffer
     * @param offset      offset into other buffer
     * @param length      length of copy
     * @return this, fluent API
     */
    Buffer setBuffer(int position, Buffer otherBuffer, int offset, int length);


    /**
     * Set buffer into this buffer at position.
     *
     * @param position   position into buffer
     * @param byteBuffer byteBuffer
     * @return this, fluent API
     */
    Buffer setBytes(int position, ByteBuffer byteBuffer);


    /**
     * Set bytes into this buffer at position.
     *
     * @param position position into buffer
     * @param bytes    bytes
     * @return this, fluent API
     */
    Buffer setBytes(int position, byte[] bytes);


    /**
     * Set byte array bytes into this Buffer at position start at offset into byte array
     * and copy as much as length.
     *
     * @param position position into this buffer
     * @param bytes    other bytes
     * @param offset   offset into other buffer
     * @param length   length of copy
     * @return this, fluent API
     */
    Buffer setBytes(int position, byte[] bytes, int offset, int length);


    /**
     * Buffer length.
     *
     * @return length
     */
    int length();

    /**
     * Returns a copy of this buffer.
     *
     * @return this, fluent API
     */
    Buffer copy();

    /**
     * Returns a copy/slice of this buffer, but changes to the copy impact this buffer.
     *
     * @return this, fluent API
     */
    Buffer slice();

    /**
     * Returns a copy/slice of this buffer from startPosition to endPosition (up to but not including).
     * Changes to the slice impact this buffer.
     *
     * @param startPosition startPosition
     * @param endPosition   end position (slice if from endPosition -1)
     * @return this, fluent API
     */
    Buffer slice(int startPosition, int endPosition);


}
