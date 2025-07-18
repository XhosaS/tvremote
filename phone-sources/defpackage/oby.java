package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oby extends ocg {
    public static final Parcelable.Creator<oby> CREATOR = new obd(3);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public oby(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.B(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.x(parcel, iV);
    }
}
