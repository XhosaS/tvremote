package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eem implements ees {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private eey d;

    protected eem(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ees
    public /* synthetic */ Map e() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(efyVar)) {
            return;
        }
        arrayList.add(efyVar);
        this.c++;
    }

    protected final void g(int i) {
        eey eeyVar = this.d;
        String str = edt.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((efy) this.b.get(i2)).k(eeyVar, this.a, i);
        }
    }

    protected final void h() {
        eey eeyVar = this.d;
        String str = edt.a;
        for (int i = 0; i < this.c; i++) {
            ((efy) this.b.get(i)).l(eeyVar, this.a);
        }
        this.d = null;
    }

    protected final void i(eey eeyVar) {
        for (int i = 0; i < this.c; i++) {
            ((efy) this.b.get(i)).m(eeyVar, this.a);
        }
    }

    protected final void j(eey eeyVar) {
        this.d = eeyVar;
        for (int i = 0; i < this.c; i++) {
            ((efy) this.b.get(i)).n(eeyVar, this.a);
        }
    }
}
