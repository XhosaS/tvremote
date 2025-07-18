package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        String strL5 = null;
        String strL6 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c != 17) {
                switch (c) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) kkw.h(parcel, i, PersonFieldMetadataEntity.CREATOR);
                        break;
                    case 3:
                        strL = kkw.l(parcel, i);
                        break;
                    case 4:
                        strL6 = kkw.l(parcel, i);
                        break;
                    case 5:
                        strL3 = kkw.l(parcel, i);
                        break;
                    case 6:
                        strL4 = kkw.l(parcel, i);
                        break;
                    case 7:
                        strL5 = kkw.l(parcel, i);
                        break;
                    default:
                        kkw.r(parcel, i);
                        break;
                }
            } else {
                strL2 = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new NameEntity(personFieldMetadataEntity, strL, strL2, strL3, strL4, strL5, strL6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NameEntity[i];
    }
}
