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
public final class aao extends zn implements ServiceConnection {
    public static final /* synthetic */ int o = 0;
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public aai d;
    public boolean e;
    final akn m;
    public byj n;
    private boolean p;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public aao(Context context, ComponentName componentName) {
        super(context, new zk(componentName));
        this.b = new ArrayList();
        this.a = componentName;
        this.m = new akn((byte[]) null);
    }

    private final zl r(String str, String str2, zm zmVar) {
        zo zoVar = this.j;
        if (zoVar == null) {
            return null;
        }
        List list = zoVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((zf) list.get(i)).n().equals(str)) {
                aan aanVar = new aan(this, str, str2, zmVar);
                this.b.add(aanVar);
                if (this.e) {
                    aanVar.e(this.d);
                }
                p();
                return aanVar;
            }
        }
        return null;
    }

    @Override // defpackage.zn
    public final zi C(String str, zm zmVar) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        zo zoVar = this.j;
        if (zoVar != null) {
            List list = zoVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zf) list.get(i)).n().equals(str)) {
                    aam aamVar = new aam(this, str, zmVar);
                    this.b.add(aamVar);
                    if (this.e) {
                        aamVar.e(this.d);
                    }
                    p();
                    return aamVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.zn
    public final zl D(String str, zm zmVar) {
        if (str != null) {
            return r(str, null, zmVar);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.zn
    public final zl E(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return r(str, str2, zm.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // defpackage.zn
    public final void d(zg zgVar) {
        if (this.e) {
            this.d.c(zgVar);
        }
        p();
    }

    public final aaj e(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            aaj aajVar = (aaj) arrayList.get(i2);
            i2++;
            if (aajVar.d() == i) {
                return aajVar;
            }
        }
        return null;
    }

    public final void f() {
        if (this.p) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.a);
        try {
            this.p = this.f.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final void k() {
        if (this.d != null) {
            F(null);
            this.e = false;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((aaj) arrayList.get(i)).f();
            }
            aai aaiVar = this.d;
            aaiVar.g(2, 0, 0, null, null);
            aaiVar.b.a.clear();
            aaiVar.a.getBinder().unlinkToDeath(aaiVar, 0);
            aaiVar.h.m.post(new ki(aaiVar, 16, null));
            this.d = null;
        }
    }

    final void l(aai aaiVar, zo zoVar) {
        if (this.d == aaiVar) {
            F(zoVar);
        }
    }

    final void m(aaj aajVar) {
        this.b.remove(aajVar);
        aajVar.f();
        p();
    }

    public final void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        p();
    }

    public final void o() {
        if (this.p) {
            this.p = false;
            k();
            try {
                this.f.unbindService(this);
            } catch (IllegalArgumentException e) {
                toString();
                Log.e("MediaRouteProviderProxy", toString().concat(": unbindService failed"), e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.p) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        aai aaiVar = new aai(this, messenger);
                        int i = aaiVar.c;
                        aaiVar.c = i + 1;
                        aaiVar.f = i;
                        if (aaiVar.g(1, i, 4, null, null)) {
                            try {
                                aaiVar.a.getBinder().linkToDeath(aaiVar, 0);
                                this.d = aaiVar;
                                return;
                            } catch (RemoteException unused) {
                                aaiVar.binderDied();
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
        k();
    }

    public final void p() {
        if (q()) {
            f();
        } else {
            o();
        }
    }

    public final boolean q() {
        if (this.c) {
            return (this.h == null && this.b.isEmpty()) ? false : true;
        }
        return false;
    }

    public final String toString() {
        return "Service connection ".concat(String.valueOf(this.a.flattenToShortString()));
    }
}
