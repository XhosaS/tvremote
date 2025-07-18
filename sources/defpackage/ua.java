package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ua {
    private static final ThreadLocal i = new ThreadLocal();
    public ty f;
    public final awy g;
    public final mi a = new mi();
    public final ArrayList b = new ArrayList();
    public final byj h = new byj(this, null);
    public final Runnable c = new Runnable() { // from class: tw
        /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0181 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 451
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.run():void");
        }
    };
    public boolean d = false;
    public float e = 1.0f;

    public ua(awy awyVar) {
        this.g = awyVar;
    }

    public static ua a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ua(new awy((byte[]) null, (char[]) null)));
        }
        return (ua) threadLocal.get();
    }

    public final boolean b() {
        return Thread.currentThread() == ((Looper) this.g.a).getThread();
    }
}
