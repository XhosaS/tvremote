package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevh implements aevg {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.session_stitching_token_enabled", false);
        rggVarA.f("measurement.link_sst_to_sid", true);
    }

    @Override // defpackage.aevg
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
