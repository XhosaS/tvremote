package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqi extends jrb {
    public jqi() {
        super("MIC_EXIT");
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.k.c(0.0f);
            jriVar.f.c(0.0f);
            jriVar.g.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        jrjVar.s().k.c(0.0f);
        jrjVar.v().k.c(0.0f);
        jrjVar.r().k.c(0.0f);
        if (jrjVar.s().k.f < 0.5f) {
            jrjVar.q().k.c(0.0f);
            jrjVar.s().f.c(0.0f);
            jrjVar.v().f.c(0.0f);
        }
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            o(jrjVar, (jri) it.next(), j2);
        }
        Iterator it2 = jrjVar.iterator();
        while (it2.hasNext()) {
            if (((jri) it2.next()).g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
    }
}
