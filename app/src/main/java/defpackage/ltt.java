package defpackage;

import android.os.Parcel;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ltt extends eru implements ltu {
    public ltt() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                O(parcel);
                break;
            case 4:
                O(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                O(parcel);
                break;
            case 7:
                O(parcel);
                break;
            case 8:
                SignInResponse signInResponse = (SignInResponse) erv.a(parcel, SignInResponse.CREATOR);
                O(parcel);
                c(signInResponse);
                break;
            case 9:
                O(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
