package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class doj extends doi {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public doj(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.dol
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.dol
    public byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.dol
    public int c() {
        return this.a.length;
    }

    @Override // defpackage.dol
    public final void e(doe doeVar) {
        doeVar.a(this.a, c());
    }

    @Override // defpackage.dol
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dol) || c() != ((dol) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof doj)) {
            return obj.equals(this);
        }
        doj dojVar = (doj) obj;
        int i = this.c;
        int i2 = dojVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iC = c();
        if (iC > dojVar.c()) {
            throw new IllegalArgumentException("Length too large: " + iC + c());
        }
        if (iC > dojVar.c()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iC + ", " + dojVar.c());
        }
        if (!(dojVar instanceof doj)) {
            return dojVar.g(iC).equals(g(iC));
        }
        byte[] bArr = this.a;
        byte[] bArr2 = dojVar.a;
        dojVar.d();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iC) {
            if (bArr[i3] != bArr2[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // defpackage.dol
    protected final int f(int i, int i2) {
        byte[] bArr = dpk.b;
        return a.M(i, this.a, 0, i2);
    }

    @Override // defpackage.dol
    public final dol g(int i) {
        int iJ = a.J(0, i, c());
        return iJ == 0 ? dol.b : new dog(this.a, iJ);
    }

    protected void d() {
    }
}
