package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ank extends aij {
    private final AtomicReference t;

    public ank(Context context, Looper looper, aid aidVar, agc agcVar, agd agdVar) {
        super(context, looper, 41, aidVar, agcVar, agdVar);
        this.t = new AtomicReference();
    }

    @Override // defpackage.aib
    public final boolean A() {
        return true;
    }

    public final void F(ane aneVar, ane aneVar2, agu aguVar) {
        ani aniVar = new ani((anf) t(), aguVar, aneVar2);
        if (aneVar == null) {
            if (aneVar2 == null) {
                aguVar.l();
                return;
            } else {
                ((anf) t()).a(aneVar2, aniVar);
                return;
            }
        }
        anf anfVar = (anf) t();
        Parcel parcelC = anfVar.c();
        int i = acl.a;
        parcelC.writeStrongBinder(aneVar);
        parcelC.writeStrongBinder(aniVar);
        anfVar.e(10, parcelC);
    }

    @Override // defpackage.aij, defpackage.aib, defpackage.afx
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.aib
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof anf ? (anf) iInterfaceQueryLocalInterface : new anf(iBinder);
    }

    @Override // defpackage.aib
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.aib
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.aib
    public final aes[] e() {
        return amr.f;
    }

    @Override // defpackage.aib
    public final void u() {
        try {
            ane aneVar = (ane) this.t.getAndSet(null);
            if (aneVar != null) {
                anh anhVar = new anh();
                anf anfVar = (anf) t();
                Parcel parcelC = anfVar.c();
                int i = acl.a;
                parcelC.writeStrongBinder(aneVar);
                parcelC.writeStrongBinder(anhVar);
                anfVar.e(5, parcelC);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.u();
    }
}
