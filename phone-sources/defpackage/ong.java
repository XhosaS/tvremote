package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ong extends ifk implements IInterface {
    public ong() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                ifl.b(parcel);
                break;
            case 4:
                ifl.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                ifl.b(parcel);
                break;
            case 7:
                ifl.b(parcel);
                break;
            case 8:
                onl onlVar = (onl) ifl.a(parcel, onl.CREATOR);
                ifl.b(parcel);
                a(onlVar);
                break;
            case 9:
                ifl.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void a(onl onlVar) {
    }
}
