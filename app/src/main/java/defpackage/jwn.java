package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class jwn implements jwp {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public jwn(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.jwp
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws IOException, jwj {
        jrz jrzVar;
        if (iBinder == null) {
            jrzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel parcelA = jrzVar.a();
        parcelA.writeString(str);
        erv.b(parcelA, bundle);
        Parcel parcelB = jrzVar.b(2, parcelA);
        Bundle bundle2 = (Bundle) erv.a(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        jwq.j(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new jwj(string);
    }
}
