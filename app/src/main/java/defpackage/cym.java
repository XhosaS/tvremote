package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cym {
    private final Map a;

    public cym(cyl cylVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(cylVar.a));
    }

    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }
}
