package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhk {
    public final kuj a;
    public final wfo b;

    public jhk(kuj kujVar, wfo wfoVar) {
        kujVar.getClass();
        wfoVar.getClass();
        this.a = kujVar;
        this.b = wfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhk)) {
            return false;
        }
        jhk jhkVar = (jhk) obj;
        return yks.e(this.a, jhkVar.a) && yks.e(this.b, jhkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DownloadButtonOptions(downloadStatus=" + this.a + ", dynamicScheme=" + this.b + ")";
    }
}
