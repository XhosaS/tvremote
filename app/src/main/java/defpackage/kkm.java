package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Account account = null;
        int iB = 0;
        int iB2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                account = (Account) kkw.h(parcel, i, Account.CREATOR);
            } else if (c == 3) {
                iB2 = kkw.b(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) kkw.h(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new ResolveAccountRequest(iB, account, iB2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
