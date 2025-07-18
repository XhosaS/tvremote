package com.google.android.libraries.elements.adl;

import dalvik.annotation.optimization.CriticalNative;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpbMessage {
    public final long a;
    public final UpbMiniTable b;
    public final UpbArena c;

    public UpbMessage(long j, UpbMiniTable upbMiniTable, UpbArena upbArena) {
        this.a = j;
        this.b = upbMiniTable;
        this.c = upbArena;
    }

    public static UpbMessage a(UpbMiniTable upbMiniTable) {
        UpbArena upbArena = new UpbArena(UpbArena.jniNewInstance());
        long jJniCreate = jniCreate(upbMiniTable.a, upbArena.a);
        if (jJniCreate != 0) {
            return new UpbMessage(jJniCreate, upbMiniTable, upbArena);
        }
        throw new IllegalStateException("Failed to create upb message");
    }

    private native void jniClearExtension(long j, long j2);

    private native long jniClone(long j, long j2, long j3);

    @CriticalNative
    private static native long jniCreate(long j, long j2);

    private native void jniDecodeDirect(long j, long j2, long j3, ByteBuffer byteBuffer, int i, int i2);

    public static native long jniGetExtension(long j, long j2, long j3);

    public static native boolean jniHasExtension(long j, int i);

    private native int jniSerializedBytesHashCode(long j, long j2);

    private native void jniSetExtension(long j, long j2, long j3, long j4);

    private native void jniSetMap(long j, long j2, long j3, int i, long[] jArr);

    private native void jniSetRepeatedBool(long j, long j2, long j3, int i, boolean[] zArr);

    private native void jniSetRepeatedBytes(long j, long j2, long j3, int i, byte[][] bArr);

    private native void jniSetRepeatedDouble(long j, long j2, long j3, int i, double[] dArr);

    private native void jniSetRepeatedFloat(long j, long j2, long j3, int i, float[] fArr);

    private native void jniSetRepeatedInt32(long j, long j2, long j3, int i, int[] iArr);

    private native void jniSetRepeatedInt64(long j, long j2, long j3, int i, long[] jArr);

    private native void jniSetRepeatedPointer(long j, long j2, long j3, int i, long[] jArr);

    public final /* bridge */ /* synthetic */ Object clone() {
        UpbArena upbArena = new UpbArena(UpbArena.jniNewInstance());
        long j = upbArena.a;
        long j2 = this.a;
        UpbMiniTable upbMiniTable = this.b;
        return new UpbMessage(jniClone(j2, upbMiniTable.a, j), upbMiniTable, upbArena);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpbMessage)) {
            return false;
        }
        UpbMessage upbMessage = (UpbMessage) obj;
        if (this == upbMessage) {
            return true;
        }
        long j = this.a;
        long j2 = upbMessage.a;
        if (j == j2) {
            return true;
        }
        UpbMiniTable upbMiniTable = this.b;
        UpbArena upbArena = this.c;
        return UpbUtils.jniEquals(j, j2, upbMiniTable.a, upbArena.a, upbMessage.c.a);
    }

    public final int hashCode() {
        return jniSerializedBytesHashCode(this.a, this.b.a);
    }

    public native void jniDecode(long j, long j2, long j3, byte[] bArr, int i, int i2);

    public native byte[] jniEncode(long j, long j2);

    public native byte[][] jniGetExtensionOrUnknownField(long j, int i);

    public native int[] jniGetExtensionOrUnknownFieldNumbers(long j);

    public native int jniGetFirstExtensionOrUnknownFieldNumber(long j);
}
