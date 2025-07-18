package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xwz implements ybp {
    @Override // defpackage.ybp
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(xxc.i("grpc-default-executor-%d"));
    }

    @Override // defpackage.ybp
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
