package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlp implements xlo {
    private static final ryv a = new ryv(xhf.b, 12);
    private final Context b;

    public xlp(Context context) {
        this.b = context;
    }

    @Override // defpackage.xlo
    public final long a() {
        return ((Long) a.c(2, "RpcFeature__deadline_seconds", 15L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final long b() {
        return ((Long) a.c(3, "RpcFeature__drm_deadline_seconds", 42L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final long c() {
        return ((Long) a.c(6, "RpcFeature__initial_backoff_time_millis", 1000L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final long d() {
        return ((Long) a.c(7, "RpcFeature__max_backoff_delay_time_millis", 120000L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final long e() {
        return ((Long) a.c(9, "RpcFeature__pelog_retry_times", 3L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final long f() {
        return ((Long) a.c(11, "RpcFeature__slendro_deadline_millis", 15000L).et(this.b)).longValue();
    }

    @Override // defpackage.xlo
    public final String g() {
        return (String) a.d(8, "RpcFeature__oauth_scopes", "oauth2:https://www.googleapis.com/auth/android_video https://www.googleapis.com/auth/userinfo.email https://www.googleapis.com/auth/google_tv").et(this.b);
    }

    @Override // defpackage.xlo
    public final String h() {
        return (String) a.d(10, "RpcFeature__slendro_api_key", "AIzaSyDPPIFxohUez6qLUfZYsZVT6-vVIzufgk0").et(this.b);
    }
}
