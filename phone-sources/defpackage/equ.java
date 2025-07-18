package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class equ {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public equ(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            equ equVar = (equ) obj;
            if (this.a == equVar.a && this.b == equVar.b && TextUtils.equals(this.c, equVar.c) && TextUtils.equals(this.d, equVar.d) && TextUtils.equals(this.e, equVar.e) && TextUtils.equals(this.f, equVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        int i2 = this.b;
        String str2 = this.d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = (((i * 31) + i2) * 31) + iHashCode;
        String str3 = this.e;
        int iHashCode3 = ((((i3 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
