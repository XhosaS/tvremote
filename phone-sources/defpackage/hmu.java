package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmu implements hlg {
    private final hlg b;
    private final hlg c;

    public hmu(hlg hlgVar, hlg hlgVar2) {
        this.b = hlgVar;
        this.c = hlgVar2;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hmu) {
            hmu hmuVar = (hmu) obj;
            if (this.b.equals(hmuVar.b) && this.c.equals(hmuVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        hlg hlgVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(hlgVar) + "}";
    }
}
