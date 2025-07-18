package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tol {
    public final Map a = new HashMap();
    public final Object b = new Object();

    public final zyd a(String str) {
        zyd zydVar;
        synchronized (this.b) {
            zydVar = (zyd) this.a.get(str);
        }
        return zydVar;
    }
}
