package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hno implements hlg {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final hlg g;
    private final Map h;
    private final hll i;
    private int j;

    public hno(Object obj, hlg hlgVar, int i, int i2, Map map, Class cls, Class cls2, hll hllVar) {
        hju.p(obj);
        this.b = obj;
        a.ar(hlgVar, "Signature must not be null");
        this.g = hlgVar;
        this.c = i;
        this.d = i2;
        hju.p(map);
        this.h = map;
        a.ar(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        hju.p(hllVar);
        this.i = hllVar;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hno) {
            hno hnoVar = (hno) obj;
            if (this.b.equals(hnoVar.b) && this.g.equals(hnoVar.g) && this.d == hnoVar.d && this.c == hnoVar.c && this.h.equals(hnoVar.h) && this.e.equals(hnoVar.e) && this.f.equals(hnoVar.f) && this.i.equals(hnoVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        hll hllVar = this.i;
        Map map = this.h;
        hlg hlgVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + hlgVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + hllVar.toString() + "}";
    }
}
