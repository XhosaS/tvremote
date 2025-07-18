package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yah extends xuk {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public yah(byte[] bArr, int i, int i2) {
        sij.o(i >= 0, "offset must be >= 0");
        sij.o(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        sij.o(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yaf
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.yaf
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.yaf
    public final /* bridge */ /* synthetic */ yaf g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new yah(this.c, i2, i);
    }

    @Override // defpackage.yaf
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.c, this.a, iRemaining);
        this.a += iRemaining;
    }

    @Override // defpackage.yaf
    public final void j(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.yaf
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.yaf
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
