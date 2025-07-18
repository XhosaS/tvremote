package defpackage;

import defpackage.fxb;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fxo<D extends fxb> {
    public fxq a;
    public boolean b;

    public abstract fxb a();

    public boolean b() {
        return true;
    }

    public void e(List list, fxh fxhVar) {
        yna ynaVar = new yna(new ymu(new ynb(yfm.ar(list), (yjv) new bap(this, 19), 2), false, new qyx(10)), 1);
        while (ynaVar.hasNext()) {
            f().f((fwr) ynaVar.next());
        }
    }

    public final fxq f() {
        fxq fxqVar = this.a;
        if (fxqVar != null) {
            return fxqVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(fwr fwrVar, boolean z) {
        List list = (List) f().d.d();
        if (!list.contains(fwrVar)) {
            throw new IllegalStateException(a.ck(list, fwrVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        ListIterator listIterator = list.listIterator(list.size());
        fwr fwrVar2 = null;
        while (b()) {
            fwrVar2 = (fwr) listIterator.previous();
            if (yks.e(fwrVar2, fwrVar)) {
                break;
            }
        }
        if (fwrVar2 != null) {
            f().d(fwrVar2, z);
        }
    }

    public fxb c(fxb fxbVar) {
        return fxbVar;
    }
}
