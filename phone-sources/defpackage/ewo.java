package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewo {
    public final int a;
    public final boolean b;

    public ewo(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ewo ewoVar = (ewo) obj;
            if (this.a == ewoVar.a && this.b == ewoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
