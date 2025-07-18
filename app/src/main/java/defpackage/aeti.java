package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeti implements aeth {
    public static final rgi a;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.f("measurement.service.ad_impression.convert_value_to_double", true);
        rggVarA.f("measurement.service.separate_public_internal_event_blacklisting", true);
        rggVarA.f("measurement.service.ad_impression", true);
    }

    @Override // defpackage.aeth
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
