package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqg extends jrb {
    public jqg() {
        super("GOOGLE LOGO EXIT");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrjVar.i(true);
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
        jrjVar.t().i.c(0.0f);
        jrjVar.u().i.c(0.0f);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.j.c(0.0f);
            jriVar.f.c(0.0f);
        }
        jrjVar.i(false);
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        jri jriVarT = jrjVar.t();
        jri jriVarU = jrjVar.u();
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            if (((j2 - j) / 500.0f) - (jrjVar.p(jriVar) * 0.15f) > 0.0f) {
                jriVar.j.c(0.0f);
                jriVar.f.c(0.0f);
                if (jriVar == jriVarT || jriVar == jriVarU) {
                    jriVar.i.c(0.0f);
                }
                o(jrjVar, jriVar, j2);
            }
        }
        return jriVarT.h() || jriVarU.h();
    }
}
