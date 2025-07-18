package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.os.PowerManager;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljw implements Runnable {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/PinningTask");
    private static final idy k = new lyl(2);
    public final kuh b;
    public final lie c;
    public final mfm d = new mfm();
    public final ConditionVariable e = new ConditionVariable();
    public lji f;
    public volatile Thread g;
    public final lyz h;
    public final ljz i;
    public final isy j;
    private final mab l;
    private final Resources m;
    private final ContentResolver n;
    private final String o;
    private final ldv p;
    private final File q;
    private final idf r;
    private final lzh s;
    private final PowerManager.WakeLock t;
    private final WifiManager.WifiLock u;
    private final idf v;
    private final lux w;
    private final lqs x;
    private final lkq y;
    private final kuw z;

    public ljw(kuh kuhVar, PowerManager.WakeLock wakeLock, WifiManager.WifiLock wifiLock, ljz ljzVar, File file, Resources resources, ContentResolver contentResolver, lux luxVar, String str, kuw kuwVar, ldv ldvVar, lie lieVar, lyz lyzVar, mab mabVar, lqs lqsVar, idf idfVar, lzh lzhVar, isy isyVar, idf idfVar2, lkq lkqVar) {
        this.b = kuhVar;
        this.t = wakeLock;
        this.u = wifiLock;
        this.i = ljzVar;
        this.c = lieVar;
        this.l = mabVar;
        this.x = lqsVar;
        this.h = lyzVar;
        this.q = file;
        this.o = str;
        this.z = kuwVar;
        this.p = ldvVar;
        this.m = resources;
        this.n = contentResolver;
        this.r = idfVar;
        this.s = lzhVar;
        this.j = isyVar;
        this.v = idfVar2;
        this.w = luxVar;
        this.y = lkqVar;
    }

    final boolean a() {
        return mfm.b(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r1v18, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljw.run():void");
    }
}
