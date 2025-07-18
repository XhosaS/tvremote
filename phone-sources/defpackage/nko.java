package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nko implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        String strAh = null;
        String strAh2 = null;
        String strAh3 = null;
        String strAh4 = null;
        String strAh5 = null;
        ArrayList arrayListAk = null;
        String strAh6 = null;
        String strAh7 = null;
        String strAh8 = null;
        byte[] bArrAo = null;
        String strAh9 = null;
        nru nruVar = null;
        Integer numAf = null;
        Boolean boolAe = null;
        Network network = null;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        boolean zAn = false;
        int iX4 = -1;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 3:
                    strAh2 = ocv.ah(parcel, i);
                    break;
                case 4:
                    strAh3 = ocv.ah(parcel, i);
                    break;
                case 5:
                    strAh4 = ocv.ah(parcel, i);
                    break;
                case 6:
                    strAh5 = ocv.ah(parcel, i);
                    break;
                case 7:
                    iX = ocv.X(parcel, i);
                    break;
                case 8:
                    arrayListAk = ocv.ak(parcel, i, oak.CREATOR);
                    break;
                case 9:
                    iX2 = ocv.X(parcel, i);
                    break;
                case 10:
                    iX4 = ocv.X(parcel, i);
                    break;
                case 11:
                    strAh6 = ocv.ah(parcel, i);
                    break;
                case 12:
                    strAh7 = ocv.ah(parcel, i);
                    break;
                case 13:
                    iX3 = ocv.X(parcel, i);
                    break;
                case 14:
                    strAh8 = ocv.ah(parcel, i);
                    break;
                case 15:
                    bArrAo = ocv.ao(parcel, i);
                    break;
                case 16:
                    strAh9 = ocv.ah(parcel, i);
                    break;
                case 17:
                    zAn = ocv.an(parcel, i);
                    break;
                case 18:
                    nruVar = (nru) ocv.ad(parcel, i, nru.CREATOR);
                    break;
                case 19:
                    numAf = ocv.af(parcel, i);
                    break;
                case 20:
                    boolAe = ocv.ae(parcel, i);
                    break;
                case 21:
                    network = (Network) ocv.ad(parcel, i, Network.CREATOR);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new CastDevice(strAh, strAh2, strAh3, strAh4, strAh5, iX, arrayListAk, iX2, iX4, strAh6, strAh7, iX3, strAh8, bArrAo, strAh9, zAn, nruVar, numAf, boolAe, network);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
