package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gpz {
    public static void e(Context context, tae taeVar) {
        context.getClass();
        taeVar.getClass();
        grs.l(context, taeVar);
    }

    public abstract gps a(String str);

    public abstract uhp b(String str);

    public abstract void c(String str);

    public abstract gps d(String str, int i, List list);

    public abstract gps f(String str, int i, cvi cviVar);

    public final gps g(String str, int i, cvi cviVar) {
        str.getClass();
        return d(str, i, yfm.p(cviVar));
    }
}
