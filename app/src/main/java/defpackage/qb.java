package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class qb implements si {
    final /* synthetic */ qd a;

    public qb(qd qdVar) {
        this.a = qdVar;
    }

    @Override // defpackage.si
    public final int a(View view) {
        return this.a.av(view) + ((qe) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.si
    public final int b(View view) {
        return this.a.aA(view) - ((qe) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.si
    public final int c() {
        qd qdVar = this.a;
        return qdVar.I - qdVar.getPaddingBottom();
    }

    @Override // defpackage.si
    public final int d() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.si
    public final View e(int i) {
        return this.a.aI(i);
    }
}
