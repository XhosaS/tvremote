package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhn extends ocg {
    public static final Parcelable.Creator<nhn> CREATOR = new mur(15);
    public final Account a;
    public final String[] b;
    public final Bundle c;

    public nhn(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, account, i);
        ocv.P(parcel, 2, this.b);
        ocv.E(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
