package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aest implements aess {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;
    public static final rgi h;
    public static final rgi i;

    static {
        rgg rggVarB = new rgg(rff.a("com.google.android.gms.icing.mdd")).c().b();
        a = rggVarB.e("abs_free_space_after_download", 524288000L);
        b = rggVarB.e("abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        c = rggVarB.e("abs_free_space_after_download_low_storage_allowed", 104857600L);
        d = rggVarB.f("downloader_enforce_https", true);
        e = rggVarB.e("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = rggVarB.e("downloader_max_threads", 2L);
        g = rggVarB.f("enforce_low_storage_behavior", true);
        h = rggVarB.d("fraction_free_space_after_download", 0.1d);
        i = rggVarB.e("time_to_wait_for_downloader", 120000L);
    }

    @Override // defpackage.aess
    public final double a() {
        return ((Double) h.b()).doubleValue();
    }

    @Override // defpackage.aess
    public final long b() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aess
    public final long c() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aess
    public final long d() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.aess
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.aess
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.aess
    public final long g() {
        return ((Long) i.b()).longValue();
    }

    @Override // defpackage.aess
    public final boolean h() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.aess
    public final boolean i() {
        return ((Boolean) g.b()).booleanValue();
    }
}
