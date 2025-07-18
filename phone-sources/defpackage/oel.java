package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        String strAh = null;
        Account account = null;
        Bundle bundleAb = null;
        String strAh2 = null;
        String strAh3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListAj = null;
        Bundle bundleAb2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrAo = null;
        String strAh4 = null;
        Uri uri = null;
        ArrayList arrayListAk = null;
        oeh oehVar = null;
        ArrayList arrayListAk2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strAh5 = null;
        String strAh6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListAk3 = null;
        String strAh7 = null;
        ArrayList arrayListAk4 = null;
        String strAh8 = null;
        Intent intent = null;
        ArrayList arrayListAj2 = null;
        int iX = 0;
        boolean zAn = false;
        boolean zAn2 = false;
        int iX2 = 0;
        int iX3 = 0;
        int iX4 = 0;
        boolean zAn3 = false;
        int iX5 = 0;
        int iX6 = 0;
        boolean zAn4 = false;
        boolean zAn5 = false;
        int iX7 = 0;
        boolean zAn6 = false;
        boolean zAn7 = false;
        boolean zAn8 = false;
        int iX8 = 0;
        int iX9 = 0;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 1:
                    iX = ocv.X(parcel, i);
                    break;
                case 2:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 3:
                    account = (Account) ocv.ad(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleAb = ocv.ab(parcel, i);
                    break;
                case 5:
                    zAn = ocv.an(parcel, i);
                    break;
                case 6:
                    zAn2 = ocv.an(parcel, i);
                    break;
                case 7:
                    arrayListAj = ocv.aj(parcel, i);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                default:
                    ocv.am(parcel, i);
                    break;
                case 10:
                    bundleAb2 = ocv.ab(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) ocv.ad(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strAh4 = ocv.ah(parcel, i);
                    break;
                case 15:
                    uri = (Uri) ocv.ad(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListAk = ocv.ak(parcel, i, oev.CREATOR);
                    break;
                case 17:
                    iX4 = ocv.X(parcel, i);
                    break;
                case 18:
                    arrayListAk2 = ocv.ak(parcel, i, oep.CREATOR);
                    break;
                case 19:
                    bArrAo = ocv.ao(parcel, i);
                    break;
                case 20:
                    iX2 = ocv.X(parcel, i);
                    break;
                case 21:
                    iX3 = ocv.X(parcel, i);
                    break;
                case 22:
                    zAn3 = ocv.an(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) ocv.ad(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    oehVar = (oeh) ocv.ad(parcel, i, oeh.CREATOR);
                    break;
                case 28:
                    strAh2 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    togglingData = (TogglingData) ocv.ad(parcel, i, TogglingData.CREATOR);
                    break;
                case 32:
                    iX5 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    pendingIntent = (PendingIntent) ocv.ad(parcel, i, PendingIntent.CREATOR);
                    break;
                case 34:
                    strAh3 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    bitmap = (Bitmap) ocv.ad(parcel, i, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    iX6 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    zAn4 = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    zAn5 = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    iX7 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    strAh5 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    zAn6 = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    strAh6 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    zAn7 = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    nD4CSettings = (ND4CSettings) ocv.ad(parcel, i, ND4CSettings.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    zAn8 = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    arrayListAk3 = ocv.ak(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    strAh7 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    iX8 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iX9 = ocv.X(parcel, i);
                    break;
                case 50:
                    arrayListAk4 = ocv.ak(parcel, i, TrailsInteraction.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    strAh8 = ocv.ah(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    intent = (Intent) ocv.ad(parcel, i, Intent.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    arrayListAj2 = ocv.aj(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new GoogleHelp(iX, strAh, account, bundleAb, strAh2, strAh3, bitmap, zAn, zAn2, arrayListAj, bundleAb2, bitmap2, bArrAo, iX2, iX3, strAh4, uri, arrayListAk, iX4, oehVar, arrayListAk2, zAn3, errorReport, togglingData, iX5, pendingIntent, iX6, zAn4, zAn5, iX7, strAh5, zAn6, strAh6, zAn7, nD4CSettings, zAn8, arrayListAk3, strAh7, iX8, iX9, arrayListAk4, strAh8, intent, arrayListAj2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
