package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnb {
    public static final cld a(List list, cld cldVar) {
        list.getClass();
        boolean zC = cldVar.g.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zC2 = cldVar.g.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zC3 = cldVar.g.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zC || !zC2 || !zC3) {
            return cldVar;
        }
        String str = cldVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cav.b(cldVar.g, linkedHashMap);
        linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return cld.f(cldVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", cav.a(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
