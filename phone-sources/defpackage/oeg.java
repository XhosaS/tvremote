package defpackage;

import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public oeg(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jAa = 0;
        int iX = 0;
        okp okpVar = null;
        byte[] bArrAo = null;
        oma[] omaVarArr = null;
        String strAh = null;
        olo oloVar = null;
        olo oloVar2 = null;
        Boolean boolAe = null;
        ArrayList arrayListAk = null;
        olo oloVar3 = null;
        Integer numAf = null;
        olo oloVar4 = null;
        String strAh2 = null;
        MatrixCursor matrixCursor = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                int iX2 = 0;
                boolean zAn = false;
                String strAh3 = null;
                String strAh4 = null;
                String[] strArrAs = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    int iV = ocv.V(i);
                    if (iV == 2) {
                        strAh3 = ocv.ah(parcel, i);
                    } else if (iV == 3) {
                        strArrAs = ocv.as(parcel, i);
                    } else if (iV == 4) {
                        iX2 = ocv.X(parcel, i);
                    } else if (iV == 5) {
                        zAn = ocv.an(parcel, i);
                    } else if (iV != 6) {
                        ocv.am(parcel, i);
                    } else {
                        strAh4 = ocv.ah(parcel, i);
                    }
                }
                ocv.al(parcel, iZ);
                return new oef(strAh3, strAh4, strArrAs, iX2, zAn);
            case 1:
                int iZ2 = ocv.Z(parcel);
                okn oknVar = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    int iV2 = ocv.V(i2);
                    if (iV2 == 1) {
                        okpVar = (okp) ocv.ad(parcel, i2, okp.CREATOR);
                    } else if (iV2 != 2) {
                        ocv.am(parcel, i2);
                    } else {
                        oknVar = (okn) ocv.ad(parcel, i2, okn.CREATOR);
                    }
                }
                ocv.al(parcel, iZ2);
                return new okq(okpVar, oknVar);
            case 2:
                int iZ3 = ocv.Z(parcel);
                int iX3 = 0;
                okp okpVar2 = null;
                Uri uri = null;
                String strAh5 = null;
                oko okoVar = null;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV3 = ocv.V(i3);
                    if (iV3 == 1) {
                        okpVar2 = (okp) ocv.ad(parcel, i3, okp.CREATOR);
                    } else if (iV3 == 2) {
                        iX3 = ocv.X(parcel, i3);
                    } else if (iV3 == 3) {
                        uri = (Uri) ocv.ad(parcel, i3, Uri.CREATOR);
                    } else if (iV3 == 4) {
                        strAh5 = ocv.ah(parcel, i3);
                    } else if (iV3 != 5) {
                        ocv.am(parcel, i3);
                    } else {
                        okoVar = (oko) ocv.ad(parcel, i3, oko.CREATOR);
                    }
                }
                ocv.al(parcel, iZ3);
                return new okr(okpVar2, iX3, uri, strAh5, okoVar);
            case 3:
                int i4 = parcel.readInt();
                String[] strArr = new String[i4];
                parcel.readStringArray(strArr);
                int i5 = parcel.readInt();
                MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
                if (i4 != 0 || i5 != 0) {
                    while (iX < i5) {
                        matrixCursor2.addRow(parcel.readArray(Object.class.getClassLoader()));
                        iX++;
                    }
                    matrixCursor = matrixCursor2;
                }
                return new oku(matrixCursor);
            case 4:
                int iZ4 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ4) {
                    int i6 = parcel.readInt();
                    int iV4 = ocv.V(i6);
                    if (iV4 == 2) {
                        iX = ocv.X(parcel, i6);
                    } else if (iV4 == 3) {
                        strAh2 = ocv.ah(parcel, i6);
                    } else if (iV4 != 4) {
                        ocv.am(parcel, i6);
                    } else {
                        jAa = ocv.aa(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ4);
                return new olc(iX, strAh2, jAa);
            case 5:
                int iZ5 = ocv.Z(parcel);
                String strAh6 = null;
                Long lAg = null;
                ArrayList arrayListAk2 = null;
                String strAh7 = null;
                Long lAg2 = null;
                Long lAg3 = null;
                olk olkVar = null;
                while (parcel.dataPosition() < iZ5) {
                    int i7 = parcel.readInt();
                    switch (ocv.V(i7)) {
                        case 2:
                            strAh6 = ocv.ah(parcel, i7);
                            break;
                        case 3:
                            arrayListAk2 = ocv.ak(parcel, i7, olr.CREATOR);
                            break;
                        case 4:
                            strAh7 = ocv.ah(parcel, i7);
                            break;
                        case 5:
                            lAg2 = ocv.ag(parcel, i7);
                            break;
                        case 6:
                            lAg3 = ocv.ag(parcel, i7);
                            break;
                        case 7:
                            lAg = ocv.ag(parcel, i7);
                            break;
                        case 8:
                            olkVar = (olk) ocv.ad(parcel, i7, olk.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i7);
                            break;
                    }
                }
                ocv.al(parcel, iZ5);
                return new oli(strAh6, lAg, arrayListAk2, strAh7, lAg2, lAg3, olkVar);
            case 6:
                int iZ6 = ocv.Z(parcel);
                Long lAg4 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i8 = parcel.readInt();
                    int iV5 = ocv.V(i8);
                    if (iV5 == 2) {
                        oloVar4 = (olo) ocv.ad(parcel, i8, olo.CREATOR);
                    } else if (iV5 != 3) {
                        ocv.am(parcel, i8);
                    } else {
                        lAg4 = ocv.ag(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ6);
                return new olj(oloVar4, lAg4);
            case 7:
                int iZ7 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ7) {
                    int i9 = parcel.readInt();
                    if (ocv.V(i9) != 2) {
                        ocv.am(parcel, i9);
                    } else {
                        numAf = ocv.af(parcel, i9);
                    }
                }
                ocv.al(parcel, iZ7);
                return new olk(numAf);
            case 8:
                int iZ8 = ocv.Z(parcel);
                String strAh8 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i10 = parcel.readInt();
                    int iV6 = ocv.V(i10);
                    if (iV6 == 2) {
                        oloVar3 = (olo) ocv.ad(parcel, i10, olo.CREATOR);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i10);
                    } else {
                        strAh8 = ocv.ah(parcel, i10);
                    }
                }
                ocv.al(parcel, iZ8);
                return new oll(oloVar3, strAh8);
            case 9:
                int iZ9 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ9) {
                    int i11 = parcel.readInt();
                    if (ocv.V(i11) != 2) {
                        ocv.am(parcel, i11);
                    } else {
                        arrayListAk = ocv.ak(parcel, i11, oli.CREATOR);
                    }
                }
                ocv.al(parcel, iZ9);
                return new FetchBackUpDeviceContactInfoResponseEntity(arrayListAk);
            case 10:
                int iZ10 = ocv.Z(parcel);
                olo oloVar5 = null;
                String strAh9 = null;
                String strAh10 = null;
                String strAh11 = null;
                String strAh12 = null;
                String strAh13 = null;
                String strAh14 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i12 = parcel.readInt();
                    int iV7 = ocv.V(i12);
                    if (iV7 != 17) {
                        switch (iV7) {
                            case 2:
                                oloVar5 = (olo) ocv.ad(parcel, i12, olo.CREATOR);
                                break;
                            case 3:
                                strAh9 = ocv.ah(parcel, i12);
                                break;
                            case 4:
                                strAh14 = ocv.ah(parcel, i12);
                                break;
                            case 5:
                                strAh11 = ocv.ah(parcel, i12);
                                break;
                            case 6:
                                strAh12 = ocv.ah(parcel, i12);
                                break;
                            case 7:
                                strAh13 = ocv.ah(parcel, i12);
                                break;
                            default:
                                ocv.am(parcel, i12);
                                break;
                        }
                    } else {
                        strAh10 = ocv.ah(parcel, i12);
                    }
                }
                ocv.al(parcel, iZ10);
                return new olm(oloVar5, strAh9, strAh10, strAh11, strAh12, strAh13, strAh14);
            case 11:
                int iZ11 = ocv.Z(parcel);
                String strAh15 = null;
                ArrayList arrayListAk3 = null;
                ArrayList arrayListAk4 = null;
                ArrayList arrayListAk5 = null;
                ArrayList arrayListAk6 = null;
                ArrayList arrayListAk7 = null;
                ArrayList arrayListAk8 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i13 = parcel.readInt();
                    int iV8 = ocv.V(i13);
                    if (iV8 == 2) {
                        strAh15 = ocv.ah(parcel, i13);
                    } else if (iV8 == 9) {
                        arrayListAk7 = ocv.ak(parcel, i13, olj.CREATOR);
                    } else if (iV8 == 11) {
                        arrayListAk5 = ocv.ak(parcel, i13, oll.CREATOR);
                    } else if (iV8 == 13) {
                        arrayListAk6 = ocv.ak(parcel, i13, olp.CREATOR);
                    } else if (iV8 == 148) {
                        arrayListAk8 = ocv.ak(parcel, i13, olq.CREATOR);
                    } else if (iV8 == 4) {
                        arrayListAk3 = ocv.ak(parcel, i13, olm.CREATOR);
                    } else if (iV8 != 5) {
                        ocv.am(parcel, i13);
                    } else {
                        arrayListAk4 = ocv.ak(parcel, i13, olq.CREATOR);
                    }
                }
                ocv.al(parcel, iZ11);
                return new oln(strAh15, arrayListAk3, arrayListAk4, arrayListAk5, arrayListAk6, arrayListAk7, arrayListAk8);
            case 12:
                int iZ12 = ocv.Z(parcel);
                int iAf = 3;
                while (parcel.dataPosition() < iZ12) {
                    int i14 = parcel.readInt();
                    int iV9 = ocv.V(i14);
                    if (iV9 == 3) {
                        iAf = ocv.af(parcel, i14);
                    } else if (iV9 != 4) {
                        ocv.am(parcel, i14);
                    } else {
                        boolAe = ocv.ae(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ12);
                return new olo(iAf, boolAe);
            case 13:
                int iZ13 = ocv.Z(parcel);
                String strAh16 = null;
                String strAh17 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i15 = parcel.readInt();
                    int iV10 = ocv.V(i15);
                    if (iV10 == 2) {
                        oloVar2 = (olo) ocv.ad(parcel, i15, olo.CREATOR);
                    } else if (iV10 == 3) {
                        strAh16 = ocv.ah(parcel, i15);
                    } else if (iV10 != 4) {
                        ocv.am(parcel, i15);
                    } else {
                        strAh17 = ocv.ah(parcel, i15);
                    }
                }
                ocv.al(parcel, iZ13);
                return new olp(oloVar2, strAh16, strAh17);
            case 14:
                int iZ14 = ocv.Z(parcel);
                String strAh18 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i16 = parcel.readInt();
                    int iV11 = ocv.V(i16);
                    if (iV11 == 2) {
                        oloVar = (olo) ocv.ad(parcel, i16, olo.CREATOR);
                    } else if (iV11 != 3) {
                        ocv.am(parcel, i16);
                    } else {
                        strAh18 = ocv.ah(parcel, i16);
                    }
                }
                ocv.al(parcel, iZ14);
                return new olq(oloVar, strAh18);
            case 15:
                int iZ15 = ocv.Z(parcel);
                Integer numAf2 = null;
                Integer numAf3 = null;
                while (parcel.dataPosition() < iZ15) {
                    int i17 = parcel.readInt();
                    int iV12 = ocv.V(i17);
                    if (iV12 == 2) {
                        strAh = ocv.ah(parcel, i17);
                    } else if (iV12 == 3) {
                        numAf2 = ocv.af(parcel, i17);
                    } else if (iV12 != 4) {
                        ocv.am(parcel, i17);
                    } else {
                        numAf3 = ocv.af(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ15);
                return new olr(strAh, numAf2, numAf3);
            case 16:
                int iZ16 = ocv.Z(parcel);
                String[] strArrAs2 = null;
                while (parcel.dataPosition() < iZ16) {
                    int i18 = parcel.readInt();
                    int iV13 = ocv.V(i18);
                    if (iV13 == 2) {
                        iX = ocv.X(parcel, i18);
                    } else if (iV13 == 3) {
                        omaVarArr = (oma[]) ocv.ar(parcel, i18, oma.CREATOR);
                    } else if (iV13 != 4) {
                        ocv.am(parcel, i18);
                    } else {
                        strArrAs2 = ocv.as(parcel, i18);
                    }
                }
                ocv.al(parcel, iZ16);
                return new olt(iX, omaVarArr, strArrAs2);
            case 17:
                int iZ17 = ocv.Z(parcel);
                long jAa2 = 0;
                boolean zAn2 = false;
                String strAh19 = null;
                String strAh20 = null;
                olt[] oltVarArr = null;
                byte[] bArrAo2 = null;
                while (parcel.dataPosition() < iZ17) {
                    int i19 = parcel.readInt();
                    switch (ocv.V(i19)) {
                        case 2:
                            strAh19 = ocv.ah(parcel, i19);
                            break;
                        case 3:
                            strAh20 = ocv.ah(parcel, i19);
                            break;
                        case 4:
                            oltVarArr = (olt[]) ocv.ar(parcel, i19, olt.CREATOR);
                            break;
                        case 5:
                            zAn2 = ocv.an(parcel, i19);
                            break;
                        case 6:
                            bArrAo2 = ocv.ao(parcel, i19);
                            break;
                        case 7:
                            jAa2 = ocv.aa(parcel, i19);
                            break;
                        default:
                            ocv.am(parcel, i19);
                            break;
                    }
                }
                ocv.al(parcel, iZ17);
                return new olu(strAh19, strAh20, oltVarArr, zAn2, bArrAo2, jAa2);
            case 18:
                int iZ18 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ18) {
                    int i20 = parcel.readInt();
                    if (ocv.V(i20) != 2) {
                        ocv.am(parcel, i20);
                    } else {
                        bArrAo = ocv.ao(parcel, i20);
                    }
                }
                ocv.al(parcel, iZ18);
                return new olv(bArrAo);
            case 19:
                int iZ19 = ocv.Z(parcel);
                String strAh21 = null;
                byte[] bArrAo3 = null;
                byte[][] bArrAt = null;
                byte[][] bArrAt2 = null;
                byte[][] bArrAt3 = null;
                byte[][] bArrAt4 = null;
                int[] iArrAp = null;
                byte[][] bArrAt5 = null;
                int[] iArrAp2 = null;
                byte[][] bArrAt6 = null;
                while (parcel.dataPosition() < iZ19) {
                    int i21 = parcel.readInt();
                    switch (ocv.V(i21)) {
                        case 2:
                            strAh21 = ocv.ah(parcel, i21);
                            break;
                        case 3:
                            bArrAo3 = ocv.ao(parcel, i21);
                            break;
                        case 4:
                            bArrAt = ocv.at(parcel, i21);
                            break;
                        case 5:
                            bArrAt2 = ocv.at(parcel, i21);
                            break;
                        case 6:
                            bArrAt3 = ocv.at(parcel, i21);
                            break;
                        case 7:
                            bArrAt4 = ocv.at(parcel, i21);
                            break;
                        case 8:
                            iArrAp = ocv.ap(parcel, i21);
                            break;
                        case 9:
                            bArrAt5 = ocv.at(parcel, i21);
                            break;
                        case 10:
                            iArrAp2 = ocv.ap(parcel, i21);
                            break;
                        case 11:
                            bArrAt6 = ocv.at(parcel, i21);
                            break;
                        default:
                            ocv.am(parcel, i21);
                            break;
                    }
                }
                ocv.al(parcel, iZ19);
                return new oly(strAh21, bArrAo3, bArrAt, bArrAt2, bArrAt3, bArrAt4, iArrAp, bArrAt5, iArrAp2, bArrAt6);
            default:
                int iZ20 = ocv.Z(parcel);
                double dT = 0.0d;
                long jAa3 = 0;
                boolean zAn3 = false;
                int iX4 = 0;
                int iX5 = 0;
                int iX6 = 0;
                String strAh22 = null;
                String strAh23 = null;
                byte[] bArrAo4 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i22 = parcel.readInt();
                    switch (ocv.V(i22)) {
                        case 2:
                            strAh22 = ocv.ah(parcel, i22);
                            break;
                        case 3:
                            jAa3 = ocv.aa(parcel, i22);
                            break;
                        case 4:
                            zAn3 = ocv.an(parcel, i22);
                            break;
                        case 5:
                            dT = ocv.T(parcel, i22);
                            break;
                        case 6:
                            strAh23 = ocv.ah(parcel, i22);
                            break;
                        case 7:
                            bArrAo4 = ocv.ao(parcel, i22);
                            break;
                        case 8:
                            iX4 = ocv.X(parcel, i22);
                            break;
                        case 9:
                            iX5 = ocv.X(parcel, i22);
                            break;
                        case 10:
                            iX6 = ocv.X(parcel, i22);
                            break;
                        default:
                            ocv.am(parcel, i22);
                            break;
                    }
                }
                ocv.al(parcel, iZ20);
                return new oma(strAh22, jAa3, zAn3, dT, strAh23, bArrAo4, iX4, iX5, iX6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oef[i];
            case 1:
                return new okq[i];
            case 2:
                return new okr[i];
            case 3:
                return new oku[i];
            case 4:
                return new olc[i];
            case 5:
                return new oli[i];
            case 6:
                return new olj[i];
            case 7:
                return new olk[i];
            case 8:
                return new oll[i];
            case 9:
                return new FetchBackUpDeviceContactInfoResponseEntity[i];
            case 10:
                return new olm[i];
            case 11:
                return new oln[i];
            case 12:
                return new olo[i];
            case 13:
                return new olp[i];
            case 14:
                return new olq[i];
            case 15:
                return new olr[i];
            case 16:
                return new olt[i];
            case 17:
                return new olu[i];
            case 18:
                return new olv[i];
            case 19:
                return new oly[i];
            default:
                return new oma[i];
        }
    }
}
