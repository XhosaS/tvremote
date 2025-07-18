package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
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
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oat {
    private static final nvg[] a = new nvg[0];
    public final int C;
    public volatile String D;
    public obs I;
    public final pku J;
    public final pku K;
    public volatile kwy L;
    private int b;
    private long c;
    private long d;
    private int e;
    private long f;
    private final obi h;
    private IInterface i;
    private oap j;
    private final String k;
    obk t;
    public final Context u;
    public final Looper v;
    final Handler w;
    protected oao z;
    private volatile String g = null;
    public final Object x = new Object();
    public final Object y = new Object();
    public final ArrayList A = new ArrayList();
    public int B = 1;
    public nve E = null;
    public boolean F = false;
    public volatile oax G = null;
    protected final AtomicInteger H = new AtomicInteger(0);

    protected oat(Context context, Looper looper, obi obiVar, nvk nvkVar, int i, pku pkuVar, pku pkuVar2, String str) {
        ocv.aG(context, "Context must not be null");
        this.u = context;
        ocv.aG(looper, "Looper must not be null");
        this.v = looper;
        ocv.aG(obiVar, "Supervisor must not be null");
        this.h = obiVar;
        ocv.aG(nvkVar, "API availability must not be null");
        this.w = new oam(this, looper);
        this.C = i;
        this.K = pkuVar;
        this.J = pkuVar2;
        this.k = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i, IInterface iInterface) {
        obk obkVar;
        a.H((i == 4) == (iInterface != null));
        synchronized (this.x) {
            this.B = i;
            this.i = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                oap oapVar = this.j;
                if (oapVar != null) {
                    obi obiVar = this.h;
                    obk obkVar2 = this.t;
                    Object obj = obkVar2.c;
                    Object obj2 = obkVar2.d;
                    int i2 = obkVar2.a;
                    M();
                    obiVar.e((String) obj, oapVar, this.t.b);
                    this.j = null;
                }
            } else if (i == 2 || i == 3) {
                oap oapVar2 = this.j;
                if (oapVar2 != null && (obkVar = this.t) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) obkVar.c) + " on " + ((String) obkVar.d));
                    obi obiVar2 = this.h;
                    obk obkVar3 = this.t;
                    Object obj3 = obkVar3.c;
                    Object obj4 = obkVar3.d;
                    int i3 = obkVar3.a;
                    M();
                    obiVar2.e((String) obj3, oapVar2, this.t.b);
                    this.H.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.H;
                oap oapVar3 = new oap(this, atomicInteger.get());
                this.j = oapVar3;
                obk obkVar4 = new obk(d(), e());
                this.t = obkVar4;
                if (obkVar4.b && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) obkVar4.c));
                }
                obi obiVar3 = this.h;
                Object obj5 = obkVar4.c;
                Object obj6 = obkVar4.d;
                int i4 = obkVar4.a;
                String strM = M();
                boolean z = this.t.b;
                X();
                nve nveVarD = obiVar3.d(new obh((String) obj5, z), oapVar3, strM);
                if (!nveVarD.c()) {
                    obk obkVar5 = this.t;
                    Log.w("GmsClient", "unable to connect to service: " + ((String) obkVar5.c) + " on " + ((String) obkVar5.d));
                    int i5 = nveVarD.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    PendingIntent pendingIntent = nveVarD.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    Q(i5, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                ocv.aF(iInterface);
                O(iInterface);
            }
        }
    }

    public final void B(oao oaoVar) {
        ocv.aG(oaoVar, "Connection progress callbacks cannot be null.");
        this.z = oaoVar;
        m(2, null);
    }

    public final void C(String str) {
        this.g = str;
        n();
    }

    public final boolean D() {
        boolean z;
        synchronized (this.x) {
            z = this.B == 4;
        }
        return z;
    }

    public final boolean E() {
        boolean z;
        synchronized (this.x) {
            int i = this.B;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean F() {
        return true;
    }

    public final nvg[] G() {
        oax oaxVar = this.G;
        if (oaxVar == null) {
            return null;
        }
        return oaxVar.b;
    }

    public final void H(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        obs obsVar;
        synchronized (this.x) {
            i = this.B;
            iInterface = this.i;
        }
        synchronized (this.y) {
            obsVar = this.I;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) c()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (obsVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(obsVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.d > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.d;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.b;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.c;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.f > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) ocv.aM(this.e));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public final void I(obm obmVar, Set set) {
        Object obj;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.L == null || (obj = this.L.a) == null || elk$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag() == null) ? this.D : elk$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
        String str = attributionTag;
        int i = this.C;
        int i2 = nvk.c;
        Scope[] scopeArr = obc.a;
        Bundle bundle = new Bundle();
        nvg[] nvgVarArr = obc.b;
        obc obcVar = new obc(6, i, i2, null, null, scopeArr, bundle, null, nvgVarArr, nvgVarArr, true, 0, false, str);
        obcVar.f = this.u.getPackageName();
        obcVar.i = bundleH;
        if (set != null) {
            obcVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (i()) {
            Account accountK = K();
            if (accountK == null) {
                accountK = new Account("<<default account>>", "com.google");
            }
            obcVar.j = accountK;
            if (obmVar != null) {
                obcVar.g = obmVar.a;
            }
        } else if (U()) {
            obcVar.j = K();
        }
        obcVar.k = V();
        obcVar.l = g();
        if (f()) {
            obcVar.o = true;
        }
        try {
            synchronized (this.y) {
                obs obsVar = this.I;
                if (obsVar != null) {
                    obr obrVar = new obr(this, this.H.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(obrVar);
                        parcelObtain.writeInt(1);
                        obd.a(obcVar, parcelObtain, 0);
                        obsVar.a.transact(46, parcelObtain, parcelObtain2, 0);
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
            R(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            p(8, null, null, this.H.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            p(8, null, null, this.H.get());
        }
    }

    public final void J(pku pkuVar) {
        ((nzd) pkuVar.a).k.o.post(new nur(pkuVar, 7, null));
    }

    public Account K() {
        throw null;
    }

    public final IInterface L() {
        IInterface iInterface;
        synchronized (this.x) {
            if (this.B == 5) {
                throw new DeadObjectException();
            }
            N();
            iInterface = this.i;
            ocv.aG(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String M() {
        String str = this.k;
        return str == null ? this.u.getClass().getName() : str;
    }

    public final void N() {
        if (!D()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected void O(IInterface iInterface) {
        this.d = System.currentTimeMillis();
    }

    protected void P(int i) {
        this.b = i;
        this.c = System.currentTimeMillis();
    }

    protected final void Q(int i, Bundle bundle, int i2) {
        oas oasVar = new oas(this, i, bundle);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, oasVar));
    }

    public final void R(int i) {
        int i2 = this.H.get();
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    public final boolean S(int i, int i2, IInterface iInterface) {
        synchronized (this.x) {
            if (this.B != i) {
                return false;
            }
            m(i2, iInterface);
            return true;
        }
    }

    public final boolean T() {
        return this.G != null;
    }

    public boolean U() {
        return false;
    }

    public nvg[] V() {
        throw null;
    }

    protected void X() {
        throw null;
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    protected boolean e() {
        return a() >= 211700000;
    }

    public boolean f() {
        return false;
    }

    public nvg[] g() {
        return a;
    }

    protected Bundle h() {
        return new Bundle();
    }

    public boolean i() {
        return false;
    }

    public Intent j() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean k() {
        return false;
    }

    public Bundle l() {
        return null;
    }

    public void n() {
        this.H.incrementAndGet();
        ArrayList arrayList = this.A;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oan) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.y) {
            this.I = null;
        }
        m(1, null);
    }

    protected void o(nve nveVar) {
        this.e = nveVar.c;
        this.f = System.currentTimeMillis();
    }

    protected void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        oar oarVar = new oar(this, i, iBinder, bundle);
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, oarVar));
    }

    public final String y() {
        obk obkVar;
        if (!D() || (obkVar = this.t) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) obkVar.d;
    }

    public final String z() {
        return this.g;
    }
}
