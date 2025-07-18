package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class kdk {
    static final kdi a;
    static final kdi b;
    public static Context c;
    static volatile kke d;
    private static final Object e;

    static {
        new kda(kdg.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new kdb(kdg.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new kdc(kdg.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new kdd(kdg.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new kde(kdg.f("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new kdf(kdg.f("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    @Deprecated
    static kdp a(String str, kdg kdgVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, kdgVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static kdp b(final String str, final kdg kdgVar, final boolean z, boolean z2) {
        try {
            d();
            kkk.k(c);
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, kdgVar, z, z2);
            try {
                kke kkeVar = d;
                kmf kmfVar = new kmf(c.getPackageManager());
                Parcel parcelA = kkeVar.a();
                erv.b(parcelA, googleCertificatesQuery);
                erv.c(parcelA, kmfVar);
                Parcel parcelB = kkeVar.b(5, parcelA);
                boolean zD = erv.d(parcelB);
                parcelB.recycle();
                return zD ? kdp.a : new kdo(new Callable() { // from class: kcz
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws NoSuchAlgorithmException {
                        Context context = kdk.c;
                        String str2 = str;
                        kdg kdgVar2 = kdgVar;
                        boolean z3 = z;
                        String str3 = (z3 || !kdk.b(str2, kdgVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestA = klg.a("SHA-256");
                        kkk.k(messageDigestA);
                        byte[] bArrDigest = messageDigestA.digest(((kdh) kdgVar2).a);
                        char[] cArr = klo.a;
                        int length = bArrDigest.length;
                        char[] cArr2 = new char[length + length];
                        int i = 0;
                        for (byte b2 : bArrDigest) {
                            int i2 = i + 1;
                            char[] cArr3 = klo.b;
                            cArr2[i] = cArr3[(b2 & 255) >>> 4];
                            i += 2;
                            cArr2[i2] = cArr3[b2 & 15];
                        }
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, new String(cArr2), Boolean.valueOf(z3), "252525000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new kdp(false, "module call", e2);
            }
        } catch (kmr e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new kdp(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    static synchronized void c(Context context) {
        if (c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            c = context.getApplicationContext();
        }
    }

    static void d() {
        kke kkeVar;
        if (d != null) {
            return;
        }
        kkk.k(c);
        synchronized (e) {
            if (d == null) {
                IBinder iBinderC = kmv.d(c, kmv.d, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl");
                if (iBinderC == null) {
                    kkeVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    kkeVar = iInterfaceQueryLocalInterface instanceof kke ? (kke) iInterfaceQueryLocalInterface : new kke(iBinderC);
                }
                d = kkeVar;
            }
        }
    }
}
