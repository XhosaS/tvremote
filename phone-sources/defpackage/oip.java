package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oip extends obe {
    private final ClientAppContext a;
    private final int b;
    private final kwy c;

    public oip(Context context, Looper looper, nws nwsVar, nwt nwtVar, oav oavVar, oil oilVar) {
        super(context, looper, 62, oavVar, nwsVar, nwtVar);
        this.c = new kwy((char[]) null, (byte[]) null);
        String str = oavVar.e;
        int iM = m(context);
        if (oilVar != null) {
            this.a = new ClientAppContext(str, iM);
            this.b = 0;
        } else {
            this.a = new ClientAppContext(str, iM);
            this.b = -1;
        }
    }

    static int m(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final boolean F() {
        return ohk.a(this.u);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof oin ? (oin) iInterfaceQueryLocalInterface : new oin(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt("NearbyPermissions", this.b);
        bundle.putParcelable("ClientAppContext", this.a);
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        try {
            q(2);
        } catch (RemoteException unused) {
        }
        this.c.a.clear();
        super.n();
    }

    final void q(int i) {
        if (D()) {
            oim oimVar = new oim(1, null, i);
            oin oinVar = (oin) L();
            Parcel parcelK = oinVar.k();
            ifl.c(parcelK, oimVar);
            oinVar.n(9, parcelK);
        }
    }
}
