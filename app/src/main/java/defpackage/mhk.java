package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhk {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(mgy mgyVar, mhl mhlVar) {
        final ExecutorService threadPoolExecutor;
        mgw mgwVar = (mgw) mgyVar;
        Context context = mgwVar.a;
        final lsd lsdVar = new lsd(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (mhlVar.a == null) {
            try {
                mhlVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                mhlVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        lvf lvfVarK = lsdVar.k(strConcat, mhlVar.a.intValue(), c, null);
        if (mha.a(mgwVar.a)) {
            threadPoolExecutor = kor.a.a(10, Executors.defaultThreadFactory());
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = mho.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            zyw zywVar = new zyw();
            zywVar.b("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, zyw.a(zywVar), mho.a);
        }
        try {
            lvfVarK.n(threadPoolExecutor, new lva() { // from class: mhh
                @Override // defpackage.lva
                public final void d(Object obj) {
                    boolean z = mhk.a;
                    lsd lsdVar2 = lsdVar;
                    final String str = strConcat;
                    lsdVar2.p(str).m(threadPoolExecutor, new lux() { // from class: mhj
                        @Override // defpackage.lux
                        public final void c(Exception exc) {
                            boolean z2 = mhk.a;
                            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", str, exc));
                        }
                    });
                }
            });
            lvfVarK.m(threadPoolExecutor, new lux() { // from class: mhi
                @Override // defpackage.lux
                public final void c(Exception exc) {
                    boolean z = mhk.a;
                    Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", strConcat, exc));
                }
            });
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
