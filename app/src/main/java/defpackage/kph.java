package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kph implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Status status = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                status = (Status) kkw.h(parcel, i, Status.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new FusedLocationProviderResult(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FusedLocationProviderResult[i];
    }
}
