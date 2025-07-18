package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obd implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public obd(int i) {
        this.a = i;
    }

    static void a(obc obcVar, Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, obcVar.c);
        ocv.B(parcel, 2, obcVar.d);
        ocv.B(parcel, 3, obcVar.e);
        ocv.O(parcel, 4, obcVar.f);
        ocv.H(parcel, 5, obcVar.g);
        ocv.R(parcel, 6, obcVar.h, i);
        ocv.E(parcel, 7, obcVar.i);
        ocv.N(parcel, 8, obcVar.j, i);
        ocv.R(parcel, 10, obcVar.k, i);
        ocv.R(parcel, 11, obcVar.l, i);
        ocv.y(parcel, 12, obcVar.m);
        ocv.B(parcel, 13, obcVar.n);
        ocv.y(parcel, 14, obcVar.o);
        ocv.O(parcel, 15, obcVar.p);
        ocv.x(parcel, iV);
    }

    public static final ErrorReport b(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strAh = null;
        String strAh2 = null;
        String strAh3 = null;
        String strAh4 = null;
        String strAh5 = null;
        String strAh6 = null;
        String strAh7 = null;
        String strAh8 = null;
        String strAh9 = null;
        String strAh10 = null;
        String strAh11 = null;
        String strAh12 = null;
        String strAh13 = null;
        String[] strArrAs = null;
        String[] strArrAs2 = null;
        String[] strArrAs3 = null;
        String strAh14 = null;
        String strAh15 = null;
        byte[] bArrAo = null;
        String strAh16 = null;
        String strAh17 = null;
        String strAh18 = null;
        Bundle bundleAb = null;
        String strAh19 = null;
        String strAh20 = null;
        String strAh21 = null;
        String strAh22 = null;
        String strAh23 = null;
        String strAh24 = null;
        String strAh25 = null;
        String strAh26 = null;
        String strAh27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strAh28 = null;
        oeb[] oebVarArr = null;
        String[] strArrAs4 = null;
        String strAh29 = null;
        oeh oehVar = null;
        oec oecVar = null;
        String strAh30 = null;
        Bundle bundleAb2 = null;
        ArrayList arrayListAk = null;
        Bitmap bitmap = null;
        String strAh31 = null;
        ArrayList arrayListAj = null;
        String[] strArrAs5 = null;
        String[] strArrAs6 = null;
        String[] strArrAs7 = null;
        String strAh32 = null;
        ods odsVar = null;
        oed[] oedVarArr = null;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        int iX4 = 0;
        int iX5 = 0;
        int iX6 = 0;
        boolean zAn = false;
        int iX7 = 0;
        int iX8 = 0;
        boolean zAn2 = false;
        int iX9 = 0;
        boolean zAn3 = false;
        boolean zAn4 = false;
        boolean zAn5 = false;
        int iX10 = 0;
        int iX11 = 0;
        boolean zAn6 = false;
        boolean zAn7 = false;
        while (parcel.dataPosition() < iZ) {
            int iW = ocv.W(parcel);
            switch (ocv.V(iW)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) ocv.ad(parcel, iW, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strAh = ocv.ah(parcel, iW);
                    break;
                case 4:
                    iX = ocv.X(parcel, iW);
                    break;
                case 5:
                    strAh2 = ocv.ah(parcel, iW);
                    break;
                case 6:
                    strAh3 = ocv.ah(parcel, iW);
                    break;
                case 7:
                    strAh4 = ocv.ah(parcel, iW);
                    break;
                case 8:
                    strAh5 = ocv.ah(parcel, iW);
                    break;
                case 9:
                    strAh6 = ocv.ah(parcel, iW);
                    break;
                case 10:
                    strAh7 = ocv.ah(parcel, iW);
                    break;
                case 11:
                    strAh8 = ocv.ah(parcel, iW);
                    break;
                case 12:
                    iX2 = ocv.X(parcel, iW);
                    break;
                case 13:
                    strAh9 = ocv.ah(parcel, iW);
                    break;
                case 14:
                    strAh10 = ocv.ah(parcel, iW);
                    break;
                case 15:
                    strAh11 = ocv.ah(parcel, iW);
                    break;
                case 16:
                    strAh12 = ocv.ah(parcel, iW);
                    break;
                case 17:
                    strAh13 = ocv.ah(parcel, iW);
                    break;
                case 18:
                    strArrAs = ocv.as(parcel, iW);
                    break;
                case 19:
                    strArrAs2 = ocv.as(parcel, iW);
                    break;
                case 20:
                    strArrAs3 = ocv.as(parcel, iW);
                    break;
                case 21:
                    strAh14 = ocv.ah(parcel, iW);
                    break;
                case 22:
                    strAh15 = ocv.ah(parcel, iW);
                    break;
                case 23:
                    bArrAo = ocv.ao(parcel, iW);
                    break;
                case 24:
                    iX3 = ocv.X(parcel, iW);
                    break;
                case 25:
                    iX4 = ocv.X(parcel, iW);
                    break;
                case 26:
                    iX5 = ocv.X(parcel, iW);
                    break;
                case 27:
                    iX6 = ocv.X(parcel, iW);
                    break;
                case 28:
                    strAh16 = ocv.ah(parcel, iW);
                    break;
                case 29:
                    strAh17 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    strAh18 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    bundleAb = ocv.ab(parcel, iW);
                    break;
                case 32:
                    zAn = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iX7 = ocv.X(parcel, iW);
                    break;
                case 34:
                    iX8 = ocv.X(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    zAn2 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    strAh19 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    strAh20 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    iX9 = ocv.X(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    strAh21 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    strAh22 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    strAh23 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    strAh24 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    strAh25 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    strAh26 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    strAh27 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) ocv.ad(parcel, iW, BitmapTeleporter.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    strAh28 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    oebVarArr = (oeb[]) ocv.ar(parcel, iW, oeb.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    strArrAs4 = ocv.as(parcel, iW);
                    break;
                case 50:
                    zAn3 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    strAh29 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    oehVar = (oeh) ocv.ad(parcel, iW, oeh.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    oecVar = (oec) ocv.ad(parcel, iW, oec.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    strAh30 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    zAn4 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    bundleAb2 = ocv.ab(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    arrayListAk = ocv.ak(parcel, iW, RectF.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    zAn5 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    bitmap = (Bitmap) ocv.ad(parcel, iW, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    strAh31 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    arrayListAj = ocv.aj(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    iX10 = ocv.X(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    iX11 = ocv.X(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    strArrAs5 = ocv.as(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    strArrAs6 = ocv.as(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    strArrAs7 = ocv.as(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    zAn6 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zAn7 = ocv.an(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    strAh32 = ocv.ah(parcel, iW);
                    break;
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    odsVar = (ods) ocv.ad(parcel, iW, ods.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    oedVarArr = (oed[]) ocv.ar(parcel, iW, oed.CREATOR);
                    break;
                default:
                    ocv.am(parcel, iW);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new ErrorReport(applicationErrorReport, strAh, iX, strAh2, strAh3, strAh4, strAh5, strAh6, strAh7, strAh8, iX2, strAh9, strAh10, strAh11, strAh12, strAh13, strArrAs, strArrAs2, strArrAs3, strAh14, strAh15, bArrAo, iX3, iX4, iX5, iX6, strAh16, strAh17, strAh18, bundleAb, zAn, iX7, iX8, zAn2, strAh19, strAh20, iX9, strAh21, strAh22, strAh23, strAh24, strAh25, strAh26, strAh27, bitmapTeleporter, strAh28, oebVarArr, strArrAs4, zAn3, strAh29, oehVar, oecVar, strAh30, zAn4, bundleAb2, arrayListAk, zAn5, bitmap, strAh31, arrayListAj, iX10, iX11, strArrAs5, strArrAs6, strArrAs7, zAn6, zAn7, strAh32, odsVar, oedVarArr);
    }

    public static void c(oeo oeoVar, Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, oeoVar.a, i);
        ocv.O(parcel, 2, oeoVar.b);
        ocv.O(parcel, 3, oeoVar.c);
        ocv.B(parcel, 4, oeoVar.d);
        ocv.O(parcel, 5, oeoVar.e);
        ocv.B(parcel, 6, oeoVar.f);
        ocv.O(parcel, 7, oeoVar.g);
        ocv.x(parcel, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jAa = 0;
        int iX = 0;
        int iX2 = 0;
        boolean zAn = false;
        int iX3 = 0;
        int iX4 = 0;
        Account account = null;
        String strAh = null;
        String strAh2 = null;
        String strAh3 = null;
        String strAh4 = null;
        String strAh5 = null;
        String strAh6 = null;
        Boolean boolAe = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListAk = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                Scope[] scopeArr = obc.a;
                Bundle bundle = new Bundle();
                nvg[] nvgVarArr = obc.b;
                nvg[] nvgVarArr2 = nvgVarArr;
                int iX5 = 0;
                int iX6 = 0;
                int iX7 = 0;
                boolean zAn2 = false;
                int iX8 = 0;
                boolean zAn3 = false;
                String strAh7 = null;
                IBinder iBinderAc = null;
                Account account2 = null;
                String strAh8 = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    switch (ocv.V(i)) {
                        case 1:
                            iX5 = ocv.X(parcel, i);
                            break;
                        case 2:
                            iX6 = ocv.X(parcel, i);
                            break;
                        case 3:
                            iX7 = ocv.X(parcel, i);
                            break;
                        case 4:
                            strAh7 = ocv.ah(parcel, i);
                            break;
                        case 5:
                            iBinderAc = ocv.ac(parcel, i);
                            break;
                        case 6:
                            scopeArr = (Scope[]) ocv.ar(parcel, i, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = ocv.ab(parcel, i);
                            break;
                        case 8:
                            account2 = (Account) ocv.ad(parcel, i, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            ocv.am(parcel, i);
                            break;
                        case 10:
                            nvgVarArr = (nvg[]) ocv.ar(parcel, i, nvg.CREATOR);
                            break;
                        case 11:
                            nvgVarArr2 = (nvg[]) ocv.ar(parcel, i, nvg.CREATOR);
                            break;
                        case 12:
                            zAn2 = ocv.an(parcel, i);
                            break;
                        case 13:
                            iX8 = ocv.X(parcel, i);
                            break;
                        case 14:
                            zAn3 = ocv.an(parcel, i);
                            break;
                        case 15:
                            strAh8 = ocv.ah(parcel, i);
                            break;
                    }
                }
                ocv.al(parcel, iZ);
                return new obc(iX5, iX6, iX7, strAh7, iBinderAc, scopeArr, bundle, account2, nvgVarArr, nvgVarArr2, zAn2, iX8, zAn3, strAh8);
            case 1:
                int iZ2 = ocv.Z(parcel);
                boolean zAn4 = false;
                boolean zAn5 = false;
                int iX9 = 0;
                ocb ocbVar = null;
                int[] iArrAp = null;
                int[] iArrAp2 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    switch (ocv.V(i2)) {
                        case 1:
                            ocbVar = (ocb) ocv.ad(parcel, i2, ocb.CREATOR);
                            break;
                        case 2:
                            zAn4 = ocv.an(parcel, i2);
                            break;
                        case 3:
                            zAn5 = ocv.an(parcel, i2);
                            break;
                        case 4:
                            iArrAp = ocv.ap(parcel, i2);
                            break;
                        case 5:
                            iX9 = ocv.X(parcel, i2);
                            break;
                        case 6:
                            iArrAp2 = ocv.ap(parcel, i2);
                            break;
                        default:
                            ocv.am(parcel, i2);
                            break;
                    }
                }
                ocv.al(parcel, iZ2);
                return new oay(ocbVar, zAn4, zAn5, iArrAp, iX9, iArrAp2);
            case 2:
                int iZ3 = ocv.Z(parcel);
                int iX10 = -1;
                long jAa2 = 0;
                long jAa3 = 0;
                int iX11 = 0;
                int iX12 = 0;
                int iX13 = 0;
                int iX14 = 0;
                String strAh9 = null;
                String strAh10 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    switch (ocv.V(i3)) {
                        case 1:
                            iX11 = ocv.X(parcel, i3);
                            break;
                        case 2:
                            iX12 = ocv.X(parcel, i3);
                            break;
                        case 3:
                            iX13 = ocv.X(parcel, i3);
                            break;
                        case 4:
                            jAa2 = ocv.aa(parcel, i3);
                            break;
                        case 5:
                            jAa3 = ocv.aa(parcel, i3);
                            break;
                        case 6:
                            strAh9 = ocv.ah(parcel, i3);
                            break;
                        case 7:
                            strAh10 = ocv.ah(parcel, i3);
                            break;
                        case 8:
                            iX14 = ocv.X(parcel, i3);
                            break;
                        case 9:
                            iX10 = ocv.X(parcel, i3);
                            break;
                        default:
                            ocv.am(parcel, i3);
                            break;
                    }
                }
                ocv.al(parcel, iZ3);
                return new obv(iX11, iX12, iX13, jAa2, jAa3, strAh9, strAh10, iX14, iX10);
            case 3:
                int iZ4 = ocv.Z(parcel);
                int iX15 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    int iV = ocv.V(i4);
                    if (iV == 1) {
                        iX = ocv.X(parcel, i4);
                    } else if (iV == 2) {
                        account = (Account) ocv.ad(parcel, i4, Account.CREATOR);
                    } else if (iV == 3) {
                        iX15 = ocv.X(parcel, i4);
                    } else if (iV != 4) {
                        ocv.am(parcel, i4);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ocv.ad(parcel, i4, GoogleSignInAccount.CREATOR);
                    }
                }
                ocv.al(parcel, iZ4);
                return new oby(iX, account, iX15, googleSignInAccount);
            case 4:
                int iZ5 = ocv.Z(parcel);
                int iX16 = 0;
                boolean zAn6 = false;
                boolean zAn7 = false;
                IBinder iBinderAc2 = null;
                nve nveVar = null;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    int iV2 = ocv.V(i5);
                    if (iV2 == 1) {
                        iX16 = ocv.X(parcel, i5);
                    } else if (iV2 == 2) {
                        iBinderAc2 = ocv.ac(parcel, i5);
                    } else if (iV2 == 3) {
                        nveVar = (nve) ocv.ad(parcel, i5, nve.CREATOR);
                    } else if (iV2 == 4) {
                        zAn6 = ocv.an(parcel, i5);
                    } else if (iV2 != 5) {
                        ocv.am(parcel, i5);
                    } else {
                        zAn7 = ocv.an(parcel, i5);
                    }
                }
                ocv.al(parcel, iZ5);
                return new obz(iX16, iBinderAc2, nveVar, zAn6, zAn7);
            case 5:
                int iZ6 = ocv.Z(parcel);
                int iX17 = 0;
                boolean zAn8 = false;
                boolean zAn9 = false;
                int iX18 = 0;
                int iX19 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV3 = ocv.V(i6);
                    if (iV3 == 1) {
                        iX17 = ocv.X(parcel, i6);
                    } else if (iV3 == 2) {
                        zAn8 = ocv.an(parcel, i6);
                    } else if (iV3 == 3) {
                        zAn9 = ocv.an(parcel, i6);
                    } else if (iV3 == 4) {
                        iX18 = ocv.X(parcel, i6);
                    } else if (iV3 != 5) {
                        ocv.am(parcel, i6);
                    } else {
                        iX19 = ocv.X(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ6);
                return new ocb(iX17, zAn8, zAn9, iX18, iX19);
            case 6:
                int iZ7 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV4 = ocv.V(i7);
                    if (iV4 == 1) {
                        iX4 = ocv.X(parcel, i7);
                    } else if (iV4 != 2) {
                        ocv.am(parcel, i7);
                    } else {
                        arrayListAk = ocv.ak(parcel, i7, obv.CREATOR);
                    }
                }
                ocv.al(parcel, iZ7);
                return new ocd(iX4, arrayListAk);
            case 7:
                return b(parcel);
            case 8:
                int iZ8 = ocv.Z(parcel);
                String strAh11 = null;
                String strAh12 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV5 = ocv.V(i8);
                    if (iV5 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ocv.ad(parcel, i8, ParcelFileDescriptor.CREATOR);
                    } else if (iV5 == 3) {
                        strAh11 = ocv.ah(parcel, i8);
                    } else if (iV5 != 4) {
                        ocv.am(parcel, i8);
                    } else {
                        strAh12 = ocv.ah(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ8);
                return new oeb(parcelFileDescriptor, strAh11, strAh12);
            case 9:
                int iZ9 = ocv.Z(parcel);
                boolean zAn10 = false;
                boolean zAn11 = false;
                boolean zAn12 = false;
                boolean zAn13 = false;
                String strAh13 = null;
                oef[] oefVarArr = null;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    switch (ocv.V(i9)) {
                        case 2:
                            strAh13 = ocv.ah(parcel, i9);
                            break;
                        case 3:
                            zAn10 = ocv.an(parcel, i9);
                            break;
                        case 4:
                            zAn11 = ocv.an(parcel, i9);
                            break;
                        case 5:
                            zAn12 = ocv.an(parcel, i9);
                            break;
                        case 6:
                            zAn13 = ocv.an(parcel, i9);
                            break;
                        case 7:
                            oefVarArr = (oef[]) ocv.ar(parcel, i9, oef.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i9);
                            break;
                    }
                }
                ocv.al(parcel, iZ9);
                return new oec(strAh13, zAn10, zAn11, zAn12, zAn13, oefVarArr);
            case 10:
                int iZ10 = ocv.Z(parcel);
                int iX20 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    int iV6 = ocv.V(i10);
                    if (iV6 == 2) {
                        iX3 = ocv.X(parcel, i10);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i10);
                    } else {
                        iX20 = ocv.X(parcel, i10);
                    }
                }
                ocv.al(parcel, iZ10);
                return new oeh(iX3, iX20);
            case 11:
                int iZ11 = ocv.Z(parcel);
                int iX21 = 0;
                int iX22 = 0;
                ArrayList arrayListAj = null;
                ArrayList arrayListAi = null;
                ArrayList arrayListAj2 = null;
                ArrayList arrayListAi2 = null;
                byte[][] bArrAt = null;
                while (parcel.dataPosition() < iZ11) {
                    int i11 = parcel.readInt();
                    switch (ocv.V(i11)) {
                        case 2:
                            iX21 = ocv.X(parcel, i11);
                            break;
                        case 3:
                            iX22 = ocv.X(parcel, i11);
                            break;
                        case 4:
                            arrayListAj = ocv.aj(parcel, i11);
                            break;
                        case 5:
                            arrayListAi = ocv.ai(parcel, i11);
                            break;
                        case 6:
                            arrayListAj2 = ocv.aj(parcel, i11);
                            break;
                        case 7:
                            arrayListAi2 = ocv.ai(parcel, i11);
                            break;
                        case 8:
                            bArrAt = ocv.at(parcel, i11);
                            break;
                        case 9:
                            boolAe = ocv.ae(parcel, i11);
                            break;
                        default:
                            ocv.am(parcel, i11);
                            break;
                    }
                }
                ocv.al(parcel, iZ11);
                return new FRDProductSpecificDataEntry(iX21, iX22, arrayListAj, arrayListAi, arrayListAj2, arrayListAi2, bArrAt, boolAe.booleanValue());
            case 12:
                int iZ12 = ocv.Z(parcel);
                int iX23 = 0;
                int iX24 = 0;
                GoogleHelp googleHelp = null;
                String strAh14 = null;
                String strAh15 = null;
                String strAh16 = null;
                String strAh17 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i12 = parcel.readInt();
                    switch (ocv.V(i12)) {
                        case 1:
                            googleHelp = (GoogleHelp) ocv.ad(parcel, i12, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strAh14 = ocv.ah(parcel, i12);
                            break;
                        case 3:
                            strAh15 = ocv.ah(parcel, i12);
                            break;
                        case 4:
                            iX23 = ocv.X(parcel, i12);
                            break;
                        case 5:
                            strAh16 = ocv.ah(parcel, i12);
                            break;
                        case 6:
                            iX24 = ocv.X(parcel, i12);
                            break;
                        case 7:
                            strAh17 = ocv.ah(parcel, i12);
                            break;
                        default:
                            ocv.am(parcel, i12);
                            break;
                    }
                }
                ocv.al(parcel, iZ12);
                return new oeo(googleHelp, strAh14, strAh15, iX23, strAh16, iX24, strAh17);
            case 13:
                int iZ13 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ13) {
                    int i13 = parcel.readInt();
                    int iV7 = ocv.V(i13);
                    if (iV7 == 2) {
                        zAn = ocv.an(parcel, i13);
                    } else if (iV7 != 3) {
                        ocv.am(parcel, i13);
                    } else {
                        strAh6 = ocv.ah(parcel, i13);
                    }
                }
                ocv.al(parcel, iZ13);
                return new ND4CSettings(zAn, strAh6);
            case 14:
                int iZ14 = ocv.Z(parcel);
                String strAh18 = null;
                String strAh19 = null;
                String strAh20 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i14 = parcel.readInt();
                    int iV8 = ocv.V(i14);
                    if (iV8 == 2) {
                        strAh5 = ocv.ah(parcel, i14);
                    } else if (iV8 == 3) {
                        strAh18 = ocv.ah(parcel, i14);
                    } else if (iV8 == 4) {
                        strAh20 = ocv.ah(parcel, i14);
                    } else if (iV8 != 5) {
                        ocv.am(parcel, i14);
                    } else {
                        strAh19 = ocv.ah(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ14);
                return new oep(strAh5, strAh18, strAh19, strAh20);
            case 15:
                int iZ15 = ocv.Z(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iZ15) {
                    int i15 = parcel.readInt();
                    int iV9 = ocv.V(i15);
                    if (iV9 == 2) {
                        iX2 = ocv.X(parcel, i15);
                    } else if (iV9 == 3) {
                        strAh4 = ocv.ah(parcel, i15);
                    } else if (iV9 != 4) {
                        ocv.am(parcel, i15);
                    } else {
                        intent = (Intent) ocv.ad(parcel, i15, Intent.CREATOR);
                    }
                }
                ocv.al(parcel, iZ15);
                return new oev(iX2, strAh4, intent);
            case 16:
                int iZ16 = ocv.Z(parcel);
                String strAh21 = null;
                String strAh22 = null;
                while (parcel.dataPosition() < iZ16) {
                    int i16 = parcel.readInt();
                    int iV10 = ocv.V(i16);
                    if (iV10 == 2) {
                        strAh3 = ocv.ah(parcel, i16);
                    } else if (iV10 == 3) {
                        strAh21 = ocv.ah(parcel, i16);
                    } else if (iV10 != 4) {
                        ocv.am(parcel, i16);
                    } else {
                        strAh22 = ocv.ah(parcel, i16);
                    }
                }
                ocv.al(parcel, iZ16);
                return new TogglingData(strAh3, strAh21, strAh22);
            case 17:
                int iZ17 = ocv.Z(parcel);
                String strAh23 = "";
                while (parcel.dataPosition() < iZ17) {
                    int i17 = parcel.readInt();
                    int iV11 = ocv.V(i17);
                    if (iV11 == 1) {
                        strAh2 = ocv.ah(parcel, i17);
                    } else if (iV11 == 2) {
                        jAa = ocv.aa(parcel, i17);
                    } else if (iV11 != 3) {
                        ocv.am(parcel, i17);
                    } else {
                        strAh23 = ocv.ah(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ17);
                return new TrailsInteraction(strAh2, jAa, strAh23);
            case 18:
                int iZ18 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ18) {
                    int i18 = parcel.readInt();
                    int iV12 = ocv.V(i18);
                    if (iV12 == 1) {
                        strAh = ocv.ah(parcel, i18);
                    } else if (iV12 != 2) {
                        ocv.am(parcel, i18);
                    } else {
                        jAa = ocv.aa(parcel, i18);
                    }
                }
                ocv.al(parcel, iZ18);
                return new ogi(strAh, jAa);
            case 19:
                int iZ19 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ19) {
                    ocv.am(parcel, parcel.readInt());
                }
                ocv.al(parcel, iZ19);
                return new ogm();
            default:
                int iZ20 = ocv.Z(parcel);
                long epochMilli = Instant.now().toEpochMilli();
                int iX25 = 0;
                byte[] bArrAo = null;
                ogm ogmVar = null;
                while (parcel.dataPosition() < iZ20) {
                    int i19 = parcel.readInt();
                    int iV13 = ocv.V(i19);
                    if (iV13 == 1) {
                        iX25 = ocv.X(parcel, i19);
                    } else if (iV13 == 2) {
                        bArrAo = ocv.ao(parcel, i19);
                    } else if (iV13 == 3) {
                        ogmVar = (ogm) ocv.ad(parcel, i19, ogm.CREATOR);
                    } else if (iV13 != 4) {
                        ocv.am(parcel, i19);
                    } else {
                        epochMilli = ocv.aa(parcel, i19);
                    }
                }
                ocv.al(parcel, iZ20);
                return new ogr(iX25, bArrAo, ogmVar, epochMilli);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new obc[i];
            case 1:
                return new oay[i];
            case 2:
                return new obv[i];
            case 3:
                return new oby[i];
            case 4:
                return new obz[i];
            case 5:
                return new ocb[i];
            case 6:
                return new ocd[i];
            case 7:
                return new ErrorReport[i];
            case 8:
                return new oeb[i];
            case 9:
                return new oec[i];
            case 10:
                return new oeh[i];
            case 11:
                return new FRDProductSpecificDataEntry[i];
            case 12:
                return new oeo[i];
            case 13:
                return new ND4CSettings[i];
            case 14:
                return new oep[i];
            case 15:
                return new oev[i];
            case 16:
                return new TogglingData[i];
            case 17:
                return new TrailsInteraction[i];
            case 18:
                return new ogi[i];
            case 19:
                return new ogm[i];
            default:
                return new ogr[i];
        }
    }
}
