package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bba {
    public static volatile baz a = null;
    public static volatile boolean b = false;
    public static final bbj c;
    public static final AtomicInteger d;
    private static final Object i = new Object();
    public final String e;
    public volatile int f = -1;
    public volatile Object g;
    public final bzt h;
    private Object j;
    private volatile boolean k;

    static {
        new AtomicReference();
        c = new bbj();
        d = new AtomicInteger();
    }

    public bba(bzt bztVar, String str, Object obj) {
        if (bztVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.h = bztVar;
        this.e = str;
        this.j = obj;
        this.k = false;
    }

    public static void e() {
        d.incrementAndGet();
    }

    public static void f(Context context) {
        if (a != null || context == null) {
            return;
        }
        Object obj = i;
        synchronized (obj) {
            if (a == null) {
                synchronized (obj) {
                    baz bazVar = a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (bazVar == null || bazVar.a != context) {
                        if (bazVar != null) {
                            baj.a();
                            bbc.a();
                            bao.a();
                        }
                        a = new baz(context, bit.k(new asf(context, 19)));
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
        return d((String) this.h.c);
    }

    public final String d(String str) {
        return str.isEmpty() ? this.e : str.concat(this.e);
    }
}
