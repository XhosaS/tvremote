package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dme {
    public static final Map a;
    public final dmd b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final dlt g;

    static {
        HashMap map = new HashMap();
        map.put(1, new dme(10, dcg.c));
        map.put(2, new dme(16, dcg.c));
        map.put(3, new dme(20, dcg.c));
        map.put(4, new dme(10, dcg.e));
        map.put(5, new dme(16, dcg.e));
        map.put(6, new dme(20, dcg.e));
        map.put(7, new dme(10, dcg.m));
        map.put(8, new dme(16, dcg.m));
        map.put(9, new dme(20, dcg.m));
        map.put(10, new dme(10, dcg.n));
        map.put(11, new dme(16, dcg.n));
        map.put(12, new dme(20, dcg.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public dme(int i, czv czvVar) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (czvVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.c = i;
        int i2 = 2;
        while (true) {
            int i3 = this.c;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.d = i2;
                String str = (String) dlk.a.get(czvVar);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: ".concat(czvVar.b()));
                }
                this.e = str;
                dlt dltVar = new dlt(czvVar);
                this.g = dltVar;
                int i4 = dltVar.a;
                this.f = i4;
                this.b = (dlj) dlj.a.get(dlj.a(str, i4, dltVar.b, i));
                return;
            }
            i2++;
        }
    }

    final dlr a() {
        return new dlr(this.g);
    }

    public dme(int i, deh dehVar) {
        this(i, dlk.a(dehVar.c()));
    }
}
