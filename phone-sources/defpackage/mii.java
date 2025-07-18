package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mii implements xcm {
    private final xcq a;

    public mii(xcq xcqVar) {
        this.a = xcqVar;
    }

    public static ExecutorService c(qwn qwnVar) {
        ExecutorService executorService = qwnVar.k;
        executorService.getClass();
        return executorService;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ExecutorService b() {
        return c((qwn) this.a.b());
    }
}
