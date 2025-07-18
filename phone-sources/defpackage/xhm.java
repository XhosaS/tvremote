package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhm implements xhl {

    @Deprecated
    public static final ryn a = xhf.b.d("AsyncQueueingOnMediaCodecRendersFeature__enabled", true);
    private final Context b;

    public xhm(Context context) {
        this.b = context;
    }

    @Override // defpackage.xhl
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
