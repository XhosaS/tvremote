package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        Long lK = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) kkw.h(parcel, i, PersonFieldMetadataEntity.CREATOR);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                lK = kkw.k(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new BirthdayEntity(personFieldMetadataEntity, lK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BirthdayEntity[i];
    }
}
