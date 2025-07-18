package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmf implements xme {

    @Deprecated
    public static final ryn a = xhf.b.d("SubsDiscoveryFeature__enabled", false);
    private final Context b;

    public xmf(Context context) {
        this.b = context;
    }

    @Override // defpackage.xme
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
