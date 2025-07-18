package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lph;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CallingCardIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lph();
    public final long a;

    public CallingCardIdentifier(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallingCardIdentifier) && this.a == ((CallingCardIdentifier) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.g(parcel, 1, j);
        kkx.b(parcel, iA);
    }
}
