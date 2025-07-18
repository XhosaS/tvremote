package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xox implements xow {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xnz.b;
        a = rzyVar.d("45359255", false);
        b = rzyVar.d("36", true);
    }

    @Override // defpackage.xow
    public final boolean a(Context context) {
        return ((Boolean) a.et(context)).booleanValue();
    }

    @Override // defpackage.xow
    public final boolean b(Context context) {
        return ((Boolean) b.et(context)).booleanValue();
    }
}
