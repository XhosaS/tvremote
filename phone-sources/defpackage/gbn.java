package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn<Key, Value> extends gez implements Iterable<Value>, yli {
    public static final gbn a = new gbn(yhb.a, null, null, 0, 0);
    public final List b;
    public final Object c;
    public final Object d;
    public final int e;
    public final int f;

    public gbn(List list, Object obj, Object obj2) {
        this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbn)) {
            return false;
        }
        gbn gbnVar = (gbn) obj;
        return yks.e(this.b, gbnVar.b) && yks.e(this.c, gbnVar.c) && yks.e(this.d, gbnVar.d) && this.e == gbnVar.e && this.f == gbnVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.e) * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator<Value> iterator() {
        return this.b.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.b;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(yfm.U(list));
        sb.append("\n                    |   last Item: ");
        sb.append(yfm.X(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.d);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.c);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.e);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.f);
        sb.append("\n                    |) ");
        return ylh.t(sb.toString());
    }

    public gbn(List list, Object obj, Object obj2, int i, int i2) {
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = i;
        this.f = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }
}
