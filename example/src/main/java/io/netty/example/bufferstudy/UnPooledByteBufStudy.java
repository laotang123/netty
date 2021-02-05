package io.netty.example.bufferstudy;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;

import java.util.Arrays;

/**
 * @author: ljf
 * @date: 2021/2/4 21:13
 * @description: 非池化bytebuf
 * @modified By：
 * @version: $ 1.0
 */
public class UnPooledByteBufStudy {
    public static void main(String[] args) {
        ByteBuf buffer = Unpooled.buffer(10);
        System.out.println(buffer);

        System.out.println(buffer.hasArray());
        buffer.writeInt(10);
        int length = buffer.readableBytes();
        System.out.println("length: " + length);

        System.out.println(length);
        System.out.println();





    }
}
