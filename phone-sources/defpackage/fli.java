package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fli implements fln {
    public long a;
    private final edh b;
    private final edi c;
    private final String d;
    private final int e;
    private final String f;
    private String g;
    private fel h;
    private int i;
    private int j;
    private boolean k;
    private long l;
    private dze m;
    private int n;

    public fli(String str, int i, String str2) {
        edh edhVar = new edh(new byte[16]);
        this.b = edhVar;
        this.c = new edi((byte[]) edhVar.c);
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.fln
    public final void a(edi ediVar) {
        eci.e(this.h);
        while (ediVar.a() > 0) {
            int i = this.i;
            if (i == 0) {
                while (ediVar.a() > 0) {
                    if (this.k) {
                        int iJ = ediVar.j();
                        this.k = iJ == 172;
                        if (iJ != 64) {
                            if (iJ == 65) {
                                iJ = 65;
                            }
                        }
                        this.i = 1;
                        byte[] bArr = this.c.a;
                        bArr[0] = -84;
                        bArr[1] = iJ == 65 ? (byte) 65 : (byte) 64;
                        this.j = 2;
                    } else {
                        this.k = ediVar.j() == 172;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(ediVar.a(), this.n - this.j);
                this.h.c(ediVar, iMin);
                int i2 = this.j + iMin;
                this.j = i2;
                if (i2 == this.n) {
                    a.ab(this.a != -9223372036854775807L);
                    this.h.e(this.a, 1, this.n, 0, null);
                    this.a += this.l;
                    this.i = 0;
                }
            } else {
                edi ediVar2 = this.c;
                byte[] bArr2 = ediVar2.a;
                int iMin2 = Math.min(ediVar.a(), 16 - this.j);
                ediVar.F(bArr2, this.j, iMin2);
                int i3 = this.j + iMin2;
                this.j = i3;
                if (i3 == 16) {
                    edh edhVar = this.b;
                    edhVar.l(0);
                    tqr tqrVarE = fcx.e(edhVar);
                    dze dzeVar = this.m;
                    if (dzeVar == null || dzeVar.aq != 2 || tqrVarE.c != dzeVar.ar || !"audio/ac4".equals(dzeVar.Y)) {
                        dzd dzdVar = new dzd();
                        dzdVar.a = this.g;
                        dzdVar.a(this.f);
                        dzdVar.d("audio/ac4");
                        dzdVar.E = 2;
                        dzdVar.F = tqrVarE.c;
                        dzdVar.d = this.d;
                        dzdVar.f = this.e;
                        dze dzeVar2 = new dze(dzdVar);
                        this.m = dzeVar2;
                        this.h.b(dzeVar2);
                    }
                    this.n = tqrVarE.a;
                    this.l = (tqrVarE.b * 1000000) / this.m.ar;
                    ediVar2.K(0);
                    this.h.c(ediVar2, 16);
                    this.i = 2;
                }
            }
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.g = fmrVar.b();
        this.h = fdrVar.dq(fmrVar.a(), 1);
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
