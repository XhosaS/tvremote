package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kth implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        int iB = 0;
        boolean zS2 = false;
        boolean zS3 = false;
        int iB2 = 0;
        int iB3 = 0;
        long jE = 0;
        long jE2 = 0;
        long jE3 = 0;
        long jE4 = 0;
        long jE5 = 0;
        long jE6 = 0;
        long jE7 = 0;
        String strL = "";
        String strL2 = strL;
        String strL3 = strL2;
        String strL4 = strL3;
        String strL5 = null;
        String strL6 = null;
        String strL7 = null;
        String strL8 = null;
        String strL9 = null;
        String strL10 = null;
        Boolean boolI = null;
        ArrayList arrayListN = null;
        String strL11 = null;
        String strL12 = null;
        int iB4 = 100;
        boolean zS4 = true;
        boolean zS5 = true;
        long jE8 = -2147483648L;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL5 = kkw.l(parcel, i);
                    break;
                case 3:
                    strL6 = kkw.l(parcel, i);
                    break;
                case 4:
                    strL7 = kkw.l(parcel, i);
                    break;
                case 5:
                    strL8 = kkw.l(parcel, i);
                    break;
                case 6:
                    jE = kkw.e(parcel, i);
                    break;
                case 7:
                    jE2 = kkw.e(parcel, i);
                    break;
                case '\b':
                    strL9 = kkw.l(parcel, i);
                    break;
                case '\t':
                    zS4 = kkw.s(parcel, i);
                    break;
                case '\n':
                    zS = kkw.s(parcel, i);
                    break;
                case 11:
                    jE8 = kkw.e(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strL10 = kkw.l(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    kkw.r(parcel, i);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    jE3 = kkw.e(parcel, i);
                    break;
                case 15:
                    iB = kkw.b(parcel, i);
                    break;
                case 16:
                    zS5 = kkw.s(parcel, i);
                    break;
                case 18:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 21:
                    boolI = kkw.i(parcel, i);
                    break;
                case 22:
                    jE4 = kkw.e(parcel, i);
                    break;
                case 23:
                    arrayListN = kkw.n(parcel, i);
                    break;
                case 25:
                    strL = kkw.l(parcel, i);
                    break;
                case 26:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 27:
                    strL11 = kkw.l(parcel, i);
                    break;
                case 28:
                    zS3 = kkw.s(parcel, i);
                    break;
                case 29:
                    jE5 = kkw.e(parcel, i);
                    break;
                case 30:
                    iB4 = kkw.b(parcel, i);
                    break;
                case 31:
                    strL3 = kkw.l(parcel, i);
                    break;
                case ' ':
                    iB2 = kkw.b(parcel, i);
                    break;
                case '\"':
                    jE6 = kkw.e(parcel, i);
                    break;
                case '#':
                    strL12 = kkw.l(parcel, i);
                    break;
                case '$':
                    strL4 = kkw.l(parcel, i);
                    break;
                case '%':
                    jE7 = kkw.e(parcel, i);
                    break;
                case '&':
                    iB3 = kkw.b(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new AppMetadata(strL5, strL6, strL7, strL8, jE, jE2, strL9, zS4, zS, jE8, strL10, jE3, iB, zS5, zS2, boolI, jE4, arrayListN, strL, strL2, strL11, zS3, jE5, iB4, strL3, iB2, jE6, strL12, strL4, jE7, iB3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppMetadata[i];
    }
}
