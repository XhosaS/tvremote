package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class tx extends ub {
    @Override // defpackage.ub
    public void a(um umVar, um umVar2, Window window, View view, boolean z, boolean z2) {
        umVar.getClass();
        umVar2.getClass();
        window.getClass();
        view.getClass();
        ahz.a(window);
        window.setStatusBarColor(umVar.a(z));
        window.setNavigationBarColor(umVar2.a(z2));
        ajj ajjVar = new ajk(window).a;
        ajjVar.d(!z);
        ajjVar.e(!z2);
    }
}
