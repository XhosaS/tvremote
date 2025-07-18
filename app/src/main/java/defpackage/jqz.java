package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqz extends jrb {
    public jqz() {
        super("GOT IT");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.j(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).g.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        float f;
        Iterator it = jrjVar.iterator();
        while (true) {
            f = (j2 - j) / 1000.0f;
            if (!it.hasNext()) {
                break;
            }
            jri jriVar = (jri) it.next();
            float fP = f - (jrjVar.p(jriVar) * 0.05f);
            if (fP < 0.0f) {
                o(jrjVar, jriVar, j2);
            } else if (fP < 0.15f) {
                jriVar.g.c(-8.0f);
            } else if (fP < 0.3f) {
                jriVar.g.c(8.0f);
            } else {
                o(jrjVar, jriVar, j2);
            }
        }
        return f < 1.0f;
    }
}
