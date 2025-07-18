package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnx implements hlg {
    private static final hwl b = new hwl(50);
    private final hlg c;
    private final hlg d;
    private final int e;
    private final int f;
    private final Class g;
    private final hll h;
    private final hlp i;
    private final hok j;

    public hnx(hok hokVar, hlg hlgVar, hlg hlgVar2, int i, int i2, hlp hlpVar, Class cls, hll hllVar) {
        this.j = hokVar;
        this.c = hlgVar;
        this.d = hlgVar2;
        this.e = i;
        this.f = i2;
        this.i = hlpVar;
        this.g = cls;
        this.h = hllVar;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        hok hokVar = this.j;
        byte[] bArr = (byte[]) hokVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        hlp hlpVar = this.i;
        if (hlpVar != null) {
            hlpVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        hwl hwlVar = b;
        byte[] bytes = (byte[]) hwlVar.g(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            hwlVar.h(cls, bytes);
        }
        messageDigest.update(bytes);
        hokVar.c(bArr);
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hnx) {
            hnx hnxVar = (hnx) obj;
            if (this.f == hnxVar.f && this.e == hnxVar.e) {
                hlp hlpVar = this.i;
                hlp hlpVar2 = hnxVar.i;
                char[] cArr = hwp.a;
                if (a.au(hlpVar, hlpVar2) && this.g.equals(hnxVar.g) && this.c.equals(hnxVar.c) && this.d.equals(hnxVar.d) && this.h.equals(hnxVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        hlp hlpVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + this.e) * 31) + this.f;
        if (hlpVar != null) {
            iHashCode2 = (iHashCode2 * 31) + hlpVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        hll hllVar = this.h;
        hlp hlpVar = this.i;
        Class cls = this.g;
        hlg hlgVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(hlgVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(hlpVar) + "', options=" + String.valueOf(hllVar) + "}";
    }
}
