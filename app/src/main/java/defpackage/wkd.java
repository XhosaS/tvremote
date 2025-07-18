package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkd implements wkf {
    public final bq a;

    public wkd(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.wkf
    public final void a(wke wkeVar) {
        uea.c();
        bq bqVar = this.a;
        Context contextS = bqVar.s();
        ComponentCallbacks2 componentCallbacks2 = wkeVar.c;
        contextS.registerComponentCallbacks(componentCallbacks2);
        bqVar.ek().b(new wkc(this, wkeVar, componentCallbacks2));
    }
}
