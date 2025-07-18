package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvl implements Runnable {
    private static final String a = gpn.a("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final grs d;
    private int e = 0;
    private final cb f;

    public gvl(Context context, grs grsVar) {
        this.c = context.getApplicationContext();
        this.d = grsVar;
        this.f = grsVar.j;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentB = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae A[Catch: SQLiteTableLockedException -> 0x0311, SQLiteFullException -> 0x0313, SQLiteDiskIOException -> 0x0315, SQLiteDatabaseLockedException -> 0x0317, SQLiteDatabaseCorruptException -> 0x0319, SQLiteConstraintException -> 0x031b, SQLiteCantOpenDatabaseException -> 0x031d, SQLiteAccessPermException -> 0x031f, all -> 0x0377, TRY_ENTER, TryCatch #14 {all -> 0x0377, blocks: (B:3:0x0006, B:5:0x0011, B:9:0x0022, B:11:0x0033, B:13:0x005f, B:14:0x009b, B:16:0x00a6, B:18:0x00b7, B:19:0x00bf, B:21:0x00c5, B:23:0x00dd, B:25:0x00e3, B:26:0x00f8, B:28:0x00fe, B:30:0x010b, B:29:0x0105, B:17:0x00ab, B:32:0x010f, B:33:0x0112, B:35:0x0128, B:37:0x012e, B:39:0x0135, B:41:0x013b, B:42:0x013f, B:44:0x0145, B:46:0x0151, B:47:0x0157, B:48:0x015f, B:49:0x0163, B:51:0x0169, B:53:0x0175, B:57:0x017f, B:63:0x019d, B:65:0x01a2, B:66:0x01a5, B:67:0x01a6, B:159:0x030d, B:160:0x0310, B:84:0x01f6, B:90:0x0202, B:92:0x0214, B:94:0x021e, B:96:0x023c, B:100:0x0247, B:103:0x0253, B:104:0x0256, B:106:0x025f, B:108:0x0265, B:110:0x026b, B:112:0x027b, B:113:0x027f, B:115:0x0285, B:117:0x0295, B:136:0x02c9, B:120:0x029e, B:130:0x02ae, B:135:0x02bf, B:193:0x0333, B:195:0x033c, B:199:0x0349, B:200:0x0356, B:201:0x0357, B:203:0x0360, B:123:0x02a4, B:206:0x0367, B:207:0x0376, B:6:0x0015), top: B:218:0x0006, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0245  */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvl.run():void");
    }
}
