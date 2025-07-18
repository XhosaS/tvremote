package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jra extends jrb {
    public jra() {
        super("LISTENING_GOT_IT_LOOPED");
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
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            float fP = ((j2 - j) / 1000.0f) - (jrjVar.p(jriVar) * 0.05f);
            if (fP < 0.0f) {
                o(jrjVar, jriVar, j2);
            } else {
                float f = fP % 1.3f;
                if (f < 0.15f) {
                    jriVar.g.c(-8.0f);
                } else if (f < 0.3f) {
                    jriVar.g.c(8.0f);
                } else {
                    o(jrjVar, jriVar, j2);
                }
            }
        }
        return true;
    }
}
