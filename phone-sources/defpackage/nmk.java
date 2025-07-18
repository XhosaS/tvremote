package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        boolean zAn = false;
        boolean zAn2 = false;
        boolean zAn3 = false;
        boolean zAn4 = false;
        boolean zAn5 = false;
        boolean zAn6 = false;
        boolean zAn7 = false;
        boolean zAn8 = false;
        boolean zAn9 = false;
        boolean zAn10 = false;
        String strAh = null;
        ArrayList arrayListAj = null;
        nlc nlcVar = null;
        now nowVar = null;
        ArrayList arrayListAj2 = null;
        nmh nmhVar = null;
        nmi nmiVar = null;
        double dT = 0.0d;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 3:
                    arrayListAj = ocv.aj(parcel, i);
                    break;
                case 4:
                    zAn = ocv.an(parcel, i);
                    break;
                case 5:
                    nlcVar = (nlc) ocv.ad(parcel, i, nlc.CREATOR);
                    break;
                case 6:
                    zAn2 = ocv.an(parcel, i);
                    break;
                case 7:
                    nowVar = (now) ocv.ad(parcel, i, now.CREATOR);
                    break;
                case 8:
                    zAn3 = ocv.an(parcel, i);
                    break;
                case 9:
                    dT = ocv.T(parcel, i);
                    break;
                case 10:
                    zAn4 = ocv.an(parcel, i);
                    break;
                case 11:
                    zAn5 = ocv.an(parcel, i);
                    break;
                case 12:
                    zAn6 = ocv.an(parcel, i);
                    break;
                case 13:
                    arrayListAj2 = ocv.aj(parcel, i);
                    break;
                case 14:
                    zAn7 = ocv.an(parcel, i);
                    break;
                case 15:
                    ocv.X(parcel, i);
                    break;
                case 16:
                    zAn8 = ocv.an(parcel, i);
                    break;
                case 17:
                    nmhVar = (nmh) ocv.ad(parcel, i, nmh.CREATOR);
                    break;
                case 18:
                    nmiVar = (nmi) ocv.ad(parcel, i, nmi.CREATOR);
                    break;
                case 19:
                    zAn9 = ocv.an(parcel, i);
                    break;
                case 20:
                    zAn10 = ocv.an(parcel, i);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new nmj(strAh, arrayListAj, zAn, nlcVar, zAn2, nowVar, zAn3, dT, zAn4, zAn5, zAn6, arrayListAj2, zAn7, zAn8, nmhVar, nmiVar, zAn9, zAn10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new nmj[i];
    }
}
