package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String strL = null;
        String strL2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) kkw.h(parcel, i, PersonFieldMetadataEntity.CREATOR);
            } else if (c == 3) {
                strL = kkw.l(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                strL2 = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new PhoneEntity(personFieldMetadataEntity, strL, strL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneEntity[i];
    }
}
