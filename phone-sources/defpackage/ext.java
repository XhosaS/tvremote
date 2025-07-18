package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ext extends exl {
    private final int e;
    private final long f;
    private long g;
    private volatile boolean h;
    private boolean i;
    private final exo j;

    public ext(ees eesVar, eey eeyVar, dze dzeVar, int i, long j, long j2, long j3, long j4, long j5, int i2, long j6, exo exoVar) {
        super(eesVar, eeyVar, dzeVar, i, j, j2, j3, j4, j5);
        this.e = i2;
        this.f = j6;
        this.j = exoVar;
    }

    @Override // defpackage.ezt
    public final void c() {
        this.h = true;
    }

    @Override // defpackage.ezt
    public final void e() {
        int i;
        int i2;
        epm epmVarB = b();
        if (this.g == 0) {
            long j = this.f;
            epmVarB.j(j);
            exo exoVar = this.j;
            long j2 = this.a;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j;
            long j4 = this.b;
            exoVar.d(epmVarB, j3, j4 != -9223372036854775807L ? j4 - j : -9223372036854775807L);
        }
        try {
            eey eeyVar = this.q;
            eey eeyVarA = eeyVar.a(this.g);
            efw efwVar = this.x;
            fdi fdiVar = new fdi(efwVar, eeyVarA.f, efwVar.b(eeyVarA));
            do {
                try {
                    if (this.h) {
                        break;
                    }
                } catch (Throwable th) {
                    this.g = fdiVar.b - this.q.f;
                    throw th;
                }
            } while (this.j.c(fdiVar));
            dze dzeVar = this.s;
            if (eae.n(dzeVar.X) && (((i = dzeVar.ax) > 1 || dzeVar.ay > 1) && i != -1 && (i2 = dzeVar.ay) != -1)) {
                fel felVarK = epmVarB.k(4);
                int i3 = i * i2;
                long j5 = (this.w - this.v) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    felVarK.c(new edi(), 0);
                    felVarK.e(i4 * j5, 0, 0, 0, null);
                }
            }
            this.g = fdiVar.b - eeyVar.f;
            ecm.e(efwVar);
            this.i = !this.h;
        } catch (Throwable th2) {
            ecm.e(this.x);
            throw th2;
        }
    }

    @Override // defpackage.exw
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.exw
    public final long m() {
        return this.y + this.e;
    }
}
