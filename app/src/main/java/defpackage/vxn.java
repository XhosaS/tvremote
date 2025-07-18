package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxn {
    public static final vxn a = new vxn(null, Instant.EPOCH, false);
    public final vxm b;
    private final Object c;

    public vxn(Object obj, Instant instant, boolean z) {
        this.c = obj;
        this.b = new vxm(instant, obj != null, z);
    }

    public static vxn a(Object obj, Instant instant) {
        obj.getClass();
        return new vxn(obj, instant, true);
    }

    public final Instant b() {
        vxm vxmVar = this.b;
        yqw.M(vxmVar.b, "Cannot get timestamp for a CacheResult that does not have content");
        yqw.M(d(), "Cannot get timestamp for an invalid CacheResult");
        return vxmVar.a;
    }

    public final Object c() {
        yqw.M(this.b.b, "Cannot get data for a CacheResult that does not have content");
        return this.c;
    }

    public final boolean d() {
        vxm vxmVar = this.b;
        yqw.M(vxmVar.b, "Cannot call isValid() for a CacheResult that does not have content");
        return vxmVar.c;
    }

    public final String toString() {
        vxm vxmVar = this.b;
        if (!vxmVar.b) {
            return "CacheResult.cacheMiss";
        }
        if (!vxmVar.c) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(this.c) + "}";
        }
        Object obj = this.c;
        Instant instant = vxmVar.a;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + instant.toString() + "}";
    }
}
