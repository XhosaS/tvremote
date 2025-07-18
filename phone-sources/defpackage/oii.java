package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        int iX = 0;
        boolean zAn = false;
        int iX2 = 0;
        byte[] bArrAo = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strAh = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        oid oidVar = null;
        String strAh2 = null;
        String strAh3 = null;
        oij oijVar = null;
        oik oikVar = null;
        oig oigVar = null;
        long jAa = 0;
        long jAa2 = 0;
        long jAa3 = 0;
        long jAa4 = -1;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 1:
                    jAa = ocv.aa(parcel, i);
                    break;
                case 2:
                    iX = ocv.X(parcel, i);
                    break;
                case 3:
                    bArrAo = ocv.ao(parcel, i);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) ocv.ad(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 6:
                    jAa4 = ocv.aa(parcel, i);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) ocv.ad(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) ocv.ad(parcel, i, Uri.CREATOR);
                    break;
                case 9:
                    jAa2 = ocv.aa(parcel, i);
                    break;
                case 10:
                    zAn = ocv.an(parcel, i);
                    break;
                case 11:
                    oidVar = (oid) ocv.ad(parcel, i, oid.CREATOR);
                    break;
                case 12:
                    jAa3 = ocv.aa(parcel, i);
                    break;
                case 13:
                    strAh2 = ocv.ah(parcel, i);
                    break;
                case 14:
                    strAh3 = ocv.ah(parcel, i);
                    break;
                case 15:
                    oijVar = (oij) ocv.ad(parcel, i, oij.CREATOR);
                    break;
                case 16:
                    oikVar = (oik) ocv.ad(parcel, i, oik.CREATOR);
                    break;
                case 17:
                    iX2 = ocv.X(parcel, i);
                    break;
                case 18:
                    oigVar = (oig) ocv.ad(parcel, i, oig.CREATOR);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new oih(jAa, iX, bArrAo, parcelFileDescriptor, strAh, jAa4, parcelFileDescriptor2, uri, jAa2, zAn, oidVar, jAa3, strAh2, strAh3, oijVar, oikVar, oigVar, iX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new oih[i];
    }
}
