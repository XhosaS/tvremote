package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpr extends cpq {
    public int m;

    public cpr(cpz cpzVar) {
        super(cpzVar);
        this.l = true != (cpzVar instanceof cpv) ? 3 : 2;
    }

    @Override // defpackage.cpq
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((cpo) it.next()).f();
        }
    }
}
