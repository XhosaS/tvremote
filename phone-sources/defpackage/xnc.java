package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnc implements xnb {

    @Deprecated
    public static final ryn a = xhf.b.d("VrBetterTogetherFeature__vr_foreground_service_enabled", false);
    private final Context b;

    public xnc(Context context) {
        this.b = context;
    }

    @Override // defpackage.xnb
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
