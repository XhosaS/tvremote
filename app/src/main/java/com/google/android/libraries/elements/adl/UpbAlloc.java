package com.google.android.libraries.elements.adl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class UpbAlloc {
    int a;
    private ByteBuffer[] b = new ByteBuffer[10];
    private int[] c = new int[10];

    private UpbAlloc() {
        a(0);
    }

    private final synchronized void a(int i) {
        int i2 = i;
        while (true) {
            int[] iArr = this.c;
            int length = iArr.length - 1;
            if (i2 < length) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            } else {
                iArr[length] = -1;
                this.a = i;
            }
        }
    }

    static UpbAlloc create() {
        return new UpbAlloc();
    }

    synchronized int allocate(int i) {
        int i2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        if (this.a == -1) {
            int length = this.c.length;
            int i3 = length + length;
            this.b = (ByteBuffer[]) Arrays.copyOf(this.b, i3);
            this.c = new int[i3];
            a(length);
        }
        i2 = this.a;
        this.a = this.c[i2];
        this.b[i2] = byteBufferAllocateDirect;
        return i2;
    }

    synchronized void deleteByteBuffer(int i) {
        this.b[i] = null;
        this.c[i] = this.a;
        this.a = i;
    }

    synchronized ByteBuffer getByteBuffer(int i) {
        return this.b[i];
    }
}
