package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.cast.MediaInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uot implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ uot(Context context, boolean z, kwy kwyVar, int i) {
        this.d = i;
        this.b = context;
        this.a = z;
        this.c = kwyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        String strJ = null;
        if (i == 0) {
            Object obj = this.c;
            Object obj2 = this.b;
            try {
                if (uiv.r((Context) obj2)) {
                    SharedPreferences.Editor editorEdit = uiv.p((Context) obj2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) ((Context) obj2).getSystemService(NotificationManager.class);
                    if (this.a) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + ((Context) obj2).getPackageName());
                }
                return;
            } finally {
                ((kwy) obj).w(null);
            }
        }
        if (i != 1) {
            ((xxt) this.c).m.c(this.b, this.a);
            return;
        }
        Object obj3 = this.b;
        nzx nzxVar = (nzx) obj3;
        Object obj4 = nzxVar.e;
        mkr mkrVar = (mkr) obj4;
        nzx nzxVar2 = mkrVar.t;
        boolean z = this.a;
        Object obj5 = this.c;
        if (nzxVar2 != obj3 || mkrVar.n != 3) {
            ((mjw) obj4).o();
            return;
        }
        ieg iegVar = mkrVar.l;
        try {
            ldv ldvVar = ((mkr) obj4).r;
            ldvVar.m(ldvVar.j(iegVar));
            strJ = ldvVar.j(iegVar);
        } catch (ldt unused) {
        }
        try {
            Object obj6 = ((nzx) obj3).e;
            nma nmaVar = ((mkr) obj6).g;
            nwu nwuVar = ((mkr) obj6).h;
            nwuVar.b(new nlp(nmaVar, nwuVar, (MediaInfo) obj5, ((nzx) obj3).b, new lfi(ksh.d(strJ), z, false).a())).i(new mkk(obj3, 5));
        } catch (Exception unused2) {
            ((mjw) nzxVar.e).o();
        }
    }

    public /* synthetic */ uot(nzx nzxVar, MediaInfo mediaInfo, boolean z, int i) {
        this.d = i;
        this.b = nzxVar;
        this.c = mediaInfo;
        this.a = z;
    }

    public uot(xxt xxtVar, xvv xvvVar, boolean z, int i) {
        this.d = i;
        this.b = xvvVar;
        this.a = z;
        this.c = xxtVar;
    }
}
