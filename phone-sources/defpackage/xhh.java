package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhh implements xhg {
    public static final ryv a = new ryv(xhf.b, 6);
    public final Context b;

    public xhh(Context context) {
        this.b = context;
    }

    @Override // defpackage.xhg
    public final boolean a() {
        return ((Boolean) a.e(0, "AppRefreshFeature__enable_entity_page_trailer_autoplay", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xhg
    public final boolean b() {
        return ((Boolean) a.e(1, "AppRefreshFeature__enable_immersive_carousel", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xhg
    public final boolean c() {
        return ((Boolean) a.e(3, "AppRefreshFeature__enable_tpfy_enhancement", false).et(this.b)).booleanValue();
    }
}
