package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzt extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        sij.w(i, i2 + i, bArr.length);
    }
}
