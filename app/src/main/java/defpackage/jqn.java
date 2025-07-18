package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqn extends jrb {
    public jqn() {
        super("MOLECULE_EXIT");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrjVar.f();
        jrb.f(jrjVar);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.e.c(4.0f);
            jriVar.f.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrb.i(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (j2 - j >= 100) {
            g(jrjVar, j2);
            return false;
        }
        jrjVar.q().g.c(16.0f);
        jrjVar.s().g.c(9.0f);
        jrjVar.v().g.c(14.0f);
        jrjVar.r().g.c(10.0f);
        return true;
    }
}
