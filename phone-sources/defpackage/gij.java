package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gij {
    public static volatile gij a;
    public static final Object b = new Object();
    public final Context e;
    public final Set d = new HashSet();
    final Map c = new HashMap();

    public gij(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (gli.o()) {
            try {
                gli.n(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        Map map = this.c;
        if (map.containsKey(cls)) {
            this.c.get(cls);
        } else {
            set.add(cls);
            try {
                gik gikVar = (gik) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listB = gikVar.b();
                if (!listB.isEmpty()) {
                    for (Class cls2 : listB) {
                        if (!map.containsKey(cls2)) {
                            a(cls2, set);
                        }
                    }
                }
                Object objA = gikVar.a(this.e);
                set.remove(cls);
                map.put(cls, objA);
            } catch (Throwable th) {
                throw new gil(th);
            }
        }
    }
}
