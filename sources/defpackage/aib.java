package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aib {
    private static final aes[] s = new aes[0];
    aio a;
    public final Context b;
    final Handler c;
    protected ahw f;
    public final int i;
    public volatile String j;
    public aiu o;
    public volatile adx p;
    public final byj q;
    public final byj r;
    private final ail u;
    private IInterface v;
    private ahx w;
    private final String x;
    private volatile String t = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public aeq k = null;
    public boolean l = false;
    public volatile aif m = null;
    protected final AtomicInteger n = new AtomicInteger(0);

    protected aib(Context context, Looper looper, ail ailVar, aev aevVar, int i, byj byjVar, byj byjVar2, String str) {
        qp.q(context, "Context must not be null");
        this.b = context;
        qp.q(looper, "Looper must not be null");
        qp.q(ailVar, "Supervisor must not be null");
        this.u = ailVar;
        qp.q(aevVar, "API availability must not be null");
        this.c = new ahu(this, looper);
        this.i = i;
        this.r = byjVar;
        this.q = byjVar2;
        this.x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i, IInterface iInterface) {
        aeq aeqVarD;
        aio aioVar;
        qp.j((i == 4) == (iInterface != null));
        synchronized (this.d) {
            this.h = i;
            this.v = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                ahx ahxVar = this.w;
                if (ahxVar != null) {
                    ail ailVar = this.u;
                    aio aioVar2 = this.a;
                    String str = aioVar2.a;
                    String str2 = aioVar2.b;
                    int i2 = aioVar2.c;
                    E();
                    ailVar.a(str, ahxVar, this.a.d);
                    this.w = null;
                }
            } else if (i == 2 || i == 3) {
                ahx ahxVar2 = this.w;
                if (ahxVar2 != null && (aioVar = this.a) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + aioVar.a + " on " + aioVar.b);
                    ail ailVar2 = this.u;
                    aio aioVar3 = this.a;
                    String str3 = aioVar3.a;
                    String str4 = aioVar3.b;
                    int i3 = aioVar3.c;
                    E();
                    ailVar2.a(str3, ahxVar2, this.a.d);
                    this.n.incrementAndGet();
                }
                ahx ahxVar3 = new ahx(this, this.n.get());
                this.w = ahxVar3;
                aio aioVar4 = new aio(d(), y());
                this.a = aioVar4;
                if (aioVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(aioVar4.a));
                }
                ail ailVar3 = this.u;
                String str5 = aioVar4.a;
                String str6 = aioVar4.b;
                int i4 = aioVar4.c;
                E();
                boolean z = this.a.d;
                D();
                aik aikVar = new aik(str5, z);
                HashMap map = ailVar3.c;
                synchronized (map) {
                    aim aimVar = (aim) map.get(aikVar);
                    Executor executor = ailVar3.g;
                    if (aimVar == null) {
                        aimVar = new aim(ailVar3, aikVar);
                        aimVar.c(ahxVar3, ahxVar3);
                        aeqVarD = aimVar.d();
                        map.put(aikVar, aimVar);
                    } else {
                        ailVar3.e.removeMessages(0, aikVar);
                        if (aimVar.a(ahxVar3)) {
                            throw new IllegalStateException(b.g(aikVar.a, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                        }
                        aimVar.c(ahxVar3, ahxVar3);
                        int i5 = aimVar.b;
                        if (i5 == 1) {
                            ahxVar3.onServiceConnected(aimVar.f, aimVar.d);
                        } else if (i5 == 2) {
                            aeqVarD = aimVar.d();
                        }
                        aeqVarD = null;
                    }
                    if (aimVar.c) {
                        aeqVarD = aeq.a;
                    } else if (aeqVarD == null) {
                        aeqVarD = new aeq(-1);
                    }
                }
                if (!aeqVarD.c()) {
                    aio aioVar5 = this.a;
                    Log.w("GmsClient", "unable to connect to service: " + aioVar5.a + " on " + aioVar5.b);
                    int i6 = aeqVarD.c;
                    if (i6 == -1) {
                        i6 = 16;
                    }
                    PendingIntent pendingIntent = aeqVarD.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    w(i6, bundle, this.n.get());
                }
            } else if (i == 4) {
                qp.p(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public boolean A() {
        return false;
    }

    public aes[] B() {
        throw null;
    }

    protected void D() {
        throw null;
    }

    protected final void E() {
        if (this.x == null) {
            this.b.getClass().getName();
        }
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public aes[] e() {
        return s;
    }

    public final String f() {
        return this.t;
    }

    public final void h(ahw ahwVar) {
        this.f = ahwVar;
        G(2, null);
    }

    public final void i(String str) {
        this.t = str;
        u();
    }

    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean l() {
        return false;
    }

    public final aes[] m() {
        aif aifVar = this.m;
        if (aifVar == null) {
            return null;
        }
        return aifVar.b;
    }

    public final void n() {
        if (!j() || this.a == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void p(aip aipVar, Set set) {
        Object obj;
        Bundle bundleS = s();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.p == null || (obj = this.p.a) == null || gh$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag() == null) ? this.j : gh$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
        String str = attributionTag;
        int i = this.i;
        int i2 = aev.b;
        Scope[] scopeArr = aii.a;
        Bundle bundle = new Bundle();
        aes[] aesVarArr = aii.b;
        aii aiiVar = new aii(6, i, i2, null, null, scopeArr, bundle, null, aesVarArr, aesVarArr, true, 0, false, str);
        aiiVar.f = this.b.getPackageName();
        aiiVar.i = bundleS;
        if (set != null) {
            aiiVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            aiiVar.j = accountR;
            if (aipVar != null) {
                aiiVar.g = aipVar.a;
            }
        }
        aiiVar.k = B();
        aiiVar.l = e();
        if (A()) {
            aiiVar.o = true;
        }
        try {
            synchronized (this.e) {
                aiu aiuVar = this.o;
                if (aiuVar != null) {
                    ait aitVar = new ait(this, this.n.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(aitVar);
                        parcelObtain.writeInt(1);
                        afi.a(aiiVar, parcelObtain, 0);
                        aiuVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.n.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.n.get());
        }
    }

    public final void q(byj byjVar) {
        ((ahc) byjVar.a).i.k.post(new ki(byjVar, 20, null));
    }

    public Account r() {
        throw null;
    }

    protected Bundle s() {
        return new Bundle();
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            if (!j()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.v;
            qp.q(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    public void u() {
        this.n.incrementAndGet();
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahv) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.e) {
            this.o = null;
        }
        G(1, null);
    }

    protected final void v(int i, IBinder iBinder, Bundle bundle, int i2) {
        ahz ahzVar = new ahz(this, i, iBinder, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, ahzVar));
    }

    protected final void w(int i, Bundle bundle, int i2) {
        aia aiaVar = new aia(this, i, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, aiaVar));
    }

    public final boolean x(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            G(i2, iInterface);
            return true;
        }
    }

    protected boolean y() {
        return false;
    }

    public final boolean z() {
        return this.m != null;
    }

    public final void o() {
    }
}
