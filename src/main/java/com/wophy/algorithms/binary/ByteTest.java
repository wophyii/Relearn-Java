package com.wophy.algorithms.binary;

public class ByteTest {
    public static void main(String[] args) {
        int intNumber = 0;
        long longNumber = 123L;
        short shortNumber = 7;
        byte byteNumber = -2;

        System.out.println("int 类型: " + formatBinaryDynamic(intNumber));
        System.out.println("long 类型: " + formatBinaryDynamic(longNumber));
        System.out.println("short 类型: " + formatBinaryDynamic(shortNumber));
        System.out.println("byte 类型: " + formatBinaryDynamic(byteNumber));
    }

    public static String formatBinaryDynamic(int number) {
        int bitLength = Integer.SIZE; // int 类型是 32 位
        return String.format("%" + bitLength + "s", Integer.toBinaryString(number)).replace(' ', '0');
    }

    public static String formatBinaryDynamic(long number) {
        int bitLength = Long.SIZE; // long 类型是 64 位
        return String.format("%" + bitLength + "s", Long.toBinaryString(number)).replace(' ', '0');
    }

    public static String formatBinaryDynamic(short number) {
        int bitLength = Short.SIZE; // short 类型是 16 位
        return String.format("%" + bitLength + "s", Integer.toBinaryString(Short.toUnsignedInt(number))).replace(' ', '0');
    }

    public static String formatBinaryDynamic(byte number) {
        int bitLength = Byte.SIZE; // short 类型是 8 位
        return String.format("%" + bitLength + "s", Integer.toBinaryString(Byte.toUnsignedInt(number))).replace(' ', '0');
    }
}
