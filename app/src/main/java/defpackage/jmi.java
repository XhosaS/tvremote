package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmi implements gzv {
    private static final List c = agqq.d(fiu.b, fry.a, fth.a, fiu.c, fqh.a, fiu.d);
    public final fae a;
    public final Set b;
    private final ahbt d;
    private final fxu e;
    private final gtu f;
    private final hab g;

    public jmi(ahbt ahbtVar, fae faeVar, fxu fxuVar, gtu gtuVar, hab habVar) {
        ahbtVar.getClass();
        fxuVar.getClass();
        gtuVar.getClass();
        habVar.getClass();
        this.d = ahbtVar;
        this.a = faeVar;
        this.e = fxuVar;
        this.f = gtuVar;
        this.g = habVar;
        this.b = new LinkedHashSet();
        gtuVar.q(new jmf(this));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.e.d(new fxk((fxr) it.next(), new jmg(this)));
        }
        this.g.g(this);
    }

    @Override // defpackage.gzv
    public final void a(Intent intent) {
        b();
    }

    public final void b() {
        ahal.e(this.d, null, 0, new jmh(this, null), 3);
    }

    public final void c(jme jmeVar) {
        this.b.add(jmeVar);
    }
}
