package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zds {
    public final zci a;
    public final int b;
    public final String c;

    public zds(zci zciVar, int i, String str) {
        zciVar.getClass();
        str.getClass();
        this.a = zciVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == zci.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
