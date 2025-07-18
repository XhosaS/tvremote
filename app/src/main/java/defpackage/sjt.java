package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjt extends sjq {
    public final sjd a;
    private final int b;

    public sjt(sjd sjdVar, int i) {
        this.a = sjdVar;
        this.b = i;
    }

    @Override // defpackage.sjq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.sjq
    public final sjd b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjq) {
            sjq sjqVar = (sjq) obj;
            if (this.a.equals(sjqVar.b()) && this.b == sjqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "AudioRequestClientData{audioRequestClient=" + this.a.toString() + ", clientToken=" + this.b + "}";
    }
}
