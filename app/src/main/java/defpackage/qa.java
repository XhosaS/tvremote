package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class qa implements si {
    final /* synthetic */ qd a;

    public qa(qd qdVar) {
        this.a = qdVar;
    }

    @Override // defpackage.si
    public final int a(View view) {
        return this.a.az(view) + ((qe) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.si
    public final int b(View view) {
        return this.a.aw(view) - ((qe) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.si
    public final int c() {
        qd qdVar = this.a;
        return qdVar.H - qdVar.getPaddingRight();
    }

    @Override // defpackage.si
    public final int d() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.si
    public final View e(int i) {
        return this.a.aI(i);
    }
}
