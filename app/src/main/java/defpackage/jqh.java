package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqh extends jrb {
    public jqh() {
        super("MIC ENTER");
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrb.h(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (!jrb.m(jrjVar)) {
            g(jrjVar, j2);
            return true;
        }
        long j3 = j2 - j;
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            if ((j3 / 300.0f) - (jrjVar.p(jriVar) * 0.15f) < 0.0f) {
                o(jrjVar, jriVar, j2);
            } else {
                jriVar.g.c(-6.0f);
            }
        }
        if (jrjVar.q().g.f < -5.666999816894531d) {
            jrb.k(jrjVar);
        }
        Iterator it2 = jrjVar.iterator();
        while (it2.hasNext()) {
            if (!((jri) it2.next()).g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
    }
}
