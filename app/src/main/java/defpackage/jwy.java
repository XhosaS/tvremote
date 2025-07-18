package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.AppRestrictionState;
import com.google.android.gms.auth.aang.GoogleAccount;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        GoogleAccount googleAccount = null;
        AppRestrictionState appRestrictionState = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                googleAccount = (GoogleAccount) kkw.h(parcel, i, GoogleAccount.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                appRestrictionState = (AppRestrictionState) kkw.h(parcel, i, AppRestrictionState.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new AccountWithAppRestrictionState(googleAccount, appRestrictionState);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountWithAppRestrictionState[i];
    }
}
