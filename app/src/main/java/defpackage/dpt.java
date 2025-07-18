package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpt implements daj {
    private final Object b;

    public dpt(Object obj) {
        dqk.d(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dpt) {
            return this.b.equals(((dpt) obj).b);
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
