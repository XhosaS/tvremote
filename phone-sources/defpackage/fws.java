package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fws extends fxq {
    public final fxo a;
    public final /* synthetic */ fwv b;

    public fws(fwv fwvVar, fxo fxoVar) {
        this.b = fwvVar;
        this.a = fxoVar;
    }

    @Override // defpackage.fxq
    public final fwr a(fxb fxbVar, Bundle bundle) {
        fyr fyrVar = this.b.b;
        return fus.Q(fyrVar.w(), fxbVar, bundle, fyrVar.a(), fyrVar.k);
    }

    public final void b(fwr fwrVar) {
        fwrVar.getClass();
        synchronized (this.h) {
            yvc yvcVar = this.f;
            yvcVar.e(yfm.ag((Collection) yvcVar.d(), fwrVar));
        }
    }

    @Override // defpackage.fxq
    public final void c(fwr fwrVar) {
        fww fwwVar;
        fwrVar.getClass();
        aye ayeVar = new aye(this, fwrVar, 11);
        fyr fyrVar = this.b.b;
        Map map = fyrVar.r;
        boolean zE = yks.e(map.get(fwrVar), true);
        ayeVar.a();
        map.remove(fwrVar);
        ygx ygxVar = fyrVar.f;
        if (ygxVar.contains(fwrVar)) {
            if (this.c) {
                return;
            }
            fyrVar.l();
            fyrVar.t.eV(yfm.an(ygxVar));
            fyrVar.u.eV(fyrVar.h());
            return;
        }
        fyrVar.u(fwrVar);
        if (((dvl) fwrVar.getLifecycle()).b.a(dvd.c)) {
            fwrVar.c(dvd.a);
        }
        if (!ygxVar.isEmpty()) {
            Iterator<E> it = ygxVar.iterator();
            while (it.hasNext()) {
                if (yks.e(((fwr) it.next()).d, fwrVar.d)) {
                    break;
                }
            }
            if (!zE) {
                fwwVar.a(fwrVar.d);
            }
        } else if (!zE && (fwwVar = fyrVar.k) != null) {
            fwwVar.a(fwrVar.d);
        }
        fyrVar.l();
        fyrVar.u.eV(fyrVar.h());
    }

    @Override // defpackage.fxq
    public final void d(fwr fwrVar, boolean z) throws Resources.NotFoundException {
        aye ayeVar = new aye(this, fwrVar, 12);
        fyr fyrVar = this.b.b;
        fxo fxoVarB = fyrVar.n.b(fwrVar.a.a);
        fyrVar.r.put(fwrVar, Boolean.valueOf(z));
        if (!yks.e(fxoVarB, this.a)) {
            Object obj = fyrVar.o.get(fxoVarB);
            obj.getClass();
            ((fws) obj).d(fwrVar, z);
            return;
        }
        yjv yjvVar = fyrVar.q;
        if (yjvVar != null) {
            yjvVar.a(fwrVar);
            ayeVar.a();
            return;
        }
        ddd dddVar = new ddd(ayeVar, 16);
        ygx ygxVar = fyrVar.f;
        int iIndexOf = ygxVar.indexOf(fwrVar);
        if (iIndexOf < 0) {
            Objects.toString(fwrVar);
            return;
        }
        int i = iIndexOf + 1;
        if (i != ygxVar.a) {
            fyrVar.m(((fwr) ygxVar.get(i)).a.b(), true, false);
        }
        fyr.s(fyrVar, fwrVar);
        dddVar.a();
        fyrVar.b.a();
        fyrVar.v();
    }

    @Override // defpackage.fxq
    public final void e(fwr fwrVar, boolean z) {
        Object objPrevious;
        fwrVar.getClass();
        yvc yvcVar = this.g;
        Iterable iterable = (Iterable) yvcVar.d();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((fwr) it.next()) == fwrVar) {
                    Iterable iterable2 = (Iterable) this.d.d();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((fwr) it2.next()) == fwrVar) {
                        }
                    }
                    return;
                }
            }
        }
        yvcVar.e(wcq.al((Set) yvcVar.d(), fwrVar));
        yva yvaVar = this.d;
        List list = (List) yvaVar.d();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            fwr fwrVar2 = (fwr) objPrevious;
            if (!yks.e(fwrVar2, fwrVar) && ((List) yvaVar.d()).lastIndexOf(fwrVar2) < ((List) yvaVar.d()).lastIndexOf(fwrVar)) {
                break;
            }
        }
        fwr fwrVar3 = (fwr) objPrevious;
        if (fwrVar3 != null) {
            yvcVar.e(wcq.al((Set) yvcVar.d(), fwrVar3));
        }
        d(fwrVar, z);
    }

    @Override // defpackage.fxq
    public final void f(fwr fwrVar) {
        fwrVar.getClass();
        fyr fyrVar = this.b.b;
        fxo fxoVarB = fyrVar.n.b(fwrVar.a.a);
        if (yks.e(fxoVarB, this.a)) {
            yjv yjvVar = fyrVar.p;
            if (yjvVar == null) {
                Objects.toString(fwrVar.a);
                return;
            } else {
                yjvVar.a(fwrVar);
                b(fwrVar);
                return;
            }
        }
        Object obj = fyrVar.o.get(fxoVarB);
        if (obj != null) {
            ((fws) obj).f(fwrVar);
            return;
        }
        throw new IllegalStateException("NavigatorBackStack for " + fwrVar.a.a + " should already be created");
    }
}
