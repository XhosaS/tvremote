package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tco implements vtg {
    private final vtm a;
    private final Executor b;

    public tco(vtm vtmVar, Executor executor) {
        this.a = vtmVar;
        this.b = executor;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(WorkerParameters workerParameters) {
        return zuz.g(this.a.b(workerParameters.a), wyo.a(new yqi() { // from class: tcn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new cbr(caz.b);
            }
        }), this.b);
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
