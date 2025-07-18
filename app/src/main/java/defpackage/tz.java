package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class tz extends ty {
    @Override // defpackage.tx, defpackage.ub
    public void a(um umVar, um umVar2, Window window, View view, boolean z, boolean z2) {
        umVar.getClass();
        umVar2.getClass();
        window.getClass();
        view.getClass();
        ahz.a(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ajj ajjVar = new ajk(window).a;
        ajjVar.d(!z);
        ajjVar.e(true ^ z2);
    }
}
