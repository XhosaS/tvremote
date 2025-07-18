package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nau {
    public final String a;
    public final kxe b;
    public final boolean c;
    public final ksx d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public nau() {
        throw null;
    }

    public static nat a() {
        nat natVar = new nat();
        natVar.a = "";
        natVar.g(false);
        natVar.f(false);
        natVar.d(false);
        natVar.b(false);
        uug uugVar = new uug();
        uugVar.g(false);
        uugVar.f(false);
        uugVar.h(false);
        natVar.b = uugVar.e();
        natVar.c(false);
        return natVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nau) {
            nau nauVar = (nau) obj;
            if (this.a.equals(nauVar.a) && this.b.equals(nauVar.b) && this.c == nauVar.c && this.d.equals(nauVar.d) && this.e == nauVar.e && this.f == nauVar.f && this.g == nauVar.g && this.h == nauVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        ksx ksxVar = this.d;
        return "UserFeedbackViewModel{title=" + this.a + ", userSentiment=" + String.valueOf(this.b) + ", isWatchlisted=" + this.c + ", assetDetailsRestrictions=" + String.valueOf(ksxVar) + ", isDownloadable=" + this.e + ", useReplayTextWithUserFeedback=" + this.f + ", isGtvApplication=" + this.g + ", isPelogEnabled=" + this.h + "}";
    }

    public nau(String str, kxe kxeVar, boolean z, ksx ksxVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = kxeVar;
        this.c = z;
        this.d = ksxVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }
}
