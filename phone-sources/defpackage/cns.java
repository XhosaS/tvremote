package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cns {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;

    public cns() {
        this(false, false, 0, false, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cns)) {
            return false;
        }
        cns cnsVar = (cns) obj;
        return this.a == cnsVar.a && this.b == cnsVar.b && this.f == cnsVar.f && this.c == cnsVar.c && this.d == cnsVar.d;
    }

    public final int hashCode() {
        a.bw(this.f);
        return (((((((a.q(this.a) * 31) + a.q(this.b)) * 31) + 1) * 31) + a.q(this.c)) * 31) + a.q(this.d);
    }

    public /* synthetic */ cns(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2) {
        this.a = 1 == ((z ? 1 : 0) | (i2 & 1));
        this.b = (!((i2 & 2) == 0)) | z2;
        this.f = (((i2 & 4) != 0 ? 0 : 1) ^ 1) | i;
        this.c = (!((i2 & 8) == 0)) | z3;
        this.d = (!((i2 & 16) == 0)) | z4;
        this.e = "";
    }

    public /* synthetic */ cns(byte[] bArr) {
        this(true, true, 1, true, true, 32);
    }
}
