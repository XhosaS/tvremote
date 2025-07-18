package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ags implements aho {
    public final View a;
    public final yjk b;
    public ActionMode f;
    private final bhi g = new bhi((char[]) null, (byte[]) null, (byte[]) null);
    public final bji c = new bji(new zn(this, 18));
    public final yjv d = new zn(this, 19);
    public final yjv e = new zn(this, 20);

    public ags(View view, yjk yjkVar) {
        this.a = view;
        this.b = yjkVar;
    }

    public final Object a(Object obj, yjv yjvVar, yjk yjkVar) throws Throwable {
        ylf ylfVar = new ylf();
        this.c.c(obj, yjvVar, new qm(ylfVar, yjkVar, 8, null));
        Object obj2 = ylfVar.a;
        if (obj2 != null) {
            return obj2;
        }
        yks.c("result");
        return ygi.a;
    }

    @Override // defpackage.aho
    public final Object b(ahn ahnVar, yih yihVar) {
        Object objK = yoz.k(new rx(rv.a, this.g, new ahk(this, ahnVar, (yih) null, 1), null, 0, null), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }
}
