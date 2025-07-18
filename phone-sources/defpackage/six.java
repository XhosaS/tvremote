package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class six {
    public static final uho e;
    static final ulp f = new ulp("debug.binder.verification");
    private static final Object g;
    public six a;
    public final CopyOnWriteArrayList b;
    public volatile boolean c;
    public volatile siz d;
    private Context h;
    private final Map i = DesugarCollections.synchronizedMap(new HashMap());
    private final Map j = DesugarCollections.synchronizedMap(new HashMap());
    private final Map k = DesugarCollections.synchronizedMap(new HashMap());
    private final ThreadLocal l;

    static {
        sin.o(new ulp("debug.binder.strict_mode"));
        g = new Object();
        e = new uho(new sim());
    }

    public six() {
        DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.l = new ThreadLocal();
        this.d = new sjg();
    }

    private final Object c(Object obj) {
        return this.d.a(obj);
    }

    private final boolean d(Object obj) {
        List list = (List) this.j.get(obj);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final Object a(Class cls) {
        Object obj;
        if (this.h == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        synchronized (c(cls)) {
            Map map = this.i;
            Object obj2 = map.get(cls);
            if (obj2 != null) {
                if (obj2 == g) {
                    obj2 = null;
                }
                return obj2;
            }
            ThreadLocal threadLocal = this.l;
            Boolean bool = (Boolean) threadLocal.get();
            boolean z = bool != null && bool.booleanValue();
            if (!z) {
                threadLocal.set(true);
            }
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                int size = copyOnWriteArrayList.size();
                for (int i = 0; i < size; i++) {
                    ((sjb) copyOnWriteArrayList.get(i)).a();
                    if (!sin.o(f) && (obj = map.get(cls)) != null && obj != g) {
                        return obj;
                    }
                }
                if (!z) {
                    this.l.set(false);
                }
                Map map2 = this.i;
                Object obj3 = map2.get(cls);
                if (obj3 == null) {
                    if (sin.o(f) && d(cls)) {
                        throw new IllegalStateException(hhh.c(cls, "get() called for multibound object: "));
                    }
                    map2.put(cls, g);
                }
                return obj3;
            } finally {
                if (!z) {
                    this.l.set(false);
                }
            }
        }
    }

    public final void b(Object obj, Object obj2) {
        synchronized (c(obj)) {
            if (sin.o(f)) {
                if (d(obj)) {
                    throw new IllegalStateException(hhh.c(obj, "Attempt to single-bind multibound object: "));
                }
                Map map = (Map) this.k.get(obj);
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (it.next() != g) {
                            throw new IllegalStateException(hhh.c(obj, "Attempt to single-bind an object that is already multibound with keys: "));
                        }
                    }
                }
            }
            Map map2 = this.i;
            Object obj3 = map2.get(obj);
            if (obj3 != null) {
                if (obj3 == g) {
                    throw new siw(hhh.c(obj, "Bind call too late - someone already tried to get: "));
                }
                throw new siv("Duplicate binding: " + obj.toString() + ", " + obj3.toString());
            }
            map2.put(obj, obj2);
        }
    }

    public six(Context context) {
        DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.l = new ThreadLocal();
        this.d = new sjg();
        this.h = context;
        this.a = null;
        context.getClass().getName();
        b(Context.class, context);
    }
}
