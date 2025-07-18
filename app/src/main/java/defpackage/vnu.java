package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vnu extends eru implements vnv {
    public vnu() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            O(parcel);
            d(arrayListCreateTypedArrayList);
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
