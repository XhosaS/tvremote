package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public nhv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zAn = false;
        int iX = 0;
        int iX2 = 0;
        String strAh = null;
        nkq nkqVar = null;
        String strAh2 = null;
        String strAh3 = null;
        Bundle bundleAb = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayListAk = null;
        Long lAg = null;
        String strAh4 = null;
        String strAh5 = null;
        ArrayList arrayListAk2 = null;
        nia niaVar = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                ArrayList arrayListAj = null;
                ArrayList arrayListAj2 = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    int iV = ocv.V(i);
                    if (iV == 1) {
                        strAh = ocv.ah(parcel, i);
                    } else if (iV == 2) {
                        arrayListAj = ocv.aj(parcel, i);
                    } else if (iV == 3) {
                        arrayListAj2 = ocv.aj(parcel, i);
                    } else if (iV != 4) {
                        ocv.am(parcel, i);
                    } else {
                        zAn = ocv.an(parcel, i);
                    }
                }
                ocv.al(parcel, iZ);
                return new nhu(strAh, arrayListAj, arrayListAj2, zAn);
            case 1:
                int iZ2 = ocv.Z(parcel);
                String strAh6 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    int iV2 = ocv.V(i2);
                    if (iV2 == 1) {
                        niaVar = (nia) ocv.ad(parcel, i2, nia.CREATOR);
                    } else if (iV2 != 2) {
                        ocv.am(parcel, i2);
                    } else {
                        strAh6 = ocv.ah(parcel, i2);
                    }
                }
                ocv.al(parcel, iZ2);
                return new nht(niaVar, strAh6);
            case 2:
                int iZ3 = ocv.Z(parcel);
                ArrayList arrayListAk3 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV3 = ocv.V(i3);
                    if (iV3 == 1) {
                        arrayListAk2 = ocv.ak(parcel, i3, nia.CREATOR);
                    } else if (iV3 != 2) {
                        ocv.am(parcel, i3);
                    } else {
                        arrayListAk3 = ocv.ak(parcel, i3, nhp.CREATOR);
                    }
                }
                ocv.al(parcel, iZ3);
                return new nhw(arrayListAk2, arrayListAk3);
            case 3:
                int iZ4 = ocv.Z(parcel);
                int iX3 = 0;
                boolean zAn2 = false;
                boolean zAn3 = false;
                nia niaVar2 = null;
                String strAh7 = null;
                ArrayList arrayListAj3 = null;
                ArrayList arrayListAj4 = null;
                ArrayList arrayListAj5 = null;
                ArrayList arrayListAj6 = null;
                String strAh8 = null;
                byte[] bArrAo = null;
                String strAh9 = null;
                Network network = null;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    switch (ocv.V(i4)) {
                        case 1:
                            niaVar2 = (nia) ocv.ad(parcel, i4, nia.CREATOR);
                            break;
                        case 2:
                            strAh7 = ocv.ah(parcel, i4);
                            break;
                        case 3:
                            arrayListAj3 = ocv.aj(parcel, i4);
                            break;
                        case 4:
                            arrayListAj4 = ocv.aj(parcel, i4);
                            break;
                        case 5:
                            arrayListAj5 = ocv.aj(parcel, i4);
                            break;
                        case 6:
                            arrayListAj6 = ocv.aj(parcel, i4);
                            break;
                        case 7:
                            iX3 = ocv.X(parcel, i4);
                            break;
                        case 8:
                            strAh8 = ocv.ah(parcel, i4);
                            break;
                        case 9:
                            zAn2 = ocv.an(parcel, i4);
                            break;
                        case 10:
                            bArrAo = ocv.ao(parcel, i4);
                            break;
                        case 11:
                            strAh9 = ocv.ah(parcel, i4);
                            break;
                        case 12:
                            zAn3 = ocv.an(parcel, i4);
                            break;
                        case 13:
                            network = (Network) ocv.ad(parcel, i4, Network.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i4);
                            break;
                    }
                }
                ocv.al(parcel, iZ4);
                return new nhy(niaVar2, strAh7, arrayListAj3, arrayListAj4, arrayListAj5, arrayListAj6, iX3, strAh8, zAn2, bArrAo, strAh9, zAn3, network);
            case 4:
                int iZ5 = ocv.Z(parcel);
                nic nicVar = null;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    int iV4 = ocv.V(i5);
                    if (iV4 == 1) {
                        strAh5 = ocv.ah(parcel, i5);
                    } else if (iV4 != 2) {
                        ocv.am(parcel, i5);
                    } else {
                        nicVar = (nic) ocv.ad(parcel, i5, nic.CREATOR);
                    }
                }
                ocv.al(parcel, iZ5);
                return new nhz(strAh5, nicVar);
            case 5:
                int iZ6 = ocv.Z(parcel);
                String strAh10 = null;
                String strAh11 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV5 = ocv.V(i6);
                    if (iV5 == 1) {
                        strAh4 = ocv.ah(parcel, i6);
                    } else if (iV5 == 2) {
                        strAh10 = ocv.ah(parcel, i6);
                    } else if (iV5 != 3) {
                        ocv.am(parcel, i6);
                    } else {
                        strAh11 = ocv.ah(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ6);
                return new nia(strAh4, strAh10, strAh11);
            case 6:
                int iZ7 = ocv.Z(parcel);
                ArrayList arrayListAj7 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV6 = ocv.V(i7);
                    if (iV6 == 1) {
                        lAg = ocv.ag(parcel, i7);
                    } else if (iV6 != 2) {
                        ocv.am(parcel, i7);
                    } else {
                        arrayListAj7 = ocv.aj(parcel, i7);
                    }
                }
                ocv.al(parcel, iZ7);
                return new nic(lAg, arrayListAj7);
            case 7:
                int iZ8 = ocv.Z(parcel);
                int iX4 = 0;
                int iX5 = 0;
                int iX6 = 0;
                PendingIntent pendingIntent = null;
                Bundle bundleAb2 = null;
                byte[] bArrAo2 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV7 = ocv.V(i8);
                    if (iV7 == 1) {
                        iX5 = ocv.X(parcel, i8);
                    } else if (iV7 == 2) {
                        pendingIntent = (PendingIntent) ocv.ad(parcel, i8, PendingIntent.CREATOR);
                    } else if (iV7 == 3) {
                        iX6 = ocv.X(parcel, i8);
                    } else if (iV7 == 4) {
                        bundleAb2 = ocv.ab(parcel, i8);
                    } else if (iV7 == 5) {
                        bArrAo2 = ocv.ao(parcel, i8);
                    } else if (iV7 != 1000) {
                        ocv.am(parcel, i8);
                    } else {
                        iX4 = ocv.X(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ8);
                return new njb(iX4, iX5, pendingIntent, iX6, bundleAb2, bArrAo2);
            case 8:
                int iZ9 = ocv.Z(parcel);
                long jAa = 0;
                String strAh12 = null;
                String strAh13 = null;
                String strAh14 = null;
                String strAh15 = null;
                Uri uri = null;
                String strAh16 = null;
                String strAh17 = null;
                ArrayList arrayListAk4 = null;
                String strAh18 = null;
                String strAh19 = null;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    switch (ocv.V(i9)) {
                        case 2:
                            strAh12 = ocv.ah(parcel, i9);
                            break;
                        case 3:
                            strAh13 = ocv.ah(parcel, i9);
                            break;
                        case 4:
                            strAh14 = ocv.ah(parcel, i9);
                            break;
                        case 5:
                            strAh15 = ocv.ah(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) ocv.ad(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strAh16 = ocv.ah(parcel, i9);
                            break;
                        case 8:
                            jAa = ocv.aa(parcel, i9);
                            break;
                        case 9:
                            strAh17 = ocv.ah(parcel, i9);
                            break;
                        case 10:
                            arrayListAk4 = ocv.ak(parcel, i9, Scope.CREATOR);
                            break;
                        case 11:
                            strAh18 = ocv.ah(parcel, i9);
                            break;
                        case 12:
                            strAh19 = ocv.ah(parcel, i9);
                            break;
                        default:
                            ocv.am(parcel, i9);
                            break;
                    }
                }
                ocv.al(parcel, iZ9);
                return new GoogleSignInAccount(strAh12, strAh13, strAh14, strAh15, uri, strAh16, jAa, strAh17, arrayListAk4, strAh18, strAh19);
            case 9:
                int iZ10 = ocv.Z(parcel);
                int iX7 = 0;
                boolean zAn4 = false;
                boolean zAn5 = false;
                boolean zAn6 = false;
                ArrayList arrayListAk5 = null;
                Account account = null;
                String strAh20 = null;
                String strAh21 = null;
                String strAh22 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    switch (ocv.V(i10)) {
                        case 1:
                            iX7 = ocv.X(parcel, i10);
                            break;
                        case 2:
                            arrayListAk5 = ocv.ak(parcel, i10, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) ocv.ad(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            zAn4 = ocv.an(parcel, i10);
                            break;
                        case 5:
                            zAn5 = ocv.an(parcel, i10);
                            break;
                        case 6:
                            zAn6 = ocv.an(parcel, i10);
                            break;
                        case 7:
                            strAh20 = ocv.ah(parcel, i10);
                            break;
                        case 8:
                            strAh21 = ocv.ah(parcel, i10);
                            break;
                        case 9:
                            arrayListAk = ocv.ak(parcel, i10, njo.CREATOR);
                            break;
                        case 10:
                            strAh22 = ocv.ah(parcel, i10);
                            break;
                        default:
                            ocv.am(parcel, i10);
                            break;
                    }
                }
                ocv.al(parcel, iZ10);
                return new GoogleSignInOptions(iX7, arrayListAk5, account, zAn4, zAn5, zAn6, strAh20, strAh21, GoogleSignInOptions.b(arrayListAk), strAh22);
            case 10:
                int iZ11 = ocv.Z(parcel);
                String strAh23 = "";
                String strAh24 = "";
                while (parcel.dataPosition() < iZ11) {
                    int i11 = parcel.readInt();
                    int iV8 = ocv.V(i11);
                    if (iV8 == 4) {
                        strAh23 = ocv.ah(parcel, i11);
                    } else if (iV8 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) ocv.ad(parcel, i11, GoogleSignInAccount.CREATOR);
                    } else if (iV8 != 8) {
                        ocv.am(parcel, i11);
                    } else {
                        strAh24 = ocv.ah(parcel, i11);
                    }
                }
                ocv.al(parcel, iZ11);
                return new SignInAccount(strAh23, googleSignInAccount, strAh24);
            case 11:
                int iZ12 = ocv.Z(parcel);
                int iX8 = 0;
                while (parcel.dataPosition() < iZ12) {
                    int i12 = parcel.readInt();
                    int iV9 = ocv.V(i12);
                    if (iV9 == 1) {
                        iX2 = ocv.X(parcel, i12);
                    } else if (iV9 == 2) {
                        iX8 = ocv.X(parcel, i12);
                    } else if (iV9 != 3) {
                        ocv.am(parcel, i12);
                    } else {
                        bundleAb = ocv.ab(parcel, i12);
                    }
                }
                ocv.al(parcel, iZ12);
                return new njo(iX2, iX8, bundleAb);
            case 12:
                int iZ13 = ocv.Z(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iZ13) {
                    int i13 = parcel.readInt();
                    int iV10 = ocv.V(i13);
                    if (iV10 == 2) {
                        strAh3 = ocv.ah(parcel, i13);
                    } else if (iV10 != 5) {
                        ocv.am(parcel, i13);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) ocv.ad(parcel, i13, GoogleSignInOptions.CREATOR);
                    }
                }
                ocv.al(parcel, iZ13);
                return new SignInConfiguration(strAh3, googleSignInOptions);
            case 13:
                int iZ14 = ocv.Z(parcel);
                long jAa2 = 0;
                long jAa3 = 0;
                String strAh25 = null;
                String strAh26 = null;
                String strAh27 = null;
                String strAh28 = null;
                String strAh29 = null;
                String strAh30 = null;
                String strAh31 = null;
                String strAh32 = null;
                String strAh33 = null;
                nmc nmcVar = null;
                while (parcel.dataPosition() < iZ14) {
                    int i14 = parcel.readInt();
                    switch (ocv.V(i14)) {
                        case 2:
                            strAh25 = ocv.ah(parcel, i14);
                            break;
                        case 3:
                            strAh26 = ocv.ah(parcel, i14);
                            break;
                        case 4:
                            jAa2 = ocv.aa(parcel, i14);
                            break;
                        case 5:
                            strAh27 = ocv.ah(parcel, i14);
                            break;
                        case 6:
                            strAh28 = ocv.ah(parcel, i14);
                            break;
                        case 7:
                            strAh29 = ocv.ah(parcel, i14);
                            break;
                        case 8:
                            strAh30 = ocv.ah(parcel, i14);
                            break;
                        case 9:
                            strAh31 = ocv.ah(parcel, i14);
                            break;
                        case 10:
                            strAh32 = ocv.ah(parcel, i14);
                            break;
                        case 11:
                            jAa3 = ocv.aa(parcel, i14);
                            break;
                        case 12:
                            strAh33 = ocv.ah(parcel, i14);
                            break;
                        case 13:
                            nmcVar = (nmc) ocv.ad(parcel, i14, nmc.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i14);
                            break;
                    }
                }
                ocv.al(parcel, iZ14);
                return new njw(strAh25, strAh26, jAa2, strAh27, strAh28, strAh29, strAh30, strAh31, strAh32, jAa3, strAh33, nmcVar);
            case 14:
                int iZ15 = ocv.Z(parcel);
                long jAa4 = 0;
                long jAa5 = 0;
                boolean zAn7 = false;
                boolean zAn8 = false;
                boolean zAn9 = false;
                String strAh34 = null;
                String[] strArrAs = null;
                while (parcel.dataPosition() < iZ15) {
                    int i15 = parcel.readInt();
                    switch (ocv.V(i15)) {
                        case 2:
                            jAa4 = ocv.aa(parcel, i15);
                            break;
                        case 3:
                            strAh34 = ocv.ah(parcel, i15);
                            break;
                        case 4:
                            jAa5 = ocv.aa(parcel, i15);
                            break;
                        case 5:
                            zAn7 = ocv.an(parcel, i15);
                            break;
                        case 6:
                            strArrAs = ocv.as(parcel, i15);
                            break;
                        case 7:
                            zAn8 = ocv.an(parcel, i15);
                            break;
                        case 8:
                            zAn9 = ocv.an(parcel, i15);
                            break;
                        default:
                            ocv.am(parcel, i15);
                            break;
                    }
                }
                ocv.al(parcel, iZ15);
                return new njx(jAa4, strAh34, jAa5, zAn7, strArrAs, zAn8, zAn9);
            case 15:
                int iZ16 = ocv.Z(parcel);
                long jAa6 = 0;
                long jAa7 = 0;
                long jAa8 = 0;
                String strAh35 = null;
                String strAh36 = null;
                while (parcel.dataPosition() < iZ16) {
                    int i16 = parcel.readInt();
                    int iV11 = ocv.V(i16);
                    if (iV11 == 2) {
                        jAa6 = ocv.aa(parcel, i16);
                    } else if (iV11 == 3) {
                        jAa7 = ocv.aa(parcel, i16);
                    } else if (iV11 == 4) {
                        strAh35 = ocv.ah(parcel, i16);
                    } else if (iV11 == 5) {
                        strAh36 = ocv.ah(parcel, i16);
                    } else if (iV11 != 6) {
                        ocv.am(parcel, i16);
                    } else {
                        jAa8 = ocv.aa(parcel, i16);
                    }
                }
                ocv.al(parcel, iZ16);
                return new njy(jAa6, jAa7, strAh35, strAh36, jAa8);
            case 16:
                int iZ17 = ocv.Z(parcel);
                int iX9 = 0;
                String strAh37 = null;
                String strAh38 = null;
                ArrayList arrayListAj8 = null;
                String strAh39 = null;
                Uri uri2 = null;
                String strAh40 = null;
                String strAh41 = null;
                Boolean boolAe = null;
                Boolean boolAe2 = null;
                while (parcel.dataPosition() < iZ17) {
                    int i17 = parcel.readInt();
                    switch (ocv.V(i17)) {
                        case 2:
                            strAh37 = ocv.ah(parcel, i17);
                            break;
                        case 3:
                            strAh38 = ocv.ah(parcel, i17);
                            break;
                        case 4:
                            ocv.ak(parcel, i17, oak.CREATOR);
                            break;
                        case 5:
                            arrayListAj8 = ocv.aj(parcel, i17);
                            break;
                        case 6:
                            strAh39 = ocv.ah(parcel, i17);
                            break;
                        case 7:
                            uri2 = (Uri) ocv.ad(parcel, i17, Uri.CREATOR);
                            break;
                        case 8:
                            strAh40 = ocv.ah(parcel, i17);
                            break;
                        case 9:
                            strAh41 = ocv.ah(parcel, i17);
                            break;
                        case 10:
                            boolAe = ocv.ae(parcel, i17);
                            break;
                        case 11:
                            boolAe2 = ocv.ae(parcel, i17);
                            break;
                        case 12:
                            iX9 = ocv.X(parcel, i17);
                            break;
                        default:
                            ocv.am(parcel, i17);
                            break;
                    }
                }
                ocv.al(parcel, iZ17);
                return new njz(strAh37, strAh38, arrayListAj8, strAh39, uri2, strAh40, strAh41, boolAe, boolAe2, iX9);
            case 17:
                int iZ18 = ocv.Z(parcel);
                String strAh42 = null;
                while (parcel.dataPosition() < iZ18) {
                    int i18 = parcel.readInt();
                    int iV12 = ocv.V(i18);
                    if (iV12 == 1) {
                        strAh2 = ocv.ah(parcel, i18);
                    } else if (iV12 != 2) {
                        ocv.am(parcel, i18);
                    } else {
                        strAh42 = ocv.ah(parcel, i18);
                    }
                }
                ocv.al(parcel, iZ18);
                return new nkp(strAh2, strAh42);
            case 18:
                int iZ19 = ocv.Z(parcel);
                float fU = 0.0f;
                float fU2 = 0.0f;
                float fU3 = 0.0f;
                while (parcel.dataPosition() < iZ19) {
                    int i19 = parcel.readInt();
                    int iV13 = ocv.V(i19);
                    if (iV13 == 2) {
                        fU = ocv.U(parcel, i19);
                    } else if (iV13 == 3) {
                        fU2 = ocv.U(parcel, i19);
                    } else if (iV13 != 4) {
                        ocv.am(parcel, i19);
                    } else {
                        fU3 = ocv.U(parcel, i19);
                    }
                }
                ocv.al(parcel, iZ19);
                return new nkq(fU, fU2, fU3);
            case 19:
                int iZ20 = ocv.Z(parcel);
                nkq nkqVar2 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i20 = parcel.readInt();
                    int iV14 = ocv.V(i20);
                    if (iV14 == 2) {
                        nkqVar = (nkq) ocv.ad(parcel, i20, nkq.CREATOR);
                    } else if (iV14 != 3) {
                        ocv.am(parcel, i20);
                    } else {
                        nkqVar2 = (nkq) ocv.ad(parcel, i20, nkq.CREATOR);
                    }
                }
                ocv.al(parcel, iZ20);
                return new nkr(nkqVar, nkqVar2);
            default:
                int iZ21 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ21) {
                    int i21 = parcel.readInt();
                    if (ocv.V(i21) != 2) {
                        ocv.am(parcel, i21);
                    } else {
                        iX = ocv.X(parcel, i21);
                    }
                }
                ocv.al(parcel, iZ21);
                return new nlb(iX);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nhu[i];
            case 1:
                return new nht[i];
            case 2:
                return new nhw[i];
            case 3:
                return new nhy[i];
            case 4:
                return new nhz[i];
            case 5:
                return new nia[i];
            case 6:
                return new nic[i];
            case 7:
                return new njb[i];
            case 8:
                return new GoogleSignInAccount[i];
            case 9:
                return new GoogleSignInOptions[i];
            case 10:
                return new SignInAccount[i];
            case 11:
                return new njo[i];
            case 12:
                return new SignInConfiguration[i];
            case 13:
                return new njw[i];
            case 14:
                return new njx[i];
            case 15:
                return new njy[i];
            case 16:
                return new njz[i];
            case 17:
                return new nkp[i];
            case 18:
                return new nkq[i];
            case 19:
                return new nkr[i];
            default:
                return new nlb[i];
        }
    }
}
