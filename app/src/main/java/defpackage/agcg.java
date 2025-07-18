package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agcg extends afmx {
    private final ahwx a;

    public agcg(ahwx ahwxVar) {
        this.a = ahwxVar;
    }

    @Override // defpackage.afmx, defpackage.afwn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        ahwx ahwxVar = this.a;
        ahwxVar.o(ahwxVar.b);
    }

    @Override // defpackage.afwn
    public final int f() {
        try {
            return this.a.c() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.afwn
    public final int g() {
        return (int) this.a.b;
    }

    @Override // defpackage.afwn
    public final afwn h(int i) {
        ahwx ahwxVar = new ahwx();
        ahwxVar.fF(this.a, i);
        return new agcg(ahwxVar);
    }

    @Override // defpackage.afwn
    public final void j(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.afwn
    public final void k(OutputStream outputStream, int i) throws IOException {
        this.a.y(outputStream, i);
    }

    @Override // defpackage.afwn
    public final void l(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iD = this.a.d(bArr, i, i2);
            if (iD == -1) {
                throw new IndexOutOfBoundsException(a.a(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iD;
            i += iD;
        }
    }

    @Override // defpackage.afwn
    public final void m(int i) {
        try {
            this.a.o(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
