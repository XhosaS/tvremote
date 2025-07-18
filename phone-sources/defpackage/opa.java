package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opa extends obe {
    private final AtomicReference a;

    public opa(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 41, oavVar, nwsVar, nwtVar);
        this.a = new AtomicReference();
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof oow ? (oow) iInterfaceQueryLocalInterface : new oow(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return ooj.f;
    }

    public final void m(njq njqVar, njq njqVar2, nxs nxsVar) {
        ooz oozVar = new ooz((oow) L(), nxsVar, njqVar2);
        if (njqVar == null) {
            if (njqVar2 == null) {
                nxsVar.c(Status.a);
                return;
            } else {
                ((oow) L()).a(njqVar2, oozVar);
                return;
            }
        }
        oow oowVar = (oow) L();
        Parcel parcelK = oowVar.k();
        ifl.e(parcelK, njqVar);
        ifl.e(parcelK, oozVar);
        oowVar.m(10, parcelK);
    }

    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        try {
            njq njqVar = (njq) this.a.getAndSet(null);
            if (njqVar != null) {
                ooy ooyVar = new ooy();
                oow oowVar = (oow) L();
                Parcel parcelK = oowVar.k();
                ifl.e(parcelK, njqVar);
                ifl.e(parcelK, ooyVar);
                oowVar.m(5, parcelK);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.n();
    }
}
