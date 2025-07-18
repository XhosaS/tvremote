package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmw implements xmv {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;
    private final Context c;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("UserConfigFeature__is_dogfood_user", false);
        b = rzyVar.d("UserConfigFeature__is_teamfood_user", false);
    }

    public xmw(Context context) {
        this.c = context;
    }

    @Override // defpackage.xmv
    public final boolean a() {
        return ((Boolean) a.et(this.c)).booleanValue();
    }

    @Override // defpackage.xmv
    public final boolean b() {
        return ((Boolean) b.et(this.c)).booleanValue();
    }
}
