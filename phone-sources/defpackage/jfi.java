package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfi implements gls {
    final /* synthetic */ jfr a;
    final /* synthetic */ List b;
    final /* synthetic */ jfr c;
    final /* synthetic */ jkh d;

    public jfi(jfr jfrVar, jkh jkhVar, List list, jfr jfrVar2) {
        this.a = jfrVar;
        this.d = jkhVar;
        this.b = list;
        this.c = jfrVar2;
    }

    @Override // defpackage.gls
    public final void b(int i) {
        List list = this.b;
        jkh jkhVar = this.d;
        this.a.r(new jfn(i, jkhVar.k(), (Integer) yfm.V(list, i)));
        jfr jfrVar = this.c;
        jfrVar.s(i);
        jfj.e(jkhVar, jfrVar);
    }

    @Override // defpackage.gls
    public final void a(int i) {
    }

    @Override // defpackage.gls
    public final void c(int i, float f) {
    }
}
