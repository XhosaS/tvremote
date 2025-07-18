package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xju implements xjt {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;
    public final Context d;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("HotAndNewFeature__enable_hot_and_new_tab", false);
        b = rzyVar.d("HotAndNewFeature__enable_hot_and_new_tab_as_default", false);
        c = rzyVar.b("HotAndNewFeature__trailer_autoplay_delay_ms", 1000L);
    }

    public xju(Context context) {
        this.d = context;
    }

    @Override // defpackage.xjt
    public final boolean a() {
        return ((Boolean) a.et(this.d)).booleanValue();
    }
}
