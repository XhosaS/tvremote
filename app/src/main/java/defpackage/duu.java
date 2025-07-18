package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class duu {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = new HashMap();
    final Set c = new HashSet();

    final synchronized void a(dxy dxyVar) {
        this.c.add(dxyVar);
    }

    public final synchronized void b(dxy dxyVar) {
        Set set = this.c;
        set.remove(dxyVar);
        if (set.isEmpty()) {
            this.b.clear();
            boolean z = ebc.a;
            this.a.clear();
        }
    }
}
