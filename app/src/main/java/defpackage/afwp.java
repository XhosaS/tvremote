package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afwp extends afmx {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public afwp(byte[] bArr, int i, int i2) {
        yqw.B(i >= 0, "offset must be >= 0");
        yqw.B(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        yqw.B(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.afwn
    public final int f() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.afwn
    public final int g() {
        return this.b - this.a;
    }

    @Override // defpackage.afwn
    public final /* bridge */ /* synthetic */ afwn h(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new afwp(this.c, i2, i);
    }

    @Override // defpackage.afwn
    public final void j(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.c, this.a, iRemaining);
        this.a += iRemaining;
    }

    @Override // defpackage.afwn
    public final void k(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.afwn
    public final void l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.afwn
    public final void m(int i) {
        a(i);
        this.a += i;
    }
}
