package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncm extends nde {
    public ncm() {
        super("MIC ENTER FAST");
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndf.h(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (!ndf.m(ndmVar)) {
            ndf.f(ndmVar, j2);
            return false;
        }
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().j(-6.0f);
        }
        ndf.k(ndmVar);
        Iterator<ndl> it2 = ndmVar.iterator();
        while (it2.hasNext()) {
            if (!it2.next().x()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
    }
}
