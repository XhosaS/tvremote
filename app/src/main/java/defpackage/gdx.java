package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdx extends gdq {
    final List a;
    private final gdp b;
    private final Iterator c;

    public gdx(gdp gdpVar, List list) {
        this.b = gdpVar;
        this.a = list;
        this.c = list.iterator();
    }

    @Override // defpackage.gdq
    public final gdp a() {
        return this.b;
    }

    @Override // defpackage.gdq
    public final gdq b() {
        return new gdx((gdp) this.b.clone(), new ArrayList(this.a));
    }

    @Override // defpackage.gdq
    public final List c() {
        Iterator it = this.c;
        if (it.hasNext()) {
            return (List) it.next();
        }
        return null;
    }

    @Override // defpackage.gdq
    public final void d() {
        e();
    }

    @Override // defpackage.gdq
    public final void e() {
        while (true) {
            Iterator it = this.c;
            if (!it.hasNext()) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // defpackage.gdq
    public final boolean f() {
        return this.c.hasNext();
    }
}
