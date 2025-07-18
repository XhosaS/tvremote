package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fx extends hj {
    final /* synthetic */ gb a;
    final /* synthetic */ ge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(ge geVar, View view, gb gbVar) {
        super(view);
        this.b = geVar;
        this.a = gbVar;
    }

    @Override // defpackage.hj
    public final ek a() {
        return this.a;
    }

    @Override // defpackage.hj
    public final boolean b() {
        ge geVar = this.b;
        if (geVar.b.u()) {
            return true;
        }
        geVar.b();
        return true;
    }
}
