package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ckt extends cks {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public ckt(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.ckv
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.ckv
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.ckv
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.ckv
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.ckv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckv) || d() != ((ckv) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof ckt)) {
            return obj.equals(this);
        }
        ckt cktVar = (ckt) obj;
        int i = this.c;
        int i2 = cktVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(cktVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.cks
    public final boolean g(ckv ckvVar, int i, int i2) {
        if (i2 > ckvVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > ckvVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + ckvVar.d());
        }
        if (!(ckvVar instanceof ckt)) {
            return ckvVar.j(i, i3).equals(j(0, i2));
        }
        ckt cktVar = (ckt) ckvVar;
        byte[] bArr = this.a;
        byte[] bArr2 = cktVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = cktVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.ckv
    protected final int i(int i, int i2, int i3) {
        return cmf.c(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.ckv
    public final ckv j(int i, int i2) {
        int iM = m(i, i2, d());
        return iM == 0 ? ckv.b : new ckq(this.a, c() + i, iM);
    }

    @Override // defpackage.ckv
    public final void k(ckn cknVar) {
        cknVar.a(this.a, c(), d());
    }

    @Override // defpackage.ckv
    public final void l(OutputStream outputStream) throws IOException {
        outputStream.write(t());
    }
}
