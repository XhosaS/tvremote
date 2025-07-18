package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mda implements mcy {
    public final lie a;
    public final Runnable b;
    public final Executor c;
    public final lyz d;
    private final Executor e;

    public mda(ExecutorService executorService, Executor executor, kuw kuwVar, lyz lyzVar, lie lieVar) {
        this.e = executorService;
        this.d = lyzVar;
        this.a = lieVar;
        this.b = new ljl(kuwVar, 13, null);
        this.c = executor;
    }

    @Override // defpackage.mcy
    public final void a(ksn ksnVar, ksy ksyVar, boolean z, int i, String str) {
        String str2 = ksyVar.b;
        xay xayVarN = ksyVar.n();
        krf.c(str2);
        this.e.execute(new mcz(this, ksnVar, str2, xayVarN, z, i, str));
    }
}
