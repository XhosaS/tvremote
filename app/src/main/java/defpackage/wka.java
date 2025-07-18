package defpackage;

import android.content.ComponentCallbacks2;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wka implements bbv {
    final /* synthetic */ bw a;
    final /* synthetic */ wke b;
    final /* synthetic */ ComponentCallbacks2 c;
    final /* synthetic */ wkb d;

    public wka(wkb wkbVar, bw bwVar, wke wkeVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = bwVar;
        this.b = wkeVar;
        this.c = componentCallbacks2;
        this.d = wkbVar;
    }

    @Override // defpackage.bbv
    public final void b(bcl bclVar) {
        wkb wkbVar = this.d;
        Map map = wkbVar.b.a;
        bw bwVar = this.a;
        Set set = (Set) map.get(bwVar);
        if (set != null) {
            set.remove(this.b);
        }
        bwVar.unregisterComponentCallbacks(this.c);
        wkbVar.a.ek().c(this);
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void c(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void d(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void eY(bcl bclVar) {
    }
}
