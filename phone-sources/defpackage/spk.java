package defpackage;

import android.support.v7.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spk implements Runnable {
    final /* synthetic */ ActionMenuView a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ BottomAppBar d;

    public spk(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.a = actionMenuView;
        this.b = i;
        this.c = z;
        this.d = bottomAppBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomAppBar bottomAppBar = this.d;
        this.a.setTranslationX(bottomAppBar.g(r1, this.b, this.c));
    }
}
