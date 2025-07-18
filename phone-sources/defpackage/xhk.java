package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhk implements xhj {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;
    private final Context d;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("AppStartupFeature__enable_cache_cleanup", false);
        b = rzyVar.d("AppStartupFeature__enable_checkin", false);
        c = rzyVar.d("AppStartupFeature__enable_phenotype_sync", true);
    }

    public xhk(Context context) {
        this.d = context;
    }

    @Override // defpackage.xhj
    public final boolean a() {
        return ((Boolean) a.et(this.d)).booleanValue();
    }

    @Override // defpackage.xhj
    public final boolean b() {
        return ((Boolean) b.et(this.d)).booleanValue();
    }

    @Override // defpackage.xhj
    public final boolean c() {
        return ((Boolean) c.et(this.d)).booleanValue();
    }
}
