package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ory {
    protected static final Map a = new ConcurrentHashMap();
    protected final String b;

    public ory(String str) {
        this.b = str;
    }

    public static ory a(Class cls) {
        String simpleName = cls.getSimpleName();
        Map map = a;
        if (map.containsKey(simpleName)) {
            return (ory) map.get(simpleName);
        }
        ory oryVar = new ory(simpleName);
        map.put(simpleName, oryVar);
        return oryVar;
    }

    private static String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, objArr);
        }
        return str == null ? "" : str;
    }

    public final void b(String str, Object... objArr) {
        Log.println(6, this.b, d(str, objArr));
    }

    public final void c(String str, Object... objArr) {
        Log.println(4, this.b, d(str, objArr));
    }
}
