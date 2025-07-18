package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListO = null;
        ArrayList arrayListO2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListO = kkw.o(parcel, i, GoogleAccount.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                arrayListO2 = kkw.o(parcel, i, AccountWithAppRestrictionState.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new GetAccountsResponse(arrayListO, arrayListO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAccountsResponse[i];
    }
}
