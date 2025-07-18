package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwo extends InputStream implements InputStreamRetargetInterface, afgy {
    private final afwn a;

    public afwo(afwn afwnVar) {
        afwnVar.getClass();
        this.a = afwnVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((afor) this.a).b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        afwn afwnVar = this.a;
        if (((afor) afwnVar).b == 0) {
            return -1;
        }
        return afwnVar.f();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        afwn afwnVar = this.a;
        int iMin = (int) Math.min(((afor) afwnVar).b, j);
        afwnVar.m(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        afor aforVar = (afor) this.a;
        int i3 = aforVar.b;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i2);
        aforVar.e(afor.a, iMin, bArr, i);
        return iMin;
    }
}
