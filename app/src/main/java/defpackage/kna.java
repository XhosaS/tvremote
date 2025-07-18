package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kna implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Bundle bundleF = null;
        String strL2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strL3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strL4 = null;
        ArrayList arrayListO = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String strL5 = null;
        String strL6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        boolean zS4 = false;
        long jE = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    bundleF = kkw.f(parcel, i);
                    break;
                case 4:
                default:
                    kkw.r(parcel, i);
                    break;
                case 5:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) kkw.h(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strL3 = kkw.l(parcel, i);
                    break;
                case '\b':
                    bitmapTeleporter = (BitmapTeleporter) kkw.h(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case '\t':
                    strL4 = kkw.l(parcel, i);
                    break;
                case '\n':
                    arrayListO = kkw.o(parcel, i, FileTeleporter.CREATOR);
                    break;
                case 11:
                    zS = kkw.s(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    themeSettings = (ThemeSettings) kkw.h(parcel, i, ThemeSettings.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    logOptions = (LogOptions) kkw.h(parcel, i, LogOptions.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) kkw.h(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strL5 = kkw.l(parcel, i);
                    break;
                case 17:
                    zS3 = kkw.s(parcel, i);
                    break;
                case 18:
                    jE = kkw.e(parcel, i);
                    break;
                case 19:
                    zS4 = kkw.s(parcel, i);
                    break;
                case 20:
                    strL6 = kkw.l(parcel, i);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) kkw.h(parcel, i, AdditionalConsentConfig.CREATOR);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new FeedbackOptions(strL, bundleF, strL2, applicationErrorReport, strL3, bitmapTeleporter, strL4, arrayListO, zS, themeSettings, logOptions, zS2, bitmap, strL5, zS3, jE, zS4, strL6, additionalConsentConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
