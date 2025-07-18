package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvi implements bvu {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ bvj d;
    final /* synthetic */ bvp e;
    final /* synthetic */ yjv f;

    public bvi(int i, int i2, Map map, bvj bvjVar, bvp bvpVar, yjv yjvVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = bvjVar;
        this.e = bvpVar;
        this.f = yjvVar;
    }

    @Override // defpackage.bvu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bvu
    public final int b() {
        return this.a;
    }

    @Override // defpackage.bvu
    public final Map e() {
        return this.c;
    }

    @Override // defpackage.bvu
    public final void f() {
        bza bzaVar;
        if (!this.d.cA() || (bzaVar = ((byi) this.e.a.n()).g) == null) {
            this.f.a(this.e.a.n().l);
        } else {
            this.f.a(bzaVar.l);
        }
    }

    @Override // defpackage.bvu
    public final void g() {
    }
}
