package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmb implements xma {

    @Deprecated
    public static final ryn a = xhf.b.d("SonicBadgingMobileUiFeature__enable_dolby_vision", false);
    private final Context b;

    public xmb(Context context) {
        this.b = context;
    }

    @Override // defpackage.xma
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
