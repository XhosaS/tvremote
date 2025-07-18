package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kl implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public kl(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.b();
        actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(-actionBarOverlayLayout.c.getHeight()).setListener(actionBarOverlayLayout.j);
    }
}
