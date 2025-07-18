package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public e(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iA = 0;
        int iA2 = 0;
        boolean zN = false;
        int iA3 = 0;
        String strH = null;
        ArrayList arrayListJ = null;
        switch (this.a) {
            case 0:
                return new f(parcel);
            case 1:
                return new d(parcel);
            case 2:
                return new ai(parcel);
            case 3:
                return new an(parcel);
            case 4:
                return new aq(parcel);
            case 5:
                return new gc(parcel);
            case 6:
                return new hu(parcel);
            case 7:
                return new ji(parcel);
            case 8:
                return new jj(parcel);
            case 9:
                parcel.getClass();
                return new la(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 10:
                return new tn(parcel);
            case 11:
                return new vw(parcel);
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                int iC = qq.C(parcel);
                long jD = 0;
                String strH2 = null;
                String strH3 = null;
                String strH4 = null;
                String strH5 = null;
                Uri uri = null;
                String strH6 = null;
                String strH7 = null;
                ArrayList arrayListJ2 = null;
                String strH8 = null;
                String strH9 = null;
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    switch (qq.z(i)) {
                        case 2:
                            strH2 = qq.H(parcel, i);
                            break;
                        case 3:
                            strH3 = qq.H(parcel, i);
                            break;
                        case 4:
                            strH4 = qq.H(parcel, i);
                            break;
                        case 5:
                            strH5 = qq.H(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) qq.G(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strH6 = qq.H(parcel, i);
                            break;
                        case 8:
                            jD = qq.D(parcel, i);
                            break;
                        case 9:
                            strH7 = qq.H(parcel, i);
                            break;
                        case 10:
                            arrayListJ2 = qq.J(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strH8 = qq.H(parcel, i);
                            break;
                        case 12:
                            strH9 = qq.H(parcel, i);
                            break;
                        default:
                            qq.M(parcel, i);
                            break;
                    }
                }
                qq.K(parcel, iC);
                return new GoogleSignInAccount(strH2, strH3, strH4, strH5, uri, strH6, jD, strH7, arrayListJ2, strH8, strH9);
            case 14:
                int iC2 = qq.C(parcel);
                boolean zN2 = true;
                int iA4 = 0;
                aeo aeoVar = null;
                byte[] bArrO = null;
                int[] iArrP = null;
                String[] strArrR = null;
                int[] iArrP2 = null;
                byte[][] bArrS = null;
                akt[] aktVarArr = null;
                aen aenVar = null;
                String[] strArrR2 = null;
                aef aefVar = null;
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    switch (qq.z(i2)) {
                        case 2:
                            aeoVar = (aeo) qq.G(parcel, i2, aeo.CREATOR);
                            break;
                        case 3:
                            bArrO = qq.O(parcel, i2);
                            break;
                        case 4:
                            iArrP = qq.P(parcel, i2);
                            break;
                        case 5:
                            strArrR = qq.R(parcel, i2);
                            break;
                        case 6:
                            iArrP2 = qq.P(parcel, i2);
                            break;
                        case 7:
                            bArrS = qq.S(parcel, i2);
                            break;
                        case 8:
                            zN2 = qq.N(parcel, i2);
                            break;
                        case 9:
                            aktVarArr = (akt[]) qq.Q(parcel, i2, akt.CREATOR);
                            break;
                        case 10:
                        default:
                            qq.M(parcel, i2);
                            break;
                        case 11:
                            aenVar = (aen) qq.G(parcel, i2, aen.CREATOR);
                            break;
                        case 12:
                            strArrR2 = qq.R(parcel, i2);
                            break;
                        case 13:
                            iA4 = qq.A(parcel, i2);
                            break;
                        case 14:
                            aefVar = (aef) qq.G(parcel, i2, aef.CREATOR);
                            break;
                    }
                }
                qq.K(parcel, iC2);
                return new adt(aeoVar, bArrO, iArrP, strArrR, iArrP2, bArrS, zN2, aktVarArr, aenVar, strArrR2, iA4, aefVar);
            case 15:
                int iC3 = qq.C(parcel);
                while (parcel.dataPosition() < iC3) {
                    int i3 = parcel.readInt();
                    if (qq.z(i3) != 1) {
                        qq.M(parcel, i3);
                    } else {
                        arrayListJ = qq.J(parcel, i3, aej.CREATOR);
                    }
                }
                qq.K(parcel, iC3);
                return new ady(arrayListJ);
            case 16:
                int iC4 = qq.C(parcel);
                int iA5 = 0;
                int iA6 = 0;
                while (parcel.dataPosition() < iC4) {
                    int i4 = parcel.readInt();
                    int iZ = qq.z(i4);
                    if (iZ == 1) {
                        iA = qq.A(parcel, i4);
                    } else if (iZ == 2) {
                        iA5 = qq.A(parcel, i4);
                    } else if (iZ != 3) {
                        qq.M(parcel, i4);
                    } else {
                        iA6 = qq.A(parcel, i4);
                    }
                }
                qq.K(parcel, iC4);
                return new aef(iA, iA5, iA6);
            case 17:
                int iC5 = qq.C(parcel);
                int iA7 = 0;
                while (parcel.dataPosition() < iC5) {
                    int i5 = parcel.readInt();
                    int iZ2 = qq.z(i5);
                    if (iZ2 == 1) {
                        strH = qq.H(parcel, i5);
                    } else if (iZ2 == 2) {
                        iA3 = qq.A(parcel, i5);
                    } else if (iZ2 != 3) {
                        qq.M(parcel, i5);
                    } else {
                        iA7 = qq.A(parcel, i5);
                    }
                }
                qq.K(parcel, iC5);
                return new aej(strH, iA3, iA7);
            case 18:
                int iC6 = qq.C(parcel);
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    if (qq.z(i6) != 1) {
                        qq.M(parcel, i6);
                    } else {
                        zN = qq.N(parcel, i6);
                    }
                }
                qq.K(parcel, iC6);
                return new aen(zN);
            case 19:
                int iC7 = qq.C(parcel);
                boolean zN3 = true;
                int iA8 = 0;
                int iA9 = 0;
                boolean zN4 = false;
                int iA10 = 0;
                boolean zN5 = false;
                int iA11 = 0;
                String strH10 = null;
                String strH11 = null;
                String strH12 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iC7) {
                    int i7 = parcel.readInt();
                    switch (qq.z(i7)) {
                        case 2:
                            strH10 = qq.H(parcel, i7);
                            break;
                        case 3:
                            iA8 = qq.A(parcel, i7);
                            break;
                        case 4:
                            iA9 = qq.A(parcel, i7);
                            break;
                        case 5:
                            strH11 = qq.H(parcel, i7);
                            break;
                        case 6:
                        default:
                            qq.M(parcel, i7);
                            break;
                        case 7:
                            zN3 = qq.N(parcel, i7);
                            break;
                        case 8:
                            strH12 = qq.H(parcel, i7);
                            break;
                        case 9:
                            zN4 = qq.N(parcel, i7);
                            break;
                        case 10:
                            iA10 = qq.A(parcel, i7);
                            break;
                        case 11:
                            int iB = qq.B(parcel, i7);
                            if (iB == 0) {
                                numValueOf = null;
                                break;
                            } else {
                                if (iB != 4) {
                                    throw new aji("Expected size 4 got " + iB + " (0x" + Integer.toHexString(iB) + ")", parcel);
                                }
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            }
                        case 12:
                            zN5 = qq.N(parcel, i7);
                            break;
                        case 13:
                            iA11 = qq.A(parcel, i7);
                            break;
                    }
                }
                qq.K(parcel, iC7);
                return new aeo(strH10, iA8, iA9, strH11, zN3, strH12, zN4, iA10, numValueOf, zN5, iA11);
            default:
                int iC8 = qq.C(parcel);
                PendingIntent pendingIntent = null;
                String strH13 = null;
                int iA12 = 0;
                while (parcel.dataPosition() < iC8) {
                    int i8 = parcel.readInt();
                    int iZ3 = qq.z(i8);
                    if (iZ3 == 1) {
                        iA2 = qq.A(parcel, i8);
                    } else if (iZ3 == 2) {
                        iA12 = qq.A(parcel, i8);
                    } else if (iZ3 == 3) {
                        pendingIntent = (PendingIntent) qq.G(parcel, i8, PendingIntent.CREATOR);
                    } else if (iZ3 != 4) {
                        qq.M(parcel, i8);
                    } else {
                        strH13 = qq.H(parcel, i8);
                    }
                }
                qq.K(parcel, iC8);
                return new aeq(iA2, iA12, pendingIntent, strH13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new d[i];
            case 2:
                return new ai[i];
            case 3:
                return new an[i];
            case 4:
                return new aq[i];
            case 5:
                return new gc[i];
            case 6:
                return new hu[i];
            case 7:
                return new ji[i];
            case 8:
                return new jj[i];
            case 9:
                return new la[i];
            case 10:
                return new tn[i];
            case 11:
                return new vw[i];
            case 12:
                return new ParcelImpl[i];
            case 13:
                return new GoogleSignInAccount[i];
            case 14:
                return new adt[i];
            case 15:
                return new ady[i];
            case 16:
                return new aef[i];
            case 17:
                return new aej[i];
            case 18:
                return new aen[i];
            case 19:
                return new aeo[i];
            default:
                return new aeq[i];
        }
    }
}
