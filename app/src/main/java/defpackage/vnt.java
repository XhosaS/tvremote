package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vnt extends ert implements vnv {
    public vnt(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback");
    }

    @Override // defpackage.vnv
    public final void c(Bundle bundle) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        J(2, parcelA);
    }

    @Override // defpackage.vnv
    public final void d(List list) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        J(1, parcelA);
    }
}
