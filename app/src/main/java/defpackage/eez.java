package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eez {
    public Map a;

    public final void a(String str, Object obj) {
        if (this.a == null) {
            this.a = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.a.put(str, obj);
    }

    public final void b(boolean z) {
        a("is_full_span", Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        a("is_sticky", Boolean.valueOf(z));
    }

    public final void d(int i) {
        a("span_size", Integer.valueOf(i));
    }
}
