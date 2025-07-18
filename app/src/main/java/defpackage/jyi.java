package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        Uri uri = null;
        String strL5 = null;
        String strL6 = null;
        ArrayList arrayListO = null;
        String strL7 = null;
        String strL8 = null;
        long jE = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 4:
                    strL3 = kkw.l(parcel, i);
                    break;
                case 5:
                    strL4 = kkw.l(parcel, i);
                    break;
                case 6:
                    uri = (Uri) kkw.h(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strL5 = kkw.l(parcel, i);
                    break;
                case '\b':
                    jE = kkw.e(parcel, i);
                    break;
                case '\t':
                    strL6 = kkw.l(parcel, i);
                    break;
                case '\n':
                    arrayListO = kkw.o(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strL7 = kkw.l(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strL8 = kkw.l(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new GoogleSignInAccount(strL, strL2, strL3, strL4, uri, strL5, jE, strL6, arrayListO, strL7, strL8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
