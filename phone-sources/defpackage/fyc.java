package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
@fxn(a = "composable")
/* loaded from: classes.dex */
public final class fyc extends fxo<fyb> {
    public final bcb c = new bci(false, bcz.c);

    @Override // defpackage.fxo
    public final /* bridge */ /* synthetic */ fxb a() {
        return new fyb(this, fxx.a);
    }

    public final void d(fwr fwrVar) {
        f().c(fwrVar);
    }

    @Override // defpackage.fxo
    public final void e(List list, fxh fxhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fwr fwrVar = (fwr) it.next();
            fxq fxqVarF = f();
            fwrVar.getClass();
            yvc yvcVar = fxqVarF.g;
            Iterable iterable = (Iterable) yvcVar.d();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((fwr) it2.next()) == fwrVar) {
                        Iterable iterable2 = (Iterable) fxqVarF.d.d();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((fwr) it3.next()) == fwrVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            fwr fwrVar2 = (fwr) yfm.X((List) fxqVarF.d.d());
            if (fwrVar2 != null) {
                yvcVar.e(wcq.al((Set) yvcVar.d(), fwrVar2));
            }
            yvcVar.e(wcq.al((Set) yvcVar.d(), fwrVar));
            fxqVarF.f(fwrVar);
        }
        this.c.b(false);
    }

    @Override // defpackage.fxo
    public final void g(fwr fwrVar, boolean z) {
        f().e(fwrVar, z);
        this.c.b(true);
    }

    public final void h(fwr fwrVar) {
        fxq fxqVarF = f();
        fwrVar.getClass();
        yvc yvcVar = fxqVarF.g;
        yvcVar.e(wcq.al((Set) yvcVar.d(), fwrVar));
        if (!((fws) fxqVarF).b.b.f.contains(fwrVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        fwrVar.c(dvd.d);
    }
}
