package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerd implements aerc {
    public static final rgi a;
    public static final rgi b;

    static {
        rgg rggVarB = new rgg("sharedPrefs_ph").a().b();
        rggVarB.f("45699337", false);
        rggVarB.f("45356159", true);
        rggVarB.f("45356160", true);
        rggVarB.f("45356164", true);
        a = rggVarB.f("45356158", true);
        rggVarB.f("45356161", true);
        b = rggVarB.f("45356162", true);
        rggVarB.f("45356163", true);
        rggVarB.f("45372896", true);
        rggVarB.f("45356165", true);
    }

    @Override // defpackage.aerc
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aerc
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
