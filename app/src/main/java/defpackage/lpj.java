package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                iB = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new CallingCardRequestStatus(iB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardRequestStatus[i];
    }
}
