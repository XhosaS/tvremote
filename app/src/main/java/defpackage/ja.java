package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ja implements Runnable {
    final /* synthetic */ jc a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ jj c;
    final /* synthetic */ jb d;

    public ja(jb jbVar, jc jcVar, MenuItem menuItem, jj jjVar) {
        this.d = jbVar;
        this.a = jcVar;
        this.b = menuItem;
        this.c = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc jcVar = this.a;
        if (jcVar != null) {
            jd jdVar = this.d.a;
            jdVar.f = true;
            jcVar.b.g(false);
            jdVar.f = false;
        }
        MenuItem menuItem = this.b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.c.x(menuItem, null, 4);
        }
    }
}
