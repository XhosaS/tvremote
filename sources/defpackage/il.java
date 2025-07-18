package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class il implements ka {
    final /* synthetic */ in a;
    private final /* synthetic */ int b;

    public il(in inVar, int i) {
        this.b = i;
        this.a = inVar;
    }

    @Override // defpackage.ka
    public final int a(View view) {
        int iAn;
        int i;
        if (this.b != 0) {
            io ioVar = (io) view.getLayoutParams();
            iAn = this.a.ap(view);
            i = ioVar.rightMargin;
        } else {
            io ioVar2 = (io) view.getLayoutParams();
            iAn = this.a.an(view);
            i = ioVar2.bottomMargin;
        }
        return iAn + i;
    }

    @Override // defpackage.ka
    public final int b(View view) {
        int iAq;
        int i;
        if (this.b != 0) {
            io ioVar = (io) view.getLayoutParams();
            iAq = this.a.ao(view);
            i = ioVar.leftMargin;
        } else {
            io ioVar2 = (io) view.getLayoutParams();
            iAq = this.a.aq(view);
            i = ioVar2.topMargin;
        }
        return iAq - i;
    }

    @Override // defpackage.ka
    public final int c() {
        int i;
        int iAv;
        if (this.b != 0) {
            in inVar = this.a;
            i = inVar.C;
            iAv = inVar.ax();
        } else {
            in inVar2 = this.a;
            i = inVar2.D;
            iAv = inVar2.av();
        }
        return i - iAv;
    }

    @Override // defpackage.ka
    public final int d() {
        return this.b != 0 ? this.a.aw() : this.a.ay();
    }

    @Override // defpackage.ka
    public final View e(int i) {
        return this.b != 0 ? this.a.aB(i) : this.a.aB(i);
    }
}
