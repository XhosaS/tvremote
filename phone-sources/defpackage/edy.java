package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edy {
    public final int d;

    public edy(int i) {
        this.d = i;
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return e(this.d);
    }
}
