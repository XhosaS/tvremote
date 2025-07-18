package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdf implements xdd {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xcv.b;
        a = rzyVar.e("1", new xde(0), "CAI");
        b = rzyVar.b("2", 150L);
    }

    @Override // defpackage.xdd
    public final long a(Context context) {
        return ((Long) b.et(context)).longValue();
    }

    @Override // defpackage.xdd
    public final uvl b(Context context) {
        return (uvl) a.et(context);
    }
}
