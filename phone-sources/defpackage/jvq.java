package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvq extends sbx {
    public final jaf a;
    private final hfw b;

    public jvq(hfw hfwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jvt jvtVar = new jvt();
        jvtVar.a = new jsi(this, ixiVar, 12);
        jvtVar.b = new jtt(this, ixiVar, 8);
        return jvtVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        final ixi ixiVar = (ixi) obj;
        String str = ixiVar.a;
        final jvt jvtVar = (jvt) obj2;
        final ulp ulpVarR = r();
        jvtVar.F(str, new String[0]);
        wue wueVar = (wue) ixiVar.b;
        wot wotVar = wueVar.c;
        if (wotVar == null) {
            wotVar = wot.a;
        }
        wos wosVar = wotVar.c;
        if (wosVar == null) {
            wosVar = wos.a;
        }
        wosVar.getClass();
        String str2 = wosVar.b;
        vun<wov> vunVar = wosVar.c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wov wovVar : vunVar) {
            kvw kvwVarA = kkw.a();
            kvwVarA.f(wovVar.b);
            vun<wor> vunVar2 = wovVar.c;
            vunVar2.getClass();
            ArrayList arrayList2 = new ArrayList(yfm.z(vunVar2, 10));
            for (wor worVar : vunVar2) {
                worVar.getClass();
                String str3 = wovVar.b;
                str3.getClass();
                str3.getClass();
                arrayList2.add(jwq.ag(worVar, str3, str3));
            }
            kvwVarA.d(arrayList2);
            arrayList.add(kvwVarA.c());
        }
        vun vunVar3 = wosVar.d;
        vunVar3.getClass();
        ArrayList arrayList3 = new ArrayList(yfm.z(vunVar3, 10));
        Iterator<E> it = vunVar3.iterator();
        while (it.hasNext()) {
            arrayList3.add(new kkx(new HashSet(((wou) it.next()).b)));
        }
        kkv kkvVar = new kkv(str2, arrayList, yfm.aq(arrayList3));
        if (!yks.e(jvtVar.d, kkvVar)) {
            jvtVar.d = kkvVar;
            jvtVar.G(1);
        }
        wot wotVar2 = wueVar.c;
        if (wotVar2 == null) {
            wotVar2 = wot.a;
        }
        wos wosVar2 = wotVar2.c;
        if (wosVar2 == null) {
            wosVar2 = wos.a;
        }
        wosVar2.getClass();
        String str4 = wosVar2.b;
        vun<wov> vunVar4 = wosVar2.c;
        vunVar4.getClass();
        ArrayList arrayList4 = new ArrayList(yfm.z(vunVar4, 10));
        for (wov wovVar2 : vunVar4) {
            xwk xwkVarB = ses.b();
            xwkVarB.e(wovVar2.b);
            vun<wor> vunVar5 = wovVar2.c;
            vunVar5.getClass();
            ArrayList arrayList5 = new ArrayList(yfm.z(vunVar5, 10));
            for (wor worVar2 : vunVar5) {
                worVar2.getClass();
                String str5 = wovVar2.b;
                str5.getClass();
                str5.getClass();
                arrayList5.add(jwq.ah(worVar2, str5, str5));
            }
            xwkVarB.c(arrayList5);
            arrayList4.add(xwkVarB.b());
        }
        vun vunVar6 = wosVar2.d;
        vunVar6.getClass();
        ArrayList arrayList6 = new ArrayList(yfm.z(vunVar6, 10));
        Iterator<E> it2 = vunVar6.iterator();
        while (it2.hasNext()) {
            arrayList6.add(new set(new HashSet(((wou) it2.next()).b)));
        }
        ser serVar = new ser(str4, arrayList4, yfm.aq(arrayList6));
        if (!yks.e(jvtVar.c, serVar)) {
            jvtVar.c = serVar;
            jvtVar.G(0);
        }
        wot wotVar3 = wueVar.c;
        if (wotVar3 == null) {
            wotVar3 = wot.a;
        }
        jvtVar.r(wotVar3.d);
        sdw sdwVar = new sdw() { // from class: jvp
            @Override // defpackage.sdw
            public final void a(List list) {
                list.getClass();
                jvtVar.r(list);
                vtw vtwVarM = wod.a.m();
                wot wotVar4 = ((wue) ixiVar.b).c;
                if (wotVar4 == null) {
                    wotVar4 = wot.a;
                }
                wos wosVar3 = wotVar4.c;
                if (wosVar3 == null) {
                    wosVar3 = wos.a;
                }
                String str6 = wosVar3.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ulp ulpVar = ulpVarR;
                wod wodVar = (wod) vtwVarM.b;
                str6.getClass();
                wodVar.b = str6;
                vtwVarM.aO(list);
                vuc vucVarR = vtwVarM.r();
                vucVarR.getClass();
                ulpVar.az(new ixv((wod) vucVarR));
            }
        };
        if (!yks.e(jvtVar.e, sdwVar)) {
            jvtVar.e = sdwVar;
            jvtVar.G(3);
        }
        mlh mlhVar = new mlh(jvtVar, ulpVarR, ixiVar, 1);
        if (yks.e(jvtVar.f, mlhVar)) {
            return;
        }
        jvtVar.f = mlhVar;
        jvtVar.G(4);
    }
}
