package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ehq implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ ehq(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        int i2 = 0;
        if (i == 1) {
            kc kcVar = cbc.M;
            synchronized (kcVar) {
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = kcVar.a;
                    int i3 = kcVar.b;
                    while (i2 < i3) {
                        cbc cbcVar = (cbc) objArr[i2];
                        boolean zA = cbcVar.A();
                        cbcVar.x = cbp.F();
                        if (zA != cbcVar.A()) {
                            cbcVar.G();
                        }
                        i2++;
                    }
                } else {
                    Object[] objArr2 = kcVar.a;
                    int i4 = kcVar.b;
                    while (i2 < i4) {
                        ((cbc) objArr2[i2]).G();
                        i2++;
                    }
                }
            }
            return;
        }
        if (i == 2) {
            int i5 = foo.y;
            return;
        }
        if (i == 3) {
            Executor executor = ksk.a;
            return;
        }
        if (i == 5) {
            System.exit(0);
            return;
        }
        if (i != 8) {
            switch (i) {
                case 15:
                    pku.k(tmg.FAILED);
                    return;
                case 16:
                    pku.k(tmg.COMPLETED);
                    return;
                case 17:
                    pku.k(tmg.SCANNING);
                    return;
                case 18:
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                default:
                    return;
            }
        }
        try {
            Thread.sleep(Math.max(0L, 600000L));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            synchronized (oqs.class) {
                Thread thread = oqs.b;
                if (thread != null && thread.isAlive()) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                    return;
                }
            }
        }
        oqs.b();
    }
}
