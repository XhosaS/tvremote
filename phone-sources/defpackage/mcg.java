package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcg implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;

    public mcg(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mru b() {
        lyz lyzVar = (lyz) this.a.b();
        ExecutorService executorService = (ExecutorService) this.b.b();
        ((kpw) this.c).b();
        return new mru(lyzVar, executorService, ((mbw) this.d).b());
    }
}
