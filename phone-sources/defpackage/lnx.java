package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnx implements lxd {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public lnx(Executor executor, san sanVar, lie lieVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = sanVar;
        this.a = lieVar;
    }

    @Override // defpackage.lxd
    public final uhp a(WorkerParameters workerParameters) {
        return this.d != 0 ? sfy.G(new lhx(this, workerParameters, 2), this.c) : sfy.G(new lhx(this, workerParameters, 4), this.c);
    }

    public lnx(kdj kdjVar, kuw kuwVar, Executor executor, int i) {
        this.d = i;
        this.a = kdjVar;
        this.b = kuwVar;
        this.c = executor;
    }
}
