package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nhh implements nhj {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public nhh(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.nhj
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws nhc {
        ndp ndpVar;
        if (iBinder == null) {
            ndpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            ndpVar = iInterfaceQueryLocalInterface instanceof ndp ? (ndp) iInterfaceQueryLocalInterface : new ndp(iBinder);
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel parcelK = ndpVar.k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        Parcel parcelL = ndpVar.l(2, parcelK);
        Bundle bundle2 = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
        parcelL.recycle();
        nhk.h(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new nhc(string);
    }
}
