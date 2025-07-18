package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vn implements Map.Entry {
    public final Object a;
    public final Object b;
    vn c;
    public vn d;

    public vn(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vn)) {
            return false;
        }
        vn vnVar = (vn) obj;
        return this.a.equals(vnVar.a) && this.b.equals(vnVar.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
