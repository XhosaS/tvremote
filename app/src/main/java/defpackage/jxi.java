package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Oauth2TokenMetadata oauth2TokenMetadata = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                oauth2TokenMetadata = (Oauth2TokenMetadata) kkw.h(parcel, i, Oauth2TokenMetadata.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new GetTokenResponse(strL, oauth2TokenMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTokenResponse[i];
    }
}
