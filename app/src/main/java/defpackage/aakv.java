package defpackage;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakv {
    private final String a;
    private Map b = null;

    public aakv(String str) {
        this.a = str;
    }

    public final aakw a() {
        Map map = this.b;
        return new aakw(this.a, map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(map)));
    }

    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(aald.class, annotation);
    }
}
