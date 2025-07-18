package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyo extends ong {
    private final WeakReference a;

    public nyo(nyr nyrVar) {
        this.a = new WeakReference(nyrVar);
    }

    @Override // defpackage.ong
    public final void a(onl onlVar) {
        nyr nyrVar = (nyr) this.a.get();
        if (nyrVar == null) {
            return;
        }
        nyrVar.a.f(new nyn(nyrVar, nyrVar, onlVar));
    }
}
