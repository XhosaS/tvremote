package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bug implements bvu {
    final /* synthetic */ yjv a;
    final /* synthetic */ buh b;
    private final int c;
    private final int d;
    private final Map e;

    public bug(int i, int i2, Map map, yjv yjvVar, buh buhVar) {
        this.a = yjvVar;
        this.b = buhVar;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    @Override // defpackage.bvu
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bvu
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bvu
    public final Map e() {
        return this.e;
    }

    @Override // defpackage.bvu
    public final void f() {
        this.a.a(this.b.a.l);
    }

    @Override // defpackage.bvu
    public final void g() {
    }
}
