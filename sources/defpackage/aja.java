package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aja extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(11);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public aja(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.t(parcel, 2, this.b, i);
        qq.m(parcel, 3, this.c);
        qq.t(parcel, 4, this.d, i);
        qq.j(parcel, iH);
    }
}
