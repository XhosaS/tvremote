package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uft {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    private final ConcurrentMap c;

    public uft(ConcurrentMap concurrentMap) {
        this.c = concurrentMap;
    }

    public static yqt a(FileChannel fileChannel, boolean z) throws IOException {
        try {
            return yqt.i(new ufq(fileChannel.lock(0L, Long.MAX_VALUE, z)));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return ypv.a;
            }
            throw e;
        }
    }

    public final Semaphore b(String str) {
        return (Semaphore) ConcurrentMap.EL.computeIfAbsent(this.c, str, new Function() { // from class: ufp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l = uft.a;
                return new Semaphore(1);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Deprecated
    public uft() {
        this.c = new ConcurrentHashMap();
    }
}
