package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqk extends jrb {
    public jqk() {
        super("MIC ENTER FAST");
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrb.h(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (!jrb.m(jrjVar)) {
            g(jrjVar, j2);
            return false;
        }
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).g.c(-6.0f);
        }
        jrb.k(jrjVar);
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
