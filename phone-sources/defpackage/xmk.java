package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmk implements xmj {

    @Deprecated
    public static final ryn a = xhf.b.d("TrailerPortraitPlaybackFeature__enabled", true);
    private final Context b;

    public xmk(Context context) {
        this.b = context;
    }

    @Override // defpackage.xmj
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
