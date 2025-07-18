package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.SourceStatsEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Integer numJ = null;
        Integer numJ2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                numJ = kkw.j(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                numJ2 = kkw.j(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new SourceStatsEntity(strL, numJ, numJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
