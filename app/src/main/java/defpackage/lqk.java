package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Integer numJ = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                numJ = kkw.j(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new DeviceVersionEntity(numJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceVersionEntity[i];
    }
}
