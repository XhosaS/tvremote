package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aece;
import defpackage.kac;
import defpackage.kad;
import defpackage.kbj;
import defpackage.kki;
import defpackage.kkx;
import defpackage.zdl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kbj();
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

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
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
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (kki.a(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && kki.a(this.f, playLoggerContext.f) && kki.a(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && kki.a(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
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
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.f(parcel, 3, this.b);
        kkx.f(parcel, 4, this.c);
        kkx.r(parcel, 5, this.d);
        kkx.c(parcel, 7, this.e);
        kkx.r(parcel, 8, this.f);
        kkx.c(parcel, 9, this.g);
        kkx.f(parcel, 10, this.h);
        kkx.o(parcel, 11, this.i);
        kkx.c(parcel, 12, this.j);
        kkx.f(parcel, 13, this.k);
        kkx.b(parcel, iA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayLoggerContext(String str, int i, String str2, String str3, aece aeceVar, kac kacVar) {
        int i2;
        boolean zContains = kacVar.d.contains(kad.ANDROID_ID);
        boolean zEquals = kacVar.equals(kac.b);
        int i3 = aeceVar.f;
        if (kacVar.equals(kac.a)) {
            i2 = 0;
        } else {
            zdl it = kacVar.d.iterator();
            int i4 = -1;
            while (it.hasNext()) {
                i4 &= ~((kad) it.next()).e;
            }
            i2 = i4;
        }
        this(str, i, -1, str3, zContains, str2, zEquals, i3, null, false, i2);
    }
}
