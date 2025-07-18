package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lty implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ResolveAccountRequest resolveAccountRequest = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) kkw.h(parcel, i, ResolveAccountRequest.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new SignInRequest(iB, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInRequest[i];
    }
}
