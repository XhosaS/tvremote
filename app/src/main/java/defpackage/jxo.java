package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jxo extends eru implements jxp {
    public jxo() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) erv.a(parcel, Status.CREATOR);
                GetAccountsResponse getAccountsResponse = (GetAccountsResponse) erv.a(parcel, GetAccountsResponse.CREATOR);
                O(parcel);
                c(status, getAccountsResponse);
                return true;
            case 2:
                Status status2 = (Status) erv.a(parcel, Status.CREATOR);
                GetTokenResponse getTokenResponse = (GetTokenResponse) erv.a(parcel, GetTokenResponse.CREATOR);
                O(parcel);
                d(status2, getTokenResponse);
                return true;
            case 3:
                parcel.readInt();
                O(parcel);
                f();
                return true;
            case 4:
                O(parcel);
                e();
                return true;
            case 5:
                O(parcel);
                h();
                return true;
            case 6:
                O(parcel);
                g();
                return true;
            default:
                return false;
        }
    }
}
