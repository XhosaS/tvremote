package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjr implements xjq {
    public static final ryv a = new ryv(xhf.b, 5);
    public final Context b;

    public xjr(Context context) {
        this.b = context;
    }

    @Override // defpackage.xjq
    public final boolean a() {
        return ((Boolean) a.e(1, "GrowthkitFeature__enabled", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xjq
    public final boolean b() {
        return ((Boolean) a.e(4, "GrowthkitFeature__use_gnp_registration", false).et(this.b)).booleanValue();
    }
}
