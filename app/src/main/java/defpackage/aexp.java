package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexp implements aexo {

    @Deprecated
    public static final rjx a;

    @Deprecated
    public static final rjx b;

    static {
        rjy rjyVar = aewi.a;
        a = rjyVar.d("45359255", false);
        b = rjyVar.d("36", true);
    }

    @Override // defpackage.aexo
    public final boolean a(Context context) {
        return ((Boolean) a.eW(context)).booleanValue();
    }

    @Override // defpackage.aexo
    public final boolean b(Context context) {
        return ((Boolean) b.eW(context)).booleanValue();
    }
}
