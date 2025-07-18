package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pko implements yjk {
    private final /* synthetic */ int a;

    @Override // defpackage.yjk
    public final Object a() {
        int i = this.a;
        if (i == 0) {
            return null;
        }
        if (i != 1) {
            return ygi.a;
        }
        uie uieVar = new uie();
        uieVar.d("aag-pool-%d");
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4, uie.b(uieVar));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }
}
