package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvn {
    public static final Map a;
    public final zvm b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final zvc g;

    static {
        HashMap map = new HashMap();
        map.put(1, new zvn(10, zln.c));
        map.put(2, new zvn(16, zln.c));
        map.put(3, new zvn(20, zln.c));
        map.put(4, new zvn(10, zln.e));
        map.put(5, new zvn(16, zln.e));
        map.put(6, new zvn(20, zln.e));
        map.put(7, new zvn(10, zln.m));
        map.put(8, new zvn(16, zln.m));
        map.put(9, new zvn(20, zln.m));
        map.put(10, new zvn(10, zln.n));
        map.put(11, new zvn(16, zln.n));
        map.put(12, new zvn(20, zln.n));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public zvn(int i, zjb zjbVar) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (zjbVar == null) {
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
                String str = (String) zut.a.get(zjbVar);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: ".concat(zjbVar.b()));
                }
                this.e = str;
                zvc zvcVar = new zvc(zjbVar);
                this.g = zvcVar;
                int i4 = zvcVar.a;
                this.f = i4;
                this.b = (zus) zus.a.get(zus.a(str, i4, zvcVar.b, i));
                return;
            }
            i2++;
        }
    }

    final zva a() {
        return new zva(this.g);
    }

    public zvn(int i, znp znpVar) {
        this(i, zut.a(znpVar.c()));
    }
}
