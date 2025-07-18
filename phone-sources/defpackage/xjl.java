package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjl implements xjk {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;
    public final Context c;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("GlanceWidgetFeature__enabled", true);
        b = rzyVar.b("GlanceWidgetFeature__glance_widget_sync_job_interval_millis", 86400000L);
    }

    public xjl(Context context) {
        this.c = context;
    }

    @Override // defpackage.xjk
    public final boolean a() {
        return ((Boolean) a.et(this.c)).booleanValue();
    }
}
