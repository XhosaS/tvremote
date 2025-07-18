package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqq implements xcm {
    private final kqf a;
    private final xcq b;
    private final xcq c;
    private final xcq d;

    public kqq(kqf kqfVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = kqfVar;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
    }

    public static lzz c(kqf kqfVar, ExecutorService executorService, lyz lyzVar, iej iejVar) {
        lzz lzzVarI = kqfVar.i(executorService, lyzVar, iejVar);
        lzzVarI.getClass();
        return lzzVarI;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lzz b() {
        return c(this.a, (ExecutorService) this.b.b(), (lyz) this.c.b(), (iej) this.d.b());
    }
}
