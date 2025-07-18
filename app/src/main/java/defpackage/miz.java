package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class miz implements oco {
    private final Set a;

    public miz(Set set) {
        this.a = set;
    }

    @Override // defpackage.oco
    public final /* synthetic */ void a(acwg acwgVar, String str, Object... objArr) {
        ocn.a(this, acwgVar, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void b(acsw acswVar, oal oalVar, String str, Object... objArr) {
        d(acswVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void c(acwg acwgVar, oal oalVar, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final void d(acsw acswVar, oal oalVar, Throwable th, String str, Object... objArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oco) it.next()).d(acswVar, oalVar, th, str, objArr);
        }
    }

    @Override // defpackage.oco
    public final /* synthetic */ void e(acwg acwgVar, oal oalVar, Throwable th, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, th, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void f(acwg acwgVar, Throwable th, Object... objArr) {
        ocn.c(this, acwgVar, th, objArr);
    }
}
