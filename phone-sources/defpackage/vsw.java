package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vsw extends vsv {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public vsw(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.vsz
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.vsz
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.vsz
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.vsz
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.vsz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vsz) || d() != ((vsz) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof vsw)) {
            return obj.equals(this);
        }
        vsw vswVar = (vsw) obj;
        int i = this.c;
        int i2 = vswVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(vswVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.vsv
    public final boolean g(vsz vszVar, int i, int i2) {
        if (i2 > vszVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > vszVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + vszVar.d());
        }
        if (!(vszVar instanceof vsw)) {
            return vszVar.j(i, i3).equals(j(0, i2));
        }
        vsw vswVar = (vsw) vszVar;
        byte[] bArr = this.a;
        byte[] bArr2 = vswVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = vswVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.vsz
    protected final int i(int i, int i2, int i3) {
        int iC = c() + i2;
        Charset charset = vuo.a;
        return a.M(i, this.a, iC, i3);
    }

    @Override // defpackage.vsz
    public final vsz j(int i, int i2) {
        int iJ = a.J(i, i2, d());
        return iJ == 0 ? vsz.b : new vst(this.a, c() + i, iJ);
    }

    @Override // defpackage.vsz
    public final vte k() {
        return vte.O(this.a, c(), d(), true);
    }

    @Override // defpackage.vsz
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.vsz
    public final void m(vsq vsqVar) {
        vsqVar.b(this.a, c(), d());
    }

    @Override // defpackage.vsz
    public final void n(OutputStream outputStream) throws IOException {
        outputStream.write(w());
    }
}
