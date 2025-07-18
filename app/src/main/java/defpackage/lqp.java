package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iJ = 3;
        Boolean boolI = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 3) {
                iJ = kkw.j(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                boolI = kkw.i(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new PersonFieldMetadataEntity(iJ, boolI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonFieldMetadataEntity[i];
    }
}
