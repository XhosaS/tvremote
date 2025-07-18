package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                arrayListO = kkw.o(parcel, i, BackedUpContactsPerDeviceEntity.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new FetchBackUpDeviceContactInfoResponseEntity(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FetchBackUpDeviceContactInfoResponseEntity[i];
    }
}
