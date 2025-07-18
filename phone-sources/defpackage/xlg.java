package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlg implements xlf {
    private static final ryv a = new ryv(xhf.b, 11);
    private final Context b;

    public xlg(Context context) {
        this.b = context;
    }

    @Override // defpackage.xlf
    public final boolean a() {
        return ((Boolean) a.e(0, "PrimesFeature__battery_logging_enable", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean b() {
        return ((Boolean) a.e(1, "PrimesFeature__clearcut_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean c() {
        return ((Boolean) a.e(2, "PrimesFeature__crash_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean d() {
        return ((Boolean) a.e(4, "PrimesFeature__jank_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean e() {
        return ((Boolean) a.e(5, "PrimesFeature__memory_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean f() {
        return ((Boolean) a.e(6, "PrimesFeature__network_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean g() {
        return ((Boolean) a.e(7, "PrimesFeature__odyssey_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean h() {
        return ((Boolean) a.e(8, "PrimesFeature__package_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean i() {
        return ((Boolean) a.e(9, "PrimesFeature__rpc_caching_logging_enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xlf
    public final boolean j() {
        return ((Boolean) a.e(10, "PrimesFeature__timer_logging_enabled", true).et(this.b)).booleanValue();
    }
}
