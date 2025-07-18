package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fma implements fln {
    private final edi a;
    private final fea b;
    private final String c;
    private final int d;
    private final String e;
    private fel f;
    private String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public fma(String str, int i, String str2) {
        edi ediVar = new edi(4);
        this.a = ediVar;
        ediVar.a[0] = -1;
        this.b = new fea();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.fln
    public final void a(edi ediVar) {
        eci.e(this.f);
        while (ediVar.a() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = ediVar.a;
                int i2 = ediVar.b;
                int i3 = ediVar.c;
                while (true) {
                    if (i2 >= i3) {
                        ediVar.K(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        ediVar.K(i4);
                        this.k = false;
                        this.a.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(ediVar.a(), this.m - this.i);
                this.f.c(ediVar, iMin);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    a.ab(this.n != -9223372036854775807L);
                    this.f.e(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = Math.min(ediVar.a(), 4 - this.i);
                edi ediVar2 = this.a;
                ediVar.F(ediVar2.a, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    ediVar2.K(0);
                    fea feaVar = this.b;
                    if (feaVar.a(ediVar2.e())) {
                        this.m = feaVar.c;
                        if (!this.j) {
                            this.l = (feaVar.g * 1000000) / feaVar.d;
                            dzd dzdVar = new dzd();
                            dzdVar.a = this.g;
                            dzdVar.a(this.e);
                            dzdVar.d(feaVar.b);
                            dzdVar.n = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                            dzdVar.E = feaVar.e;
                            dzdVar.F = feaVar.d;
                            dzdVar.d = this.c;
                            dzdVar.f = this.d;
                            this.f.b(new dze(dzdVar));
                            this.j = true;
                        }
                        ediVar2.K(0);
                        this.f.c(ediVar2, 4);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.g = fmrVar.b();
        this.f = fdrVar.dq(fmrVar.a(), 1);
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
