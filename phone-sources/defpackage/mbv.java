package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbv implements lxd {
    public final mab a;
    public final mcw b;
    public final mcj c;
    public final lht d;
    public final lys e;
    public final lzq f;
    public final jzs g;
    private final Executor h;

    public mbv(mab mabVar, mcw mcwVar, lys lysVar, mcj mcjVar, jzs jzsVar, lzq lzqVar, lht lhtVar, ExecutorService executorService) {
        this.a = mabVar;
        this.b = mcwVar;
        this.e = lysVar;
        this.c = mcjVar;
        this.g = jzsVar;
        this.f = lzqVar;
        this.d = lhtVar;
        this.h = executorService;
    }

    @Override // defpackage.lxd
    public final uhp a(WorkerParameters workerParameters) {
        return sfy.G(new lhx(this, workerParameters, 6), this.h);
    }
}
