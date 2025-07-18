package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mke {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;

    public mke(String str, String str2, String str3, Uri uri, boolean z, int i, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = z;
        this.f = i;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mke mkeVar = (mke) obj;
        if (this.e != mkeVar.e || this.f != mkeVar.f) {
            return false;
        }
        String str = this.a;
        if (str == null ? mkeVar.a != null : !str.equals(mkeVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? mkeVar.b != null : !str2.equals(mkeVar.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? mkeVar.c != null : !str3.equals(mkeVar.c)) {
            return false;
        }
        if (!this.d.equals(mkeVar.d)) {
            return false;
        }
        String str4 = this.g;
        if (str4 == null ? mkeVar.g != null : !str4.equals(mkeVar.g)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? mkeVar.h != null : !str5.equals(mkeVar.h)) {
            return false;
        }
        String str6 = this.i;
        return str6 != null ? str6.equals(mkeVar.i) : mkeVar.i == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode * 31;
        String str3 = this.c;
        int iHashCode3 = (((((((((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.i;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
