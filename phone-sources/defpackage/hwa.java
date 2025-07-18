package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwa implements hlg {
    private final Object b;

    public hwa(Object obj) {
        hju.p(obj);
        this.b = obj;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hwa) {
            return this.b.equals(((hwa) obj).b);
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
