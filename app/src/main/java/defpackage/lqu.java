package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Flag[] flagArr = null;
        int iB = 0;
        String[] strArrW = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iB = kkw.b(parcel, i);
            } else if (c == 3) {
                flagArr = (Flag[]) kkw.v(parcel, i, Flag.CREATOR);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                strArrW = kkw.w(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new Configuration(iB, flagArr, strArrW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
