package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        GoogleAccount googleAccount = null;
        String strL = null;
        ArrayList arrayListN = null;
        ArrayList arrayListN2 = null;
        ArrayList arrayListN3 = null;
        ArrayList arrayListN4 = null;
        String strL2 = null;
        byte[] bArrT = null;
        String strL3 = null;
        Network network = null;
        int iB = 0;
        boolean zS = false;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    googleAccount = (GoogleAccount) kkw.h(parcel, i, GoogleAccount.CREATOR);
                    break;
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    arrayListN = kkw.n(parcel, i);
                    break;
                case 4:
                    arrayListN2 = kkw.n(parcel, i);
                    break;
                case 5:
                    arrayListN3 = kkw.n(parcel, i);
                    break;
                case 6:
                    arrayListN4 = kkw.n(parcel, i);
                    break;
                case 7:
                    iB = kkw.b(parcel, i);
                    break;
                case '\b':
                    strL2 = kkw.l(parcel, i);
                    break;
                case '\t':
                    zS = kkw.s(parcel, i);
                    break;
                case '\n':
                    bArrT = kkw.t(parcel, i);
                    break;
                case 11:
                    strL3 = kkw.l(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    zS2 = kkw.s(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    network = (Network) kkw.h(parcel, i, Network.CREATOR);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new GetTokenRequest(googleAccount, strL, arrayListN, arrayListN2, arrayListN3, arrayListN4, iB, strL2, zS, bArrT, strL3, zS2, network);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTokenRequest[i];
    }
}
