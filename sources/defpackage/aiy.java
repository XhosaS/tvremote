package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiy implements agf {
    final /* synthetic */ Object a;
    final /* synthetic */ qn b;
    private final /* synthetic */ int c;

    public aiy(awy awyVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.b = basePendingResult;
        this.a = awyVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agf
    public final void a(Status status) {
        agi agiVar;
        if (this.c != 0) {
            ((awy) this.a).b.remove(this.b);
            return;
        }
        if (!status.a()) {
            ((adx) this.a).e(qp.t(status));
            return;
        }
        qn qnVar = this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) qnVar;
        qp.n(!basePendingResult.g, "Result has already been consumed.");
        qn qnVar2 = basePendingResult.i;
        qp.n(true, "Cannot await if then() has been called.");
        try {
            if (!((BasePendingResult) qnVar).d.await(0L, timeUnit)) {
                ((BasePendingResult) qnVar).m(Status.c);
            }
        } catch (InterruptedException unused) {
            basePendingResult.m(Status.b);
        }
        qp.n(basePendingResult.p(), "Result is not ready.");
        synchronized (basePendingResult.c) {
            qp.n(!((BasePendingResult) qnVar).g, "Result has already been consumed.");
            qp.n(((BasePendingResult) qnVar).p(), "Result is not ready.");
            agiVar = ((BasePendingResult) qnVar).f;
            ((BasePendingResult) qnVar).f = null;
            ((BasePendingResult) qnVar).g = true;
        }
        ahs ahsVar = (ahs) basePendingResult.e.getAndSet(null);
        if (ahsVar != null) {
            ahsVar.a();
        }
        qp.p(agiVar);
        ((adx) this.a).f(null);
    }

    public aiy(qn qnVar, adx adxVar, int i) {
        this.c = i;
        this.b = qnVar;
        this.a = adxVar;
    }
}
