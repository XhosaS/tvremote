package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abe implements OnBackAnimationCallback {
    final /* synthetic */ ctu a;
    final /* synthetic */ ctu b;
    final /* synthetic */ ctj c;
    final /* synthetic */ ctj d;

    public abe(ctu ctuVar, ctu ctuVar2, ctj ctjVar, ctj ctjVar2) {
        this.a = ctuVar;
        this.b = ctuVar2;
        this.c = ctjVar;
        this.d = ctjVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.a(tk.e(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.a(tk.e(backEvent));
    }
}
