package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abzh extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ abzi a;
    private abzg b;
    private abvl c;
    private int d;
    private int e;
    private int f;
    private int g;

    public abzh(abzi abziVar) {
        this.a = abziVar;
        d();
    }

    private final int a() {
        return this.a.d - (this.f + this.e);
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            c();
            if (this.c == null) {
                break;
            }
            int iMin = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.z(bArr, this.e, i, iMin);
                i += iMin;
            }
            this.e += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    private final void c() {
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            if (i == i2) {
                this.f += i2;
                int iD = 0;
                this.e = 0;
                if (this.b.hasNext()) {
                    abvl next = this.b.next();
                    this.c = next;
                    iD = next.d();
                } else {
                    this.c = null;
                }
                this.d = iD;
            }
        }
    }

    private final void d() {
        abzg abzgVar = new abzg(this.a);
        this.b = abzgVar;
        abvl next = abzgVar.next();
        this.c = next;
        this.d = next.d();
        this.e = 0;
        this.f = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        c();
        abvl abvlVar = this.c;
        if (abvlVar == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return abvlVar.a(i) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        d();
        b(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return b(null, 0, (int) j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            int iB = b(bArr, i, i2);
            return iB == 0 ? (i2 > 0 || a() == 0) ? -1 : 0 : iB;
        }
        throw new IndexOutOfBoundsException();
    }
}
