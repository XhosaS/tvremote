package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsn implements Runnable {
    final /* synthetic */ AspectRatioFrameLayout a;
    private boolean b;

    public fsn(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = aspectRatioFrameLayout;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = false;
    }
}
