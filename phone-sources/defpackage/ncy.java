package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncy extends nde {
    public ncy() {
        super("APPEAR");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().n(1.0f);
        }
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        return false;
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
    }
}
