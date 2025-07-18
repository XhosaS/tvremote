package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfo {
    public final cdy a;
    private final coe b;

    public cfo(cdy cdyVar, coe coeVar) {
        cdyVar.getClass();
        coeVar.getClass();
        this.a = cdyVar;
        this.b = coeVar;
    }

    public final void a(final cee ceeVar, final cdf cdfVar) {
        this.b.a.execute(new Runnable() { // from class: cfn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.a.h(ceeVar);
            }
        });
    }

    public final void b(cee ceeVar, int i) {
        this.b.a.execute(new cns(this.a, ceeVar, false, i));
    }
}
