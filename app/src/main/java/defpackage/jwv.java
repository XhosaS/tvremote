package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Long lK = null;
        ArrayList arrayListN = null;
        String strL2 = null;
        int iB = 0;
        boolean zS = false;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB = kkw.b(parcel, i);
                    break;
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    lK = kkw.k(parcel, i);
                    break;
                case 4:
                    zS = kkw.s(parcel, i);
                    break;
                case 5:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 6:
                    arrayListN = kkw.n(parcel, i);
                    break;
                case 7:
                    strL2 = kkw.l(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new TokenData(iB, strL, lK, zS, zS2, arrayListN, strL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
