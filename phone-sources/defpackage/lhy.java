package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhy implements lxd {
    public final Object a;
    private final Executor b;
    private final /* synthetic */ int c;

    public lhy(Executor executor, Object obj, int i) {
        this.c = i;
        this.b = executor;
        this.a = obj;
    }

    @Override // defpackage.lxd
    public final uhp a(WorkerParameters workerParameters) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? sfy.G(new lhx(this, workerParameters, 8), this.b) : sfy.G(new lhx(this, workerParameters, 5), this.b) : sfy.G(new lhx(this, workerParameters, 3), this.b) : sfy.G(new lhx(this, workerParameters, 1), this.b) : sfy.G(new lhx(this, workerParameters, 0), this.b);
    }
}
