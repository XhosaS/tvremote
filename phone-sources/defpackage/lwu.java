package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwu {
    public final lwq a;
    public final int b;
    public final lwo c;

    public lwu(lwq lwqVar, int i, lwo lwoVar) {
        lwqVar.getClass();
        this.a = lwqVar;
        this.b = i;
        this.c = lwoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lwu lwuVar = (lwu) obj;
            if (this.b != lwuVar.b || !this.a.equals(lwuVar.a)) {
                return false;
            }
            lwo lwoVar = this.c;
            if (lwoVar == null ? lwuVar.c == null : lwoVar.equals(lwuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lwo lwoVar = this.c;
        return ((iHashCode + this.b) * 31) + (lwoVar != null ? lwoVar.hashCode() : 0);
    }
}
