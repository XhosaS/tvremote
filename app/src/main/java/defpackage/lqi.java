package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Long lK = null;
        ArrayList arrayListO = null;
        String strL2 = null;
        Long lK2 = null;
        Long lK3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    arrayListO = kkw.o(parcel, i, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 5:
                    lK2 = kkw.k(parcel, i);
                    break;
                case 6:
                    lK3 = kkw.k(parcel, i);
                    break;
                case 7:
                    lK = kkw.k(parcel, i);
                    break;
                case '\b':
                    deviceVersionEntity = (DeviceVersionEntity) kkw.h(parcel, i, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new BackedUpContactsPerDeviceEntity(strL, lK, arrayListO, strL2, lK2, lK3, deviceVersionEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }
}
