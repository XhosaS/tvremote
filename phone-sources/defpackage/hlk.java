package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlk {
    public static final hlj a = new hli();
    public final Object b;
    public final hlj c;
    public final String d;
    public volatile byte[] e;

    public hlk(String str, Object obj, hlj hljVar) {
        hju.n(str);
        this.d = str;
        this.b = obj;
        hju.p(hljVar);
        this.c = hljVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hlk) {
            return this.d.equals(((hlk) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
