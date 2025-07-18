package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xim implements xil {

    @Deprecated
    public static final ryn a = xhf.b.d("DeeplinkLoggingFeature__enabled", false);
    private final Context b;

    public xim(Context context) {
        this.b = context;
    }

    @Override // defpackage.xil
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
