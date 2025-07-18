package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqx extends jrb {
    public jqx() {
        super("USER_SPEAKS");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.j(jrjVar);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).g.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).h.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            float f = jriVar.b;
            int iP = jrjVar.p(jriVar);
            jriVar.h.c(f * (iP != 0 ? iP != 1 ? iP != 2 ? iP != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
