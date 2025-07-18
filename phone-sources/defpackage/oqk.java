package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oqk {
    public final ngl a;
    public final long b;

    public oqk(ngl nglVar, long j) {
        sij.o(true, "secondsFixIsValid must be >= 0");
        this.a = nglVar;
        this.b = j;
    }

    protected abstract oqp a(oqp oqpVar, tst tstVar);

    protected abstract String b();
}
