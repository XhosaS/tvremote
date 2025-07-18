package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dam {
    public static final dal a = new dak();
    public final Object b;
    public final dal c;
    public final String d;
    public volatile byte[] e;

    public dam(String str, Object obj, dal dalVar) {
        dqk.b(str);
        this.d = str;
        this.b = obj;
        this.c = dalVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dam) {
            return this.d.equals(((dam) obj).d);
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
