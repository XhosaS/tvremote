package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqf extends jrb {
    public jqf() {
        super("GOOGLE LOGO");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        jrjVar.i(true);
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.j.c(1.0f);
            jriVar.i.c(1.0f);
            jriVar.f.c(jrjVar.o(jriVar));
            jriVar.g.c(0.0f);
        }
    }

    @Override // defpackage.jrb
    public final boolean c(long j, long j2, jrj jrjVar) {
        return false;
    }

    @Override // defpackage.jrb
    public final void b(jrj jrjVar) {
    }
}
