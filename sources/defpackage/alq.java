package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alq extends ack implements IInterface {
    public alq() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                acl.b(parcel);
                break;
            case 4:
                acl.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                acl.b(parcel);
                break;
            case 7:
                acl.b(parcel);
                break;
            case 8:
                alv alvVar = (alv) acl.a(parcel, alv.CREATOR);
                acl.b(parcel);
                c(alvVar);
                break;
            case 9:
                acl.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(alv alvVar) {
    }
}
