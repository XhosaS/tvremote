package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public class laq implements ServiceConnection {
    public final String a;
    final /* synthetic */ lar b;

    public laq(lar larVar, String str) {
        this.b = larVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            lbk lbkVar = this.b.a;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            jvd jvdVar = iInterfaceQueryLocalInterface instanceof jvd ? (jvd) iInterfaceQueryLocalInterface : new jvd(iBinder);
            if (jvdVar == null) {
                lbk lbkVar2 = this.b.a;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.f.a("Install Referrer Service implementation was not found");
                return;
            }
            lbk lbkVar3 = this.b.a;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.k.a("Install Referrer Service connected");
            lbh lbhVar = lbkVar3.g;
            lbkVar3.o(lbhVar);
            lbhVar.h(new lap(this, jvdVar, this));
        } catch (RuntimeException e) {
            lbk lbkVar4 = this.b.a;
            lab labVar4 = lbkVar4.f;
            lbkVar4.o(labVar4);
            labVar4.f.b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lbk lbkVar = this.b.a;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.k.a("Install Referrer Service disconnected");
    }
}
