package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afud implements Runnable {
    final /* synthetic */ afug a;
    final /* synthetic */ afuh b;

    public afud(afuh afuhVar, afug afugVar) {
        this.a = afugVar;
        this.b = afuhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afuh afuhVar = this.b;
        if (afuhVar.a.get() != afun.e) {
            this.a.j();
            return;
        }
        afun afunVar = afuhVar.c;
        if (afunVar.y == null) {
            afunVar.y = new LinkedHashSet();
            afunVar.U.c(afunVar.z, true);
        }
        afunVar.y.add(this.a);
    }
}
