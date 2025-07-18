package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ie extends AbstractC0001if {
    public ie(in inVar) {
        super(inVar);
    }

    @Override // defpackage.AbstractC0001if
    public final int a(View view) {
        return this.a.an(view) + ((io) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int b(View view) {
        io ioVar = (io) view.getLayoutParams();
        return in.bn(view) + ioVar.topMargin + ioVar.bottomMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int c(View view) {
        io ioVar = (io) view.getLayoutParams();
        return in.bo(view) + ioVar.leftMargin + ioVar.rightMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int d(View view) {
        return this.a.aq(view) - ((io) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.AbstractC0001if
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.AbstractC0001if
    public final int f() {
        in inVar = this.a;
        return inVar.D - inVar.av();
    }

    @Override // defpackage.AbstractC0001if
    public final int g() {
        return this.a.av();
    }

    @Override // defpackage.AbstractC0001if
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.AbstractC0001if
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.AbstractC0001if
    public final int j() {
        return this.a.ay();
    }

    @Override // defpackage.AbstractC0001if
    public final int k() {
        in inVar = this.a;
        return (inVar.D - inVar.ay()) - inVar.av();
    }

    @Override // defpackage.AbstractC0001if
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bq(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.AbstractC0001if
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bq(view, rect);
        return rect.top;
    }

    @Override // defpackage.AbstractC0001if
    public final void n(int i) {
        this.a.aO(i);
    }
}
