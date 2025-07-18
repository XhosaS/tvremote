package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyw {
    private String c = null;
    public Boolean a = null;
    private Integer d = null;
    public ThreadFactory b = null;

    public static ThreadFactory a(zyw zywVar) {
        String str = zywVar.c;
        Boolean bool = zywVar.a;
        Integer num = zywVar.d;
        ThreadFactory threadFactoryDefaultThreadFactory = zywVar.b;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new zyv(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num);
    }

    public final void b(String str) {
        String.format(Locale.ROOT, str, 0);
        this.c = str;
    }

    public final void c(int i) {
        yqw.G(true, "Thread priority (%s) must be >= %s", i, 1);
        yqw.G(true, "Thread priority (%s) must be <= %s", i, 10);
        this.d = Integer.valueOf(i);
    }
}
