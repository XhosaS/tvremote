package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vux implements vtg {
    public final agow a;
    private final vtv b;

    public vux(agow agowVar, vtv vtvVar) {
        this.a = agowVar;
        this.b = vtvVar;
    }

    @Override // defpackage.vtu
    public final zyd a(WorkerParameters workerParameters) {
        return ((vtg) this.a.a()).a(workerParameters);
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(final WorkerParameters workerParameters) {
        final wvx wvxVarF = wzg.f("NoAccountWorkerFactory startWork()", wwb.a, true);
        try {
            zyd zydVarC = this.b.c(new zvh() { // from class: vuw
                @Override // defpackage.zvh
                public final zyd a() {
                    zyd zydVarB = ((vtg) this.a.a.a()).b(workerParameters);
                    wvxVarF.a(zydVarB);
                    return zydVarB;
                }
            });
            wvxVarF.close();
            return zydVarC;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
