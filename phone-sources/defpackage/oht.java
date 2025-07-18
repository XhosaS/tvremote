package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oht extends obe {
    public long a;
    public final Set b;
    public final Set c;
    public final Set d;
    public sml e;
    private final Set f;
    private final Set g;
    private final Set h;

    protected oht(Context context, Looper looper, oav oavVar, oil oilVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 54, oavVar, nwsVar, nwtVar);
        this.b = new it();
        this.f = new it();
        this.c = new it();
        this.g = new it();
        this.d = new it();
        this.h = new it();
        if (oilVar != null) {
            throw null;
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            ocv.a = cacheDir;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m() {
        Set set = this.b;
        is isVar = new is((it) set);
        while (isVar.hasNext()) {
            ((ohw) isVar.next()).c();
        }
        Set set2 = this.f;
        is isVar2 = new is((it) set2);
        while (isVar2.hasNext()) {
            ((ohr) isVar2.next()).a();
        }
        Set set3 = this.c;
        is isVar3 = new is((it) set3);
        while (isVar3.hasNext()) {
            ((ohs) isVar3.next()).a();
        }
        Set set4 = this.g;
        is isVar4 = new is((it) set4);
        while (isVar4.hasNext()) {
            ((ohs) isVar4.next()).a();
        }
        Set set5 = this.d;
        is isVar5 = new is((it) set5);
        while (isVar5.hasNext()) {
            ((ohs) isVar5.next()).a();
        }
        Set set6 = this.h;
        is isVar6 = new is((it) set6);
        while (isVar6.hasNext()) {
            ((ohs) isVar6.next()).a();
        }
        set.clear();
        set2.clear();
        set3.clear();
        set4.clear();
        set5.clear();
        set6.clear();
        sml smlVar = this.e;
        if (smlVar != null) {
            smlVar.c();
            this.e = null;
        }
    }

    @Override // defpackage.oat, defpackage.nwj
    public final boolean F() {
        return ohk.a(this.u);
    }

    @Override // defpackage.oat
    protected final /* bridge */ /* synthetic */ void O(IInterface iInterface) {
        super.O((ohx) iInterface);
        this.e = new sml();
    }

    @Override // defpackage.oat
    public final void P(int i) {
        if (i == 1) {
            m();
            i = 1;
        }
        super.P(i);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof ohx ? (ohx) iInterfaceQueryLocalInterface : new ohx(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return new nvg[]{ohj.a, ohj.d, ohj.h, ohj.f, ohj.i, ohj.e, ohj.b, ohj.g, ohj.c, ohj.j};
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.a);
        return bundle;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        if (D()) {
            try {
                ohx ohxVar = (ohx) L();
                ohq ohqVar = new ohq();
                Parcel parcelK = ohxVar.k();
                ifl.c(parcelK, ohqVar);
                ohxVar.m(2011, parcelK);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        m();
        super.n();
    }
}
