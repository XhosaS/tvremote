package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeud implements aeuc {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = rggVarA.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = rggVarA.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = rggVarA.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.aeuc
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aeuc
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.aeuc
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }
}
