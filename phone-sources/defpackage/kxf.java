package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxf {
    public final String a;
    public final String b;
    private final String c;
    private final Uri d;
    private final int e;

    public kxf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxf) {
            kxf kxfVar = (kxf) obj;
            if (this.a.equals(kxfVar.a)) {
                int i = this.e;
                int i2 = kxfVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(kxfVar.b) && this.c.equals(kxfVar.c) && this.d.equals(kxfVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.e;
        a.bl(i);
        return (((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FAMILY" : "TV" : "MOVIE" : "UNSPECIFIED";
        return "VideoCategory{id=" + this.a + ", type=" + str + ", name=" + this.b + ", description=" + this.c + ", image=" + String.valueOf(this.d) + "}";
    }

    public kxf(String str, int i, String str2, String str3, Uri uri) {
        this.a = str;
        this.e = i;
        this.b = str2;
        this.c = str3;
        this.d = uri;
    }
}
