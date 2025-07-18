package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nld implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public nld(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zAn = false;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        boolean zAn2 = false;
        int iX4 = 0;
        int iX5 = 0;
        String strAh = null;
        String strAh2 = null;
        String strAh3 = null;
        String strAh4 = null;
        String strAh5 = null;
        ArrayList arrayListAk = null;
        String strAh6 = null;
        String strAh7 = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                long jAa = 0;
                String strAh8 = null;
                Integer numAf = null;
                String strAh9 = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    int iV = ocv.V(i);
                    if (iV == 2) {
                        strAh8 = ocv.ah(parcel, i);
                    } else if (iV == 3) {
                        jAa = ocv.aa(parcel, i);
                    } else if (iV == 4) {
                        numAf = ocv.af(parcel, i);
                    } else if (iV == 5) {
                        strAh9 = ocv.ah(parcel, i);
                    } else if (iV != 6) {
                        ocv.am(parcel, i);
                    } else {
                        strAh = ocv.ah(parcel, i);
                    }
                }
                ocv.al(parcel, iZ);
                return new MediaError(strAh8, jAa, numAf, strAh9, nrv.g(strAh));
            case 1:
                int iZ2 = ocv.Z(parcel);
                boolean zAn3 = false;
                nkp nkpVar = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    int iV2 = ocv.V(i2);
                    if (iV2 == 2) {
                        zAn = ocv.an(parcel, i2);
                    } else if (iV2 == 3) {
                        strAh7 = ocv.ah(parcel, i2);
                    } else if (iV2 == 4) {
                        zAn3 = ocv.an(parcel, i2);
                    } else if (iV2 != 5) {
                        ocv.am(parcel, i2);
                    } else {
                        nkpVar = (nkp) ocv.ad(parcel, i2, nkp.CREATOR);
                    }
                }
                ocv.al(parcel, iZ2);
                return new nlc(zAn, strAh7, zAn3, nkpVar);
            case 2:
                int iZ3 = ocv.Z(parcel);
                long jAa2 = 0;
                long jAa3 = 0;
                boolean zAn4 = false;
                boolean zAn5 = false;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV3 = ocv.V(i3);
                    if (iV3 == 2) {
                        jAa2 = ocv.aa(parcel, i3);
                    } else if (iV3 == 3) {
                        jAa3 = ocv.aa(parcel, i3);
                    } else if (iV3 == 4) {
                        zAn4 = ocv.an(parcel, i3);
                    } else if (iV3 != 5) {
                        ocv.am(parcel, i3);
                    } else {
                        zAn5 = ocv.an(parcel, i3);
                    }
                }
                ocv.al(parcel, iZ3);
                return new nlg(jAa2, jAa3, zAn4, zAn5);
            case 3:
                int iZ4 = ocv.Z(parcel);
                double dT = 0.0d;
                long jAa4 = 0;
                long jAa5 = 0;
                MediaInfo mediaInfo = null;
                nlk nlkVar = null;
                Boolean boolAe = null;
                long[] jArrAq = null;
                String strAh10 = null;
                String strAh11 = null;
                String strAh12 = null;
                String strAh13 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    switch (ocv.V(i4)) {
                        case 2:
                            mediaInfo = (MediaInfo) ocv.ad(parcel, i4, MediaInfo.CREATOR);
                            break;
                        case 3:
                            nlkVar = (nlk) ocv.ad(parcel, i4, nlk.CREATOR);
                            break;
                        case 4:
                            boolAe = ocv.ae(parcel, i4);
                            break;
                        case 5:
                            jAa4 = ocv.aa(parcel, i4);
                            break;
                        case 6:
                            dT = ocv.T(parcel, i4);
                            break;
                        case 7:
                            jArrAq = ocv.aq(parcel, i4);
                            break;
                        case 8:
                            strAh6 = ocv.ah(parcel, i4);
                            break;
                        case 9:
                            strAh10 = ocv.ah(parcel, i4);
                            break;
                        case 10:
                            strAh11 = ocv.ah(parcel, i4);
                            break;
                        case 11:
                            strAh12 = ocv.ah(parcel, i4);
                            break;
                        case 12:
                            strAh13 = ocv.ah(parcel, i4);
                            break;
                        case 13:
                            jAa5 = ocv.aa(parcel, i4);
                            break;
                        default:
                            ocv.am(parcel, i4);
                            break;
                    }
                }
                ocv.al(parcel, iZ4);
                return new nlh(mediaInfo, nlkVar, boolAe, jAa4, dT, jArrAq, nrv.g(strAh6), strAh10, strAh11, strAh12, strAh13, jAa5);
            case 4:
                int iZ5 = ocv.Z(parcel);
                Bundle bundleAb = null;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    int iV4 = ocv.V(i5);
                    if (iV4 == 2) {
                        arrayListAk = ocv.ak(parcel, i5, oak.CREATOR);
                    } else if (iV4 == 3) {
                        bundleAb = ocv.ab(parcel, i5);
                    } else if (iV4 != 4) {
                        ocv.am(parcel, i5);
                    } else {
                        iX5 = ocv.X(parcel, i5);
                    }
                }
                ocv.al(parcel, iZ5);
                return new nli(arrayListAk, bundleAb, iX5);
            case 5:
                int iZ6 = ocv.Z(parcel);
                double dT2 = 0.0d;
                int iX6 = 0;
                String strAh14 = null;
                ArrayList arrayListAk2 = null;
                ArrayList arrayListAk3 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV5 = ocv.V(i6);
                    if (iV5 == 2) {
                        iX6 = ocv.X(parcel, i6);
                    } else if (iV5 == 3) {
                        strAh14 = ocv.ah(parcel, i6);
                    } else if (iV5 == 4) {
                        arrayListAk2 = ocv.ak(parcel, i6, nli.CREATOR);
                    } else if (iV5 == 5) {
                        arrayListAk3 = ocv.ak(parcel, i6, oak.CREATOR);
                    } else if (iV5 != 6) {
                        ocv.am(parcel, i6);
                    } else {
                        dT2 = ocv.T(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ6);
                return new nlj(iX6, strAh14, arrayListAk2, arrayListAk3, dT2);
            case 6:
                int iZ7 = ocv.Z(parcel);
                long jAa6 = 0;
                int iX7 = 0;
                int iX8 = 0;
                int iX9 = 0;
                boolean zAn6 = false;
                String strAh15 = null;
                String strAh16 = null;
                String strAh17 = null;
                nlj nljVar = null;
                ArrayList arrayListAk4 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    switch (ocv.V(i7)) {
                        case 2:
                            strAh15 = ocv.ah(parcel, i7);
                            break;
                        case 3:
                            strAh16 = ocv.ah(parcel, i7);
                            break;
                        case 4:
                            iX7 = ocv.X(parcel, i7);
                            break;
                        case 5:
                            strAh17 = ocv.ah(parcel, i7);
                            break;
                        case 6:
                            nljVar = (nlj) ocv.ad(parcel, i7, nlj.CREATOR);
                            break;
                        case 7:
                            iX8 = ocv.X(parcel, i7);
                            break;
                        case 8:
                            arrayListAk4 = ocv.ak(parcel, i7, nll.CREATOR);
                            break;
                        case 9:
                            iX9 = ocv.X(parcel, i7);
                            break;
                        case 10:
                            jAa6 = ocv.aa(parcel, i7);
                            break;
                        case 11:
                            zAn6 = ocv.an(parcel, i7);
                            break;
                        default:
                            ocv.am(parcel, i7);
                            break;
                    }
                }
                ocv.al(parcel, iZ7);
                return new nlk(strAh15, strAh16, iX7, strAh17, nljVar, iX8, arrayListAk4, iX9, jAa6, zAn6);
            case 7:
                int iZ8 = ocv.Z(parcel);
                double dT3 = 0.0d;
                double dT4 = 0.0d;
                double dT5 = 0.0d;
                int iX10 = 0;
                boolean zAn7 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArrAq2 = null;
                String strAh18 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    switch (ocv.V(i8)) {
                        case 2:
                            mediaInfo2 = (MediaInfo) ocv.ad(parcel, i8, MediaInfo.CREATOR);
                            break;
                        case 3:
                            iX10 = ocv.X(parcel, i8);
                            break;
                        case 4:
                            zAn7 = ocv.an(parcel, i8);
                            break;
                        case 5:
                            dT3 = ocv.T(parcel, i8);
                            break;
                        case 6:
                            dT4 = ocv.T(parcel, i8);
                            break;
                        case 7:
                            dT5 = ocv.T(parcel, i8);
                            break;
                        case 8:
                            jArrAq2 = ocv.aq(parcel, i8);
                            break;
                        case 9:
                            strAh18 = ocv.ah(parcel, i8);
                            break;
                        default:
                            ocv.am(parcel, i8);
                            break;
                    }
                }
                ocv.al(parcel, iZ8);
                return new nll(mediaInfo2, iX10, zAn7, dT3, dT4, dT5, jArrAq2, strAh18);
            case 8:
                int iZ9 = ocv.Z(parcel);
                long jAa7 = 0;
                int iX11 = 0;
                int iX12 = 0;
                String strAh19 = null;
                String strAh20 = null;
                String strAh21 = null;
                String strAh22 = null;
                ArrayList arrayListAj = null;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    switch (ocv.V(i9)) {
                        case 2:
                            jAa7 = ocv.aa(parcel, i9);
                            break;
                        case 3:
                            iX11 = ocv.X(parcel, i9);
                            break;
                        case 4:
                            strAh19 = ocv.ah(parcel, i9);
                            break;
                        case 5:
                            strAh20 = ocv.ah(parcel, i9);
                            break;
                        case 6:
                            strAh21 = ocv.ah(parcel, i9);
                            break;
                        case 7:
                            strAh22 = ocv.ah(parcel, i9);
                            break;
                        case 8:
                            iX12 = ocv.X(parcel, i9);
                            break;
                        case 9:
                            arrayListAj = ocv.aj(parcel, i9);
                            break;
                        case 10:
                            strAh5 = ocv.ah(parcel, i9);
                            break;
                        default:
                            ocv.am(parcel, i9);
                            break;
                    }
                }
                ocv.al(parcel, iZ9);
                return new MediaTrack(jAa7, iX11, strAh19, strAh20, strAh21, strAh22, iX12, arrayListAj, nrv.g(strAh5));
            case 9:
                int iZ10 = ocv.Z(parcel);
                float fU = 0.0f;
                int iX13 = 0;
                int iX14 = 0;
                int iX15 = 0;
                int iX16 = 0;
                int iX17 = 0;
                int iX18 = 0;
                int iX19 = 0;
                int iX20 = 0;
                int iX21 = 0;
                String strAh23 = null;
                String strAh24 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    switch (ocv.V(i10)) {
                        case 2:
                            fU = ocv.U(parcel, i10);
                            break;
                        case 3:
                            iX13 = ocv.X(parcel, i10);
                            break;
                        case 4:
                            iX14 = ocv.X(parcel, i10);
                            break;
                        case 5:
                            iX15 = ocv.X(parcel, i10);
                            break;
                        case 6:
                            iX16 = ocv.X(parcel, i10);
                            break;
                        case 7:
                            iX17 = ocv.X(parcel, i10);
                            break;
                        case 8:
                            iX18 = ocv.X(parcel, i10);
                            break;
                        case 9:
                            iX19 = ocv.X(parcel, i10);
                            break;
                        case 10:
                            strAh23 = ocv.ah(parcel, i10);
                            break;
                        case 11:
                            iX20 = ocv.X(parcel, i10);
                            break;
                        case 12:
                            iX21 = ocv.X(parcel, i10);
                            break;
                        case 13:
                            strAh24 = ocv.ah(parcel, i10);
                            break;
                        default:
                            ocv.am(parcel, i10);
                            break;
                    }
                }
                ocv.al(parcel, iZ10);
                return new nmb(fU, iX13, iX14, iX15, iX16, iX17, iX18, iX19, strAh23, iX20, iX21, strAh24);
            case 10:
                int iZ11 = ocv.Z(parcel);
                String strAh25 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i11 = parcel.readInt();
                    int iV6 = ocv.V(i11);
                    if (iV6 == 2) {
                        strAh4 = ocv.ah(parcel, i11);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i11);
                    } else {
                        strAh25 = ocv.ah(parcel, i11);
                    }
                }
                ocv.al(parcel, iZ11);
                return new nmc(strAh4, strAh25);
            case 11:
                int iZ12 = ocv.Z(parcel);
                int iX22 = 0;
                int iX23 = 0;
                while (parcel.dataPosition() < iZ12) {
                    int i12 = parcel.readInt();
                    int iV7 = ocv.V(i12);
                    if (iV7 == 2) {
                        iX4 = ocv.X(parcel, i12);
                    } else if (iV7 == 3) {
                        iX22 = ocv.X(parcel, i12);
                    } else if (iV7 != 4) {
                        ocv.am(parcel, i12);
                    } else {
                        iX23 = ocv.X(parcel, i12);
                    }
                }
                ocv.al(parcel, iZ12);
                return new nmd(iX4, iX22, iX23);
            case 12:
                int iZ13 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ13) {
                    int i13 = parcel.readInt();
                    if (ocv.V(i13) != 2) {
                        ocv.am(parcel, i13);
                    } else {
                        zAn2 = ocv.an(parcel, i13);
                    }
                }
                ocv.al(parcel, iZ13);
                return new nmh(zAn2);
            case 13:
                int iZ14 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ14) {
                    int i14 = parcel.readInt();
                    if (ocv.V(i14) != 2) {
                        ocv.am(parcel, i14);
                    } else {
                        iX3 = ocv.X(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ14);
                return new nmi(iX3);
            case 14:
                int iZ15 = ocv.Z(parcel);
                boolean zAn8 = false;
                boolean zAn9 = false;
                String strAh26 = null;
                String strAh27 = null;
                IBinder iBinderAc = null;
                npk npkVar = null;
                while (parcel.dataPosition() < iZ15) {
                    int i15 = parcel.readInt();
                    switch (ocv.V(i15)) {
                        case 2:
                            strAh26 = ocv.ah(parcel, i15);
                            break;
                        case 3:
                            strAh27 = ocv.ah(parcel, i15);
                            break;
                        case 4:
                            iBinderAc = ocv.ac(parcel, i15);
                            break;
                        case 5:
                            npkVar = (npk) ocv.ad(parcel, i15, npk.CREATOR);
                            break;
                        case 6:
                            zAn8 = ocv.an(parcel, i15);
                            break;
                        case 7:
                            zAn9 = ocv.an(parcel, i15);
                            break;
                        default:
                            ocv.am(parcel, i15);
                            break;
                    }
                }
                ocv.al(parcel, iZ15);
                return new now(strAh26, strAh27, iBinderAc, npkVar, zAn8, zAn9);
            case 15:
                int iZ16 = ocv.Z(parcel);
                int iX24 = 0;
                int iX25 = 0;
                while (parcel.dataPosition() < iZ16) {
                    int i16 = parcel.readInt();
                    int iV8 = ocv.V(i16);
                    if (iV8 == 2) {
                        iX2 = ocv.X(parcel, i16);
                    } else if (iV8 == 3) {
                        iX24 = ocv.X(parcel, i16);
                    } else if (iV8 != 4) {
                        ocv.am(parcel, i16);
                    } else {
                        iX25 = ocv.X(parcel, i16);
                    }
                }
                ocv.al(parcel, iZ16);
                return new npc(iX2, iX24, iX25);
            case 16:
                int iZ17 = ocv.Z(parcel);
                String strAh28 = null;
                while (parcel.dataPosition() < iZ17) {
                    int i17 = parcel.readInt();
                    int iV9 = ocv.V(i17);
                    if (iV9 == 2) {
                        strAh3 = ocv.ah(parcel, i17);
                    } else if (iV9 == 3) {
                        iX = ocv.X(parcel, i17);
                    } else if (iV9 != 4) {
                        ocv.am(parcel, i17);
                    } else {
                        strAh28 = ocv.ah(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ17);
                return new npi(strAh3, iX, strAh28);
            case 17:
                int iZ18 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ18) {
                    int i18 = parcel.readInt();
                    if (ocv.V(i18) != 2) {
                        ocv.am(parcel, i18);
                    } else {
                        strAh2 = ocv.ah(parcel, i18);
                    }
                }
                ocv.al(parcel, iZ18);
                return new nrh(strAh2);
            case 18:
                int iZ19 = ocv.Z(parcel);
                int iX26 = 0;
                boolean zAn10 = false;
                boolean zAn11 = false;
                boolean zAn12 = false;
                boolean zAn13 = false;
                String strAh29 = null;
                String strAh30 = null;
                String strAh31 = null;
                String strAh32 = null;
                String strAh33 = null;
                while (parcel.dataPosition() < iZ19) {
                    int i19 = parcel.readInt();
                    switch (ocv.V(i19)) {
                        case 2:
                            iX26 = ocv.X(parcel, i19);
                            break;
                        case 3:
                            zAn10 = ocv.an(parcel, i19);
                            break;
                        case 4:
                            zAn11 = ocv.an(parcel, i19);
                            break;
                        case 5:
                            strAh29 = ocv.ah(parcel, i19);
                            break;
                        case 6:
                            strAh30 = ocv.ah(parcel, i19);
                            break;
                        case 7:
                            strAh31 = ocv.ah(parcel, i19);
                            break;
                        case 8:
                            strAh32 = ocv.ah(parcel, i19);
                            break;
                        case 9:
                            strAh33 = ocv.ah(parcel, i19);
                            break;
                        case 10:
                            zAn12 = ocv.an(parcel, i19);
                            break;
                        case 11:
                            zAn13 = ocv.an(parcel, i19);
                            break;
                        default:
                            ocv.am(parcel, i19);
                            break;
                    }
                }
                ocv.al(parcel, iZ19);
                return new nru(iX26, zAn10, zAn11, strAh29, strAh30, strAh31, strAh32, strAh33, zAn12, zAn13);
            case 19:
                int iZ20 = ocv.Z(parcel);
                double dT6 = 0.0d;
                double dT7 = 0.0d;
                boolean zAn14 = false;
                int iX27 = 0;
                int iX28 = 0;
                njz njzVar = null;
                nkr nkrVar = null;
                while (parcel.dataPosition() < iZ20) {
                    int i20 = parcel.readInt();
                    switch (ocv.V(i20)) {
                        case 2:
                            dT6 = ocv.T(parcel, i20);
                            break;
                        case 3:
                            zAn14 = ocv.an(parcel, i20);
                            break;
                        case 4:
                            iX27 = ocv.X(parcel, i20);
                            break;
                        case 5:
                            njzVar = (njz) ocv.ad(parcel, i20, njz.CREATOR);
                            break;
                        case 6:
                            iX28 = ocv.X(parcel, i20);
                            break;
                        case 7:
                            nkrVar = (nkr) ocv.ad(parcel, i20, nkr.CREATOR);
                            break;
                        case 8:
                            dT7 = ocv.T(parcel, i20);
                            break;
                        default:
                            ocv.am(parcel, i20);
                            break;
                    }
                }
                ocv.al(parcel, iZ20);
                return new nrw(dT6, zAn14, iX27, njzVar, iX28, nkrVar, dT7);
            default:
                int iZ21 = ocv.Z(parcel);
                boolean zAn15 = true;
                int iX29 = 0;
                nuk nukVar = null;
                byte[] bArrAo = null;
                int[] iArrAp = null;
                String[] strArrAs = null;
                int[] iArrAp2 = null;
                byte[][] bArrAt = null;
                oly[] olyVarArr = null;
                nuj nujVar = null;
                String[] strArrAs2 = null;
                nua nuaVar = null;
                while (parcel.dataPosition() < iZ21) {
                    int i21 = parcel.readInt();
                    switch (ocv.V(i21)) {
                        case 2:
                            nukVar = (nuk) ocv.ad(parcel, i21, nuk.CREATOR);
                            break;
                        case 3:
                            bArrAo = ocv.ao(parcel, i21);
                            break;
                        case 4:
                            iArrAp = ocv.ap(parcel, i21);
                            break;
                        case 5:
                            strArrAs = ocv.as(parcel, i21);
                            break;
                        case 6:
                            iArrAp2 = ocv.ap(parcel, i21);
                            break;
                        case 7:
                            bArrAt = ocv.at(parcel, i21);
                            break;
                        case 8:
                            zAn15 = ocv.an(parcel, i21);
                            break;
                        case 9:
                            olyVarArr = (oly[]) ocv.ar(parcel, i21, oly.CREATOR);
                            break;
                        case 10:
                        default:
                            ocv.am(parcel, i21);
                            break;
                        case 11:
                            nujVar = (nuj) ocv.ad(parcel, i21, nuj.CREATOR);
                            break;
                        case 12:
                            strArrAs2 = ocv.as(parcel, i21);
                            break;
                        case 13:
                            iX29 = ocv.X(parcel, i21);
                            break;
                        case 14:
                            nuaVar = (nua) ocv.ad(parcel, i21, nua.CREATOR);
                            break;
                    }
                }
                ocv.al(parcel, iZ21);
                return new ntk(nukVar, bArrAo, iArrAp, strArrAs, iArrAp2, bArrAt, zAn15, olyVarArr, nujVar, strArrAs2, iX29, nuaVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaError[i];
            case 1:
                return new nlc[i];
            case 2:
                return new nlg[i];
            case 3:
                return new nlh[i];
            case 4:
                return new nli[i];
            case 5:
                return new nlj[i];
            case 6:
                return new nlk[i];
            case 7:
                return new nll[i];
            case 8:
                return new MediaTrack[i];
            case 9:
                return new nmb[i];
            case 10:
                return new nmc[i];
            case 11:
                return new nmd[i];
            case 12:
                return new nmh[i];
            case 13:
                return new nmi[i];
            case 14:
                return new now[i];
            case 15:
                return new npc[i];
            case 16:
                return new npi[i];
            case 17:
                return new nrh[i];
            case 18:
                return new nru[i];
            case 19:
                return new nrw[i];
            default:
                return new ntk[i];
        }
    }
}
