package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeuy implements aeux {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;
    public static final rgi h;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        rggVarA.f("measurement.rb.attribution.ad_campaign_info", true);
        rggVarA.f("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        a = rggVarA.f("measurement.rb.attribution.client2", true);
        b = rggVarA.f("measurement.rb.attribution.followup1.service", false);
        rggVarA.f("measurement.rb.attribution.client.get_trigger_uris_async", true);
        c = rggVarA.f("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        rggVarA.f("measurement.rb.attribution.index_out_of_bounds_fix", true);
        d = rggVarA.f("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        e = rggVarA.f("measurement.rb.attribution.retry_disposition", false);
        f = rggVarA.f("measurement.rb.attribution.service", true);
        g = rggVarA.f("measurement.rb.attribution.enable_trigger_redaction", true);
        h = rggVarA.f("measurement.rb.attribution.uuid_generation", true);
        rggVarA.e("measurement.id.rb.attribution.retry_disposition", 0L);
        rggVarA.f("measurement.rb.attribution.improved_retry", true);
    }

    @Override // defpackage.aeux
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean e() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean f() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean g() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.aeux
    public final boolean h() {
        return ((Boolean) h.b()).booleanValue();
    }
}
