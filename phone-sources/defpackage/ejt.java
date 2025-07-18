package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejt implements ejo {
    public final evu a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public ejt(ewb ewbVar, boolean z) {
        this.a = new evu(ewbVar, z);
    }

    @Override // defpackage.ejo
    public final eay a() {
        return this.a.a;
    }

    @Override // defpackage.ejo
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
