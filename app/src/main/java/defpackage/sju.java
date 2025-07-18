package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sju extends sjr {
    public final rux a;
    private final int b;

    public sju(rux ruxVar, int i) {
        this.a = ruxVar;
        this.b = i;
    }

    @Override // defpackage.sjr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.sjr
    public final rux b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjr) {
            sjr sjrVar = (sjr) obj;
            if (this.a.equals(sjrVar.b()) && this.b == sjrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "AudioRequestListeningSessionData{audioRequestListeningSession=" + this.a.toString() + ", sessionToken=" + this.b + "}";
    }
}
