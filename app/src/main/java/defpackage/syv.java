package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syv {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public syv(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syv)) {
            return false;
        }
        syv syvVar = (syv) obj;
        return agvy.c(this.a, syvVar.a) && this.b == syvVar.b && this.c == syvVar.c && this.d == syvVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Config(name=" + this.a + ", encodingFormat=" + this.b + ", channelCount=" + this.c + ", sampleRateHz=" + this.d + ")";
    }
}
