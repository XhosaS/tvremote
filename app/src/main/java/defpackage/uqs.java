package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uqs {
    public final String a;
    public final Class b;

    public uqs(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqs) {
            uqs uqsVar = (uqs) obj;
            if (this.b == uqsVar.b && this.a.equals(uqsVar.a)) {
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
