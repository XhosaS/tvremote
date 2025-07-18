package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeo extends ajh {
    public static final Parcelable.Creator CREATOR = new e(19);
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

    public aeo(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
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
        if (obj instanceof aeo) {
            aeo aeoVar = (aeo) obj;
            if (ii.X(this.a, aeoVar.a) && this.b == aeoVar.b && this.c == aeoVar.c && ii.X(this.f, aeoVar.f) && ii.X(this.d, aeoVar.d) && this.e == aeoVar.e && this.g == aeoVar.g && this.h == aeoVar.h && ii.X(this.i, aeoVar.i) && this.j == aeoVar.j && this.k == aeoVar.k) {
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
        int iH = qq.h(parcel);
        qq.u(parcel, 2, this.a);
        qq.m(parcel, 3, this.b);
        qq.m(parcel, 4, this.c);
        qq.u(parcel, 5, this.d);
        qq.k(parcel, 7, this.e);
        qq.u(parcel, 8, this.f);
        qq.k(parcel, 9, this.g);
        qq.m(parcel, 10, this.h);
        Integer num = this.i;
        if (num != null) {
            qq.l(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        qq.k(parcel, 12, this.j);
        qq.m(parcel, 13, this.k);
        qq.j(parcel, iH);
    }
}
