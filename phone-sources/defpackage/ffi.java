package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffi extends ffh {
    private final edi a;
    private final edi b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public ffi(fel felVar) {
        super(felVar);
        this.a = new edi(eee.a);
        this.b = new edi(4);
    }

    @Override // defpackage.ffh
    protected final boolean a(edi ediVar) throws ffg {
        int iJ = ediVar.j();
        int i = iJ >> 4;
        int i2 = iJ & 15;
        if (i2 != 7) {
            throw new ffg(a.cf(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    @Override // defpackage.ffh
    protected final boolean b(edi ediVar, long j) throws eaf {
        int i;
        int iJ = ediVar.j();
        byte[] bArr = ediVar.a;
        int i2 = ediVar.b;
        int i3 = i2 + 1;
        ediVar.b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        ediVar.b = i5;
        int i6 = bArr[i3] & 255;
        ediVar.b = i2 + 3;
        int i7 = bArr[i5] & 255;
        if (iJ == 0) {
            if (!this.e) {
                edi ediVar2 = new edi(new byte[ediVar.a()]);
                ediVar.F(ediVar2.a, 0, ediVar.a());
                fcy fcyVarA = fcy.a(ediVar2);
                this.c = fcyVarA.b;
                dzd dzdVar = new dzd();
                dzdVar.a("video/x-flv");
                dzdVar.d("video/avc");
                dzdVar.j = fcyVarA.l;
                dzdVar.t = fcyVarA.c;
                dzdVar.u = fcyVarA.d;
                dzdVar.z = fcyVarA.k;
                dzdVar.p = fcyVarA.a;
                this.d.b(new dze(dzdVar));
                this.e = true;
                return false;
            }
        } else if (iJ == 1 && this.e) {
            int i8 = this.g == 1 ? 1 : 0;
            if (this.f) {
                i = i8;
            } else if (i8 != 0) {
                i = 1;
            }
            edi ediVar3 = this.b;
            byte[] bArr2 = ediVar3.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = 4 - this.c;
            int i10 = 0;
            while (ediVar.a() > 0) {
                ediVar.F(ediVar3.a, i9, this.c);
                ediVar3.K(0);
                int iM = ediVar3.m();
                edi ediVar4 = this.a;
                ediVar4.K(0);
                fel felVar = this.d;
                felVar.c(ediVar4, 4);
                felVar.c(ediVar, iM);
                i10 = i10 + 4 + iM;
            }
            this.d.e(j + ((((i4 << 24) >> 8) | (i6 << 8) | i7) * 1000), i, i10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
