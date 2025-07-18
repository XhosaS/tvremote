package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@fxn(a = "dialog")
/* loaded from: classes.dex */
public final class fyg extends fxo<fyf> {
    @Override // defpackage.fxo
    public final /* bridge */ /* synthetic */ fxb a() {
        return new fyf(this, new cns(null), fxy.a);
    }

    public final yva d() {
        return f().d;
    }

    @Override // defpackage.fxo
    public final void e(List list, fxh fxhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f().f((fwr) it.next());
        }
    }

    @Override // defpackage.fxo
    public final void g(fwr fwrVar, boolean z) {
        f().e(fwrVar, z);
        int iO = yfm.O((Iterable) f().e.d(), fwrVar);
        int i = 0;
        for (Object obj : (Iterable) f().e.d()) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            fwr fwrVar2 = (fwr) obj;
            if (i > iO) {
                h(fwrVar2);
            }
            i = i2;
        }
    }

    public final void h(fwr fwrVar) {
        f().c(fwrVar);
    }
}
