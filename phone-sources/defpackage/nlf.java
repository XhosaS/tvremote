package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        String strAh = null;
        String strAh2 = null;
        nli nliVar = null;
        ArrayList arrayListAk = null;
        nmb nmbVar = null;
        String strAh3 = null;
        ArrayList arrayListAk2 = null;
        ArrayList arrayListAk3 = null;
        String strAh4 = null;
        nmc nmcVar = null;
        String strAh5 = null;
        String strAh6 = null;
        String strAh7 = null;
        String strAh8 = null;
        long jAa = 0;
        long jAa2 = 0;
        int iX = 0;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 3:
                    iX = ocv.X(parcel, i);
                    break;
                case 4:
                    strAh2 = ocv.ah(parcel, i);
                    break;
                case 5:
                    nliVar = (nli) ocv.ad(parcel, i, nli.CREATOR);
                    break;
                case 6:
                    jAa = ocv.aa(parcel, i);
                    break;
                case 7:
                    arrayListAk = ocv.ak(parcel, i, MediaTrack.CREATOR);
                    break;
                case 8:
                    nmbVar = (nmb) ocv.ad(parcel, i, nmb.CREATOR);
                    break;
                case 9:
                    strAh3 = ocv.ah(parcel, i);
                    break;
                case 10:
                    arrayListAk2 = ocv.ak(parcel, i, njx.CREATOR);
                    break;
                case 11:
                    arrayListAk3 = ocv.ak(parcel, i, njw.CREATOR);
                    break;
                case 12:
                    strAh4 = ocv.ah(parcel, i);
                    break;
                case 13:
                    nmcVar = (nmc) ocv.ad(parcel, i, nmc.CREATOR);
                    break;
                case 14:
                    jAa2 = ocv.aa(parcel, i);
                    break;
                case 15:
                    strAh5 = ocv.ah(parcel, i);
                    break;
                case 16:
                    strAh6 = ocv.ah(parcel, i);
                    break;
                case 17:
                    strAh7 = ocv.ah(parcel, i);
                    break;
                case 18:
                    strAh8 = ocv.ah(parcel, i);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new MediaInfo(strAh, iX, strAh2, nliVar, jAa, arrayListAk, nmbVar, strAh3, arrayListAk2, arrayListAk3, strAh4, nmcVar, jAa2, strAh5, strAh6, strAh7, strAh8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
