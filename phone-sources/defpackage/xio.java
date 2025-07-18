package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xio implements xin {

    @Deprecated
    public static final ryn a = xhf.b.d("EnhancedClusterV2Feature__enabled", false);
    private final Context b;

    public xio(Context context) {
        this.b = context;
    }

    @Override // defpackage.xin
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
