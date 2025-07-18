package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ks extends oc {
    final /* synthetic */ kt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(kt ktVar, View view) {
        super(view);
        this.a = ktVar;
    }

    @Override // defpackage.oc
    public final ka a() {
        ku kuVar = this.a.a.j;
        if (kuVar == null) {
            return null;
        }
        return kuVar.a();
    }

    @Override // defpackage.oc
    public final boolean b() {
        this.a.a.p();
        return true;
    }

    @Override // defpackage.oc
    public final boolean c() {
        kw kwVar = this.a.a;
        if (kwVar.l != null) {
            return false;
        }
        kwVar.n();
        return true;
    }
}
