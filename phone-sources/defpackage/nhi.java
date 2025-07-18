package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhi implements nhj {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public nhi(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // defpackage.nhj
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws nhc, IOException {
        ndp ndpVar;
        if (iBinder == null) {
            ndpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            ndpVar = iInterfaceQueryLocalInterface instanceof ndp ? (ndp) iInterfaceQueryLocalInterface : new ndp(iBinder);
        }
        String str = this.a;
        Parcel parcelK = ndpVar.k();
        parcelK.writeString(str);
        Parcel parcelL = ndpVar.l(8, parcelK);
        Bundle bundle = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
        parcelL.recycle();
        nhk.h(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        if (njv.SUCCESS.equals(njv.a(string))) {
            return true;
        }
        nhk.f(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new nhc("Invalid state. Shouldn't happen");
    }
}
