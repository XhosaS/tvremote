package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcb implements daj {
    private final daj b;
    private final daj c;

    public dcb(daj dajVar, daj dajVar2) {
        this.b = dajVar;
        this.c = dajVar2;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dcb) {
            dcb dcbVar = (dcb) obj;
            if (this.b.equals(dcbVar.b) && this.c.equals(dcbVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        daj dajVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(dajVar) + "}";
    }
}
