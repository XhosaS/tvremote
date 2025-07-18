package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afg {
    public static Context g;
    static volatile aiv h;
    static final afe a = new aex(air.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final afe b = new aey(air.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final afe c = new aez(air.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final afe d = new afa(air.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final afe e = new afb(air.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final afe f = new afc(air.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    static synchronized void a(Context context) {
        if (g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            g = context.getApplicationContext();
        }
    }

    static void b() {
        aiv aivVar;
        if (h != null) {
            return;
        }
        qp.p(g);
        synchronized (i) {
            if (h == null) {
                Context context = g;
                int i2 = aki.b;
                IBinder iBinderB = aki.c(context, "com.google.android.gms.googlecertificates").b();
                if (iBinderB == null) {
                    aivVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    aivVar = iInterfaceQueryLocalInterface instanceof aiv ? (aiv) iInterfaceQueryLocalInterface : new aiv(iBinderB);
                }
                h = aivVar;
            }
        }
    }

    @Deprecated
    static afm c(String str, air airVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, airVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static afm d(final String str, final air airVar, final boolean z, boolean z2) {
        try {
            b();
            qp.p(g);
            afk afkVar = new afk(str, airVar, z, z2);
            try {
                aiv aivVar = h;
                ajx ajxVar = new ajx(g.getPackageManager());
                Parcel parcelC = aivVar.c();
                acl.c(parcelC, afkVar);
                parcelC.writeStrongBinder(ajxVar);
                Parcel parcelD = aivVar.d(5, parcelC);
                boolean zE = acl.e(parcelD);
                parcelD.recycle();
                return zE ? afm.a : new afl(new Callable() { // from class: aew
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws NoSuchAlgorithmException {
                        Context context = afg.g;
                        String str2 = str;
                        air airVar2 = airVar;
                        boolean z3 = z;
                        String str3 = (z3 || !afg.d(str2, airVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestA = ajp.a();
                        qp.p(messageDigestA);
                        byte[] bArrDigest = messageDigestA.digest(((afd) airVar2).a);
                        char[] cArr = ajr.a;
                        int length = bArrDigest.length;
                        char[] cArr2 = new char[length + length];
                        int i2 = 0;
                        for (byte b2 : bArrDigest) {
                            int i3 = i2 + 1;
                            char[] cArr3 = ajr.a;
                            cArr2[i2] = cArr3[(b2 & 255) >>> 4];
                            i2 += 2;
                            cArr2[i3] = cArr3[b2 & 15];
                        }
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, new String(cArr2), Boolean.valueOf(z3), "252315000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new afm(false, "module call", e2);
            }
        } catch (akf e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new afm(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
