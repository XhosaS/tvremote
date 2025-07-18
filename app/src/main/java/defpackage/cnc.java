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
public class cnc implements Runnable {
    private static final String a = cbx.d("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final cfq d;
    private final cnk e;
    private int f = 0;

    public cnc(Context context, cfq cfqVar) {
        this.c = context.getApplicationContext();
        this.d = cfqVar;
        this.e = cfqVar.h;
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
    /* JADX WARN: Removed duplicated region for block: B:101:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1 A[Catch: SQLiteTableLockedException -> 0x0360, SQLiteFullException -> 0x0362, SQLiteDiskIOException -> 0x0364, SQLiteDatabaseLockedException -> 0x0366, SQLiteDatabaseCorruptException -> 0x0368, SQLiteConstraintException -> 0x036a, SQLiteCantOpenDatabaseException -> 0x036c, SQLiteAccessPermException -> 0x036e, all -> 0x03eb, TRY_ENTER, TryCatch #6 {all -> 0x03eb, blocks: (B:3:0x0008, B:5:0x0015, B:9:0x0040, B:11:0x0052, B:14:0x007b, B:16:0x0083, B:17:0x00c0, B:19:0x00cb, B:21:0x00dc, B:22:0x00e4, B:24:0x00ea, B:26:0x0102, B:28:0x0108, B:29:0x011b, B:31:0x0121, B:33:0x0134, B:32:0x012a, B:20:0x00d0, B:35:0x013c, B:36:0x0147, B:38:0x015d, B:40:0x0163, B:42:0x016a, B:44:0x0170, B:45:0x0174, B:47:0x017a, B:49:0x0186, B:50:0x018c, B:51:0x0194, B:52:0x0198, B:54:0x019e, B:56:0x01aa, B:60:0x01bc, B:66:0x01dd, B:68:0x01e2, B:69:0x01e5, B:70:0x01e6, B:162:0x035c, B:163:0x035f, B:87:0x0238, B:93:0x0244, B:95:0x0254, B:97:0x025e, B:99:0x0280, B:103:0x028b, B:106:0x0297, B:107:0x029a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b0, B:115:0x02be, B:116:0x02c2, B:118:0x02c8, B:120:0x02d8, B:139:0x0312, B:123:0x02e1, B:133:0x02f1, B:138:0x0308, B:196:0x0382, B:198:0x038b, B:202:0x0398, B:203:0x03ab, B:204:0x03ac, B:206:0x03ce, B:126:0x02e7, B:209:0x03d5, B:210:0x03ea, B:6:0x0021), top: B:221:0x0008, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Type inference failed for: r10v20, types: [cbx] */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.run():void");
    }
}
