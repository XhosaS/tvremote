package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrl extends sbx {
    public final itk a;
    public final jaf b;
    public final irc c;
    private final dxc d;

    public jrl(dxc dxcVar, irc ircVar, itk itkVar, jaf jafVar) {
        ircVar.getClass();
        itkVar.getClass();
        jafVar.getClass();
        this.d = dxcVar;
        this.c = ircVar;
        this.a = itkVar;
        this.b = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jro jroVar = new jro(this.d.a);
        jroVar.a = new jmm(this, ixiVar, 18);
        jroVar.b = new jnq(this, ixiVar, 14);
        return jroVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jro jroVar = (jro) obj2;
        ksf ksfVarA = ksf.a();
        ksfVarA.d(60000L);
        m(ksfVarA);
        boolean z = false;
        jroVar.F(ixiVar.a, new String[0]);
        wtd wtdVar = (wtd) ixiVar.b;
        wls wlsVar = wtdVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jroVar.e, wlsVar)) {
            jroVar.e = wlsVar;
            jroVar.G(3);
        }
        wls wlsVar2 = wtdVar.d;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jroVar.f, wlsVar2)) {
            jroVar.f = wlsVar2;
            jroVar.G(4);
        }
        String str = wtdVar.e;
        if (!yks.e(jroVar.h, str)) {
            jroVar.h = str;
            jroVar.G(7);
        }
        wlx wlxVar = wtdVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        if (ihz.U(wlxVar)) {
            wls wlsVar3 = wtdVar.c;
            if (wlsVar3 == null) {
                wlsVar3 = wls.a;
            }
            jroVar.s(wlsVar3);
            jroVar.r(null);
        } else {
            jroVar.s(null);
            wlx wlxVar2 = wtdVar.b;
            if (wlxVar2 == null) {
                wlxVar2 = wlx.a;
            }
            jroVar.r(wlxVar2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        vwe vweVarE = vxf.e(jCurrentTimeMillis);
        vweVarE.getClass();
        vwe vweVar = wtdVar.h;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        long jB = vxf.b(vweVar);
        vwe vweVar2 = wtdVar.g;
        if (vweVar2 == null) {
            vweVar2 = vwe.a;
        }
        vwe vweVar3 = wtdVar.h;
        if (vweVar3 == null) {
            vweVar3 = vwe.a;
        }
        long jC = vxd.c(vxf.c(vweVar2, vweVar3));
        vwe vweVar4 = wtdVar.g;
        if (vweVar4 == null) {
            vweVar4 = vwe.a;
        }
        long jC2 = vxd.c(vxf.c(vweVar4, vweVarE));
        boolean z2 = jB > jCurrentTimeMillis;
        if (jroVar.i != z2) {
            jroVar.i = z2;
            Iterator it = jroVar.j.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        Integer numValueOf = Integer.valueOf((int) (jC > 0 ? (jC2 * 100) / jC : 0L));
        if (!yks.e(jroVar.c, numValueOf)) {
            jroVar.c = numValueOf;
            jroVar.G(0);
        }
        jroVar.g = new scc("R.id.live_tv_card_component", jroVar, new jla((Object) this, ixiVar, 14));
        jroVar.G(6);
        kkb kkbVar = new kkb(this.a, !yks.e(wtdVar.i, "play-movies"), z, 28);
        if (yks.e(jroVar.d, kkbVar)) {
            return;
        }
        jroVar.d = kkbVar;
        jroVar.G(1);
    }
}
