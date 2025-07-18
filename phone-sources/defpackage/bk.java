package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bk extends ca {
    final /* synthetic */ ca a;
    final /* synthetic */ bl b;

    public bk(bl blVar, ca caVar) {
        this.b = blVar;
        this.a = caVar;
    }

    @Override // defpackage.ca
    public final View a(int i) {
        ca caVar = this.a;
        return caVar.b() ? caVar.a(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.ca
    public final boolean b() {
        return this.a.b() || this.b.onHasView();
    }
}
