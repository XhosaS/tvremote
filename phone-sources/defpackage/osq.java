package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osq {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(osh oshVar, xzg xzgVar) {
        final ExecutorService threadPoolExecutor;
        jzs jzsVar = omg.a;
        Context context = oshVar.a;
        final omi omiVar = new omi(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (xzgVar.a == null) {
            try {
                xzgVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                xzgVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        onz onzVarD = omiVar.d(strConcat, ((Integer) xzgVar.a).intValue(), c);
        if (osk.d(oshVar.a)) {
            ocv ocvVar = ogg.a;
            threadPoolExecutor = ocv.p(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = ost.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            uie uieVar = new uie();
            uieVar.d("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, uie.b(uieVar), ost.a);
        }
        try {
            onzVarD.n(threadPoolExecutor, new onv() { // from class: osp
                @Override // defpackage.onv
                public final void e(Object obj) {
                    boolean z = osq.a;
                    omi omiVar2 = omiVar;
                    String str = strConcat;
                    omiVar2.b(str, "").m(threadPoolExecutor, new ofn(str, 5));
                }
            });
            onzVarD.m(threadPoolExecutor, new ofn(strConcat, 4));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
