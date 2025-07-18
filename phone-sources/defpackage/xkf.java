package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xkf implements xke {
    public static final ryv a = new ryv(xhf.b, 13);
    public final Context b;

    public xkf(Context context) {
        this.b = context;
    }

    @Override // defpackage.xke
    public final boolean a() {
        return ((Boolean) a.e(0, "KinetoscopeLibIntegrationFeature__binge_watch_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean b() {
        return ((Boolean) a.e(3, "KinetoscopeLibIntegrationFeature__exoplayerv3_download_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean c() {
        return ((Boolean) a.e(6, "KinetoscopeLibIntegrationFeature__picture_in_picture_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean d() {
        return ((Boolean) a.e(8, "KinetoscopeLibIntegrationFeature__tabletop_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean e() {
        return ((Boolean) a.e(9, "KinetoscopeLibIntegrationFeature__thumbnail_scrubbing_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean f() {
        return ((Boolean) a.e(10, "KinetoscopeLibIntegrationFeature__trailers_playback_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean g() {
        return ((Boolean) a.e(11, "KinetoscopeLibIntegrationFeature__tvod_playback_enabled", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xke
    public final boolean h() {
        return ((Boolean) a.e(12, "KinetoscopeLibIntegrationFeature__ump_playback_state_enabled", false).et(this.b)).booleanValue();
    }
}
