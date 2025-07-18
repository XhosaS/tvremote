package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        MediaInfo mediaInfo = null;
        long[] jArrAq = null;
        String strAh = null;
        ArrayList arrayListAk = null;
        njy njyVar = null;
        nmd nmdVar = null;
        nlg nlgVar = null;
        nlk nlkVar = null;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        boolean zAn = false;
        int iX4 = 0;
        int iX5 = 0;
        int iX6 = 0;
        boolean zAn2 = false;
        double dT = 0.0d;
        double dT2 = 0.0d;
        long jAa = 0;
        long jAa2 = 0;
        long jAa3 = 0;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    mediaInfo = (MediaInfo) ocv.ad(parcel, i, MediaInfo.CREATOR);
                    break;
                case 3:
                    jAa = ocv.aa(parcel, i);
                    break;
                case 4:
                    iX = ocv.X(parcel, i);
                    break;
                case 5:
                    dT = ocv.T(parcel, i);
                    break;
                case 6:
                    iX2 = ocv.X(parcel, i);
                    break;
                case 7:
                    iX3 = ocv.X(parcel, i);
                    break;
                case 8:
                    jAa2 = ocv.aa(parcel, i);
                    break;
                case 9:
                    jAa3 = ocv.aa(parcel, i);
                    break;
                case 10:
                    dT2 = ocv.T(parcel, i);
                    break;
                case 11:
                    zAn = ocv.an(parcel, i);
                    break;
                case 12:
                    jArrAq = ocv.aq(parcel, i);
                    break;
                case 13:
                    iX4 = ocv.X(parcel, i);
                    break;
                case 14:
                    iX5 = ocv.X(parcel, i);
                    break;
                case 15:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 16:
                    iX6 = ocv.X(parcel, i);
                    break;
                case 17:
                    arrayListAk = ocv.ak(parcel, i, nll.CREATOR);
                    break;
                case 18:
                    zAn2 = ocv.an(parcel, i);
                    break;
                case 19:
                    njyVar = (njy) ocv.ad(parcel, i, njy.CREATOR);
                    break;
                case 20:
                    nmdVar = (nmd) ocv.ad(parcel, i, nmd.CREATOR);
                    break;
                case 21:
                    nlgVar = (nlg) ocv.ad(parcel, i, nlg.CREATOR);
                    break;
                case 22:
                    nlkVar = (nlk) ocv.ad(parcel, i, nlk.CREATOR);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new nln(mediaInfo, jAa, iX, dT, iX2, iX3, jAa2, jAa3, dT2, zAn, jArrAq, iX4, iX5, strAh, iX6, arrayListAk, zAn2, njyVar, nmdVar, nlgVar, nlkVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new nln[i];
    }
}
