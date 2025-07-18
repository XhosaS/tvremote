package defpackage;

import android.content.Intent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hej {
    public final aear a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final Intent h;
    public final double i;
    public final xkc j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    private final View.OnClickListener q = null;

    public hej(aear aearVar, String str, String str2, String str3, String str4, String str5, int i, Intent intent, double d, xkc xkcVar, boolean z) {
        int iA;
        int iA2;
        this.a = aearVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = intent;
        this.i = d;
        this.j = xkcVar;
        this.k = z;
        this.l = aearVar.o;
        int iA3 = aean.a(aearVar.k);
        boolean z2 = true;
        if ((iA3 == 0 || iA3 != 15) && ((!agvy.c(aearVar.f, "com.google.android.apps.tv.launcherx") || (iA2 = aean.a(aearVar.k)) == 0 || iA2 != 11) && ((iA = aean.a(aearVar.k)) == 0 || iA != 16))) {
            z2 = false;
        }
        this.m = z2;
        this.n = aearVar.p;
        this.o = aearVar.q;
        String str6 = aearVar.m;
        this.p = str6 == null ? "" : str6;
    }

    public final boolean a() {
        int iA = aean.a(this.a.k);
        return iA != 0 && iA == 12;
    }

    public final boolean b() {
        int iA = aean.a(this.a.k);
        return iA != 0 && iA == 15;
    }

    public final boolean c() {
        int iA = aean.a(this.a.k);
        return iA != 0 && iA == 16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hej)) {
            return false;
        }
        hej hejVar = (hej) obj;
        if (!agvy.c(this.a, hejVar.a) || !agvy.c(this.b, hejVar.b) || !agvy.c(this.c, hejVar.c) || !agvy.c(this.d, hejVar.d) || !agvy.c(this.e, hejVar.e) || !agvy.c(this.f, hejVar.f) || this.g != hejVar.g || !agvy.c(this.h, hejVar.h)) {
            return false;
        }
        View.OnClickListener onClickListener = hejVar.q;
        return agvy.c(null, null) && Double.compare(this.i, hejVar.i) == 0 && agvy.c(this.j, hejVar.j) && this.k == hejVar.k;
    }

    public final int hashCode() {
        int iB;
        aear aearVar = this.a;
        if ((aearVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(aearVar.getClass()).b(aearVar);
        } else {
            int iB2 = aearVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(aearVar.getClass()).b(aearVar);
                aearVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        String str = this.b;
        int iB3 = 0;
        int iHashCode = ((((((((iB * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str2 = this.f;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g) * 31;
        Intent intent = this.h;
        int iHashCode3 = intent == null ? 0 : intent.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.i);
        int i = (((iHashCode2 + iHashCode3) * 961) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        xkc xkcVar = this.j;
        if (xkcVar != null) {
            if ((Integer.MIN_VALUE & xkcVar.memoizedSerializedSize) != 0) {
                iB3 = abza.a.a(xkcVar.getClass()).b(xkcVar);
            } else {
                iB3 = xkcVar.memoizedHashCode;
                if (iB3 == 0) {
                    iB3 = abza.a.a(xkcVar.getClass()).b(xkcVar);
                    xkcVar.memoizedHashCode = iB3;
                }
            }
        }
        return ((i + iB3) * 31) + (true != this.k ? 1237 : 1231);
    }

    public final String toString() {
        return "ActionItem(actionProto=" + this.a + ", packageName=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", entityTitle=" + this.e + ", imageUri=" + this.f + ", veId=" + this.g + ", intent=" + this.h + ", onClickListener=null, score=" + this.i + ", tapInput=" + this.j + ", isOnDeviceContent=" + this.k + ")";
    }
}
