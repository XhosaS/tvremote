package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drg extends dro {
    public final drh a;

    public drg(dru druVar, drh drhVar) {
        super(druVar, drhVar);
        this.a = drhVar;
    }

    @Override // defpackage.drn
    public final /* synthetic */ drq a() {
        return this.a;
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
        drh drhVar = this.a;
        if (drhVar.a == null) {
            drhVar.a = new ArrayList();
        }
        drhVar.a.add(drqVar);
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
