package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fo extends fh {
    public fo() {
        super(null);
    }

    @Override // defpackage.fh
    public void b(gb gbVar, gb gbVar2, Window window, View view, boolean z, boolean z2) {
        gbVar.getClass();
        gbVar2.getClass();
        window.getClass();
        view.getClass();
        cwn.c(window, false);
        window.setStatusBarColor(gbVar.a(z));
        window.setNavigationBarColor(gbVar2.b);
        new cxe(window, view).i(!z);
    }
}
