package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lhc implements idy {
    final /* synthetic */ lhe a;
    private final lrr b;

    public lhc(lhe lheVar, lrr lrrVar) {
        this.a = lheVar;
        this.b = lrrVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [idy, java.lang.Object] */
    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(ieg iegVar) {
        Throwable th;
        boolean z;
        byte[] bArrProvideKeyResponse;
        if (!iegVar.m()) {
            Throwable lzkVar = iegVar.d;
            if (lzkVar == null) {
                lzkVar = new lzk(-1);
            }
            lhe lheVar = this.a;
            krd.d(lheVar.b("License request error"), lzkVar);
            lheVar.g(lzkVar);
            return;
        }
        ieg iegVar2 = ((lru) iegVar.g()).b;
        if (!iegVar2.m()) {
            Throwable thI = iegVar2.i();
            lhe lheVar2 = this.a;
            synchronized (lheVar2) {
                if (lheVar2.o(this.b)) {
                    if (thI instanceof lzk) {
                        krd.c(lheVar2.b("License status error [" + ((lzk) thI).a + "]"));
                    } else {
                        krd.d(lheVar2.b("License request error"), thI);
                    }
                    lheVar2.g(thI);
                }
            }
            return;
        }
        lhe lheVar3 = this.a;
        synchronized (lheVar3) {
            if (lheVar3.o(this.b)) {
                try {
                    byte[] bArr = lheVar3.d == 3 ? lheVar3.e : lheVar3.h;
                    lheVar3.f(9);
                    Trace.beginSection("provideKeyResponse");
                    try {
                        bArrProvideKeyResponse = lheVar3.a.provideKeyResponse(bArr, (byte[]) iegVar2.g());
                        tst tstVar = lheVar3.b;
                        if (tstVar.g()) {
                            tstVar.c().c(((lru) iegVar.g()).a);
                        }
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                    }
                    try {
                        lheVar3.f = true;
                        lhe lheVar4 = this.a;
                        lheVar4.s(9, true);
                        Trace.endSection();
                        if (lheVar4.d == 2 && (bArrProvideKeyResponse == null || bArrProvideKeyResponse.length == 0)) {
                            bArrProvideKeyResponse = lheVar4.e;
                        }
                        lheVar4.h(ieg.f(bArrProvideKeyResponse));
                    } catch (Throwable th3) {
                        th = th3;
                        this.a.s(9, z);
                        Trace.endSection();
                        throw th;
                    }
                } catch (DeniedByServerException e) {
                    lhe lheVar5 = this.a;
                    krd.d(lheVar5.b("License denied by server"), e);
                    lheVar5.g(e);
                } catch (NotProvisionedException e2) {
                    this.a.k(2, e2);
                } catch (Exception e3) {
                    lhe lheVar6 = this.a;
                    krd.d(lheVar6.b("Unexpected error when providing the key response"), e3);
                    lheVar6.g(e3);
                }
            }
        }
    }
}
