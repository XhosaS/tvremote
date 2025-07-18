package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svk implements OnBackAnimationCallback {
    final /* synthetic */ svi a;
    final /* synthetic */ svl b;

    public svk(svl svlVar, svi sviVar) {
        this.a = sviVar;
        this.b = svlVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.I();
        }
    }

    public final void onBackInvoked() {
        this.a.K();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.T(new fd(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.R(new fd(backEvent));
        }
    }
}
