package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oee implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public oee(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jAa = 0;
        float fU = 0.0f;
        oef oefVar = null;
        okl oklVar = null;
        String strAh = null;
        okk okkVar = null;
        String strAh2 = null;
        Account account = null;
        String strAh3 = null;
        ojp ojpVar = null;
        Bundle bundleAb = null;
        String strAh4 = null;
        int iX = 0;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                byte[] bArrAo = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    int iV = ocv.V(i);
                    if (iV == 2) {
                        oefVar = (oef) ocv.ad(parcel, i, oef.CREATOR);
                    } else if (iV != 3) {
                        ocv.am(parcel, i);
                    } else {
                        bArrAo = ocv.ao(parcel, i);
                    }
                }
                ocv.al(parcel, iZ);
                return new oed(oefVar, bArrAo);
            case 1:
                int iZ2 = ocv.Z(parcel);
                String strAh5 = null;
                int iX2 = 0;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    int iV2 = ocv.V(i2);
                    if (iV2 == 1) {
                        strAh4 = ocv.ah(parcel, i2);
                    } else if (iV2 == 2) {
                        strAh5 = ocv.ah(parcel, i2);
                    } else if (iV2 == 3) {
                        iX = ocv.X(parcel, i2);
                    } else if (iV2 != 4) {
                        ocv.am(parcel, i2);
                    } else {
                        iX2 = ocv.X(parcel, i2);
                    }
                }
                ocv.al(parcel, iZ2);
                return new ojo(strAh4, strAh5, iX, iX2);
            case 2:
                int iZ3 = ocv.Z(parcel);
                String strAh6 = "";
                ArrayList arrayListAk = null;
                ArrayList arrayListAk2 = null;
                ArrayList arrayListAk3 = null;
                boolean zAn = false;
                boolean zAn2 = false;
                boolean zAn3 = false;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    switch (ocv.V(i3)) {
                        case 1:
                            zAn = ocv.an(parcel, i3);
                            break;
                        case 2:
                            zAn2 = ocv.an(parcel, i3);
                            break;
                        case 3:
                            arrayListAk = ocv.ak(parcel, i3, Account.CREATOR);
                            break;
                        case 4:
                            arrayListAk2 = ocv.ak(parcel, i3, Account.CREATOR);
                            break;
                        case 5:
                            strAh6 = ocv.ah(parcel, i3);
                            break;
                        case 6:
                            zAn3 = ocv.an(parcel, i3);
                            break;
                        case 7:
                            arrayListAk3 = ocv.ak(parcel, i3, Account.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i3);
                            break;
                    }
                }
                ocv.al(parcel, iZ3);
                return new ojp(zAn, zAn2, arrayListAk, arrayListAk2, strAh6, zAn3, arrayListAk3);
            case 3:
                int iZ4 = ocv.Z(parcel);
                Account account2 = null;
                String strAh7 = null;
                ArrayList arrayListAk4 = null;
                boolean zAn4 = false;
                boolean zAn5 = false;
                boolean zAn6 = false;
                boolean zAn7 = false;
                boolean zAn8 = false;
                boolean zAn9 = false;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    switch (ocv.V(i4)) {
                        case 1:
                            zAn4 = ocv.an(parcel, i4);
                            break;
                        case 2:
                            zAn5 = ocv.an(parcel, i4);
                            break;
                        case 3:
                            zAn6 = ocv.an(parcel, i4);
                            break;
                        case 4:
                            account2 = (Account) ocv.ad(parcel, i4, Account.CREATOR);
                            break;
                        case 5:
                            zAn7 = ocv.an(parcel, i4);
                            break;
                        case 6:
                            zAn8 = ocv.an(parcel, i4);
                            break;
                        case 7:
                            strAh7 = ocv.ah(parcel, i4);
                            break;
                        case 8:
                            arrayListAk4 = ocv.ak(parcel, i4, Account.CREATOR);
                            break;
                        case 9:
                            zAn9 = ocv.an(parcel, i4);
                            break;
                        default:
                            ocv.am(parcel, i4);
                            break;
                    }
                }
                ocv.al(parcel, iZ4);
                return new ojq(zAn4, zAn5, zAn6, account2, zAn7, zAn8, strAh7, arrayListAk4, zAn9);
            case 4:
                int iZ5 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    int iV3 = ocv.V(i5);
                    if (iV3 == 1) {
                        iX = ocv.X(parcel, i5);
                    } else if (iV3 != 2) {
                        ocv.am(parcel, i5);
                    } else {
                        bundleAb = ocv.ab(parcel, i5);
                    }
                }
                ocv.al(parcel, iZ5);
                return new ojr(iX, bundleAb);
            case 5:
                int iZ6 = ocv.Z(parcel);
                ojr ojrVar = null;
                ojq ojqVar = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV4 = ocv.V(i6);
                    if (iV4 == 1) {
                        ojpVar = (ojp) ocv.ad(parcel, i6, ojp.CREATOR);
                    } else if (iV4 == 2) {
                        ojrVar = (ojr) ocv.ad(parcel, i6, ojr.CREATOR);
                    } else if (iV4 != 3) {
                        ocv.am(parcel, i6);
                    } else {
                        ojqVar = (ojq) ocv.ad(parcel, i6, ojq.CREATOR);
                    }
                }
                ocv.al(parcel, iZ6);
                return new ojs(ojpVar, ojrVar, ojqVar);
            case 6:
                int iZ7 = ocv.Z(parcel);
                int[] iArrAp = null;
                String[] strArrAs = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV5 = ocv.V(i7);
                    if (iV5 == 1) {
                        strAh3 = ocv.ah(parcel, i7);
                    } else if (iV5 == 2) {
                        iArrAp = ocv.ap(parcel, i7);
                    } else if (iV5 == 4) {
                        iX = ocv.X(parcel, i7);
                    } else if (iV5 != 5) {
                        ocv.am(parcel, i7);
                    } else {
                        strArrAs = ocv.as(parcel, i7);
                    }
                }
                ocv.al(parcel, iZ7);
                return new okc(strAh3, iArrAp, iX, strArrAs);
            case 7:
                int iZ8 = ocv.Z(parcel);
                int iX3 = 0;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV6 = ocv.V(i8);
                    if (iV6 == 2) {
                        iX = ocv.X(parcel, i8);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i8);
                    } else {
                        iX3 = ocv.X(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ8);
                return new okd(iX, iX3);
            case 8:
                int iZ9 = ocv.Z(parcel);
                int iX4 = 0;
                int iX5 = 0;
                int iX6 = 0;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    int iV7 = ocv.V(i9);
                    if (iV7 == 1) {
                        iX = ocv.X(parcel, i9);
                    } else if (iV7 == 2) {
                        iX4 = ocv.X(parcel, i9);
                    } else if (iV7 == 3) {
                        iX5 = ocv.X(parcel, i9);
                    } else if (iV7 != 4) {
                        ocv.am(parcel, i9);
                    } else {
                        iX6 = ocv.X(parcel, i9);
                    }
                }
                ocv.al(parcel, iZ9);
                return new oke(iX, iX4, iX5, iX6);
            case 9:
                int iZ10 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    int iV8 = ocv.V(i10);
                    if (iV8 == 1) {
                        iX = ocv.X(parcel, i10);
                    } else if (iV8 != 2) {
                        ocv.am(parcel, i10);
                    } else {
                        account = (Account) ocv.ad(parcel, i10, Account.CREATOR);
                    }
                }
                ocv.al(parcel, iZ10);
                return new DeviceContactsSyncSetting(iX, account);
            case 10:
                int iZ11 = ocv.Z(parcel);
                long jAa2 = 0;
                String strAh8 = null;
                int iX7 = 0;
                int iX8 = 0;
                int iX9 = 0;
                int iX10 = 0;
                int iX11 = 0;
                int iX12 = 0;
                int iX13 = 0;
                while (parcel.dataPosition() < iZ11) {
                    int i11 = parcel.readInt();
                    switch (ocv.V(i11)) {
                        case 2:
                            iX7 = ocv.X(parcel, i11);
                            break;
                        case 3:
                            strAh8 = ocv.ah(parcel, i11);
                            break;
                        case 4:
                            jAa2 = ocv.aa(parcel, i11);
                            break;
                        case 5:
                            iX8 = ocv.X(parcel, i11);
                            break;
                        case 6:
                            iX9 = ocv.X(parcel, i11);
                            break;
                        case 7:
                            iX10 = ocv.X(parcel, i11);
                            break;
                        case 8:
                            iX11 = ocv.X(parcel, i11);
                            break;
                        case 9:
                            iX12 = ocv.X(parcel, i11);
                            break;
                        case 10:
                            iX13 = ocv.X(parcel, i11);
                            break;
                        default:
                            ocv.am(parcel, i11);
                            break;
                    }
                }
                ocv.al(parcel, iZ11);
                return new okf(iX7, strAh8, jAa2, iX8, iX9, iX10, iX11, iX12, iX13);
            case 11:
                int iZ12 = ocv.Z(parcel);
                oke okeVar = null;
                while (parcel.dataPosition() < iZ12) {
                    int i12 = parcel.readInt();
                    int iV9 = ocv.V(i12);
                    if (iV9 == 1) {
                        iX = ocv.X(parcel, i12);
                    } else if (iV9 == 2) {
                        strAh2 = ocv.ah(parcel, i12);
                    } else if (iV9 != 3) {
                        ocv.am(parcel, i12);
                    } else {
                        okeVar = (oke) ocv.ad(parcel, i12, oke.CREATOR);
                    }
                }
                ocv.al(parcel, iZ12);
                return new okg(iX, strAh2, okeVar);
            case 12:
                int iZ13 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ13) {
                    ocv.am(parcel, parcel.readInt());
                }
                ocv.al(parcel, iZ13);
                return new okh();
            case 13:
                int iZ14 = ocv.Z(parcel);
                long jAa3 = 0;
                String strAh9 = null;
                String strAh10 = null;
                String strAh11 = null;
                int iX14 = 0;
                int iX15 = 0;
                int iX16 = 0;
                while (parcel.dataPosition() < iZ14) {
                    int i13 = parcel.readInt();
                    switch (ocv.V(i13)) {
                        case 1:
                            strAh9 = ocv.ah(parcel, i13);
                            break;
                        case 2:
                            iX14 = ocv.X(parcel, i13);
                            break;
                        case 3:
                            iX15 = ocv.X(parcel, i13);
                            break;
                        case 4:
                            strAh10 = ocv.ah(parcel, i13);
                            break;
                        case 5:
                            strAh11 = ocv.ah(parcel, i13);
                            break;
                        case 6:
                            iX16 = ocv.X(parcel, i13);
                            break;
                        case 7:
                            jAa3 = ocv.aa(parcel, i13);
                            break;
                        default:
                            ocv.am(parcel, i13);
                            break;
                    }
                }
                ocv.al(parcel, iZ14);
                return new oki(strAh9, iX14, iX15, strAh10, strAh11, iX16, jAa3);
            case 14:
                int iZ15 = ocv.Z(parcel);
                oki okiVar = null;
                while (parcel.dataPosition() < iZ15) {
                    int i14 = parcel.readInt();
                    int iV10 = ocv.V(i14);
                    if (iV10 == 1) {
                        iX = ocv.X(parcel, i14);
                    } else if (iV10 == 2) {
                        okkVar = (okk) ocv.ad(parcel, i14, okk.CREATOR);
                    } else if (iV10 != 3) {
                        ocv.am(parcel, i14);
                    } else {
                        okiVar = (oki) ocv.ad(parcel, i14, oki.CREATOR);
                    }
                }
                ocv.al(parcel, iZ15);
                return new okj(iX, okkVar, okiVar);
            case 15:
                int iZ16 = ocv.Z(parcel);
                ArrayList arrayListAi = null;
                while (parcel.dataPosition() < iZ16) {
                    int i15 = parcel.readInt();
                    int iV11 = ocv.V(i15);
                    if (iV11 == 1) {
                        strAh = ocv.ah(parcel, i15);
                    } else if (iV11 == 2) {
                        arrayListAi = ocv.ai(parcel, i15);
                    } else if (iV11 != 3) {
                        ocv.am(parcel, i15);
                    } else {
                        jAa = ocv.aa(parcel, i15);
                    }
                }
                ocv.al(parcel, iZ16);
                return new okk(strAh, arrayListAi, jAa);
            case 16:
                int iZ17 = ocv.Z(parcel);
                float fU2 = 0.0f;
                float fU3 = 0.0f;
                float fU4 = 0.0f;
                float fU5 = 0.0f;
                float fU6 = 0.0f;
                float fU7 = 0.0f;
                float fU8 = 0.0f;
                int iX17 = 0;
                int iX18 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i16 = parcel.readInt();
                    switch (ocv.V(i16)) {
                        case 1:
                            fU2 = ocv.U(parcel, i16);
                            break;
                        case 2:
                            fU3 = ocv.U(parcel, i16);
                            break;
                        case 3:
                            fU4 = ocv.U(parcel, i16);
                            break;
                        case 4:
                            fU5 = ocv.U(parcel, i16);
                            break;
                        case 5:
                            fU6 = ocv.U(parcel, i16);
                            break;
                        case 6:
                            fU7 = ocv.U(parcel, i16);
                            break;
                        case 7:
                            iX17 = ocv.X(parcel, i16);
                            break;
                        case 8:
                            iX18 = ocv.X(parcel, i16);
                            break;
                        case 9:
                            fU8 = ocv.U(parcel, i16);
                            break;
                        default:
                            ocv.am(parcel, i16);
                            break;
                    }
                }
                ocv.al(parcel, iZ17);
                return new okl(fU2, fU3, fU4, fU5, fU6, fU7, iX17, iX18, fU8);
            case 17:
                int iZ18 = ocv.Z(parcel);
                float fU9 = 0.0f;
                float fU10 = 0.0f;
                while (parcel.dataPosition() < iZ18) {
                    int i17 = parcel.readInt();
                    int iV12 = ocv.V(i17);
                    if (iV12 == 1) {
                        fU = ocv.U(parcel, i17);
                    } else if (iV12 == 2) {
                        fU9 = ocv.U(parcel, i17);
                    } else if (iV12 != 3) {
                        ocv.am(parcel, i17);
                    } else {
                        fU10 = ocv.U(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ18);
                return new okm(fU, fU9, fU10);
            case 18:
                int iZ19 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ19) {
                    int i18 = parcel.readInt();
                    if (ocv.V(i18) != 1) {
                        ocv.am(parcel, i18);
                    } else {
                        jAa = ocv.aa(parcel, i18);
                    }
                }
                ocv.al(parcel, iZ19);
                return new okn(jAa);
            case 19:
                int iZ20 = ocv.Z(parcel);
                okm okmVar = null;
                while (parcel.dataPosition() < iZ20) {
                    int i19 = parcel.readInt();
                    int iV13 = ocv.V(i19);
                    if (iV13 == 1) {
                        oklVar = (okl) ocv.ad(parcel, i19, okl.CREATOR);
                    } else if (iV13 != 2) {
                        ocv.am(parcel, i19);
                    } else {
                        okmVar = (okm) ocv.ad(parcel, i19, okm.CREATOR);
                    }
                }
                ocv.al(parcel, iZ20);
                return new oko(oklVar, okmVar);
            default:
                int iZ21 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ21) {
                    int i20 = parcel.readInt();
                    if (ocv.V(i20) != 1) {
                        ocv.am(parcel, i20);
                    } else {
                        iX = ocv.X(parcel, i20);
                    }
                }
                ocv.al(parcel, iZ21);
                return new okp(iX);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oed[i];
            case 1:
                return new ojo[i];
            case 2:
                return new ojp[i];
            case 3:
                return new ojq[i];
            case 4:
                return new ojr[i];
            case 5:
                return new ojs[i];
            case 6:
                return new okc[i];
            case 7:
                return new okd[i];
            case 8:
                return new oke[i];
            case 9:
                return new DeviceContactsSyncSetting[i];
            case 10:
                return new okf[i];
            case 11:
                return new okg[i];
            case 12:
                return new okh[i];
            case 13:
                return new oki[i];
            case 14:
                return new okj[i];
            case 15:
                return new okk[i];
            case 16:
                return new okl[i];
            case 17:
                return new okm[i];
            case 18:
                return new okn[i];
            case 19:
                return new oko[i];
            default:
                return new okp[i];
        }
    }
}
