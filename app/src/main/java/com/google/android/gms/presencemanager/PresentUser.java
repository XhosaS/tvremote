package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lsr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PresentUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lsr();
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public PresentUser(String str, long j, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PresentUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PresentUser presentUser = (PresentUser) obj;
        return kki.a(this.a, presentUser.a) && this.b == presentUser.b && this.c == presentUser.c && this.d == presentUser.d && kki.a(this.e, presentUser.e) && kki.a(this.f, presentUser.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.g(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.f(parcel, 4, this.d);
        kkx.r(parcel, 5, this.e);
        kkx.r(parcel, 6, this.f);
        kkx.b(parcel, iA);
    }
}
