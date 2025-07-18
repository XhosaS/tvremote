package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ddq extends ddp {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public ddq(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.dds
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.dds
    public byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.dds
    public int c() {
        return this.a.length;
    }

    @Override // defpackage.dds
    protected void d(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.dds
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dds) || c() != ((dds) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof ddq)) {
            return obj.equals(this);
        }
        ddq ddqVar = (ddq) obj;
        int i = this.c;
        int i2 = ddqVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iC = c();
        if (iC > ddqVar.c()) {
            throw new IllegalArgumentException("Length too large: " + iC + c());
        }
        if (iC > ddqVar.c()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iC + ", " + ddqVar.c());
        }
        if (!(ddqVar instanceof ddq)) {
            return ddqVar.h(iC).equals(h(iC));
        }
        byte[] bArr = this.a;
        byte[] bArr2 = ddqVar.a;
        ddqVar.e();
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

    @Override // defpackage.dds
    public final void f(ddm ddmVar) {
        ddmVar.a(this.a, c());
    }

    @Override // defpackage.dds
    protected final int g(int i, int i2) {
        Charset charset = dep.a;
        return a.M(i, this.a, 0, i2);
    }

    @Override // defpackage.dds
    public final dds h(int i) {
        int iJ = a.J(0, i, c());
        return iJ == 0 ? dds.b : new ddn(this.a, iJ);
    }

    protected void e() {
    }
}
