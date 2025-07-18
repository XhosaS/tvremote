package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pf extends pg {
    public pf(qd qdVar) {
        super(qdVar);
    }

    @Override // defpackage.pg
    public final int a(View view) {
        return this.a.av(view) + ((qe) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.pg
    public final int b(View view) {
        qe qeVar = (qe) view.getLayoutParams();
        return this.a.ax(view) + qeVar.topMargin + qeVar.bottomMargin;
    }

    @Override // defpackage.pg
    public final int c(View view) {
        qe qeVar = (qe) view.getLayoutParams();
        return this.a.ay(view) + qeVar.leftMargin + qeVar.rightMargin;
    }

    @Override // defpackage.pg
    public final int d(View view) {
        return this.a.aA(view) - ((qe) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.pg
    public final int e() {
        return this.a.I;
    }

    @Override // defpackage.pg
    public final int f() {
        qd qdVar = this.a;
        return qdVar.I - qdVar.getPaddingBottom();
    }

    @Override // defpackage.pg
    public final int g() {
        return this.a.getPaddingBottom();
    }

    @Override // defpackage.pg
    public final int h() {
        return this.a.G;
    }

    @Override // defpackage.pg
    public final int i() {
        return this.a.F;
    }

    @Override // defpackage.pg
    public final int j() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.pg
    public final int k() {
        qd qdVar = this.a;
        return (qdVar.I - qdVar.getPaddingTop()) - qdVar.getPaddingBottom();
    }

    @Override // defpackage.pg
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bt(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.pg
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bt(view, rect);
        return rect.top;
    }

    @Override // defpackage.pg
    public final void n(int i) {
        this.a.aT(i);
    }
}
