package defpackage;

import java.util.Iterator;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ndb extends nde {
    public ndb() {
        super("LISTENING_RANDOM_LINES");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.j(ndmVar);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().j(0.0f);
        }
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().h(0.0f);
        }
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (j2 % 5 == 0) {
            Random random = new Random();
            Iterator<ndl> it = ndmVar.iterator();
            while (it.hasNext()) {
                ndl next = it.next();
                float fNextFloat = random.nextFloat();
                int iC = ndmVar.c(next);
                next.h(fNextFloat * (iC != 0 ? iC != 1 ? iC != 2 ? iC != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
            }
        }
        return true;
    }
}
