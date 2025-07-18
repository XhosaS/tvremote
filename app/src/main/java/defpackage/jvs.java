package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvs {
    private static final Object g = new Object();
    private static volatile jvs h;
    kcq a;
    boolean b;
    final Object c = new Object();
    jvq d;
    final long e;
    jvw f;
    private final Context i;

    public jvs(Context context) {
        kkk.k(context);
        this.i = context.getApplicationContext();
        this.b = false;
        this.e = 30000L;
    }

    public static jvr c(Context context) {
        jvr jvrVar;
        jvs jvsVar = h;
        if (jvsVar == null) {
            synchronized (g) {
                jvsVar = h;
                if (jvsVar == null) {
                    Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                    jvsVar = new jvs(context);
                    h = jvsVar;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (jvu.a == null) {
            synchronized (jvu.b) {
                if (jvu.a == null) {
                    jvu.a = new jvu(context);
                }
            }
        }
        jvu jvuVar = jvu.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            kkk.e("Calling this from your main thread can lead to deadlock");
            synchronized (jvsVar) {
                jvsVar.b();
                kkk.k(jvsVar.a);
                kkk.k(jvsVar.f);
                try {
                    jvw jvwVar = jvsVar.f;
                    Parcel parcelB = jvwVar.b(1, jvwVar.a());
                    String string = parcelB.readString();
                    parcelB.recycle();
                    jvw jvwVar2 = jvsVar.f;
                    Parcel parcelA = jvwVar2.a();
                    ClassLoader classLoader = erv.a;
                    parcelA.writeInt(1);
                    Parcel parcelB2 = jvwVar2.b(2, parcelA);
                    boolean zD = erv.d(parcelB2);
                    parcelB2.recycle();
                    jvrVar = new jvr(string, zD);
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception", e);
                }
            }
            synchronized (jvsVar.c) {
                jvq jvqVar = jvsVar.d;
                if (jvqVar != null) {
                    jvqVar.a.countDown();
                    try {
                        jvsVar.d.join();
                    } catch (InterruptedException unused) {
                    }
                }
                long j = jvsVar.e;
                if (j > 0) {
                    jvsVar.d = new jvq(jvsVar, j);
                }
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            jvsVar.d(jvrVar, jElapsedRealtime2, null);
            jvuVar.a(0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
            return jvrVar;
        } catch (Throwable th) {
            jvsVar.d(null, -1L, th);
            jvuVar.a(th instanceof IOException ? 1 : !(th instanceof kdr) ? !(th instanceof kds) ? th instanceof IllegalStateException ? 8 : -1 : 16 : 9, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th;
        }
    }

    public final void a() {
        kkk.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.i;
            if (context == null || this.a == null) {
                return;
            }
            try {
                if (this.b) {
                    kle.a().b(context, this.a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.b = false;
            this.f = null;
            this.a = null;
        }
    }

    final synchronized void b() {
        if (!this.b) {
            try {
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                kkk.e("Calling this from your main thread can lead to deadlock");
                synchronized (this) {
                    if (!this.b) {
                        Context context = this.i;
                        try {
                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            int iG = kcy.d.g(context, 12451000);
                            if (iG != 0 && iG != 2) {
                                throw new IOException("Google Play services not available");
                            }
                            kcq kcqVar = new kcq();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (!kle.a().c(context, intent, kcqVar, 1)) {
                                    throw new IOException("Connection failure");
                                }
                                this.a = kcqVar;
                                try {
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    kkk.e("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (kcqVar.a) {
                                        throw new IllegalStateException("Cannot call get on this connection more than once");
                                    }
                                    kcqVar.a = true;
                                    IBinder iBinder = (IBinder) kcqVar.b.poll(10000L, timeUnit);
                                    if (iBinder == null) {
                                        throw new TimeoutException("Timed out waiting for the service connection");
                                    }
                                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    this.f = iInterfaceQueryLocalInterface instanceof jvw ? (jvw) iInterfaceQueryLocalInterface : new jvw(iBinder);
                                    this.b = true;
                                } catch (InterruptedException unused) {
                                    throw new IOException("Interrupted exception");
                                } catch (Throwable th) {
                                    throw new IOException(th);
                                }
                            } finally {
                                IOException iOException = new IOException(th);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            throw new kdr(9);
                        }
                    }
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.b) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
            } catch (Exception e) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    final void d(jvr jvrVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (jvrVar != null) {
                map.put("limit_ad_tracking", true != jvrVar.b ? "0" : "1");
                String str = jvrVar.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new jvp(map).start();
        }
    }

    protected final void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
