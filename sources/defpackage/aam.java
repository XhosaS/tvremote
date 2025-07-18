package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aam extends zi implements aaj {
    final /* synthetic */ aao a;
    private final String b;
    private final zm c;
    private boolean d;
    private int f;
    private aai g;
    private int e = -1;
    private int h = -1;

    public aam(aao aaoVar, String str, zm zmVar) {
        this.a = aaoVar;
        this.b = str;
        this.c = zmVar;
    }

    @Override // defpackage.zl
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.zl
    public final void b(int i) throws RemoteException {
        aai aaiVar = this.g;
        if (aaiVar != null) {
            aaiVar.d(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.zl
    public final void c(int i) throws RemoteException {
        aai aaiVar = this.g;
        if (aaiVar != null) {
            aaiVar.f(this.h, i);
        } else {
            this.f += i;
        }
    }

    @Override // defpackage.aaj
    public final int d() {
        return this.h;
    }

    @Override // defpackage.aaj
    public final void e(aai aaiVar) throws RemoteException {
        aal aalVar = new aal();
        this.g = aaiVar;
        int i = aaiVar.d;
        aaiVar.d = i + 1;
        int i2 = aaiVar.c;
        aaiVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.b);
        bundle.putParcelable("routeControllerOptions", this.c.b);
        aaiVar.g(11, i2, i, null, bundle);
        aaiVar.g.put(i2, aalVar);
        this.h = i;
        if (this.d) {
            aaiVar.b(i);
            int i3 = this.e;
            if (i3 >= 0) {
                aaiVar.d(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                aaiVar.f(this.h, i4);
                this.f = 0;
            }
        }
    }

    @Override // defpackage.aaj
    public final void f() throws RemoteException {
        aai aaiVar = this.g;
        if (aaiVar != null) {
            aaiVar.a(this.h);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.zl
    public final void g() throws RemoteException {
        this.d = true;
        aai aaiVar = this.g;
        if (aaiVar != null) {
            aaiVar.b(this.h);
        }
    }

    @Override // defpackage.zl
    public final void h() {
        i(0);
    }

    @Override // defpackage.zl
    public final void i(int i) throws RemoteException {
        this.d = false;
        aai aaiVar = this.g;
        if (aaiVar != null) {
            aaiVar.e(this.h, i);
        }
    }
}
