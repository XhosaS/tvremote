package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeup implements aeuo {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.gmscore_feature_tracking", true);
        a = rggVarA.f("measurement.gmscore_client_telemetry", false);
    }

    @Override // defpackage.aeuo
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
