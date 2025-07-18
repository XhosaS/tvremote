package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class niz extends ifk implements IInterface {
    public niz() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ifl.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        String string = parcel.readString();
        ifl.b(parcel);
        a(string);
        parcel2.writeNoException();
        return true;
    }
}
