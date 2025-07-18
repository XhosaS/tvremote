package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ddf implements daj {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final daj g;
    private final Map h;
    private final dan i;
    private int j;

    public ddf(Object obj, daj dajVar, int i, int i2, Map map, Class cls, Class cls2, dan danVar) {
        dqk.d(obj, "Argument must not be null");
        this.b = obj;
        dqk.d(dajVar, "Signature must not be null");
        this.g = dajVar;
        this.c = i;
        this.d = i2;
        dqk.d(map, "Argument must not be null");
        this.h = map;
        dqk.d(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        dqk.d(danVar, "Argument must not be null");
        this.i = danVar;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof ddf) {
            ddf ddfVar = (ddf) obj;
            if (this.b.equals(ddfVar.b) && this.g.equals(ddfVar.g) && this.d == ddfVar.d && this.c == ddfVar.c && this.h.equals(ddfVar.h) && this.e.equals(ddfVar.e) && this.f.equals(ddfVar.f) && this.i.equals(ddfVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
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
        int iHashCode6 = (iHashCode5 * 31) + this.i.b.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        dan danVar = this.i;
        Map map = this.h;
        daj dajVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + dajVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + danVar.toString() + "}";
    }
}
