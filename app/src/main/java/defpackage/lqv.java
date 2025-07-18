package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        String strL = null;
        String strL2 = null;
        Configuration[] configurationArr = null;
        byte[] bArrT = null;
        boolean zS = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 4:
                    configurationArr = (Configuration[]) kkw.v(parcel, i, Configuration.CREATOR);
                    break;
                case 5:
                    zS = kkw.s(parcel, i);
                    break;
                case 6:
                    bArrT = kkw.t(parcel, i);
                    break;
                case 7:
                    jE = kkw.e(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new Configurations(strL, strL2, configurationArr, zS, bArrT, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }
}
