package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmp extends jys {
    public final /* synthetic */ nmq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmp(nmq nmqVar) {
        super((char[]) null);
        this.a = nmqVar;
    }

    @Override // defpackage.jys
    public final void D() throws Throwable {
        nmq nmqVar = this.a;
        nmx nmxVar = nmqVar.b;
        if (nmxVar == null) {
            return;
        }
        try {
            nqj nqjVar = nmqVar.d;
            if (nqjVar != null) {
                nqjVar.k();
            }
            nmxVar.f();
        } catch (RemoteException unused) {
            nsf.e();
        }
        pku pkuVar = this.a.e;
        if (pkuVar != null) {
            ((goe) pkuVar.a).e(new nov(new nou(3)));
        }
    }

    @Override // defpackage.jys
    public final void E(int i) {
        jys.A(this, i);
    }

    @Override // defpackage.jys
    public final void F(int i) {
        nmx nmxVar = this.a.b;
        if (nmxVar == null) {
            return;
        }
        try {
            nmxVar.d(i);
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    @Override // defpackage.jys
    public final void G(int i) {
        jys.A(this, i);
    }
}
