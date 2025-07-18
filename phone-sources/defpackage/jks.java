package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jks extends sbx {
    public final jaf a;
    public final jan b;
    private final cxe c;

    public jks(cxe cxeVar, jan janVar, jaf jafVar) {
        janVar.getClass();
        jafVar.getClass();
        this.c = cxeVar;
        this.b = janVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        jkw jkwVar = new jkw(this.c.a);
        jkwVar.a = new jeu(this, jryVar, 17);
        jkwVar.b = new jev(this, jryVar, 14);
        return jkwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iof, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        Object obj3 = jryVar.b;
        ?? r1 = jryVar.d;
        jkw jkwVar = (jkw) obj2;
        wui wuiVar = (wui) obj3;
        wll wllVar = wuiVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(r1.a(wllVar));
        jkwVar.F(((ixi) jryVar).a, new String[0]);
        jla jlaVar = new jla((Object) this, (ixi) jryVar, 1);
        boolean z = (jryVar.q() == null || !ihz.E(jryVar.p()) || ihz.H(jryVar.p())) ? false : true;
        if (jkwVar.i != z) {
            jkwVar.i = z;
            Iterator it = jkwVar.j.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        sco scoVar = new sco(jryVar.r());
        if (!yks.e(jkwVar.e, scoVar)) {
            jkwVar.e = scoVar;
            jkwVar.G(2);
        }
        wls wlsVar = wuiVar.e;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        if (!yks.e(jkwVar.f, wlsVar)) {
            jkwVar.f = wlsVar;
            jkwVar.G(3);
        }
        wls wlsVarK = ihz.k(jryVar.p());
        if (!yks.e(jkwVar.g, wlsVarK)) {
            jkwVar.g = wlsVarK;
            jkwVar.G(4);
        }
        jkwVar.h = new scc("R.id.cta", jkwVar, jlaVar);
        jkwVar.G(5);
        wlx wlxVarO = ihz.U(jryVar.o()) ? null : jryVar.o();
        if (!yks.e(jkwVar.c, wlxVarO)) {
            jkwVar.c = wlxVarO;
            jkwVar.G(0);
        }
        sco scoVar2 = new sco(ihz.U(jryVar.o()) ? jryVar.r() : null);
        if (yks.e(jkwVar.d, scoVar2)) {
            return;
        }
        jkwVar.d = scoVar2;
        jkwVar.G(1);
    }
}
