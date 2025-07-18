package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class emj extends Handler implements emk {
    public emj(Looper looper) {
        super(looper);
    }

    @Override // defpackage.emk
    public final void a(Runnable runnable) {
        removeCallbacks(runnable);
    }

    @Override // defpackage.emk
    public final void c(Runnable runnable) {
        post(runnable);
    }

    @Override // defpackage.emk
    public final void b() {
    }
}
