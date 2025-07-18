package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhe implements xhd {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;

    static {
        rzy rzyVar = xhb.b;
        a = rzyVar.d("45410057", true);
        b = rzyVar.d("45633393", false);
        c = rzyVar.d("45408267", true);
    }

    @Override // defpackage.xhd
    public final boolean a(Context context) {
        return ((Boolean) a.et(context)).booleanValue();
    }

    @Override // defpackage.xhd
    public final boolean b(Context context) {
        return ((Boolean) b.et(context)).booleanValue();
    }

    @Override // defpackage.xhd
    public final boolean c(Context context) {
        return ((Boolean) c.et(context)).booleanValue();
    }
}
