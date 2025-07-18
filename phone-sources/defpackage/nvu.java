package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvu {
    public static Context g;
    public static volatile obt h;
    static final nvs a = new nvl(obp.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final nvs b = new nvm(obp.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final nvs c = new nvn(obp.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final nvs d = new nvo(obp.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final nvs e = new nvp(obp.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final nvs f = new nvq(obp.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    public static nvy a(nvw nvwVar) {
        if (nvwVar.a) {
            nvwVar.b();
            long j = nvwVar.e;
            return new nvy(true);
        }
        String str = nvwVar.b;
        if (nvwVar.a() == 4) {
            new PackageManager.NameNotFoundException();
        }
        nvwVar.b();
        nvwVar.a();
        return new nvy(false);
    }

    static synchronized void b(Context context) {
        if (g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            g = context.getApplicationContext();
        }
    }

    public static void c() {
        obt obtVar;
        if (h != null) {
            return;
        }
        ocv.aF(g);
        synchronized (i) {
            if (h == null) {
                IBinder iBinderC = odp.d(g, odp.b, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl");
                if (iBinderC == null) {
                    obtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    obtVar = iInterfaceQueryLocalInterface instanceof obt ? (obt) iInterfaceQueryLocalInterface : new obt(iBinderC);
                }
                h = obtVar;
            }
        }
    }

    @Deprecated
    public static nvy d(String str, obp obpVar, boolean z, boolean z2) {
        nvy nvyVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                c();
                ocv.aF(g);
                nvx nvxVar = new nvx(str, obpVar, z, z2);
                try {
                    obt obtVar = h;
                    odc odcVar = new odc(g.getPackageManager());
                    Parcel parcelK = obtVar.k();
                    ifl.c(parcelK, nvxVar);
                    ifl.e(parcelK, odcVar);
                    Parcel parcelL = obtVar.l(5, parcelK);
                    boolean zF = ifl.f(parcelL);
                    parcelL.recycle();
                    nvyVar = zF ? nvy.a : new nvy(false);
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    nvyVar = new nvy(false);
                }
            } catch (odl e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                e3.getMessage();
                nvyVar = new nvy(false);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return nvyVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
