package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetr implements aetq {
    public static final rgi a;
    public static final rgi b;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        rggVarA.f("measurement.set_default_event_parameters_with_backfill.service", true);
        rggVarA.e("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        a = rggVarA.f("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = rggVarA.f("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        rggVarA.f("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // defpackage.aetq
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aetq
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
