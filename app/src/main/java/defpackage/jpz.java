package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jpz extends jrb {
    public jpz() {
        super("DIDN'T GET IT");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrb.j(jrjVar);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).f.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        float f;
        Iterator it = jrjVar.iterator();
        while (true) {
            f = (j2 - j) / 550.0f;
            if (!it.hasNext()) {
                break;
            }
            jri jriVar = (jri) it.next();
            jriVar.f.c((float) (Math.sin((f - (jrjVar.p(jriVar) * 0.030909091f)) * 6.2831855f * 3.0f) * 6.0d));
            o(jrjVar, jriVar, j2);
        }
        return f < 1.0f;
    }
}
