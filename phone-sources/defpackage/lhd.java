package defpackage;

import android.media.DeniedByServerException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lhd implements idy {
    final /* synthetic */ lhe a;
    private final mfp b;

    public lhd(lhe lheVar, mfp mfpVar) {
        this.a = lheVar;
        this.b = mfpVar;
    }

    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(ieg iegVar) {
        if (!iegVar.m()) {
            Throwable thI = iegVar.i();
            lhe lheVar = this.a;
            synchronized (lheVar) {
                if (lheVar.o(this.b)) {
                    krd.d(lheVar.b("Provisioning request error"), thI);
                    lheVar.g(thI);
                }
            }
            return;
        }
        lhe lheVar2 = this.a;
        synchronized (lheVar2) {
            if (lheVar2.o(this.b)) {
                try {
                    lheVar2.a.provideProvisionResponse((byte[]) iegVar.g());
                    int i = lheVar2.g;
                    if (i == 0) {
                        lheVar2.h(ieg.a);
                    } else if (i != 1) {
                        lheVar2.j();
                    } else {
                        lheVar2.e();
                    }
                } catch (DeniedByServerException e) {
                    lhe lheVar3 = this.a;
                    krd.c(lheVar3.b("Provisioning denied by server"));
                    lheVar3.g(e);
                }
            }
        }
    }
}
