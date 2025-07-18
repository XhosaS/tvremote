package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjx implements xjw {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;
    public final Context d;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("ImageCleanupFeature__enabled", false);
        b = rzyVar.b("ImageCleanupFeature__image_cleanup_job_interval_millis", 604800000L);
        c = rzyVar.b("ImageCleanupFeature__stale_image_time_millis", 604800000L);
    }

    public xjx(Context context) {
        this.d = context;
    }
}
