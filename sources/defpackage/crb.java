package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crb implements cra {

    @Deprecated
    public static final bcl a;

    @Deprecated
    public static final bcl b;

    static {
        awy awyVar = cqc.b;
        a = awyVar.f("45359255", false);
        b = awyVar.f("36", true);
    }

    @Override // defpackage.cra
    public final boolean a(Context context) {
        return ((Boolean) a.aM(context)).booleanValue();
    }

    @Override // defpackage.cra
    public final boolean b(Context context) {
        return ((Boolean) b.aM(context)).booleanValue();
    }
}
