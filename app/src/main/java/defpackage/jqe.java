package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqe extends jrb {
    public jqe() {
        super("GOOGLE LOGO ENTER");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.j(jrjVar);
        jrjVar.i(true);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.j.c(1.0f);
            jriVar.i.c(1.0f);
            jriVar.f.c(jrjVar.o(jriVar));
            jriVar.g.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        float f;
        if (!jrb.m(jrjVar)) {
            g(jrjVar, j2);
            return true;
        }
        long j3 = j2 - j;
        Iterator it = jrjVar.iterator();
        while (true) {
            f = j3 / 300.0f;
            if (!it.hasNext()) {
                break;
            }
            jri jriVar = (jri) it.next();
            if (f - (jrjVar.p(jriVar) * 0.15f) > 0.0f) {
                jriVar.j.c(1.0f);
                jriVar.i.c(1.0f);
                jriVar.f.c(jrjVar.o(jriVar));
                jriVar.g.c(0.0f);
            } else {
                o(jrjVar, jriVar, j2);
            }
        }
        return f < 1.0f;
    }
}
