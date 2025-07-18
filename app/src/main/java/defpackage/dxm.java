package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxm extends dro {
    public final dxn a;

    public dxm(dru druVar, dxn dxnVar) {
        super(druVar, dxnVar);
        this.a = dxnVar;
    }

    @Override // defpackage.drn
    public final /* synthetic */ drq a() {
        return this.a;
    }

    public final void aa() {
        this.a.b = true;
    }

    @Override // defpackage.dro
    public final /* synthetic */ void b(int i) {
        this.a.c = i;
    }

    @Override // defpackage.dro
    public final /* synthetic */ void c(int i) {
        this.a.d = i;
    }

    @Override // defpackage.dro
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(drq drqVar) {
        if (drqVar == null) {
            return;
        }
        dxn dxnVar = this.a;
        if (dxnVar.a == null) {
            dxnVar.a = new ArrayList();
        }
        dxnVar.a.add(drqVar);
    }

    @Override // defpackage.dro
    public final /* synthetic */ void f(int i) {
        this.a.e = i;
    }

    @Override // defpackage.dro
    public final /* synthetic */ void g(int i) {
        this.a.f = i;
    }

    @Override // defpackage.dro
    public final /* bridge */ /* synthetic */ void h(int i, float f) {
        this.a.k().v(i, f);
    }
}
