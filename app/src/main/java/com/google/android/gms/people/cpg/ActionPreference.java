package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpc;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ActionPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpc();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public ActionPreference(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPreference)) {
            return false;
        }
        ActionPreference actionPreference = (ActionPreference) obj;
        return this.b == actionPreference.b && this.c == actionPreference.c && yqs.a(this.d, actionPreference.d) && yqs.a(this.a, actionPreference.a) && yqs.a(this.e, actionPreference.e) && this.f == actionPreference.f && this.g == actionPreference.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.f(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.r(parcel, 4, this.d);
        kkx.r(parcel, 5, this.e);
        kkx.f(parcel, 6, this.f);
        kkx.g(parcel, 7, this.g);
        kkx.b(parcel, iA);
    }
}
