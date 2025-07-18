package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqb extends jrb {
    public jqb() {
        super("REPLY");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.q(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).d(false);
        }
        jrb.q(jrjVar);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        if (j2 - j > 300) {
            Iterator it = jrjVar.iterator();
            while (it.hasNext()) {
                ((jri) it.next()).d(true);
            }
        }
        Iterator it2 = jrjVar.iterator();
        while (it2.hasNext()) {
            jri jriVar = (jri) it2.next();
            jriVar.c.c((jriVar.b * 4.0f) + 4.0f);
        }
        return true;
    }
}
