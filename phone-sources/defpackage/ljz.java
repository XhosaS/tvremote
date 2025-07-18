package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.util.Pair;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljz implements Handler.Callback, iej {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor");
    private final lzq A;
    private final lkq B;
    private final gb C;
    public final HandlerThread b;
    public final ids d;
    public final WifiManager.WifiLock e;
    public int f;
    public int g;
    private final Resources h;
    private final Handler i;
    private final SharedPreferences j;
    private final ieh k;
    private final ljn l;
    private final Context m;
    private final PowerManager.WakeLock q;
    private final WifiManager.WifiLock r;
    private final mem s;
    private final lgr t;
    private final int u;
    private final int v;
    private boolean x;
    private final TransferService y;
    private final lyz z;
    private boolean w = true;
    public final Object c = new Object();
    private final Map n = new HashMap();
    private final Map o = new HashMap();
    private final Set p = new HashSet();

    public ljz(TransferService transferService, Context context, mem memVar, idr idrVar, lyz lyzVar, lfn lfnVar, SharedPreferences sharedPreferences, ljn ljnVar, lzq lzqVar, lgr lgrVar, lkq lkqVar, ids idsVar, PowerManager powerManager, WifiManager wifiManager, Resources resources) {
        this.h = resources;
        this.y = transferService;
        this.m = context;
        this.s = memVar;
        this.k = idrVar;
        this.z = lyzVar;
        this.j = sharedPreferences;
        this.A = lzqVar;
        this.t = lgrVar;
        this.B = lkqVar;
        this.C = new gb(lfnVar.aa(), lfnVar.X());
        this.u = lfnVar.T();
        this.v = lfnVar.W();
        this.l = ljnVar;
        this.d = idsVar;
        idsVar.ea(this);
        String name = getClass().getName();
        String strConcat = String.valueOf(name).concat("_tasks");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        this.q = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(true);
        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, strConcat);
        this.r = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(true);
        WifiManager.WifiLock wifiLockCreateWifiLock2 = wifiManager.createWifiLock(String.valueOf(name).concat("_executor"));
        this.e = wifiLockCreateWifiLock2;
        wifiLockCreateWifiLock2.setReferenceCounted(false);
        HandlerThread handlerThread = new HandlerThread(name);
        this.b = handlerThread;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper(), this);
    }

    private final void e(kuh kuhVar) {
        ((tug) ((tug) a.e()).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "cancelTask", 456, "TransfersExecutor.java")).v("PinningTask requested to be cancelled: %s", kuhVar);
        ljw ljwVar = (ljw) this.n.remove(kuhVar);
        if (ljwVar == null) {
            if (this.p.remove(kuhVar)) {
                this.i.removeMessages(5, kuhVar);
                this.o.remove(kuhVar);
                return;
            }
            return;
        }
        synchronized (ljwVar) {
            mfm.a(ljwVar.d);
            if (ljwVar.g != null) {
                ljwVar.g.interrupt();
            }
        }
        ljwVar.e.block();
        this.o.remove(kuhVar);
    }

    private final void f(kuh kuhVar, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("pinning_status", Integer.valueOf(i));
        contentValues.put("pinning_status_reason", Integer.valueOf(i2));
        contentValues.putNull("pinning_drm_error_code");
        if (i == 2) {
            contentValues.put("pinning_notification_active", (Boolean) true);
        }
        ktw.u(this.z, kuhVar, contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljz.g():void");
    }

    private final boolean h(ljw ljwVar) {
        return this.n.get(ljwVar.b) == ljwVar;
    }

    public final void a(ljw ljwVar, ljx ljxVar) {
        c(4, Pair.create(ljwVar, ljxVar));
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            this.i.obtainMessage(1).sendToTarget();
            this.w = false;
            i = this.g + 1;
            this.g = i;
        }
        return i;
    }

    public final void c(int i, Object obj) {
        synchronized (this.c) {
            this.i.obtainMessage(i, obj).sendToTarget();
            this.w = false;
            this.g++;
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        synchronized (this.c) {
            if (!this.w) {
                b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z;
        boolean z2;
        int i;
        ljs ljsVar;
        int i2;
        int iIntValue;
        ljx cause;
        ?? r18;
        boolean z3;
        int iMax;
        int i3 = message.what;
        if (i3 == 1) {
            z = true;
            z2 = false;
            g();
        } else if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    Pair pair = (Pair) message.obj;
                    if (h((ljw) pair.first)) {
                        ljw ljwVar = (ljw) pair.first;
                        ljx ljxVar = (ljx) pair.second;
                        kuh kuhVar = ljwVar.b;
                        tui tuiVar = a;
                        ((tug) ((tug) ((tug) tuiVar.g()).i(ljxVar)).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "handleTaskError", 482, "TransfersExecutor.java")).v("PinningTask failed: %s", kuhVar);
                        this.n.remove(kuhVar);
                        Map map = this.o;
                        Integer num = (Integer) map.get(kuhVar);
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        ljn ljnVar = this.l;
                        ljnVar.g.sendEmptyMessage(1);
                        if (ljnVar.j) {
                            iIntValue2++;
                        }
                        boolean z4 = ljxVar instanceof ljs;
                        if (z4) {
                            z = true;
                            ljsVar = (ljs) ljxVar;
                        } else {
                            z = true;
                            ljsVar = null;
                        }
                        boolean z5 = iIntValue2 > this.v ? z ? 1 : 0 : false;
                        gb gbVar = this.C;
                        boolean z6 = (ljsVar == null || ljsVar.a) ? z ? 1 : 0 : false;
                        if (z4) {
                            ljs ljsVar2 = (ljs) ljxVar;
                            i2 = ljsVar2.b;
                            Integer num2 = ljsVar2.c;
                            iIntValue = num2 == null ? -1 : num2.intValue();
                            cause = ljxVar.getCause();
                        } else {
                            i2 = 18;
                            iIntValue = -1;
                            cause = ljxVar;
                        }
                        int i4 = i2;
                        lji ljiVar = ljwVar.f;
                        ljwVar.c.I(kuhVar.b, ljiVar != null ? ljiVar.y : null, cause, z6, z5, iIntValue, i4);
                        if (z6 || z5) {
                            r18 = 3;
                            z3 = 0;
                            ((tug) ((tug) ((tug) ljw.a.g()).i(ljxVar)).j("com/google/android/apps/play/movies/common/service/pinning/PinningTask", "onError", 232, "PinningTask.java")).v("transfer fatal fail: %s", kuhVar);
                            ContentValues contentValuesR = ktw.r();
                            contentValuesR.put("pinning_status", (Integer) 4);
                            contentValuesR.put("pinning_status_reason", Integer.valueOf(i4));
                            contentValuesR.put("pinning_drm_error_code", Integer.valueOf(iIntValue));
                            contentValuesR.put("pinned", (Integer) 0);
                            ktw.B(ljwVar.j, kuhVar, contentValuesR);
                        } else {
                            r18 = 3;
                            z3 = 0;
                        }
                        tug tugVar = (tug) ((tug) ((tug) tuiVar.g()).i(ljxVar)).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "handleTaskError", 507, "TransfersExecutor.java");
                        Locale locale = Locale.US;
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        Boolean boolValueOf = Boolean.valueOf(z6);
                        Boolean boolValueOf2 = Boolean.valueOf(z5);
                        Object[] objArr = new Object[4];
                        objArr[z3] = numValueOf;
                        objArr[z ? 1 : 0] = boolValueOf;
                        objArr[2] = boolValueOf2;
                        objArr[r18] = kuhVar;
                        tugVar.v("%s", String.format(locale, "task error (strikes: %d, fatal: %b, maxRetries: %b, key: %s)", objArr));
                        if (z5 || z6) {
                            map.remove(kuhVar);
                            this.p.remove(kuhVar);
                        } else {
                            map.put(kuhVar, numValueOf);
                            this.p.add(kuhVar);
                            if (iIntValue2 == 0) {
                                iIntValue2 = z ? 1 : 0;
                            }
                            a.aD(iIntValue2 > 0 ? z ? 1 : 0 : z3, "retryCount should be positive");
                            if (iIntValue2 >= 32) {
                                iMax = gbVar.b;
                            } else {
                                long j = gbVar.a;
                                iMax = (int) Math.max(j, Math.min((1 << (iIntValue2 - 1)) * j, gbVar.b));
                            }
                            long jNextInt = ((Random) gbVar.c).nextInt(iMax);
                            int i5 = iMax / 2;
                            synchronized (this.c) {
                                Handler handler = this.i;
                                handler.sendMessageDelayed(handler.obtainMessage(5, kuhVar), (iMax + jNextInt) - i5);
                                this.w = z3;
                                this.g++;
                            }
                        }
                        this.t.a();
                        g();
                    }
                } else if (i3 == 5) {
                    if (this.p.remove((kuh) message.obj)) {
                        g();
                    }
                }
                z = true;
            } else {
                z = true;
                ljw ljwVar2 = (ljw) message.obj;
                if (h(ljwVar2)) {
                    this.l.a();
                    kuh kuhVar2 = ljwVar2.b;
                    ((tug) ((tug) a.e()).j("com/google/android/apps/play/movies/common/service/pinning/TransfersExecutor", "handleTaskCompleted", 469, "TransfersExecutor.java")).v("PinningTask completed: %s ", kuhVar2);
                    this.n.remove(kuhVar2);
                    this.o.remove(kuhVar2);
                    this.p.remove(kuhVar2);
                    z2 = false;
                    f(kuhVar2, 3, 0);
                    g();
                }
            }
            z2 = false;
        } else {
            z = true;
            z2 = false;
            ljw ljwVar3 = (ljw) message.obj;
            if (h(ljwVar3)) {
                this.o.remove(ljwVar3.b);
                this.l.a();
            }
        }
        synchronized (this.c) {
            i = this.f + 1;
            this.f = i;
            if (i == this.g && !this.x) {
                z2 = z;
            }
            this.w = z2;
        }
        if (z2) {
            TransferService transferService = this.y;
            transferService.a.post(new csl(transferService, i, 8));
        }
        return z;
    }
}
