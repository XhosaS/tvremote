package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class jqv extends jrb {
    public jqv() {
        super("APPEAR");
    }

    @Override // defpackage.jrb
    public final void a(jrj jrjVar) {
        Iterator it = jrjVar.iterator();
        while (it.hasNext()) {
            ((jri) it.next()).i.c(1.0f);
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
