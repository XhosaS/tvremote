package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqw extends jrb {
    public jqw() {
        super("LISTENING");
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
        g(jrjVar, j2);
        return true;
    }
}
