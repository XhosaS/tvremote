package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeum implements aeul {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.gbraid_campaign.gbraid.client", true);
        a = rggVarA.f("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // defpackage.aeul
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
