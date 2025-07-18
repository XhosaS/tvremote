package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lof implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final ksn h;
    public final Uri i;
    public final boolean j;

    public lof() {
        throw null;
    }

    public static rfa a(int i, String str, ieg iegVar) {
        rfa rfaVar = new rfa((char[]) null);
        rfaVar.e = iegVar;
        rfaVar.a = i;
        rfaVar.c = (byte) (rfaVar.c | 2);
        if (str == null) {
            throw new NullPointerException("Null getReferrer");
        }
        rfaVar.h = str;
        rfaVar.q(false);
        return rfaVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        ksn ksnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lof) {
            lof lofVar = (lof) obj;
            if (this.a.equals(lofVar.a) && ((str = this.b) != null ? str.equals(lofVar.b) : lofVar.b == null) && ((str2 = this.c) != null ? str2.equals(lofVar.c) : lofVar.c == null) && this.d == lofVar.d && this.e.equals(lofVar.e) && this.f == lofVar.f && this.g == lofVar.g && ((ksnVar = this.h) != null ? ksnVar.equals(lofVar.h) : lofVar.h == null) && this.i.equals(lofVar.i) && this.j == lofVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (((((((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        ksn ksnVar = this.h;
        return ((((iHashCode3 ^ (ksnVar != null ? ksnVar.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231);
    }

    public final String toString() {
        Uri uri = this.i;
        return "DirectPurchaseFlowSettings{getItemId=" + this.a + ", getSeasonId=" + this.b + ", getShowId=" + this.c + ", getFilteringType=" + this.d + ", getReferrer=" + this.e + ", getEventSource=" + this.f + ", getItemType=" + this.g + ", getAccountInternal=" + String.valueOf(this.h) + ", getReferrerUri=" + uri.toString() + ", suppressPostSuccessAction=" + this.j + "}";
    }

    public lof(String str, String str2, String str3, int i, String str4, int i2, int i3, ksn ksnVar, Uri uri, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null getItemId");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        if (str4 == null) {
            throw new NullPointerException("Null getReferrer");
        }
        this.e = str4;
        this.f = i2;
        this.g = i3;
        this.h = ksnVar;
        if (uri == null) {
            throw new NullPointerException("Null getReferrerUri");
        }
        this.i = uri;
        this.j = z;
    }
}
