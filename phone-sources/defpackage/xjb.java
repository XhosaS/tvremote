package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjb implements xja {

    @Deprecated
    public static final ryn a = xhf.b.d("ForYouTabNoPaddingFeature__enabled", false);
    private final Context b;

    public xjb(Context context) {
        this.b = context;
    }

    @Override // defpackage.xja
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
