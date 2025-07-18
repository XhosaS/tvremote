package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aan extends zl implements aaj {
    final /* synthetic */ aao a;
    private final String b;
    private final String c;
    private final zm d;
    private boolean e;
    private int f = -1;
    private int g;
    private aai h;
    private int i;

    public aan(aao aaoVar, String str, String str2, zm zmVar) {
        this.a = aaoVar;
        this.b = str;
        this.c = str2;
        this.d = zmVar;
    }

    @Override // defpackage.zl
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.zl
    public final void b(int i) throws RemoteException {
        aai aaiVar = this.h;
        if (aaiVar != null) {
            aaiVar.d(this.i, i);
        } else {
            this.f = i;
            this.g = 0;
        }
    }

    @Override // defpackage.zl
    public final void c(int i) throws RemoteException {
        aai aaiVar = this.h;
        if (aaiVar != null) {
            aaiVar.f(this.i, i);
        } else {
            this.g += i;
        }
    }

    @Override // defpackage.aaj
    public final int d() {
        return this.i;
    }

    @Override // defpackage.aaj
    public final void e(aai aaiVar) throws RemoteException {
        this.h = aaiVar;
        int i = aaiVar.d;
        aaiVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.b);
        bundle.putString("routeGroupId", this.c);
        bundle.putParcelable("routeControllerOptions", this.d.b);
        int i2 = aaiVar.c;
        aaiVar.c = i2 + 1;
        aaiVar.g(3, i2, i, null, bundle);
        this.i = i;
        if (this.e) {
            aaiVar.b(i);
            int i3 = this.f;
            if (i3 >= 0) {
                aaiVar.d(this.i, i3);
                this.f = -1;
            }
            int i4 = this.g;
            if (i4 != 0) {
                aaiVar.f(this.i, i4);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.aaj
    public final void f() throws RemoteException {
        aai aaiVar = this.h;
        if (aaiVar != null) {
            aaiVar.a(this.i);
            this.h = null;
            this.i = 0;
        }
    }

    @Override // defpackage.zl
    public final void g() throws RemoteException {
        this.e = true;
        aai aaiVar = this.h;
        if (aaiVar != null) {
            aaiVar.b(this.i);
        }
    }

    @Override // defpackage.zl
    public final void h() {
        i(0);
    }

    @Override // defpackage.zl
    public final void i(int i) throws RemoteException {
        this.e = false;
        aai aaiVar = this.h;
        if (aaiVar != null) {
            aaiVar.e(this.i, i);
        }
    }
}
