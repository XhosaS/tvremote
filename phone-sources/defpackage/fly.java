package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fly implements fln {
    private fel c;
    private boolean d;
    private int f;
    private int g;
    private final String a = "video/mp2t";
    private final edi b = new edi(10);
    private long e = -9223372036854775807L;

    @Override // defpackage.fln
    public final void a(edi ediVar) {
        eci.e(this.c);
        if (this.d) {
            int iA = ediVar.a();
            int i = this.g;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = ediVar.a;
                int i2 = ediVar.b;
                edi ediVar2 = this.b;
                System.arraycopy(bArr, i2, ediVar2.a, this.g, iMin);
                if (this.g + iMin == 10) {
                    ediVar2.K(0);
                    if (ediVar2.j() != 73 || ediVar2.j() != 68 || ediVar2.j() != 51) {
                        edb.e("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        ediVar2.L(3);
                        this.f = ediVar2.i() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f - this.g);
            this.c.c(ediVar, iMin2);
            this.g += iMin2;
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        fel felVarDq = fdrVar.dq(fmrVar.a(), 5);
        this.c = felVarDq;
        dzd dzdVar = new dzd();
        dzdVar.a = fmrVar.b();
        dzdVar.a(this.a);
        dzdVar.d("application/id3");
        felVarDq.b(new dze(dzdVar));
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        int i;
        eci.e(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            a.ab(this.e != -9223372036854775807L);
            this.c.e(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = j;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.fln
    public final void e() {
        this.d = false;
        this.e = -9223372036854775807L;
    }
}
