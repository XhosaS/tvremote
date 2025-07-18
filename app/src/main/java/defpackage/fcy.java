package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcy {
    public final String a;
    public final String b;
    public final String c;

    public fcy(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean a() {
        return new agyu("[0-9A-Z]{32}").c(this.a) && this.b.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcy)) {
            return false;
        }
        fcy fcyVar = (fcy) obj;
        return agvy.c(this.a, fcyVar.a) && agvy.c(this.b, fcyVar.b) && agvy.c(this.c, fcyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CastInfoContainer(cloudDeviceId=" + this.a + ", cert=" + this.b + ", source=" + this.c + ")";
    }

    public /* synthetic */ fcy() {
        this("", "", "");
    }
}
