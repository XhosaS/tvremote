package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lex implements ler {
    public final LinkedHashMap a = new lew(this, ((int) Math.ceil(26.66666603088379d)) + 1);

    public final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized ArrayList b() {
        return new ArrayList(this.a.values());
    }

    public final synchronized void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a.put(obj, obj2);
    }

    public final synchronized void d(Object obj) {
        obj.getClass();
        this.a.remove(obj);
    }

    public final synchronized String toString() {
        return this.a.toString();
    }
}
