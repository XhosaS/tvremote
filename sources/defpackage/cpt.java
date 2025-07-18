package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpt implements cps {

    @Deprecated
    public static final bcl a;

    @Deprecated
    public static final bcl b;

    @Deprecated
    public static final bcl c;

    @Deprecated
    public static final bcl d;

    static {
        awy awyVar = cpq.b;
        a = awyVar.f("45701201", false);
        b = awyVar.e("45701203", 524288L);
        c = awyVar.e("45701204", 5L);
        d = awyVar.e("45701202", 100L);
    }

    @Override // defpackage.cps
    public final long a(Context context) {
        return ((Long) b.aM(context)).longValue();
    }

    @Override // defpackage.cps
    public final long b(Context context) {
        return ((Long) c.aM(context)).longValue();
    }

    @Override // defpackage.cps
    public final long c(Context context) {
        return ((Long) d.aM(context)).longValue();
    }

    @Override // defpackage.cps
    public final boolean d(Context context) {
        return ((Boolean) a.aM(context)).booleanValue();
    }
}
