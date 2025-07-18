package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class id extends AbstractC0001if {
    public id(in inVar) {
        super(inVar);
    }

    @Override // defpackage.AbstractC0001if
    public final int a(View view) {
        return this.a.ap(view) + ((io) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int b(View view) {
        io ioVar = (io) view.getLayoutParams();
        return in.bo(view) + ioVar.leftMargin + ioVar.rightMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int c(View view) {
        io ioVar = (io) view.getLayoutParams();
        return in.bn(view) + ioVar.topMargin + ioVar.bottomMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int d(View view) {
        return this.a.ao(view) - ((io) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.AbstractC0001if
    public final int f() {
        in inVar = this.a;
        return inVar.C - inVar.ax();
    }

    @Override // defpackage.AbstractC0001if
    public final int g() {
        return this.a.ax();
    }

    @Override // defpackage.AbstractC0001if
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.AbstractC0001if
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.AbstractC0001if
    public final int j() {
        return this.a.aw();
    }

    @Override // defpackage.AbstractC0001if
    public final int k() {
        in inVar = this.a;
        return (inVar.C - inVar.aw()) - inVar.ax();
    }

    @Override // defpackage.AbstractC0001if
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bq(view, rect);
        return rect.right;
    }

    @Override // defpackage.AbstractC0001if
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bq(view, rect);
        return rect.left;
    }

    @Override // defpackage.AbstractC0001if
    public final void n(int i) {
        this.a.aN(i);
    }
}
