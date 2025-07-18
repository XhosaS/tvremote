package defpackage;

import android.accounts.Account;
import android.app.NotificationManager;
import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipl implements ipm {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/notification/ProactiveBitNotificationHelper");
    public static final Duration b;
    public final Context c;
    public final iax d;
    public final fda e;
    public final ahbt f;
    public final gtu g;
    public final NotificationManager h;
    public final fus i;
    private final gph j;
    private final ipk k;

    static {
        Duration durationOfDays = Duration.ofDays(14L);
        durationOfDays.getClass();
        b = durationOfDays;
    }

    public ipl(Context context, iax iaxVar, fda fdaVar, ahbt ahbtVar, gph gphVar, gtu gtuVar, NotificationManager notificationManager, fus fusVar) {
        context.getClass();
        iaxVar.getClass();
        fdaVar.getClass();
        ahbtVar.getClass();
        gtuVar.getClass();
        this.c = context;
        this.d = iaxVar;
        this.e = fdaVar;
        this.f = ahbtVar;
        this.j = gphVar;
        this.g = gtuVar;
        this.h = notificationManager;
        this.i = fusVar;
        this.k = new ipk(this);
    }

    @Override // defpackage.ipm
    public final void a() {
        gph gphVar = this.j;
        if (gphVar == gph.b || gphVar == gph.c) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/setup/notification/ProactiveBitNotificationHelper", "triggerProactiveBitNotification", 98, "ProactiveBitNotificationHelper.kt")).u("skip triggering proactive bit notification because non Amati device");
            return;
        }
        Account accountC = this.g.c();
        if (accountC == null) {
            return;
        }
        String str = accountC.type;
        yme ymeVar = yme.a;
        ymd ymdVar = new ymd();
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        yme ymeVar2 = (yme) ymdVar.b;
        ymeVar2.b |= 512;
        ymeVar2.i = true;
        abxd abxdVarV = ymdVar.v();
        abxdVarV.getClass();
        this.d.m(accountC, (yme) abxdVarV, this.k, "FloresProactiveBitNotification");
    }
}
