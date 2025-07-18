package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        int iB2 = 0;
        boolean zS = false;
        int iB3 = 0;
        boolean zS2 = false;
        int iB4 = 0;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        Integer numJ = null;
        boolean zS3 = true;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    iB = kkw.b(parcel, i);
                    break;
                case 4:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 5:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 6:
                default:
                    kkw.r(parcel, i);
                    break;
                case 7:
                    zS3 = kkw.s(parcel, i);
                    break;
                case '\b':
                    strL3 = kkw.l(parcel, i);
                    break;
                case '\t':
                    zS = kkw.s(parcel, i);
                    break;
                case '\n':
                    iB3 = kkw.b(parcel, i);
                    break;
                case 11:
                    numJ = kkw.j(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    zS2 = kkw.s(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iB4 = kkw.b(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new PlayLoggerContext(strL, iB, iB2, strL2, zS3, strL3, zS, iB3, numJ, zS2, iB4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
