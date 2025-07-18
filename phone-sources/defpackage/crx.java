package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crx {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public crx(crw crwVar) {
        this.a = crwVar.a;
        this.b = crwVar.b;
        this.c = crwVar.c;
        this.d = crwVar.d;
        this.e = crwVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof crx)) {
            return false;
        }
        crx crxVar = (crx) obj;
        String str = this.c;
        String str2 = crxVar.c;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (Objects.equals(Objects.toString(this.a), Objects.toString(crxVar.a)) && Objects.equals(this.b, crxVar.b)) {
            if (Objects.equals(Boolean.valueOf(this.d), Boolean.valueOf(crxVar.d))) {
                if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(crxVar.e))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.b, Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
