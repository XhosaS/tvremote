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
/* loaded from: classes.dex */
public class jwo implements jwp {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public jwo(String str, Context context) {
        this.a = str;
        this.b = context;
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
        Parcel parcelA = jrzVar.a();
        parcelA.writeString(str);
        Parcel parcelB = jrzVar.b(8, parcelA);
        Bundle bundle = (Bundle) erv.a(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        jwq.j(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        if (jyk.SUCCESS.equals(jyk.a(string))) {
            return true;
        }
        jwq.e(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new jwj("Invalid state. Shouldn't happen");
    }
}
