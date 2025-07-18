package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ari implements aqw {
    public final Object a = new Object();
    public Handler b;
    public HandlerThread c;
    public arj d;
    aqx e;
    private final Context f;
    private final aee g;
    private ContentObserver h;
    private Runnable i;

    public ari(Context context, aee aeeVar) {
        afk.e(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = aeeVar;
    }

    private final void b() {
        this.e = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.f.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.b.removeCallbacks(this.i);
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.b = null;
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x00b3, TryCatch #1 {, blocks: (B:16:0x003d, B:18:0x0041, B:20:0x004c, B:28:0x007b, B:29:0x007f, B:38:0x00a9, B:42:0x00ad, B:44:0x00b0, B:22:0x0058, B:25:0x006a, B:30:0x0080, B:32:0x0084, B:33:0x0096, B:35:0x009a, B:36:0x00a1, B:37:0x00a8), top: B:99:0x003d, outer: #3, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.a():void");
    }
}
