package defpackage;

import java.lang.annotation.Annotation;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakw {
    private final String a;
    private final Map b;

    public aakw(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final Annotation a(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aakw)) {
            return false;
        }
        aakw aakwVar = (aakw) obj;
        return this.a.equals(aakwVar.a) && this.b.equals(aakwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + String.valueOf(this.b.values()) + "}";
    }
}
