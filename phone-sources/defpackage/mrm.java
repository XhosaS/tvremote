package defpackage;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v7.app.ActionBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrm implements idb {
    public static final boolean b;
    public final Activity c;
    public final lfn d;
    public final ActionBar e;
    public final boolean f;
    public boolean h;
    public boolean i;
    public final boolean j;
    private final dyd n;
    private boolean o;
    public static final mrj a = new mrj();
    private static final IntentFilter k = new IntentFilter("com.google.android.videos.NEW_PLAYBACK_STARTED");
    private static final IntentFilter l = new IntentFilter("com.google.android.videos.intent.action.pip_controllers");
    private final mrk m = new mrk(this);
    public mrl g = a;

    static {
        b = Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mrm(android.app.Activity r5, defpackage.lfn r6, android.support.v7.app.ActionBar r7, defpackage.dyd r8, boolean r9) {
        /*
            r4 = this;
            r4.<init>()
            mrk r0 = new mrk
            r0.<init>(r4)
            r4.m = r0
            mrj r0 = defpackage.mrm.a
            r4.g = r0
            int r0 = defpackage.ctk.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            if (r0 >= r1) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r3 = 0
            if (r0 < r1) goto L2c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r1 = "S"
            boolean r0 = defpackage.ctk.a(r1, r0)
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            r4.j = r2
            r4.c = r5
            r4.d = r6
            r4.e = r7
            r4.n = r8
            r4.f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrm.<init>(android.app.Activity, lfn, android.support.v7.app.ActionBar, dyd, boolean):void");
    }

    @Override // defpackage.idb
    public final boolean a() {
        return this.h;
    }

    public final void b() {
        this.c.finishAndRemoveTask();
    }

    public final void c(boolean z) {
        this.h = z;
        Activity activity = this.c;
        activity.invalidateOptionsMenu();
        this.g.e(z);
        if (!z) {
            d();
            if (this.i) {
                b();
                return;
            }
            return;
        }
        this.i = false;
        if (this.o) {
            return;
        }
        this.o = true;
        mrk mrkVar = this.m;
        czi.f(activity, mrkVar, l, 4);
        this.n.b(mrkVar, k);
    }

    public final void d() {
        if (this.o) {
            this.o = false;
            Activity activity = this.c;
            mrk mrkVar = this.m;
            activity.unregisterReceiver(mrkVar);
            this.n.c(mrkVar);
        }
    }
}
