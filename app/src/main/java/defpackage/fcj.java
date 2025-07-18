package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcj extends fcr {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public fcj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.fcr
    public final String a() {
        return this.a;
    }

    @Override // defpackage.fcr
    public final String b() {
        return this.b;
    }

    @Override // defpackage.fcr
    public final String c() {
        return this.c;
    }

    @Override // defpackage.fcr
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fcr) {
            fcr fcrVar = (fcr) obj;
            if (this.a.equals(fcrVar.a()) && this.b.equals(fcrVar.b()) && this.c.equals(fcrVar.c()) && this.d.equals(fcrVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "TvOperatorServiceResult{accessToken=" + this.a + ", customContext=" + this.b + ", deviceModelId=" + this.c + ", obfuscatedUserId=" + this.d + "}";
    }
}
