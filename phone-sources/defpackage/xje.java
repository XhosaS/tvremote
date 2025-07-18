package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xje implements xjd {

    @Deprecated
    public static final ryn a = xhf.b.d("FreeTabFeature__enabled", false);
    private final Context b;

    public xje(Context context) {
        this.b = context;
    }

    @Override // defpackage.xjd
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
