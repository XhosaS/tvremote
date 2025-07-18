package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhv {
    public final fel a;
    public fif d;
    public fht e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean k;
    public final fie b = new fie();
    public final edi c = new edi();
    private final edi l = new edi(1);
    private final edi m = new edi();

    public fhv(fel felVar, fif fifVar, fht fhtVar, String str) {
        this.a = felVar;
        this.d = fifVar;
        this.e = fhtVar;
        this.j = str;
        e(fifVar, fhtVar);
    }

    public final int a() {
        int i = !this.k ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return d() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i2) {
        edi ediVar;
        fid fidVarD = d();
        if (fidVarD == null) {
            return 0;
        }
        int i3 = fidVarD.d;
        if (i3 != 0) {
            ediVar = this.b.n;
        } else {
            byte[] bArr = fidVarD.e;
            String str = edt.a;
            edi ediVar2 = this.m;
            int length = bArr.length;
            ediVar2.I(bArr, length);
            ediVar = ediVar2;
            i3 = length;
        }
        fie fieVar = this.b;
        boolean zC = fieVar.c(this.f);
        boolean z = zC || i2 != 0;
        edi ediVar3 = this.l;
        ediVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        ediVar3.K(0);
        fel felVar = this.a;
        felVar.d(ediVar3, 1, 1);
        felVar.d(ediVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zC) {
            edi ediVar4 = this.c;
            ediVar4.G(8);
            byte[] bArr2 = ediVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            felVar.d(ediVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        edi ediVar5 = fieVar.n;
        int iN = ediVar5.n();
        ediVar5.L(-2);
        int i5 = (iN * 6) + 2;
        if (i2 != 0) {
            edi ediVar6 = this.c;
            ediVar6.G(i5);
            byte[] bArr3 = ediVar6.a;
            ediVar5.F(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            ediVar5 = ediVar6;
        }
        felVar.d(ediVar5, i5, 1);
        return i4 + i5;
    }

    public final long c() {
        return !this.k ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final fid d() {
        if (!this.k) {
            return null;
        }
        fie fieVar = this.b;
        fht fhtVar = fieVar.a;
        String str = edt.a;
        int i = fhtVar.a;
        fid fidVarB = fieVar.m;
        if (fidVarB == null) {
            fidVarB = this.d.a.b(i);
        }
        if (fidVarB == null || !fidVarB.a) {
            return null;
        }
        return fidVarB;
    }

    public final void e(fif fifVar, fht fhtVar) {
        this.d = fifVar;
        this.e = fhtVar;
        dzd dzdVar = new dzd(fifVar.a.g);
        dzdVar.a(this.j);
        this.a.b(new dze(dzdVar));
        f();
    }

    public final void f() {
        fie fieVar = this.b;
        fieVar.d = 0;
        fieVar.p = 0L;
        fieVar.q = false;
        fieVar.k = false;
        fieVar.o = false;
        fieVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.k = false;
    }

    public final boolean g() {
        this.f++;
        if (!this.k) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
