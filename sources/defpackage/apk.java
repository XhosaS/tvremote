package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apk {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(apa apaVar, apl aplVar) {
        final ExecutorService threadPoolExecutor;
        Context context = apaVar.a;
        final alh alhVar = new alh(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (aplVar.a == null) {
            try {
                aplVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                aplVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        final int iIntValue = ((Integer) aplVar.a).intValue();
        final String[] strArr = c;
        ahq ahqVar = new ahq();
        ahqVar.a = new aho() { // from class: ale
            @Override // defpackage.aho
            public final void a(Object obj, Object obj2) {
                int i = alh.a;
                ane aneVar = new ane((adx) obj2, 1);
                alj aljVar = (alj) ((alk) obj).t();
                Parcel parcelC = aljVar.c();
                int i2 = acl.a;
                parcelC.writeStrongBinder(aneVar);
                parcelC.writeString(strConcat);
                parcelC.writeInt(iIntValue);
                parcelC.writeStringArray(strArr);
                parcelC.writeByteArray(null);
                aljVar.e(1, parcelC);
            }
        };
        ami amiVarC = alhVar.c(ahqVar.a());
        if (apd.a(apaVar.a)) {
            qr qrVar = akm.a;
            threadPoolExecutor = qr.g(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = apo.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            dnx.bJ(0);
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, new cjm(Executors.defaultThreadFactory(), new AtomicLong(0L)), apo.a);
        }
        try {
            amiVarC.i(threadPoolExecutor, new amg() { // from class: api
                @Override // defpackage.amg
                public final void a(Object obj) throws PackageManager.NameNotFoundException {
                    ami amiVarC2;
                    boolean z = apk.a;
                    alh alhVar2 = alhVar;
                    int iC = aev.c.c(alhVar2.b, 12451000);
                    String str = strConcat;
                    if (iC == 0) {
                        ahq ahqVar2 = new ahq();
                        ahqVar2.a = new alc(str, 3);
                        amiVarC2 = alhVar2.c(ahqVar2.a());
                    } else {
                        afy afyVar = new afy(new Status(16));
                        amn amnVar = new amn();
                        amnVar.k(afyVar);
                        amiVarC2 = amnVar;
                    }
                    amiVarC2.h(threadPoolExecutor, new apj(str, 0));
                }
            });
            amiVarC.h(threadPoolExecutor, new apj(strConcat, 1));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
