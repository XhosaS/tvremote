package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lww extends kjn {
    private final AtomicReference t;

    public lww(Context context, Looper looper, kjd kjdVar, ket ketVar, keu keuVar) {
        super(context, looper, 41, kjdVar, ketVar, keuVar);
        this.t = new AtomicReference();
    }

    public final void J(lwv lwvVar, lwv lwvVar2, kfv kfvVar) {
        lwt lwtVar = new lwt((lwp) v(), kfvVar, lwvVar2);
        if (lwvVar == null) {
            if (lwvVar2 == null) {
                kfvVar.i(Status.a);
                return;
            } else {
                ((lwp) v()).e(lwvVar2, lwtVar);
                return;
            }
        }
        lwp lwpVar = (lwp) v();
        Parcel parcelA = lwpVar.a();
        erv.c(parcelA, lwvVar);
        erv.c(parcelA, lwtVar);
        lwpVar.J(10, parcelA);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof lwp ? (lwp) iInterfaceQueryLocalInterface : new lwp(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return lvu.f;
    }

    @Override // defpackage.kiz
    public final void z() {
        try {
            lwv lwvVar = (lwv) this.t.getAndSet(null);
            if (lwvVar != null) {
                lws lwsVar = new lws();
                lwp lwpVar = (lwp) v();
                Parcel parcelA = lwpVar.a();
                erv.c(parcelA, lwvVar);
                erv.c(parcelA, lwsVar);
                lwpVar.J(5, parcelA);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.z();
    }
}
