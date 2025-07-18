package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes3.dex */
public final class ysd {
    public static final ysc a = new ysc();
    public final Object b;

    public static final Object a(Object obj) {
        if (obj instanceof ysc) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        ysb ysbVar = obj instanceof ysb ? (ysb) obj : null;
        if (ysbVar != null) {
            return ysbVar.a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof ysc);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ysd) && yks.e(this.b, ((ysd) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof ysb ? ((ysb) obj).toString() : a.cj(obj, "Value(", ")");
    }
}
