package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArrT = null;
        int[] iArrU = null;
        String[] strArrW = null;
        int[] iArrU2 = null;
        byte[][] bArrX = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArrW2 = null;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        int iB = 0;
        boolean zS = true;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) kkw.h(parcel, i, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArrT = kkw.t(parcel, i);
                    break;
                case 4:
                    iArrU = kkw.u(parcel, i);
                    break;
                case 5:
                    strArrW = kkw.w(parcel, i);
                    break;
                case 6:
                    iArrU2 = kkw.u(parcel, i);
                    break;
                case 7:
                    bArrX = kkw.x(parcel, i);
                    break;
                case '\b':
                    zS = kkw.s(parcel, i);
                    break;
                case '\t':
                    experimentTokensArr = (ExperimentTokens[]) kkw.v(parcel, i, ExperimentTokens.CREATOR);
                    break;
                case '\n':
                default:
                    kkw.r(parcel, i);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) kkw.h(parcel, i, LogVerifierResultParcelable.CREATOR);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strArrW2 = kkw.w(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iB = kkw.b(parcel, i);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    dataCollectionIdentifierParcelable = (DataCollectionIdentifierParcelable) kkw.h(parcel, i, DataCollectionIdentifierParcelable.CREATOR);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new LogEventParcelable(playLoggerContext, bArrT, iArrU, strArrW, iArrU2, bArrX, zS, experimentTokensArr, logVerifierResultParcelable, strArrW2, iB, dataCollectionIdentifierParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
