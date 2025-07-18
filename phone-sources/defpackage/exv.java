package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exv extends exp {
    public epm a;
    private long b;
    private volatile boolean c;
    private final exo d;

    public exv(ees eesVar, eey eeyVar, dze dzeVar, int i, exo exoVar) {
        super(eesVar, eeyVar, 2, dzeVar, i, -9223372036854775807L, -9223372036854775807L);
        this.d = exoVar;
    }

    @Override // defpackage.ezt
    public final void c() {
        this.c = true;
    }

    @Override // defpackage.ezt
    public final void e() {
        if (this.b == 0) {
            this.d.d(this.a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            eey eeyVarA = this.q.a(this.b);
            efw efwVar = this.x;
            fdi fdiVar = new fdi(efwVar, eeyVarA.f, efwVar.b(eeyVarA));
            while (!this.c && this.d.c(fdiVar)) {
                try {
                } finally {
                    this.b = fdiVar.b - this.q.f;
                    this.d.a();
                }
            }
        } finally {
            ecm.e(this.x);
        }
    }
}
