package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahxz implements Map.Entry, Comparable, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public abstract Object a();

    public abstract Object b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ahxz ahxzVar = (ahxz) obj;
        ahxx ahxxVar = new ahxx();
        ahxxVar.a(a(), ahxzVar.a());
        ahxxVar.a(b(), ahxzVar.b());
        return ahxxVar.a;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(a(), entry.getKey()) && Objects.equals(b(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return a();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return b();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hashCode(a()) ^ Objects.hashCode(b());
    }

    public final String toString() {
        return "(" + String.valueOf(a()) + "," + b().toString() + ")";
    }
}
