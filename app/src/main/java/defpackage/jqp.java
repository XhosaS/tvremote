package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqp extends jrb {
    public jqp() {
        super("MOLECULE_DRIFTING");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.l(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.g.c(jrb.a[jrjVar.p(jriVar)]);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            int iP = jrjVar.p(jriVar);
            jrb.p(jriVar, iP, jrb.e(j2, iP));
        }
        return true;
    }
}
