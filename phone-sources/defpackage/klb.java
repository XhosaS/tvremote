package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klb {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;

    public klb() {
        throw null;
    }

    public final klb a(int i) {
        if (this.h == i) {
            return this;
        }
        sez sezVar = new sez(this);
        sezVar.q(i);
        return sezVar.k();
    }

    public final boolean b() {
        return (this.h & 4) != 0;
    }

    public final boolean c() {
        return (this.h & 2) != 0;
    }

    public final boolean d() {
        return (this.h & 16) != 0;
    }

    public final boolean e() {
        return (this.h & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klb) {
            klb klbVar = (klb) obj;
            if (this.a.equals(klbVar.a) && this.b.equals(klbVar.b) && this.c.equals(klbVar.c) && this.d == klbVar.d && this.e == klbVar.e && this.f.equals(klbVar.f) && this.g == klbVar.g && this.h == klbVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "TagBrowseTag{id=" + this.a + ", name=" + this.b + ", contentDescription=" + this.c + ", drawableRes=" + this.d + ", drawableColorRes=" + this.e + ", groupId=" + this.f + ", depth=" + this.g + ", flags=" + this.h + "}";
    }

    public klb(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = i3;
        this.h = i4;
    }
}
