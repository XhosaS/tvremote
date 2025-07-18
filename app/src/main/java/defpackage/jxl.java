package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Long lK = null;
        ArrayList arrayListN = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                lK = kkw.k(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                arrayListN = kkw.n(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new Oauth2TokenMetadata(lK, arrayListN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Oauth2TokenMetadata[i];
    }
}
