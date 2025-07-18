package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vnx extends eru implements vny {
    public vnx() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d();
        } else {
            if (i != 2) {
                return false;
            }
            Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
            O(parcel);
            c(bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
