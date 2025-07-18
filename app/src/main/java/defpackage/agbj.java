package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbj implements afzt {
    @Override // defpackage.afzt
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(afrq.j("grpc-okhttp-%d"));
    }

    @Override // defpackage.afzt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
