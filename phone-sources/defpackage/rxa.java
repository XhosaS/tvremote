package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rxa {
    public static volatile rwz a = null;
    public static volatile boolean b = false;
    public static final AtomicInteger c;
    public static final shy g;
    private static final Object i = new Object();
    public final String d;
    public volatile int e = -1;
    public volatile Object f;
    public final aafi h;
    private Object j;
    private volatile boolean k;

    static {
        new AtomicReference();
        g = new shy();
        c = new AtomicInteger();
    }

    public rxa(aafi aafiVar, String str, Object obj) {
        if (aafiVar.c == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.h = aafiVar;
        this.d = str;
        this.j = obj;
        this.k = false;
    }

    public static void e() {
        c.incrementAndGet();
    }

    public static void f(Context context) {
        if (a != null || context == null) {
            return;
        }
        Object obj = i;
        synchronized (obj) {
            if (a == null) {
                synchronized (obj) {
                    rwz rwzVar = a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (rwzVar == null || rwzVar.a != context) {
                        if (rwzVar != null) {
                            rwl.a();
                            rxc.a();
                            rwq.a();
                        }
                        a = new rwz(context, sij.l(new rtb(context, 9)));
                        e();
                    }
                }
            }
        }
    }

    public abstract Object a(Object obj);

    public final Object b() {
        return this.j;
    }

    public final String c() {
        return d((String) this.h.a);
    }

    public final String d(String str) {
        return str.isEmpty() ? this.d : str.concat(this.d);
    }
}
