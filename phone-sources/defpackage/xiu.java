package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiu implements xit {
    private static final ryv a = new ryv(xhf.b, 15);
    private final Context b;

    public xiu(Context context) {
        this.b = context;
    }

    @Override // defpackage.xit
    public final double a() {
        return ((Double) a.b(5, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_percentile", -1.0d).et(this.b)).doubleValue();
    }

    @Override // defpackage.xit
    public final double b() {
        return ((Double) a.b(8, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_smoothing_factor", -1.0d).et(this.b)).doubleValue();
    }

    @Override // defpackage.xit
    public final double c() {
        return ((Double) a.b(12, "ExoExperimentalBandwidthMeterFeature__time_to_first_byte_percentile", -1.0d).et(this.b)).doubleValue();
    }

    @Override // defpackage.xit
    public final double d() {
        return ((Double) a.b(14, "ExoExperimentalBandwidthMeterFeature__time_to_first_byte_smoothing_factor", -1.0d).et(this.b)).doubleValue();
    }

    @Override // defpackage.xit
    public final long e() {
        return ((Long) a.c(0, "ExoExperimentalBandwidthMeterFeature__bandwidth_estimator_min_bytes_transferred", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long f() {
        return ((Long) a.c(1, "ExoExperimentalBandwidthMeterFeature__bandwidth_estimator_min_samples", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long g() {
        return ((Long) a.c(2, "ExoExperimentalBandwidthMeterFeature__bandwidth_estimator_type", 0L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long h() {
        return ((Long) a.c(3, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_eviction_max_sample_age", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long i() {
        return ((Long) a.c(4, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_eviction_max_sample_count", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long j() {
        return ((Long) a.c(6, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_sample_count", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long k() {
        return ((Long) a.c(7, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_sample_eviction_type", 0L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long l() {
        return ((Long) a.c(9, "ExoExperimentalBandwidthMeterFeature__bandwidth_statistic_type", 0L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long m() {
        return ((Long) a.c(11, "ExoExperimentalBandwidthMeterFeature__time_to_first_byte_estimator_type", 0L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final long n() {
        return ((Long) a.c(13, "ExoExperimentalBandwidthMeterFeature__time_to_first_byte_sample_count", -1L).et(this.b)).longValue();
    }

    @Override // defpackage.xit
    public final boolean o() {
        return ((Boolean) a.e(10, "ExoExperimentalBandwidthMeterFeature__enabled", false).et(this.b)).booleanValue();
    }
}
