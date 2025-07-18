package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mxe implements Parcelable {
    public final kuf a;
    public final int b;
    public final Uri c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public mxe() {
        throw null;
    }

    public static mxd a() {
        mxd mxdVar = new mxd();
        mxdVar.b(kuf.a);
        mxdVar.c(6);
        mxdVar.d(Uri.EMPTY);
        mxdVar.e(false);
        mxdVar.g("");
        mxdVar.f(false);
        mxdVar.b = (byte) (mxdVar.b | 8);
        return mxdVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxe) {
            mxe mxeVar = (mxe) obj;
            if (this.a.equals(mxeVar.a) && this.b == mxeVar.b && this.c.equals(mxeVar.c) && this.d.equals(mxeVar.d) && ((str = this.e) != null ? str.equals(mxeVar.e) : mxeVar.e == null) && ((str2 = this.f) != null ? str2.equals(mxeVar.f) : mxeVar.f == null) && this.g == mxeVar.g && this.h == mxeVar.h && this.i == mxeVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        return ((((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        Uri uri = this.c;
        return "DistributorItemViewModel{distributorId=" + this.a.toString() + ", distributorType=" + this.b + ", iconUri=" + uri.toString() + ", title=" + this.d + ", subtitle=" + this.e + ", priceTitle=" + this.f + ", isAvod=" + this.g + ", isFreeTabEnabled=" + this.h + ", hasFreeEpisodes=" + this.i + "}";
    }

    public mxe(kuf kufVar, int i, Uri uri, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (kufVar == null) {
            throw new NullPointerException("Null distributorId");
        }
        this.a = kufVar;
        this.b = i;
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.c = uri;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }
}
