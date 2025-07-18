package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmd implements xmc {

    @Deprecated
    public static final ryn a = xhf.b.d("SouthAfricaRatingsFeature__enabled", true);
    private final Context b;

    public xmd(Context context) {
        this.b = context;
    }

    @Override // defpackage.xmc
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
