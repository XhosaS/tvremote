package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpq implements xpp {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;

    @Deprecated
    public static final ryn d;

    static {
        rzy rzyVar = xnz.b;
        a = rzyVar.e("10", new xpd(5), "EOgHGAQ");
        b = rzyVar.d("45673425", false);
        c = rzyVar.d("45673426", true);
        d = rzyVar.d("45684338", true);
    }

    @Override // defpackage.xpp
    public final zah a(Context context) {
        return (zah) a.et(context);
    }

    @Override // defpackage.xpp
    public final boolean b(Context context) {
        return ((Boolean) b.et(context)).booleanValue();
    }

    @Override // defpackage.xpp
    public final boolean c(Context context) {
        return ((Boolean) c.et(context)).booleanValue();
    }

    @Override // defpackage.xpp
    public final boolean d(Context context) {
        return ((Boolean) d.et(context)).booleanValue();
    }
}
