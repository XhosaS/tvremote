package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        Uri uri = null;
        String strL = null;
        CallingCardMetadata callingCardMetadata = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) kkw.h(parcel, i, CallingCardRequestStatus.CREATOR);
            } else if (c == 2) {
                iB = kkw.b(parcel, i);
            } else if (c == 3) {
                uri = (Uri) kkw.h(parcel, i, Uri.CREATOR);
            } else if (c == 4) {
                strL = kkw.l(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                callingCardMetadata = (CallingCardMetadata) kkw.h(parcel, i, CallingCardMetadata.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new GetCallingCardResponse(callingCardRequestStatus, iB, uri, strL, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCallingCardResponse[i];
    }
}
