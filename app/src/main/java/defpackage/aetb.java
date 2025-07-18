package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetb implements aeta {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;

    static {
        rgg rggVarB = new rgg(rff.a("com.google.android.gms.icing.mdd")).c().b();
        a = rggVarB.e("api_logging_sample_interval", 100L);
        rggVarB.e("cleanup_log_logging_sample_interval", 1000L);
        b = rggVarB.e("group_stats_logging_sample_interval", 100L);
        c = rggVarB.e("mdd_android_sharing_sample_interval", 100L);
        d = rggVarB.e("mdd_default_sample_interval", 100L);
        rggVarB.e("mdd_download_events_sample_interval", 1L);
        rggVarB.e("mobstore_file_service_stats_sample_interval", 100L);
        e = rggVarB.e("network_stats_logging_sample_interval", 100L);
        f = rggVarB.e("pds_migration_compare_results_sample_interval", 10000L);
        rggVarB.e("silent_feedback_sample_interval", 100L);
        g = rggVarB.e("storage_stats_logging_sample_interval", 100L);
    }

    @Override // defpackage.aeta
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long c() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long d() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.aeta
    public final long g() {
        return ((Long) g.b()).longValue();
    }
}
