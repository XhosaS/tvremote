package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class fr extends fq {
    @Override // defpackage.fp, defpackage.fh
    public void b(gb gbVar, gb gbVar2, Window window, View view, boolean z, boolean z2) {
        gbVar.getClass();
        gbVar2.getClass();
        window.getClass();
        view.getClass();
        cwn.c(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        cxe cxeVar = new cxe(window, view);
        cxeVar.i(!z);
        cxeVar.h(true ^ z2);
    }
}
