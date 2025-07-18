package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byn implements bvu {
    private final /* synthetic */ bvu a;
    private final int b;
    private final int c;

    public byn(bvu bvuVar, byo byoVar) {
        this.a = bvuVar;
        bza bzaVar = byoVar.h;
        bzaVar.getClass();
        this.b = bzaVar.a;
        bzaVar.getClass();
        this.c = bzaVar.b;
    }

    @Override // defpackage.bvu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bvu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bvu
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.bvu
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.bvu
    public final void g() {
        this.a.g();
    }
}
