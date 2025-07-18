package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvr extends fun implements fvn {
    final /* synthetic */ fvs a;
    private final String b;
    private final String c;
    private final fuo d;
    private boolean e;
    private int f = -1;
    private int g;
    private fvm h;
    private int i;

    public fvr(fvs fvsVar, String str, String str2, fuo fuoVar) {
        this.a = fvsVar;
        this.b = str;
        this.c = str2;
        this.d = fuoVar;
    }

    @Override // defpackage.fun
    public final void b() {
        this.a.n(this);
    }

    @Override // defpackage.fun
    public final void d(int i) throws RemoteException {
        fvm fvmVar = this.h;
        if (fvmVar != null) {
            fvmVar.d(this.i, i);
        } else {
            this.f = i;
            this.g = 0;
        }
    }

    @Override // defpackage.fun
    public final void f(int i) throws RemoteException {
        fvm fvmVar = this.h;
        if (fvmVar != null) {
            fvmVar.f(this.i, i);
        } else {
            this.g += i;
        }
    }

    @Override // defpackage.fvn
    public final int g() {
        return this.i;
    }

    @Override // defpackage.fvn
    public final void h(fvm fvmVar) throws RemoteException {
        this.h = fvmVar;
        int i = fvmVar.d;
        fvmVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.b);
        bundle.putString("routeGroupId", this.c);
        bundle.putParcelable("routeControllerOptions", this.d.b);
        int i2 = fvmVar.c;
        fvmVar.c = i2 + 1;
        fvmVar.g(3, i2, i, null, bundle);
        this.i = i;
        if (this.e) {
            fvmVar.b(i);
            int i3 = this.f;
            if (i3 >= 0) {
                fvmVar.d(this.i, i3);
                this.f = -1;
            }
            int i4 = this.g;
            if (i4 != 0) {
                fvmVar.f(this.i, i4);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.fvn
    public final void k() throws RemoteException {
        fvm fvmVar = this.h;
        if (fvmVar != null) {
            fvmVar.a(this.i);
            this.h = null;
            this.i = 0;
        }
    }

    @Override // defpackage.fun
    public final void l() throws RemoteException {
        this.e = true;
        fvm fvmVar = this.h;
        if (fvmVar != null) {
            fvmVar.b(this.i);
        }
    }

    @Override // defpackage.fun
    public final void m() {
        n(0);
    }

    @Override // defpackage.fun
    public final void n(int i) throws RemoteException {
        this.e = false;
        fvm fvmVar = this.h;
        if (fvmVar != null) {
            fvmVar.e(this.i, i);
        }
    }
}
