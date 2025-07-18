package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kkj implements kex {
    final /* synthetic */ key a;
    final /* synthetic */ lvj b;

    public kkj(key keyVar, lvj lvjVar) {
        this.a = keyVar;
        this.b = lvjVar;
    }

    @Override // defpackage.kex
    public final void a(Status status) {
        if (!status.c()) {
            this.b.a.o(kin.a(status));
            return;
        }
        key keyVar = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) keyVar;
        kkk.g(!basePendingResult.g, "Result has already been consumed.");
        kie kieVar = basePendingResult.h;
        try {
            if (!((BasePendingResult) keyVar).e.await(0L, timeUnit)) {
                ((BasePendingResult) keyVar).k(Status.d);
            }
        } catch (InterruptedException unused) {
            basePendingResult.k(Status.b);
        }
        kkk.g(basePendingResult.n(), "Result is not ready.");
        basePendingResult.j();
        this.b.a.p(null);
    }
}
