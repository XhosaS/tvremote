package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddr implements daj {
    private static final dqh b = new dqh(50);
    private final ddx c;
    private final daj d;
    private final daj e;
    private final int f;
    private final int g;
    private final Class h;
    private final dan i;
    private final dar j;

    public ddr(ddx ddxVar, daj dajVar, daj dajVar2, int i, int i2, dar darVar, Class cls, dan danVar) {
        this.c = ddxVar;
        this.d = dajVar;
        this.e = dajVar2;
        this.f = i;
        this.g = i2;
        this.j = darVar;
        this.h = cls;
        this.i = danVar;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        ddx ddxVar = this.c;
        byte[] bArr = (byte[]) ddxVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        dar darVar = this.j;
        if (darVar != null) {
            darVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        Class cls = this.h;
        dqh dqhVar = b;
        byte[] bytes = (byte[]) dqhVar.f(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            dqhVar.g(cls, bytes);
        }
        messageDigest.update(bytes);
        ddxVar.c(bArr);
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof ddr) {
            ddr ddrVar = (ddr) obj;
            if (this.g == ddrVar.g && this.f == ddrVar.f && dqm.g(this.j, ddrVar.j) && this.h.equals(ddrVar.h) && this.d.equals(ddrVar.d) && this.e.equals(ddrVar.e) && this.i.equals(ddrVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        int iHashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        dar darVar = this.j;
        if (darVar != null) {
            iHashCode = (iHashCode * 31) + darVar.hashCode();
        }
        return (((iHashCode * 31) + this.h.hashCode()) * 31) + this.i.b.hashCode();
    }

    public final String toString() {
        dan danVar = this.i;
        dar darVar = this.j;
        Class cls = this.h;
        daj dajVar = this.e;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.d) + ", signature=" + String.valueOf(dajVar) + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(darVar) + "', options=" + String.valueOf(danVar) + "}";
    }
}
