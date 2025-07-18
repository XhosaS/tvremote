package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sph extends sss {
    final /* synthetic */ int a;
    final /* synthetic */ BottomAppBar b;

    public sph(BottomAppBar bottomAppBar, int i) {
        this.a = i;
        this.b = bottomAppBar;
    }

    @Override // defpackage.sss
    public final void b(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.f(this.a));
        floatingActionButton.h(new spg(this));
    }
}
