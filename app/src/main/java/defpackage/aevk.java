package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevk implements aevj {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.client.sessions.enable_fix_background_engagement", false);
        rggVarA.f("measurement.client.sessions.enable_pause_engagement_in_background", true);
        rggVarA.e("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // defpackage.aevj
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
