package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public afi(int i) {
        this.a = i;
    }

    public static void a(aii aiiVar, Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, aiiVar.c);
        qq.m(parcel, 2, aiiVar.d);
        qq.m(parcel, 3, aiiVar.e);
        qq.u(parcel, 4, aiiVar.f);
        qq.r(parcel, 5, aiiVar.g);
        qq.x(parcel, 6, aiiVar.h, i);
        qq.o(parcel, 7, aiiVar.i);
        qq.t(parcel, 8, aiiVar.j, i);
        qq.x(parcel, 10, aiiVar.k, i);
        qq.x(parcel, 11, aiiVar.l, i);
        qq.k(parcel, 12, aiiVar.m);
        qq.m(parcel, 13, aiiVar.n);
        qq.k(parcel, 14, aiiVar.o);
        qq.u(parcel, 15, aiiVar.p);
        qq.j(parcel, iH);
    }

    public static boolean b(int i) {
        return i == 0;
    }

    public static boolean c(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jD = -1;
        int iA = 0;
        boolean zN = false;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        int iA5 = 0;
        int iA6 = 0;
        int iA7 = 0;
        boolean zN2 = false;
        String strH = null;
        String strH2 = null;
        byte[] bArrO = null;
        akv[] akvVarArr = null;
        ArrayList arrayListJ = null;
        Account account = null;
        Bundle bundleE = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        switch (this.a) {
            case 0:
                int iC = qq.C(parcel);
                boolean zN3 = false;
                boolean zN4 = false;
                boolean zN5 = false;
                boolean zN6 = false;
                boolean zN7 = false;
                String strH6 = null;
                IBinder iBinderF = null;
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    switch (qq.z(i)) {
                        case 1:
                            strH6 = qq.H(parcel, i);
                            break;
                        case 2:
                            zN3 = qq.N(parcel, i);
                            break;
                        case 3:
                            zN4 = qq.N(parcel, i);
                            break;
                        case 4:
                            iBinderF = qq.F(parcel, i);
                            break;
                        case 5:
                            zN5 = qq.N(parcel, i);
                            break;
                        case 6:
                            zN6 = qq.N(parcel, i);
                            break;
                        case 7:
                        default:
                            qq.M(parcel, i);
                            break;
                        case 8:
                            zN7 = qq.N(parcel, i);
                            break;
                    }
                }
                qq.K(parcel, iC);
                return new afh(strH6, zN3, zN4, iBinderF, zN5, zN6, zN7);
            case 1:
                int iC2 = qq.C(parcel);
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    int iZ = qq.z(i2);
                    if (iZ == 1) {
                        strH = qq.H(parcel, i2);
                    } else if (iZ == 2) {
                        iA = qq.A(parcel, i2);
                    } else if (iZ != 3) {
                        qq.M(parcel, i2);
                    } else {
                        jD = qq.D(parcel, i2);
                    }
                }
                qq.K(parcel, iC2);
                return new aes(strH, iA, jD);
            case 2:
                int iC3 = qq.C(parcel);
                long jD2 = -1;
                boolean zN8 = false;
                int iA8 = 0;
                int iA9 = 0;
                String strH7 = null;
                while (parcel.dataPosition() < iC3) {
                    int i3 = parcel.readInt();
                    int iZ2 = qq.z(i3);
                    if (iZ2 == 1) {
                        zN8 = qq.N(parcel, i3);
                    } else if (iZ2 == 2) {
                        strH7 = qq.H(parcel, i3);
                    } else if (iZ2 == 3) {
                        iA8 = qq.A(parcel, i3);
                    } else if (iZ2 == 4) {
                        iA9 = qq.A(parcel, i3);
                    } else if (iZ2 != 5) {
                        qq.M(parcel, i3);
                    } else {
                        jD2 = qq.D(parcel, i3);
                    }
                }
                qq.K(parcel, iC3);
                return new afj(zN8, strH7, iA8, iA9, jD2);
            case 3:
                int iC4 = qq.C(parcel);
                boolean zN9 = false;
                IBinder iBinderF2 = null;
                while (parcel.dataPosition() < iC4) {
                    int i4 = parcel.readInt();
                    int iZ3 = qq.z(i4);
                    if (iZ3 == 1) {
                        strH5 = qq.H(parcel, i4);
                    } else if (iZ3 == 2) {
                        iBinderF2 = qq.F(parcel, i4);
                    } else if (iZ3 == 3) {
                        zN2 = qq.N(parcel, i4);
                    } else if (iZ3 != 4) {
                        qq.M(parcel, i4);
                    } else {
                        zN9 = qq.N(parcel, i4);
                    }
                }
                qq.K(parcel, iC4);
                return new afk(strH5, iBinderF2, zN2, zN9);
            case 4:
                int iC5 = qq.C(parcel);
                while (parcel.dataPosition() < iC5) {
                    int i5 = parcel.readInt();
                    int iZ4 = qq.z(i5);
                    if (iZ4 == 1) {
                        iA7 = qq.A(parcel, i5);
                    } else if (iZ4 != 2) {
                        qq.M(parcel, i5);
                    } else {
                        strH4 = qq.H(parcel, i5);
                    }
                }
                qq.K(parcel, iC5);
                return new Scope(iA7, strH4);
            case 5:
                int iC6 = qq.C(parcel);
                PendingIntent pendingIntent = null;
                aeq aeqVar = null;
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    int iZ5 = qq.z(i6);
                    if (iZ5 == 1) {
                        iA6 = qq.A(parcel, i6);
                    } else if (iZ5 == 2) {
                        strH3 = qq.H(parcel, i6);
                    } else if (iZ5 == 3) {
                        pendingIntent = (PendingIntent) qq.G(parcel, i6, PendingIntent.CREATOR);
                    } else if (iZ5 != 4) {
                        qq.M(parcel, i6);
                    } else {
                        aeqVar = (aeq) qq.G(parcel, i6, aeq.CREATOR);
                    }
                }
                qq.K(parcel, iC6);
                return new Status(iA6, strH3, pendingIntent, aeqVar);
            case 6:
                int iC7 = qq.C(parcel);
                int iA10 = 0;
                int iA11 = 0;
                String[] strArrR = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleE2 = null;
                while (parcel.dataPosition() < iC7) {
                    int i7 = parcel.readInt();
                    int iZ6 = qq.z(i7);
                    if (iZ6 == 1) {
                        strArrR = qq.R(parcel, i7);
                    } else if (iZ6 == 2) {
                        cursorWindowArr = (CursorWindow[]) qq.Q(parcel, i7, CursorWindow.CREATOR);
                    } else if (iZ6 == 3) {
                        iA11 = qq.A(parcel, i7);
                    } else if (iZ6 == 4) {
                        bundleE2 = qq.E(parcel, i7);
                    } else if (iZ6 != 1000) {
                        qq.M(parcel, i7);
                    } else {
                        iA10 = qq.A(parcel, i7);
                    }
                }
                qq.K(parcel, iC7);
                DataHolder dataHolder = new DataHolder(iA10, strArrR, cursorWindowArr, iA11, bundleE2);
                dataHolder.c = new Bundle();
                int i8 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i8 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i9 = 0; i9 < cursorWindowArr2.length; i9++) {
                            dataHolder.g[i9] = numRows;
                            numRows += cursorWindowArr2[i9].getNumRows() - (numRows - cursorWindowArr2[i9].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i8], i8);
                    i8++;
                }
            case 7:
                int iC8 = qq.C(parcel);
                aes[] aesVarArr = null;
                aig aigVar = null;
                while (parcel.dataPosition() < iC8) {
                    int i10 = parcel.readInt();
                    int iZ7 = qq.z(i10);
                    if (iZ7 == 1) {
                        bundleE = qq.E(parcel, i10);
                    } else if (iZ7 == 2) {
                        aesVarArr = (aes[]) qq.Q(parcel, i10, aes.CREATOR);
                    } else if (iZ7 == 3) {
                        iA5 = qq.A(parcel, i10);
                    } else if (iZ7 != 4) {
                        qq.M(parcel, i10);
                    } else {
                        aigVar = (aig) qq.G(parcel, i10, aig.CREATOR);
                    }
                }
                qq.K(parcel, iC8);
                return new aif(bundleE, aesVarArr, iA5, aigVar);
            case 8:
                int iC9 = qq.C(parcel);
                boolean zN10 = false;
                boolean zN11 = false;
                int iA12 = 0;
                ajd ajdVar = null;
                int[] iArrP = null;
                int[] iArrP2 = null;
                while (parcel.dataPosition() < iC9) {
                    int i11 = parcel.readInt();
                    switch (qq.z(i11)) {
                        case 1:
                            ajdVar = (ajd) qq.G(parcel, i11, ajd.CREATOR);
                            break;
                        case 2:
                            zN10 = qq.N(parcel, i11);
                            break;
                        case 3:
                            zN11 = qq.N(parcel, i11);
                            break;
                        case 4:
                            iArrP = qq.P(parcel, i11);
                            break;
                        case 5:
                            iA12 = qq.A(parcel, i11);
                            break;
                        case 6:
                            iArrP2 = qq.P(parcel, i11);
                            break;
                        default:
                            qq.M(parcel, i11);
                            break;
                    }
                }
                qq.K(parcel, iC9);
                return new aig(ajdVar, zN10, zN11, iArrP, iA12, iArrP2);
            case 9:
                int iC10 = qq.C(parcel);
                Scope[] scopeArr = aii.a;
                Bundle bundle = new Bundle();
                aes[] aesVarArr2 = aii.b;
                aes[] aesVarArr3 = aesVarArr2;
                int iA13 = 0;
                int iA14 = 0;
                int iA15 = 0;
                boolean zN12 = false;
                int iA16 = 0;
                boolean zN13 = false;
                String strH8 = null;
                IBinder iBinderF3 = null;
                Account account2 = null;
                String strH9 = null;
                while (parcel.dataPosition() < iC10) {
                    int i12 = parcel.readInt();
                    switch (qq.z(i12)) {
                        case 1:
                            iA13 = qq.A(parcel, i12);
                            break;
                        case 2:
                            iA14 = qq.A(parcel, i12);
                            break;
                        case 3:
                            iA15 = qq.A(parcel, i12);
                            break;
                        case 4:
                            strH8 = qq.H(parcel, i12);
                            break;
                        case 5:
                            iBinderF3 = qq.F(parcel, i12);
                            break;
                        case 6:
                            scopeArr = (Scope[]) qq.Q(parcel, i12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = qq.E(parcel, i12);
                            break;
                        case 8:
                            account2 = (Account) qq.G(parcel, i12, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            qq.M(parcel, i12);
                            break;
                        case 10:
                            aesVarArr2 = (aes[]) qq.Q(parcel, i12, aes.CREATOR);
                            break;
                        case 11:
                            aesVarArr3 = (aes[]) qq.Q(parcel, i12, aes.CREATOR);
                            break;
                        case 12:
                            zN12 = qq.N(parcel, i12);
                            break;
                        case 13:
                            iA16 = qq.A(parcel, i12);
                            break;
                        case 14:
                            zN13 = qq.N(parcel, i12);
                            break;
                        case 15:
                            strH9 = qq.H(parcel, i12);
                            break;
                    }
                }
                qq.K(parcel, iC10);
                return new aii(iA13, iA14, iA15, strH8, iBinderF3, scopeArr, bundle, account2, aesVarArr2, aesVarArr3, zN12, iA16, zN13, strH9);
            case 10:
                int iC11 = qq.C(parcel);
                int iA17 = -1;
                long jD3 = 0;
                long jD4 = 0;
                int iA18 = 0;
                int iA19 = 0;
                int iA20 = 0;
                int iA21 = 0;
                String strH10 = null;
                String strH11 = null;
                while (parcel.dataPosition() < iC11) {
                    int i13 = parcel.readInt();
                    switch (qq.z(i13)) {
                        case 1:
                            iA18 = qq.A(parcel, i13);
                            break;
                        case 2:
                            iA19 = qq.A(parcel, i13);
                            break;
                        case 3:
                            iA20 = qq.A(parcel, i13);
                            break;
                        case 4:
                            jD3 = qq.D(parcel, i13);
                            break;
                        case 5:
                            jD4 = qq.D(parcel, i13);
                            break;
                        case 6:
                            strH10 = qq.H(parcel, i13);
                            break;
                        case 7:
                            strH11 = qq.H(parcel, i13);
                            break;
                        case 8:
                            iA21 = qq.A(parcel, i13);
                            break;
                        case 9:
                            iA17 = qq.A(parcel, i13);
                            break;
                        default:
                            qq.M(parcel, i13);
                            break;
                    }
                }
                qq.K(parcel, iC11);
                return new aix(iA18, iA19, iA20, jD3, jD4, strH10, strH11, iA21, iA17);
            case 11:
                int iC12 = qq.C(parcel);
                int iA22 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iC12) {
                    int i14 = parcel.readInt();
                    int iZ8 = qq.z(i14);
                    if (iZ8 == 1) {
                        iA4 = qq.A(parcel, i14);
                    } else if (iZ8 == 2) {
                        account = (Account) qq.G(parcel, i14, Account.CREATOR);
                    } else if (iZ8 == 3) {
                        iA22 = qq.A(parcel, i14);
                    } else if (iZ8 != 4) {
                        qq.M(parcel, i14);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) qq.G(parcel, i14, GoogleSignInAccount.CREATOR);
                    }
                }
                qq.K(parcel, iC12);
                return new aja(iA4, account, iA22, googleSignInAccount);
            case 12:
                int iC13 = qq.C(parcel);
                int iA23 = 0;
                boolean zN14 = false;
                boolean zN15 = false;
                IBinder iBinderF4 = null;
                aeq aeqVar2 = null;
                while (parcel.dataPosition() < iC13) {
                    int i15 = parcel.readInt();
                    int iZ9 = qq.z(i15);
                    if (iZ9 == 1) {
                        iA23 = qq.A(parcel, i15);
                    } else if (iZ9 == 2) {
                        iBinderF4 = qq.F(parcel, i15);
                    } else if (iZ9 == 3) {
                        aeqVar2 = (aeq) qq.G(parcel, i15, aeq.CREATOR);
                    } else if (iZ9 == 4) {
                        zN14 = qq.N(parcel, i15);
                    } else if (iZ9 != 5) {
                        qq.M(parcel, i15);
                    } else {
                        zN15 = qq.N(parcel, i15);
                    }
                }
                qq.K(parcel, iC13);
                return new ajb(iA23, iBinderF4, aeqVar2, zN14, zN15);
            case 13:
                int iC14 = qq.C(parcel);
                int iA24 = 0;
                boolean zN16 = false;
                boolean zN17 = false;
                int iA25 = 0;
                int iA26 = 0;
                while (parcel.dataPosition() < iC14) {
                    int i16 = parcel.readInt();
                    int iZ10 = qq.z(i16);
                    if (iZ10 == 1) {
                        iA24 = qq.A(parcel, i16);
                    } else if (iZ10 == 2) {
                        zN16 = qq.N(parcel, i16);
                    } else if (iZ10 == 3) {
                        zN17 = qq.N(parcel, i16);
                    } else if (iZ10 == 4) {
                        iA25 = qq.A(parcel, i16);
                    } else if (iZ10 != 5) {
                        qq.M(parcel, i16);
                    } else {
                        iA26 = qq.A(parcel, i16);
                    }
                }
                qq.K(parcel, iC14);
                return new ajd(iA24, zN16, zN17, iA25, iA26);
            case 14:
                int iC15 = qq.C(parcel);
                while (parcel.dataPosition() < iC15) {
                    int i17 = parcel.readInt();
                    int iZ11 = qq.z(i17);
                    if (iZ11 == 1) {
                        iA3 = qq.A(parcel, i17);
                    } else if (iZ11 != 2) {
                        qq.M(parcel, i17);
                    } else {
                        arrayListJ = qq.J(parcel, i17, aix.CREATOR);
                    }
                }
                qq.K(parcel, iC15);
                return new ajf(iA3, arrayListJ);
            case 15:
                int iC16 = qq.C(parcel);
                String[] strArrR2 = null;
                while (parcel.dataPosition() < iC16) {
                    int i18 = parcel.readInt();
                    int iZ12 = qq.z(i18);
                    if (iZ12 == 2) {
                        iA2 = qq.A(parcel, i18);
                    } else if (iZ12 == 3) {
                        akvVarArr = (akv[]) qq.Q(parcel, i18, akv.CREATOR);
                    } else if (iZ12 != 4) {
                        qq.M(parcel, i18);
                    } else {
                        strArrR2 = qq.R(parcel, i18);
                    }
                }
                qq.K(parcel, iC16);
                return new ako(iA2, akvVarArr, strArrR2);
            case 16:
                int iC17 = qq.C(parcel);
                long jD5 = 0;
                boolean zN18 = false;
                String strH12 = null;
                String strH13 = null;
                ako[] akoVarArr = null;
                byte[] bArrO2 = null;
                while (parcel.dataPosition() < iC17) {
                    int i19 = parcel.readInt();
                    switch (qq.z(i19)) {
                        case 2:
                            strH12 = qq.H(parcel, i19);
                            break;
                        case 3:
                            strH13 = qq.H(parcel, i19);
                            break;
                        case 4:
                            akoVarArr = (ako[]) qq.Q(parcel, i19, ako.CREATOR);
                            break;
                        case 5:
                            zN18 = qq.N(parcel, i19);
                            break;
                        case 6:
                            bArrO2 = qq.O(parcel, i19);
                            break;
                        case 7:
                            jD5 = qq.D(parcel, i19);
                            break;
                        default:
                            qq.M(parcel, i19);
                            break;
                    }
                }
                qq.K(parcel, iC17);
                return new akp(strH12, strH13, akoVarArr, zN18, bArrO2, jD5);
            case 17:
                int iC18 = qq.C(parcel);
                while (parcel.dataPosition() < iC18) {
                    int i20 = parcel.readInt();
                    if (qq.z(i20) != 2) {
                        qq.M(parcel, i20);
                    } else {
                        bArrO = qq.O(parcel, i20);
                    }
                }
                qq.K(parcel, iC18);
                return new akq(bArrO);
            case 18:
                int iC19 = qq.C(parcel);
                String strH14 = null;
                byte[] bArrO3 = null;
                byte[][] bArrS = null;
                byte[][] bArrS2 = null;
                byte[][] bArrS3 = null;
                byte[][] bArrS4 = null;
                int[] iArrP3 = null;
                byte[][] bArrS5 = null;
                int[] iArrP4 = null;
                byte[][] bArrS6 = null;
                while (parcel.dataPosition() < iC19) {
                    int i21 = parcel.readInt();
                    switch (qq.z(i21)) {
                        case 2:
                            strH14 = qq.H(parcel, i21);
                            break;
                        case 3:
                            bArrO3 = qq.O(parcel, i21);
                            break;
                        case 4:
                            bArrS = qq.S(parcel, i21);
                            break;
                        case 5:
                            bArrS2 = qq.S(parcel, i21);
                            break;
                        case 6:
                            bArrS3 = qq.S(parcel, i21);
                            break;
                        case 7:
                            bArrS4 = qq.S(parcel, i21);
                            break;
                        case 8:
                            iArrP3 = qq.P(parcel, i21);
                            break;
                        case 9:
                            bArrS5 = qq.S(parcel, i21);
                            break;
                        case 10:
                            iArrP4 = qq.P(parcel, i21);
                            break;
                        case 11:
                            bArrS6 = qq.S(parcel, i21);
                            break;
                        default:
                            qq.M(parcel, i21);
                            break;
                    }
                }
                qq.K(parcel, iC19);
                return new akt(strH14, bArrO3, bArrS, bArrS2, bArrS3, bArrS4, iArrP3, bArrS5, iArrP4, bArrS6);
            case 19:
                int iC20 = qq.C(parcel);
                double d = 0.0d;
                long jD6 = 0;
                boolean zN19 = false;
                int iA27 = 0;
                int iA28 = 0;
                int iA29 = 0;
                String strH15 = null;
                String strH16 = null;
                byte[] bArrO4 = null;
                while (parcel.dataPosition() < iC20) {
                    int i22 = parcel.readInt();
                    switch (qq.z(i22)) {
                        case 2:
                            strH15 = qq.H(parcel, i22);
                            break;
                        case 3:
                            jD6 = qq.D(parcel, i22);
                            break;
                        case 4:
                            zN19 = qq.N(parcel, i22);
                            break;
                        case 5:
                            qq.L(parcel, i22, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strH16 = qq.H(parcel, i22);
                            break;
                        case 7:
                            bArrO4 = qq.O(parcel, i22);
                            break;
                        case 8:
                            iA27 = qq.A(parcel, i22);
                            break;
                        case 9:
                            iA28 = qq.A(parcel, i22);
                            break;
                        case 10:
                            iA29 = qq.A(parcel, i22);
                            break;
                        default:
                            qq.M(parcel, i22);
                            break;
                    }
                }
                qq.K(parcel, iC20);
                return new akv(strH15, jD6, zN19, d, strH16, bArrO4, iA27, iA28, iA29);
            default:
                int iC21 = qq.C(parcel);
                String strH17 = null;
                akv akvVar = null;
                while (parcel.dataPosition() < iC21) {
                    int i23 = parcel.readInt();
                    int iZ13 = qq.z(i23);
                    if (iZ13 == 2) {
                        strH2 = qq.H(parcel, i23);
                    } else if (iZ13 == 3) {
                        strH17 = qq.H(parcel, i23);
                    } else if (iZ13 == 4) {
                        akvVar = (akv) qq.G(parcel, i23, akv.CREATOR);
                    } else if (iZ13 != 5) {
                        qq.M(parcel, i23);
                    } else {
                        zN = qq.N(parcel, i23);
                    }
                }
                qq.K(parcel, iC21);
                return new akw(strH2, strH17, akvVar, zN);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new afh[i];
            case 1:
                return new aes[i];
            case 2:
                return new afj[i];
            case 3:
                return new afk[i];
            case 4:
                return new Scope[i];
            case 5:
                return new Status[i];
            case 6:
                return new DataHolder[i];
            case 7:
                return new aif[i];
            case 8:
                return new aig[i];
            case 9:
                return new aii[i];
            case 10:
                return new aix[i];
            case 11:
                return new aja[i];
            case 12:
                return new ajb[i];
            case 13:
                return new ajd[i];
            case 14:
                return new ajf[i];
            case 15:
                return new ako[i];
            case 16:
                return new akp[i];
            case 17:
                return new akq[i];
            case 18:
                return new akt[i];
            case 19:
                return new akv[i];
            default:
                return new akw[i];
        }
    }
}
