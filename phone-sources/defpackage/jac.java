package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jac {
    public final out a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final jbm g;
    public final boolean h;
    public final wdq i;

    public jac(out outVar, boolean z, boolean z2, Integer num, Integer num2, String str, jbm jbmVar, boolean z3, wdq wdqVar) {
        outVar.getClass();
        str.getClass();
        jbmVar.getClass();
        this.a = outVar;
        this.b = z;
        this.c = z2;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = jbmVar;
        this.h = z3;
        this.i = wdqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jac)) {
            return false;
        }
        jac jacVar = (jac) obj;
        return yks.e(this.a, jacVar.a) && this.b == jacVar.b && this.c == jacVar.c && yks.e(this.d, jacVar.d) && yks.e(this.e, jacVar.e) && yks.e(this.f, jacVar.f) && this.g == jacVar.g && this.h == jacVar.h && this.i == jacVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.d;
        int iQ = (((((iHashCode + a.q(this.b)) * 31) + a.q(this.c)) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (((((((iQ + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a.q(this.h)) * 31;
        wdq wdqVar = this.i;
        return iHashCode2 + (wdqVar != null ? wdqVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaybackDetails(playerMetadata=" + this.a + ", isRented=" + this.b + ", isMultiAudio=" + this.c + ", selectedMaxVideoWidth=" + this.d + ", selectedMaxVideoHeight=" + this.e + ", selectedLanguageCode=" + this.f + ", networkState=" + this.g + ", isOffline=" + this.h + ", errorType=" + this.i + ")";
    }
}
