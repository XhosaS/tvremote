package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqr extends jrb {
    public jqr() {
        super("MOLECULE HIDDEN");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.l(jrjVar);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.g.c(jrb.a[jrjVar.p(jriVar)] + 10.0f);
            jrjVar.e(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrjVar.e(0.0f);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        return false;
    }
}
