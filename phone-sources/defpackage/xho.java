package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xho implements xhn {
    public static final ryv a = new ryv(xhf.b, 5);
    public final Context b;

    public xho(Context context) {
        this.b = context;
    }

    @Override // defpackage.xhn
    public final boolean a() {
        return ((Boolean) a.e(2, "AvodUiFeature__enable_age_gate", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xhn
    public final boolean b() {
        return ((Boolean) a.e(1, "AvodUiFeature__enableChromecast", false).et(this.b)).booleanValue();
    }

    @Override // defpackage.xhn
    public final boolean c() {
        return ((Boolean) a.e(4, "AvodUiFeature__enabled", false).et(this.b)).booleanValue();
    }
}
