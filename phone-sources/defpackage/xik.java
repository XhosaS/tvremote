package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xik implements xij {

    @Deprecated
    public static final ryn a = xhf.b.d("DeeplinkFeature__enable_remote_deeplinks", false);
    private final Context b;

    public xik(Context context) {
        this.b = context;
    }

    @Override // defpackage.xij
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
