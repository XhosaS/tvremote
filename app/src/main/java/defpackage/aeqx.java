package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqx implements aeqw {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;

    static {
        rgg rggVarB = new rgg("sharedPrefs_ph").a().b();
        a = rggVarB.e("45355679", 5L);
        rggVarB.f("45355680", true);
        b = rggVarB.e("45355681", 15L);
        c = rggVarB.e("45355682", 1000L);
    }

    @Override // defpackage.aeqw
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aeqw
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aeqw
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}
