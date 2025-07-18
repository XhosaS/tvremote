package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sct implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public sct(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = 0;
        Uri uri = null;
        Bundle bundleAb = null;
        String strAh = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new scu(parcel);
            case 1:
                return new shi(parcel);
            case 2:
                return new shs(parcel);
            case 3:
                return new sra(parcel);
            case 4:
                return new tey((PendingIntent) parcel.readParcelable(tfa.class.getClassLoader()), parcel.readInt() != 0);
            case 5:
                return new tgn(parcel);
            case 6:
                int iZ = ocv.Z(parcel);
                String strAh2 = null;
                String strAh3 = null;
                String strAh4 = null;
                String strAh5 = null;
                ujt ujtVar = null;
                String strAh6 = null;
                Bundle bundleAb2 = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    switch (ocv.V(i)) {
                        case 1:
                            strAh2 = ocv.ah(parcel, i);
                            break;
                        case 2:
                            strAh3 = ocv.ah(parcel, i);
                            break;
                        case 3:
                            strAh4 = ocv.ah(parcel, i);
                            break;
                        case 4:
                            strAh5 = ocv.ah(parcel, i);
                            break;
                        case 5:
                            ujtVar = (ujt) ocv.ad(parcel, i, ujt.CREATOR);
                            break;
                        case 6:
                            strAh6 = ocv.ah(parcel, i);
                            break;
                        case 7:
                            bundleAb2 = ocv.ab(parcel, i);
                            break;
                        default:
                            ocv.am(parcel, i);
                            break;
                    }
                }
                ocv.al(parcel, iZ);
                return new uju(strAh2, strAh3, strAh4, strAh5, ujtVar, strAh6, bundleAb2);
            case 7:
                int iZ2 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    if (ocv.V(i2) != 1) {
                        ocv.am(parcel, i2);
                    } else {
                        iX = ocv.X(parcel, i2);
                    }
                }
                ocv.al(parcel, iZ2);
                return new ujx(iX);
            case 8:
                int iZ3 = ocv.Z(parcel);
                boolean zAn = false;
                int iX2 = 0;
                String strAh7 = null;
                Bundle bundleAb3 = null;
                Bundle bundleAb4 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV = ocv.V(i3);
                    if (iV == 1) {
                        zAn = ocv.an(parcel, i3);
                    } else if (iV == 2) {
                        iX2 = ocv.X(parcel, i3);
                    } else if (iV == 3) {
                        strAh7 = ocv.ah(parcel, i3);
                    } else if (iV == 4) {
                        bundleAb3 = ocv.ab(parcel, i3);
                    } else if (iV != 5) {
                        ocv.am(parcel, i3);
                    } else {
                        bundleAb4 = ocv.ab(parcel, i3);
                    }
                }
                ocv.al(parcel, iZ3);
                return new uke(zAn, iX2, strAh7, bundleAb3, bundleAb4);
            case 9:
                int iZ4 = ocv.Z(parcel);
                int iX3 = 0;
                boolean zAn2 = false;
                boolean zAn3 = false;
                String strAh8 = null;
                String strAh9 = null;
                byte[] bArrAo = null;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    switch (ocv.V(i4)) {
                        case 1:
                            iX3 = ocv.X(parcel, i4);
                            break;
                        case 2:
                            zAn2 = ocv.an(parcel, i4);
                            break;
                        case 3:
                            strAh8 = ocv.ah(parcel, i4);
                            break;
                        case 4:
                            strAh9 = ocv.ah(parcel, i4);
                            break;
                        case 5:
                            bArrAo = ocv.ao(parcel, i4);
                            break;
                        case 6:
                            zAn3 = ocv.an(parcel, i4);
                            break;
                        default:
                            ocv.am(parcel, i4);
                            break;
                    }
                }
                ocv.al(parcel, iZ4);
                return new ujt(iX3, zAn2, strAh8, strAh9, bArrAo, zAn3);
            case 10:
                int iZ5 = ocv.Z(parcel);
                int iX4 = 0;
                Thing[] thingArr = null;
                String[] strArrAs = null;
                String[] strArrAs2 = null;
                uju ujuVar = null;
                String strAh10 = null;
                String strAh11 = null;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    switch (ocv.V(i5)) {
                        case 1:
                            iX4 = ocv.X(parcel, i5);
                            break;
                        case 2:
                            thingArr = (Thing[]) ocv.ar(parcel, i5, Thing.CREATOR);
                            break;
                        case 3:
                            strArrAs = ocv.as(parcel, i5);
                            break;
                        case 4:
                        default:
                            ocv.am(parcel, i5);
                            break;
                        case 5:
                            strArrAs2 = ocv.as(parcel, i5);
                            break;
                        case 6:
                            ujuVar = (uju) ocv.ad(parcel, i5, uju.CREATOR);
                            break;
                        case 7:
                            strAh10 = ocv.ah(parcel, i5);
                            break;
                        case 8:
                            strAh11 = ocv.ah(parcel, i5);
                            break;
                    }
                }
                ocv.al(parcel, iZ5);
                return new ukd(iX4, thingArr, strArrAs, strArrAs2, ujuVar, strAh10, strAh11);
            case 11:
                int iZ6 = ocv.Z(parcel);
                int iX5 = 0;
                Bundle bundleAb5 = null;
                uke ukeVar = null;
                String strAh12 = null;
                String strAh13 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV2 = ocv.V(i6);
                    if (iV2 == 1) {
                        bundleAb5 = ocv.ab(parcel, i6);
                    } else if (iV2 == 2) {
                        ukeVar = (uke) ocv.ad(parcel, i6, uke.CREATOR);
                    } else if (iV2 == 3) {
                        strAh12 = ocv.ah(parcel, i6);
                    } else if (iV2 == 4) {
                        strAh13 = ocv.ah(parcel, i6);
                    } else if (iV2 != 1000) {
                        ocv.am(parcel, i6);
                    } else {
                        iX5 = ocv.X(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ6);
                return new Thing(iX5, bundleAb5, ukeVar, strAh12, strAh13);
            case 12:
                int iZ7 = ocv.Z(parcel);
                long jAa = 0;
                int iX6 = 0;
                String strAh14 = null;
                String strAh15 = null;
                Bundle bundleAb6 = null;
                Uri uri2 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    switch (ocv.V(i7)) {
                        case 1:
                            strAh14 = ocv.ah(parcel, i7);
                            break;
                        case 2:
                            strAh15 = ocv.ah(parcel, i7);
                            break;
                        case 3:
                            iX6 = ocv.X(parcel, i7);
                            break;
                        case 4:
                            jAa = ocv.aa(parcel, i7);
                            break;
                        case 5:
                            bundleAb6 = ocv.ab(parcel, i7);
                            break;
                        case 6:
                            uri2 = (Uri) ocv.ad(parcel, i7, Uri.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i7);
                            break;
                    }
                }
                ocv.al(parcel, iZ7);
                return new ulq(strAh14, strAh15, iX6, jAa, bundleAb6, uri2);
            case 13:
                int iZ8 = ocv.Z(parcel);
                Uri uri3 = null;
                ArrayList arrayListAk = null;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV3 = ocv.V(i8);
                    if (iV3 == 1) {
                        uri = (Uri) ocv.ad(parcel, i8, Uri.CREATOR);
                    } else if (iV3 == 2) {
                        uri3 = (Uri) ocv.ad(parcel, i8, Uri.CREATOR);
                    } else if (iV3 != 3) {
                        ocv.am(parcel, i8);
                    } else {
                        arrayListAk = ocv.ak(parcel, i8, uly.CREATOR);
                    }
                }
                ocv.al(parcel, iZ8);
                return new ulz(uri, uri3, arrayListAk);
            case 14:
                int iZ9 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    if (ocv.V(i9) != 2) {
                        ocv.am(parcel, i9);
                    } else {
                        strAh = ocv.ah(parcel, i9);
                    }
                }
                ocv.al(parcel, iZ9);
                return new uly(strAh);
            case 15:
                int iZ10 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    if (ocv.V(i10) != 2) {
                        ocv.am(parcel, i10);
                    } else {
                        bundleAb = ocv.ab(parcel, i10);
                    }
                }
                ocv.al(parcel, iZ10);
                return new uov(bundleAb);
            case 16:
                return new usp(parcel);
            default:
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new ProtoParsers$InternalDontUse(bArr, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new scu[i];
            case 1:
                return new shi[0];
            case 2:
                return new shs[i];
            case 3:
                return new sra[i];
            case 4:
                return new tfa[i];
            case 5:
                return new tgn[i];
            case 6:
                return new uju[i];
            case 7:
                return new ujx[i];
            case 8:
                return new uke[i];
            case 9:
                return new ujt[i];
            case 10:
                return new ukd[i];
            case 11:
                return new Thing[i];
            case 12:
                return new ulq[i];
            case 13:
                return new ulz[i];
            case 14:
                return new uly[i];
            case 15:
                return new uov[i];
            case 16:
                return new usp[i];
            default:
                return new ProtoParsers$InternalDontUse[i];
        }
    }
}
