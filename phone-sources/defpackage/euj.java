package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euj {
    public boolean a;
    final /* synthetic */ euk b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private boolean d;

    public euj(euk eukVar) {
        this.b = eukVar;
    }

    public final void a() {
        if (this.a) {
            d();
        }
    }

    public final void b() {
        this.d = true;
        d();
    }

    public final void c() {
        this.d = false;
        this.c.removeCallbacksAndMessages(null);
    }

    public final void d() {
        euk eukVar = this.b;
        eui euiVar = eukVar.e;
        euiVar.getClass();
        euc eucVar = euiVar.a;
        List list = eucVar.l;
        int i = eucVar.j;
        Notification notificationP = eukVar.p(list);
        if (this.a) {
            ((NotificationManager) this.b.getSystemService("notification")).notify(1, notificationP);
        } else {
            String str = edt.a;
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    eukVar.startForeground(1, notificationP, 1);
                } catch (RuntimeException e) {
                    edb.c("Util", "The service must be declared with a foregroundServiceType that includes dataSync");
                    throw e;
                }
            } else {
                eukVar.startForeground(1, notificationP);
            }
            this.a = true;
        }
        if (this.d) {
            Handler handler = this.c;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new emy(this, 8), 2000L);
        }
    }
}
