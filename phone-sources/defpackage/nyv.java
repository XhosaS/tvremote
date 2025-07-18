package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyv extends nzi {
    private final WeakReference a;

    public nyv(nyw nywVar) {
        this.a = new WeakReference(nywVar);
    }

    @Override // defpackage.nzi
    public final void a() {
        nyw nywVar = (nyw) this.a.get();
        if (nywVar == null) {
            return;
        }
        nywVar.p();
    }
}
