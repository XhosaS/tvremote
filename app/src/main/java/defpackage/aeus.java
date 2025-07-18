package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeus implements aeur {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        a = rggVarA.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        rggVarA.e("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.aeur
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
