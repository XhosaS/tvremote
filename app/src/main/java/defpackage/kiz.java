package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kiz {
    private static final Feature[] t = new Feature[0];
    kju a;
    public final Context b;
    public final kcy c;
    public final Handler d;
    public kit g;
    public final kip j;
    public final kiq k;
    public final int l;
    public volatile String m;
    public volatile kly n;
    public kkd s;
    private final kjp v;
    private IInterface w;
    private kiv x;
    private final String y;
    private volatile String u = null;
    public final Object e = new Object();
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();
    public int i = 1;
    public ConnectionResult o = null;
    public boolean p = false;
    public volatile ConnectionInfo q = null;
    public final AtomicInteger r = new AtomicInteger(0);

    protected kiz(Context context, Looper looper, kjp kjpVar, kcy kcyVar, int i, kip kipVar, kiq kiqVar, String str) {
        kkk.l(context, "Context must not be null");
        this.b = context;
        kkk.l(looper, "Looper must not be null");
        kkk.l(kjpVar, "Supervisor must not be null");
        this.v = kjpVar;
        kkk.l(kcyVar, "API availability must not be null");
        this.c = kcyVar;
        this.d = new kir(this, looper);
        this.l = i;
        this.j = kipVar;
        this.k = kiqVar;
        this.y = str;
    }

    protected void A(int i, IBinder iBinder, Bundle bundle, int i2) {
        kix kixVar = new kix(this, i, iBinder, bundle);
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, kixVar));
    }

    protected final void B(int i, Bundle bundle, int i2) {
        kiy kiyVar = new kiy(this, i, bundle);
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, kiyVar));
    }

    public final void C(int i, IInterface iInterface) {
        kju kjuVar;
        kkk.a((i == 4) == (iInterface != null));
        synchronized (this.e) {
            this.i = i;
            this.w = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                kiv kivVar = this.x;
                if (kivVar != null) {
                    kjp kjpVar = this.v;
                    kju kjuVar2 = this.a;
                    String str = kjuVar2.a;
                    String str2 = kjuVar2.b;
                    int i2 = kjuVar2.c;
                    w();
                    kjpVar.e(str, kivVar, this.a.d);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                kiv kivVar2 = this.x;
                if (kivVar2 != null && (kjuVar = this.a) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + kjuVar.a + " on " + kjuVar.b);
                    kjp kjpVar2 = this.v;
                    kju kjuVar3 = this.a;
                    String str3 = kjuVar3.a;
                    String str4 = kjuVar3.b;
                    int i3 = kjuVar3.c;
                    w();
                    kjpVar2.e(str3, kivVar2, this.a.d);
                    this.r.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.r;
                kiv kivVar3 = new kiv(this, atomicInteger.get());
                this.x = kivVar3;
                kju kjuVar4 = new kju(d(), f());
                this.a = kjuVar4;
                if (kjuVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(kjuVar4.a));
                }
                kjp kjpVar3 = this.v;
                String str5 = kjuVar4.a;
                String str6 = kjuVar4.b;
                int i4 = kjuVar4.c;
                String strW = w();
                boolean z = this.a.d;
                I();
                ConnectionResult connectionResultA = kjpVar3.a(new kjo(str5, z), kivVar3, strW, null);
                if (!connectionResultA.c()) {
                    kju kjuVar5 = this.a;
                    Log.w("GmsClient", "unable to connect to service: " + kjuVar5.a + " on " + kjuVar5.b);
                    int i5 = connectionResultA.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    PendingIntent pendingIntent = connectionResultA.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    B(i5, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                kkk.k(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final boolean D(int i, int i2, IInterface iInterface) {
        synchronized (this.e) {
            if (this.i != i) {
                return false;
            }
            C(i2, iInterface);
            return true;
        }
    }

    public final boolean E() {
        return this.q != null;
    }

    public boolean F() {
        return false;
    }

    public Feature[] G() {
        return t;
    }

    protected void H() {
        System.currentTimeMillis();
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public boolean e() {
        return false;
    }

    protected boolean f() {
        return a() >= 211700000;
    }

    public Feature[] g() {
        return t;
    }

    public final String h() {
        kju kjuVar;
        if (!m() || (kjuVar = this.a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return kjuVar.b;
    }

    public final String i() {
        return this.u;
    }

    public final void k(kit kitVar) {
        this.g = kitVar;
        C(2, null);
    }

    public final void l(String str) {
        this.u = str;
        z();
    }

    public final boolean m() {
        boolean z;
        synchronized (this.e) {
            z = this.i == 4;
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this.e) {
            int i = this.i;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean o() {
        return false;
    }

    public final Feature[] p() {
        ConnectionInfo connectionInfo = this.q;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void q(kgp kgpVar) {
        kgpVar.a.l.o.post(new kgo(kgpVar));
    }

    public final void s(kjw kjwVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleU = u();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.n == null || (attributionSource = this.n.a) == null || attributionSource.getAttributionTag() == null) ? this.m : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.l;
        int i2 = kcy.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = bundleU;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = accountT;
            if (kjwVar != null) {
                getServiceRequest.g = kjwVar.mRemote;
            }
        } else if (F()) {
            getServiceRequest.j = t();
        }
        getServiceRequest.k = G();
        getServiceRequest.l = g();
        if (e()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.f) {
                kkd kkdVar = this.s;
                if (kkdVar != null) {
                    kiu kiuVar = new kiu(this, this.r.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(kiuVar);
                        parcelObtain.writeInt(1);
                        kjk.a(getServiceRequest, parcelObtain, 0);
                        kkdVar.a.transact(46, parcelObtain, parcelObtain2, 0);
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
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(6, this.r.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A(8, null, null, this.r.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A(8, null, null, this.r.get());
        }
    }

    public Account t() {
        return null;
    }

    protected Bundle u() {
        return new Bundle();
    }

    public final IInterface v() {
        IInterface iInterface;
        synchronized (this.e) {
            if (this.i == 5) {
                throw new DeadObjectException();
            }
            y();
            iInterface = this.w;
            kkk.l(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String w() {
        String str = this.y;
        return str == null ? this.b.getClass().getName() : str;
    }

    protected Set x() {
        return Collections.EMPTY_SET;
    }

    protected final void y() {
        if (!m()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void z() {
        this.r.incrementAndGet();
        ArrayList arrayList = this.h;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kis) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.f) {
            this.s = null;
        }
        C(1, null);
    }

    protected void I() {
    }

    public final void r() {
    }
}
