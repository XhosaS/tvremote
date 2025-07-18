package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqo extends jrb {
    public jqo() {
        super("MOLECULE_WAVY");
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
            float fE = jrb.e(j2, iP);
            jrb.p(jriVar, iP, fE);
            if (jriVar == jrjVar.q()) {
                if (fE % 0.5d < 0.25d) {
                    jriVar.e.c(14.0f);
                } else {
                    jriVar.e.c(12.0f);
                }
            }
        }
        return true;
    }
}
