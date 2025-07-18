package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvs extends fup implements ServiceConnection {
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public fvm d;
    public boolean l;
    final ogh m;
    public pku n;
    private boolean o;

    public fvs(Context context, ComponentName componentName) {
        super(context, new fum(componentName));
        this.b = new ArrayList();
        this.a = componentName;
        this.m = new ogh((byte[]) null);
    }

    private final fun s(String str, String str2, fuo fuoVar) {
        fuq fuqVar = this.i;
        if (fuqVar == null) {
            return null;
        }
        List list = fuqVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((fug) list.get(i)).n().equals(str)) {
                fvr fvrVar = new fvr(this, str, str2, fuoVar);
                this.b.add(fvrVar);
                if (this.l) {
                    fvrVar.h(this.d);
                }
                q();
                return fvrVar;
            }
        }
        return null;
    }

    public final fvn a(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            fvn fvnVar = (fvn) arrayList.get(i2);
            i2++;
            if (fvnVar.g() == i) {
                return fvnVar;
            }
        }
        return null;
    }

    @Override // defpackage.fup
    public final fuk dx(String str, fuo fuoVar) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        fuq fuqVar = this.i;
        if (fuqVar != null) {
            List list = fuqVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((fug) list.get(i)).n().equals(str)) {
                    fvq fvqVar = new fvq(this, str, fuoVar);
                    this.b.add(fvqVar);
                    if (this.l) {
                        fvqVar.h(this.d);
                    }
                    q();
                    return fvqVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.fup
    public final fun dy(String str, fuo fuoVar) {
        if (str != null) {
            return s(str, null, fuoVar);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.fup
    public final fun dz(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return s(str, str2, fuo.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // defpackage.fup
    public final void e(fuh fuhVar) {
        if (this.l) {
            this.d.c(fuhVar);
        }
        q();
    }

    public final void f() {
        if (this.o) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.a);
        try {
            this.o = this.e.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final void g() {
        if (this.d != null) {
            dA(null);
            this.l = false;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fvn) arrayList.get(i)).k();
            }
            fvm fvmVar = this.d;
            fvmVar.g(2, 0, 0, null, null);
            fvmVar.b.a.clear();
            fvmVar.a.getBinder().unlinkToDeath(fvmVar, 0);
            fvmVar.h.m.post(new foe(fvmVar, 15, null));
            this.d = null;
        }
    }

    final void m(fvm fvmVar, fuq fuqVar) {
        if (this.d == fvmVar) {
            dA(fuqVar);
        }
    }

    final void n(fvn fvnVar) {
        this.b.remove(fvnVar);
        fvnVar.k();
        q();
    }

    public final void o() {
        if (this.c) {
            return;
        }
        this.c = true;
        q();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.o) {
            g();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        fvm fvmVar = new fvm(this, messenger);
                        int i = fvmVar.c;
                        fvmVar.c = i + 1;
                        fvmVar.f = i;
                        if (fvmVar.g(1, i, 4, null, null)) {
                            try {
                                fvmVar.a.getBinder().linkToDeath(fvmVar, 0);
                                this.d = fvmVar;
                                return;
                            } catch (RemoteException unused) {
                                fvmVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
            Log.e("MediaRouteProviderProxy", toString().concat(": Service returned invalid messenger binder"));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g();
    }

    public final void p() {
        if (this.o) {
            this.o = false;
            g();
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException e) {
                toString();
                Log.e("MediaRouteProviderProxy", toString().concat(": unbindService failed"), e);
            }
        }
    }

    public final void q() {
        if (r()) {
            f();
        } else {
            p();
        }
    }

    public final boolean r() {
        if (this.c) {
            return (this.g == null && this.b.isEmpty()) ? false : true;
        }
        return false;
    }

    public final String toString() {
        return "Service connection ".concat(String.valueOf(this.a.flattenToShortString()));
    }
}
