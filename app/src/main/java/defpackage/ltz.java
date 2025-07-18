package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ConnectionResult connectionResult = null;
        int iB = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) kkw.h(parcel, i, ConnectionResult.CREATOR);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) kkw.h(parcel, i, ResolveAccountResponse.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new SignInResponse(iB, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
