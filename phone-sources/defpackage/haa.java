package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haa implements Iterable, yli {
    public static final haa a = new haa(yhc.a);
    public final Map b;

    public haa(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof haa) && yks.e(this.b, ((haa) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<yfw<String, gzz>> iterator() {
        Map map = this.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new yfw((String) entry.getKey(), (gzz) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.b + ")";
    }

    public haa() {
        this(yhc.a);
    }
}
