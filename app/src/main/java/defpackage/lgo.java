package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgo implements ServiceConnection, kip, kiq {
    public volatile boolean a;
    public volatile kzv b;
    final /* synthetic */ lgp c;

    protected lgo(lgp lgpVar) {
        this.c = lgpVar;
    }

    @Override // defpackage.kip
    public final void a(int i) {
        lbk lbkVar = this.c.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.e();
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.a("Service connection suspended");
        lbkVar.o(lbhVar);
        lbhVar.h(new lgk(this));
    }

    @Override // defpackage.kip
    public final void b() {
        lbk lbkVar = this.c.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.e();
        synchronized (this) {
            try {
                kkk.k(this.b);
                kzj kzjVar = (kzj) this.b.v();
                lbk lbkVar2 = this.c.y;
                lbh lbhVar2 = lbkVar2.g;
                lbkVar2.o(lbhVar2);
                lbhVar2.h(new lgj(this, kzjVar));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.kiq
    public final void c(ConnectionResult connectionResult) {
        lgp lgpVar = this.c;
        lbk lbkVar = lgpVar.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.e();
        lab labVar = lgpVar.y.f;
        if (labVar == null || !labVar.r()) {
            labVar = null;
        }
        if (labVar != null) {
            labVar.k.b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        lbk lbkVar2 = this.c.y;
        lbh lbhVar2 = lbkVar2.g;
        lbkVar2.o(lbhVar2);
        lbhVar2.h(new lgn(this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lbk lbkVar = this.c.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.e();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                lbk lbkVar2 = this.c.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.a("Service connected with null binder");
                return;
            }
            kzj kzhVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    kzhVar = iInterfaceQueryLocalInterface instanceof kzj ? (kzj) iInterfaceQueryLocalInterface : new kzh(iBinder);
                    lbk lbkVar3 = this.c.y;
                    lab labVar2 = lbkVar3.f;
                    lbkVar3.o(labVar2);
                    labVar2.k.a("Bound to IMeasurementService interface");
                } else {
                    lbk lbkVar4 = this.c.y;
                    lab labVar3 = lbkVar4.f;
                    lbkVar4.o(labVar3);
                    labVar3.c.b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                lbk lbkVar5 = this.c.y;
                lab labVar4 = lbkVar5.f;
                lbkVar5.o(labVar4);
                labVar4.c.a("Service connect failed to get IMeasurementService");
            }
            if (kzhVar == null) {
                this.a = false;
                try {
                    kle kleVarA = kle.a();
                    lgp lgpVar = this.c;
                    kleVarA.b(lgpVar.y.a, lgpVar.a);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                lbk lbkVar6 = this.c.y;
                lbh lbhVar2 = lbkVar6.g;
                lbkVar6.o(lbhVar2);
                lbhVar2.h(new lgh(this, kzhVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lbk lbkVar = this.c.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.e();
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.a("Service disconnected");
        lbkVar.o(lbhVar);
        lbhVar.h(new lgi(this, componentName));
    }
}
