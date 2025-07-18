package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjq extends sbx {
    public final jaf a;
    private final jzs b;
    private final cxe c;

    public jjq(cxe cxeVar, jzs jzsVar, jan janVar, jaf jafVar) {
        jzsVar.getClass();
        janVar.getClass();
        jafVar.getClass();
        this.c = cxeVar;
        this.b = jzsVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Object objA;
        Object next;
        jjn jjnVar = (jjn) obj;
        List list = (List) obj2;
        ylh.f(list);
        iea ieaVar = (iea) p(jef.b);
        if (ieaVar != null) {
            m(ieaVar);
        }
        if (ieaVar != null) {
            m(ieaVar);
            objA = ieaVar.a();
        } else {
            objA = null;
        }
        if (objA == null || yks.e(objA, wni.a)) {
            wti wtiVar = (wti) jjnVar.b;
            wni wniVar = wtiVar.d;
            if (wniVar == null) {
                wniVar = wni.a;
            }
            idr idrVar = ieaVar instanceof idr ? (idr) ieaVar : null;
            if (idrVar != null) {
                wni wniVar2 = wtiVar.d;
                if (wniVar2 == null) {
                    wniVar2 = wni.a;
                }
                idrVar.c(wniVar2);
            }
            objA = wniVar;
        }
        objA.getClass();
        wni wniVar3 = (wni) objA;
        wti wtiVar2 = (wti) jjnVar.b;
        vun vunVar = wtiVar2.c;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wni wniVar4 = ((wth) next).c;
            if (wniVar4 == null) {
                wniVar4 = wni.a;
            }
            if (yks.e(wniVar4, wniVar3)) {
                break;
            }
        }
        wth wthVar = (wth) next;
        if (wthVar == null) {
            vun vunVar2 = wtiVar2.c;
            vunVar2.getClass();
            wthVar = (wth) yfm.X(vunVar2);
        }
        jju jjuVar = new jju(this.c.a);
        jjuVar.a = new jeu(this, jjnVar, 13);
        jjuVar.b = new jfu(this, 3);
        jjuVar.F(((ixi) jjnVar).a, new String[0]);
        if (wthVar != null) {
            String str = wthVar.d;
            if (!yks.e(jjuVar.f, str)) {
                jjuVar.f = str;
                jjuVar.G(3);
            }
            wls wlsVar = wthVar.e;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            if (!yks.e(jjuVar.c, wlsVar)) {
                jjuVar.c = wlsVar;
                jjuVar.G(0);
            }
        }
        iut iutVar = new iut((sbx) this, (Object) jjnVar, 19);
        jjuVar.d = new scc("R.id.selected_season", jjuVar, iutVar);
        jjuVar.G(1);
        jjuVar.e = new scc("R.id.selected_season_text", jjuVar, iutVar);
        jjuVar.G(2);
        Map map = jjnVar.e;
        Object obj3 = map.get(wniVar3);
        Object obj4 = obj3;
        if (obj3 == null) {
            gag gagVar = jjnVar.f;
            jzs jzsVar = (jzs) gagVar.e.b();
            jzsVar.getClass();
            irc ircVar = (irc) gagVar.c.b();
            ircVar.getClass();
            kw kwVar = (kw) gagVar.b.b();
            kwVar.getClass();
            isf isfVar = (isf) gagVar.d.b();
            isfVar.getClass();
            ino inoVar = (ino) gagVar.a.b();
            inoVar.getClass();
            kcv kcvVar = new kcv(jzsVar, ircVar, kwVar, isfVar, inoVar, wniVar3);
            ykr.q(yoz.m(), null, 0, new imw(kcvVar, jjnVar, (yih) null, 14), 3);
            map.put(wniVar3, kcvVar);
            obj4 = kcvVar;
        }
        List<ixh> listH = ((iyd) obj4).h();
        ArrayList arrayList = new ArrayList(yfm.z(listH, 10));
        for (ixh ixhVar : listH) {
            arrayList.add((scf) this.b.c(ixhVar).l(ixhVar));
        }
        list.clear();
        list.add(jjuVar);
        list.addAll(arrayList);
        r().az(new ixz());
    }
}
