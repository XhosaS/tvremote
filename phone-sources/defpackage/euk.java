package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.videos.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class euk extends Service {
    public static final HashMap a = new HashMap();
    public final euj b = new euj(this);
    public final String c = "kinetoscope_download";
    public final int d = R.string.download;
    public eui e;
    public boolean f;
    private int g;
    private boolean h;
    private boolean i;

    protected euk() {
    }

    public static Intent h(Context context, Class cls, String str) {
        return new Intent(context, (Class<?>) cls).setAction(str);
    }

    public static Intent i(Context context, Class cls, String str, boolean z) {
        return h(context, cls, str).putExtra("foreground", z);
    }

    public static void m(Context context, Intent intent, boolean z) {
        if (z) {
            edt.aD(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean n(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    protected abstract euc j();

    public final void k(List list) {
        euj eujVar = this.b;
        if (eujVar != null) {
            for (int i = 0; i < list.size(); i++) {
                if (n(((etn) list.get(i)).b)) {
                    eujVar.b();
                    return;
                }
            }
        }
    }

    public final void l() {
        euj eujVar = this.b;
        if (eujVar != null) {
            eujVar.c();
        }
        eui euiVar = this.e;
        euiVar.getClass();
        if (euiVar.h()) {
            if (Build.VERSION.SDK_INT >= 28 || !this.i) {
                this.f |= stopSelfResult(this.g);
            } else {
                stopSelf();
                this.f = true;
            }
        }
    }

    protected abstract euq o();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.c;
        if (str != null) {
            int i = this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                notificationManager.createNotificationChannel(new NotificationChannel(str, getString(i), 2));
            }
        }
        Class<?> cls = getClass();
        HashMap map = a;
        eui euiVar = (eui) map.get(cls);
        byte[] bArr = null;
        if (euiVar == null) {
            boolean z = this.b != null;
            euq euqVarO = (!z || Build.VERSION.SDK_INT >= 31) ? null : o();
            euc eucVarJ = j();
            eucVarJ.d();
            eui euiVar2 = new eui(getApplicationContext(), eucVarJ, z, euqVarO, cls);
            map.put(cls, euiVar2);
            euiVar = euiVar2;
        }
        this.e = euiVar;
        a.ab(euiVar.b == null);
        euiVar.b = this;
        if (euiVar.a.h) {
            edt.L().postAtFrontOfQueue(new eoy(euiVar, this, 8, bArr));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        eui euiVar = this.e;
        euiVar.getClass();
        a.ab(euiVar.b == this);
        euiVar.b = null;
        euj eujVar = this.b;
        if (eujVar != null) {
            eujVar.c();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euk.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.i = true;
    }

    protected abstract Notification p(List list);
}
