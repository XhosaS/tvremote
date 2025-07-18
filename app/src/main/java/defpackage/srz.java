package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srz {
    public final sqn a;
    public final sry b;
    public final ssm c;
    private final sst d;

    public srz(sqn sqnVar, sry sryVar, sst sstVar, ssm ssmVar) {
        this.a = sqnVar;
        this.b = sryVar;
        this.d = sstVar;
        this.c = ssmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srz)) {
            return false;
        }
        srz srzVar = (srz) obj;
        return agvy.c(this.a, srzVar.a) && agvy.c(this.b, srzVar.b) && agvy.c(this.d, srzVar.d) && agvy.c(this.c, srzVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AudioSourceData(sourceAccessor=" + this.a + ", client=" + this.b + ", route=" + this.d + ", session=" + this.c + ")";
    }
}
