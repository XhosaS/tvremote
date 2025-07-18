package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        String strL = null;
        String strL2 = null;
        Flag flag = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                strL2 = kkw.l(parcel, i);
            } else if (c == 4) {
                flag = (Flag) kkw.h(parcel, i, Flag.CREATOR);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                zS = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new FlagOverride(strL, strL2, flag, zS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FlagOverride[i];
    }
}
