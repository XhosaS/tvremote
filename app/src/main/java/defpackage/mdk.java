package defpackage;

import android.os.Build;
import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdk implements aejg {
    public static Looper b(Object obj, ThreadFactory threadFactory) {
        final zyu zyuVar = new zyu();
        new mcy(mdj.a("Lite", new meb(threadFactory)), ((mef) obj).a()).newThread(new Runnable() { // from class: mdg
            @Override // java.lang.Runnable
            public final void run() {
                zyu zyuVar2 = zyuVar;
                try {
                    Looper.prepare();
                    zyuVar2.p(Looper.myLooper());
                    Looper.loop();
                    if ("robolectric".equals(Build.FINGERPRINT)) {
                        return;
                    }
                    uea.a().post(new Runnable() { // from class: mdf
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException("Someone quit the @LightweightExecutor looper");
                        }
                    });
                } catch (Throwable th) {
                    zyuVar2.p(Looper.myLooper());
                    throw th;
                }
            }
        }).start();
        try {
            Looper looper = (Looper) zze.a(zyuVar);
            looper.getClass();
            return looper;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
