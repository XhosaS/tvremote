package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        CallingCardIdentifier callingCardIdentifier = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) kkw.h(parcel, i, CallingCardRequestStatus.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                callingCardIdentifier = (CallingCardIdentifier) kkw.h(parcel, i, CallingCardIdentifier.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new CreateCallingCardResponse(callingCardRequestStatus, callingCardIdentifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateCallingCardResponse[i];
    }
}
