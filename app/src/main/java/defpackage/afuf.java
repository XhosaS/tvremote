package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afuf implements Runnable {
    final /* synthetic */ afug a;

    public afuf(afug afugVar) {
        this.a = afugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afug afugVar = this.a;
        afun afunVar = afugVar.f.c;
        Collection collection = afunVar.y;
        if (collection != null) {
            collection.remove(afugVar);
            if (afunVar.y.isEmpty()) {
                afunVar.U.c(afunVar.z, false);
                afunVar.y = null;
                if (afunVar.C.get()) {
                    afunVar.B.a(afun.b);
                }
            }
        }
    }
}
