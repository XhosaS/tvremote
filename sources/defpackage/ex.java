package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ex extends hj {
    final /* synthetic */ ey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(ey eyVar, View view) {
        super(view);
        this.a = eyVar;
    }

    @Override // defpackage.hj
    public final ek a() {
        ez ezVar = this.a.a.i;
        if (ezVar == null) {
            return null;
        }
        return ezVar.a();
    }

    @Override // defpackage.hj
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.hj
    public final boolean c() {
        fa faVar = this.a.a;
        if (faVar.k != null) {
            return false;
        }
        faVar.k();
        return true;
    }
}
