package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anx {
    public final aco a;
    public final long b;

    public anx(aco acoVar, long j) {
        bdq.f(true, "secondsFixIsValid must be >= 0");
        this.a = acoVar;
        this.b = j;
    }

    protected abstract aod a(aod aodVar, byg bygVar);

    protected abstract String b();
}
