package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixq {
    public final String a;
    public final String b;
    public final String c;

    public ixq(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixq)) {
            return false;
        }
        ixq ixqVar = (ixq) obj;
        return agvy.c(this.a, ixqVar.a) && agvy.c(this.b, ixqVar.b) && agvy.c(this.c, ixqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FallbackSuggestion(displayText=" + this.a + ", foreground_app=" + this.b + ", serverLog=" + this.c + ")";
    }
}
