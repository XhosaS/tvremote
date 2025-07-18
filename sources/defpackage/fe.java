package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fe {
    public int a;
    public int b;
    public Object c = null;
    public int d;

    public fe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        if (this.a != feVar.a || this.d != feVar.d || this.b != feVar.b) {
            return false;
        }
        Object obj2 = feVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? "??" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:null]");
        return sb.toString();
    }
}
