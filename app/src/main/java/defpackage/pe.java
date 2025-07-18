package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pe extends pg {
    public pe(qd qdVar) {
        super(qdVar);
    }

    @Override // defpackage.pg
    public final int a(View view) {
        return this.a.az(view) + ((qe) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.pg
    public final int b(View view) {
        qe qeVar = (qe) view.getLayoutParams();
        return this.a.ay(view) + qeVar.leftMargin + qeVar.rightMargin;
    }

    @Override // defpackage.pg
    public final int c(View view) {
        qe qeVar = (qe) view.getLayoutParams();
        return this.a.ax(view) + qeVar.topMargin + qeVar.bottomMargin;
    }

    @Override // defpackage.pg
    public final int d(View view) {
        return this.a.aw(view) - ((qe) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.pg
    public final int e() {
        return this.a.H;
    }

    @Override // defpackage.pg
    public final int f() {
        qd qdVar = this.a;
        return qdVar.H - qdVar.getPaddingRight();
    }

    @Override // defpackage.pg
    public final int g() {
        return this.a.getPaddingRight();
    }

    @Override // defpackage.pg
    public final int h() {
        return this.a.F;
    }

    @Override // defpackage.pg
    public final int i() {
        return this.a.G;
    }

    @Override // defpackage.pg
    public final int j() {
        return this.a.getPaddingLeft();
    }

    @Override // defpackage.pg
    public final int k() {
        qd qdVar = this.a;
        return (qdVar.H - qdVar.getPaddingLeft()) - qdVar.getPaddingRight();
    }

    @Override // defpackage.pg
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bt(view, rect);
        return rect.right;
    }

    @Override // defpackage.pg
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bt(view, rect);
        return rect.left;
    }

    @Override // defpackage.pg
    public final void n(int i) {
        this.a.aS(i);
    }
}
