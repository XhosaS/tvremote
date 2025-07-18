package com.google.android.gms.people.cpg.callingcard;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpl;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpl();
    public final CallingCardRequestStatus a;
    public final int b;
    public final Uri c;
    public final String d;
    public final CallingCardMetadata e;

    public GetCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, int i, Uri uri, String str, CallingCardMetadata callingCardMetadata) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallingCardResponse) {
            GetCallingCardResponse getCallingCardResponse = (GetCallingCardResponse) obj;
            if (yqs.a(this.a, getCallingCardResponse.a) && this.b == getCallingCardResponse.b && yqs.a(this.c, getCallingCardResponse.c) && yqs.a(this.d, getCallingCardResponse.d) && yqs.a(this.e, getCallingCardResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, callingCardRequestStatus, i);
        kkx.f(parcel, 2, this.b);
        kkx.q(parcel, 3, this.c, i);
        kkx.r(parcel, 4, this.d);
        kkx.q(parcel, 5, this.e, i);
        kkx.b(parcel, iA);
    }
}
