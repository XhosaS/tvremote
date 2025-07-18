package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevq implements aevp {
    public static final rgi a;
    public static final rgi b;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.tcf.consent_fix", false);
        rggVarA.f("measurement.tcf.client", true);
        b = rggVarA.f("measurement.tcf.empty_pref_fix", true);
        rggVarA.e("measurement.id.tcf", 0L);
    }

    @Override // defpackage.aevp
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aevp
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
