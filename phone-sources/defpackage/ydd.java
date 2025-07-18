package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ydd extends xuk {
    private final zgk a;

    public ydd(zgk zgkVar) {
        this.a = zgkVar;
    }

    @Override // defpackage.xuk, defpackage.yaf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.z();
    }

    @Override // defpackage.yaf
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.yaf
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.yaf
    public final yaf g(int i) {
        zgk zgkVar = new zgk();
        zgkVar.eW(this.a, i);
        return new ydd(zgkVar);
    }

    @Override // defpackage.yaf
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yaf
    public final void j(OutputStream outputStream, int i) throws IOException {
        this.a.Q(outputStream, i);
    }

    @Override // defpackage.yaf
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iE = this.a.e(bArr, i, i2);
            if (iE == -1) {
                throw new IndexOutOfBoundsException(a.cd(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iE;
            i += iE;
        }
    }

    @Override // defpackage.yaf
    public final void l(int i) {
        try {
            this.a.B(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
