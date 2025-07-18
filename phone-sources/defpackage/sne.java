package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sne {
    public final String a;
    public final Class b;

    public sne(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sne) {
            sne sneVar = (sne) obj;
            if (this.b == sneVar.b && this.a.equals(sneVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
