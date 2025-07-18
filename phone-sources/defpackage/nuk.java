package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nuk extends ocg {
    public static final Parcelable.Creator<nuk> CREATOR = new nub(4);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public nuk(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nuk) {
            nuk nukVar = (nuk) obj;
            if (a.Q(this.a, nukVar.a) && this.b == nukVar.b && this.c == nukVar.c && a.Q(this.f, nukVar.f) && a.Q(this.d, nukVar.d) && this.e == nukVar.e && this.g == nukVar.g && this.h == nukVar.h && a.Q(this.i, nukVar.i) && this.j == nukVar.j && this.k == nukVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.y(parcel, 7, this.e);
        ocv.O(parcel, 8, this.f);
        ocv.y(parcel, 9, this.g);
        ocv.B(parcel, 10, this.h);
        ocv.J(parcel, 11, this.i);
        ocv.y(parcel, 12, this.j);
        ocv.B(parcel, 13, this.k);
        ocv.x(parcel, iV);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public nuk(String str, int i, String str2, String str3, int i2, ntn ntnVar) {
        int i3;
        boolean zA = ntnVar.a(nto.ANDROID_ID);
        boolean zEquals = ntnVar.equals(ntn.b);
        if (ntnVar.equals(ntn.a)) {
            i3 = 0;
        } else {
            UnmodifiableIterator it = ntnVar.d.iterator();
            int i4 = -1;
            while (it.hasNext()) {
                i4 &= ~((nto) it.next()).e;
            }
            i3 = i4;
        }
        this(str, i, -1, str3, zA, str2, zEquals, i2 - 1, null, false, i3);
    }
}
