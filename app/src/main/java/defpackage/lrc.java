package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        byte[] bArrT = null;
        byte[][] bArrX = null;
        byte[][] bArrX2 = null;
        byte[][] bArrX3 = null;
        byte[][] bArrX4 = null;
        int[] iArrU = null;
        byte[][] bArrX5 = null;
        int[] iArrU2 = null;
        byte[][] bArrX6 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    bArrT = kkw.t(parcel, i);
                    break;
                case 4:
                    bArrX = kkw.x(parcel, i);
                    break;
                case 5:
                    bArrX2 = kkw.x(parcel, i);
                    break;
                case 6:
                    bArrX3 = kkw.x(parcel, i);
                    break;
                case 7:
                    bArrX4 = kkw.x(parcel, i);
                    break;
                case '\b':
                    iArrU = kkw.u(parcel, i);
                    break;
                case '\t':
                    bArrX5 = kkw.x(parcel, i);
                    break;
                case '\n':
                    iArrU2 = kkw.u(parcel, i);
                    break;
                case 11:
                    bArrX6 = kkw.x(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ExperimentTokens(strL, bArrT, bArrX, bArrX2, bArrX3, bArrX4, iArrU, bArrX5, iArrU2, bArrX6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
