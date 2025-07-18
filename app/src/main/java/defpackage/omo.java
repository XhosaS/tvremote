package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omo {
    public static zyd a(final Map map, ExecutorService executorService) {
        return xab.c(map.values()).a(new Callable() { // from class: omn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yyn yynVar = new yyn(4);
                for (Map.Entry entry : map.entrySet()) {
                    yynVar.c(entry.getKey(), zxn.o((Future) entry.getValue()));
                }
                return yynVar.a(false);
            }
        }, executorService);
    }
}
