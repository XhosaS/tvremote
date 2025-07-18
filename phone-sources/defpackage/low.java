package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class low implements lor {
    public final gex a;
    public final gei b = new lou();
    public final gei c = new lov();

    public low(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.lor
    public final Object a(String str, yih yihVar) {
        return gez.l(this.a, false, true, new kij(str, 12), yihVar);
    }

    @Override // defpackage.lor
    public final Object b(String str, String str2, int i, yih yihVar) {
        return gez.l(this.a, false, true, new aiy(str, str2, i, 13), yihVar);
    }

    @Override // defpackage.lor
    public final /* synthetic */ Object c(String str, String str2, int i) {
        return (List) gez.j(this.a, false, true, new jzu(this, new lox[]{new lox(str, str2, i, 2, -System.currentTimeMillis(), false)}, 12, null));
    }

    @Override // defpackage.lor
    public final Object d(String str, yih yihVar) {
        return gez.l(this.a, false, true, new kij(str, 13), yihVar);
    }

    @Override // defpackage.lor
    public final /* synthetic */ Object e(String str, String str2, int i, long j) {
        return (List) gez.j(this.a, false, true, new jzu(this, new lox[]{new lox(str, str2, i, 1, j, true)}, 11, null));
    }

    @Override // defpackage.lor
    public final Object f(String str, String str2, int i, int i2, yih yihVar) {
        return gez.l(this.a, false, true, new lot(i2, str, str2, i, 0), yihVar);
    }

    @Override // defpackage.lor
    public final List g(int i) {
        return (List) gez.j(this.a, true, false, new abs(i, 5));
    }

    @Override // defpackage.lor
    public final List h(String str, int i) {
        return (List) gez.j(this.a, true, false, new aps(str, i, 5));
    }

    @Override // defpackage.lor
    public final Object i(String str, yih yihVar) {
        return gez.l(this.a, false, true, new kij(str, 11), yihVar);
    }

    @Override // defpackage.lor
    public final /* synthetic */ dvs j(String str) {
        dvu dvuVar;
        geo geoVarB = this.a.b();
        String[] strArr = {"watchlist"};
        kij kijVar = new kij(str, 10);
        geoVarB.b.f(strArr);
        ghd ghdVar = geoVarB.i;
        gfh gfhVar = new gfh((gex) ghdVar.a, ghdVar, strArr, kijVar);
        ylb ylbVar = new ylb();
        ylbVar.a = true;
        if (gfhVar.m()) {
            ylbVar.a = false;
            dvuVar = new dvu(gfhVar.a());
        } else {
            dvuVar = new dvu();
        }
        dvuVar.n(gfhVar, new rdl(new bct(dvuVar, ylbVar, 8, null), 1, null));
        return dvuVar;
    }

    @Override // defpackage.lor
    public final boolean k(String str, String str2, int i) {
        return ((Boolean) gez.j(this.a, true, false, new aiy(str, str2, i, 12))).booleanValue();
    }

    @Override // defpackage.lor
    public final Object l(String str, String str2, int i, long j, yih yihVar) {
        return gez.l(this.a, false, true, new los(j, str, str2, i, 0), yihVar);
    }
}
