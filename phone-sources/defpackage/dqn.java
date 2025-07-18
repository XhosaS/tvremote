package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqn implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    final /* synthetic */ AbstractMap c;
    private final /* synthetic */ int d;

    public dqn(AbstractMap abstractMap, Comparable comparable, Object obj, int i) {
        this.d = i;
        this.c = abstractMap;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.d != 0) {
            return this.a.compareTo(((dqn) obj).a);
        }
        return this.a.compareTo(((dqn) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.d != 0) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a.au(this.a, entry.getKey()) && a.au(this.b, entry.getValue());
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        return a.au(this.a, entry2.getKey()) && a.au(this.b, entry2.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.d != 0 ? this.a : this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d != 0 ? this.b : this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.d != 0) {
            Comparable comparable = this.a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }
        Comparable comparable2 = this.a;
        int iHashCode2 = comparable2 == null ? 0 : comparable2.hashCode();
        Object obj2 = this.b;
        return iHashCode2 ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.d != 0) {
            ((dfw) this.c).f();
            Object obj2 = this.b;
            this.b = obj;
            return obj2;
        }
        ((dqq) this.c).f();
        Object obj3 = this.b;
        this.b = obj;
        return obj3;
    }

    public final String toString() {
        if (this.d != 0) {
            return this.a + "=" + this.b;
        }
        return this.a + "=" + this.b;
    }
}
