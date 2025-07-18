package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpk;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CreateCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpk();
    public final CallingCardRequestStatus a;
    public final CallingCardIdentifier b;

    public CreateCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, CallingCardIdentifier callingCardIdentifier) {
        this.a = callingCardRequestStatus;
        this.b = callingCardIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCallingCardResponse) {
            CreateCallingCardResponse createCallingCardResponse = (CreateCallingCardResponse) obj;
            if (yqs.a(this.a, createCallingCardResponse.a) && yqs.a(this.b, createCallingCardResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int iA = kkx.a(parcel, 20293);
        int i2 = i | 1;
        kkx.q(parcel, 1, callingCardRequestStatus, i2);
        kkx.q(parcel, 2, this.b, i2);
        kkx.b(parcel, iA);
    }
}
