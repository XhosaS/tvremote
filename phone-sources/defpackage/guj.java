package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guj {
    public final String a;
    public final int b;
    public final int c;

    public guj(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guj)) {
            return false;
        }
        guj gujVar = (guj) obj;
        return yks.e(this.a, gujVar.a) && this.b == gujVar.b && this.c == gujVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
