package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        ArrayList arrayListO = null;
        ArrayList arrayListO2 = null;
        ArrayList arrayListO3 = null;
        ArrayList arrayListO4 = null;
        ArrayList arrayListO5 = null;
        ArrayList arrayListO6 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == '\t') {
                arrayListO5 = kkw.o(parcel, i, BirthdayEntity.CREATOR);
            } else if (c == 11) {
                arrayListO3 = kkw.o(parcel, i, EmailEntity.CREATOR);
            } else if (c == '\r') {
                arrayListO4 = kkw.o(parcel, i, PhoneEntity.CREATOR);
            } else if (c == 148) {
                arrayListO6 = kkw.o(parcel, i, PhotoEntity.CREATOR);
            } else if (c == 4) {
                arrayListO = kkw.o(parcel, i, NameEntity.CREATOR);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                arrayListO2 = kkw.o(parcel, i, PhotoEntity.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new PersonEntity(strL, arrayListO, arrayListO2, arrayListO3, arrayListO4, arrayListO5, arrayListO6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }
}
