package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjj implements xji {

    @Deprecated
    public static final ryn a = xhf.b.d("GilLoggingFeature__enabled", true);
    private final Context b;

    public xjj(Context context) {
        this.b = context;
    }

    @Override // defpackage.xji
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
