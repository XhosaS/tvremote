package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvq extends fuk implements fvn {
    String a;
    String b;
    final /* synthetic */ fvs c;
    private final String d;
    private final fuo e;
    private boolean f;
    private int h;
    private fvm i;
    private int g = -1;
    private int j = -1;

    public fvq(fvs fvsVar, String str, fuo fuoVar) {
        this.c = fvsVar;
        this.d = str;
        this.e = fuoVar;
    }

    @Override // defpackage.fuk
    public final void a(String str) throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = fvmVar.c;
            fvmVar.c = i2 + 1;
            fvmVar.g(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.fun
    public final void b() {
        this.c.n(this);
    }

    @Override // defpackage.fuk
    public final void c(String str) throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = fvmVar.c;
            fvmVar.c = i2 + 1;
            fvmVar.g(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.fun
    public final void d(int i) throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            fvmVar.d(this.j, i);
        } else {
            this.g = i;
            this.h = 0;
        }
    }

    @Override // defpackage.fuk
    public final void e(List list) throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            int i = this.j;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = fvmVar.c;
            fvmVar.c = i2 + 1;
            fvmVar.g(14, i2, i, null, bundle);
        }
    }

    @Override // defpackage.fun
    public final void f(int i) throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            fvmVar.f(this.j, i);
        } else {
            this.h += i;
        }
    }

    @Override // defpackage.fvn
    public final int g() {
        return this.j;
    }

    @Override // defpackage.fvn
    public final void h(fvm fvmVar) throws RemoteException {
        fvp fvpVar = new fvp(this);
        this.i = fvmVar;
        int i = fvmVar.d;
        fvmVar.d = i + 1;
        int i2 = fvmVar.c;
        fvmVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.d);
        bundle.putParcelable("routeControllerOptions", this.e.b);
        fvmVar.g(11, i2, i, null, bundle);
        fvmVar.g.put(i2, fvpVar);
        this.j = i;
        if (this.f) {
            fvmVar.b(i);
            int i3 = this.g;
            if (i3 >= 0) {
                fvmVar.d(this.j, i3);
                this.g = -1;
            }
            int i4 = this.h;
            if (i4 != 0) {
                fvmVar.f(this.j, i4);
                this.h = 0;
            }
        }
    }

    @Override // defpackage.fuk
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fuk
    public final String j() {
        return this.b;
    }

    @Override // defpackage.fvn
    public final void k() throws RemoteException {
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            fvmVar.a(this.j);
            this.i = null;
            this.j = 0;
        }
    }

    @Override // defpackage.fun
    public final void l() throws RemoteException {
        this.f = true;
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            fvmVar.b(this.j);
        }
    }

    @Override // defpackage.fun
    public final void m() {
        n(0);
    }

    @Override // defpackage.fun
    public final void n(int i) throws RemoteException {
        this.f = false;
        fvm fvmVar = this.i;
        if (fvmVar != null) {
            fvmVar.e(this.j, i);
        }
    }
}
