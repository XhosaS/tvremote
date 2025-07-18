package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pob extends poc {
    private final Choreographer b = Choreographer.getInstance();

    @Override // defpackage.poc
    public final void a(poa poaVar) {
        if (poaVar.a == null) {
            poaVar.a = new dgq(poaVar, 2);
        }
        this.b.postFrameCallback(poaVar.a);
    }
}
