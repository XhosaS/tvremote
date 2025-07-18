package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xht implements xhs {

    @Deprecated
    public static final ryn a = xhf.b.d("BrazilRatingsFeature__enabled", true);
    private final Context b;

    public xht(Context context) {
        this.b = context;
    }

    @Override // defpackage.xhs
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
