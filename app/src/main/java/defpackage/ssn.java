package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssn {
    public final sqn a;
    public final zyd b;

    public ssn(sqn sqnVar, zyd zydVar) {
        this.a = sqnVar;
        this.b = zydVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssn)) {
            return false;
        }
        ssn ssnVar = (ssn) obj;
        return agvy.c(this.a, ssnVar.a) && agvy.c(this.b, ssnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AudioSourceStartedData(sourceAccessor=" + this.a + ", startListeningResult=" + this.b + ")";
    }
}
