package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeto implements aetn {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.client.3p_consent_state_v1", true);
        a = rggVarA.e("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.aetn
    public final long a() {
        return ((Long) a.b()).longValue();
    }
}
