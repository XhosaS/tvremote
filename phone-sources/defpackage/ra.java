package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ra implements ysy {
    final /* synthetic */ yld a;
    final /* synthetic */ yld b;
    final /* synthetic */ yld c;
    final /* synthetic */ rb d;

    public ra(yld yldVar, yld yldVar2, yld yldVar3, rb rbVar) {
        this.a = yldVar;
        this.b = yldVar2;
        this.c = yldVar3;
        this.d = rbVar;
    }

    @Override // defpackage.ysy
    public final /* bridge */ /* synthetic */ Object emit(Object obj, yih yihVar) {
        yld yldVar;
        int i;
        wq wqVar = (wq) obj;
        boolean z = true;
        if (wqVar instanceof ws) {
            this.a.a++;
        } else {
            if ((wqVar instanceof wt) || (wqVar instanceof wr)) {
                yldVar = this.a;
            } else {
                if (wqVar instanceof wn) {
                    yldVar = this.b;
                } else if (wqVar instanceof wo) {
                    yldVar = this.b;
                } else if (wqVar instanceof wl) {
                    yldVar = this.c;
                } else if (wqVar instanceof wm) {
                    yldVar = this.c;
                }
                i = yldVar.a + 1;
                yldVar.a = i;
            }
            i = yldVar.a - 1;
            yldVar.a = i;
        }
        boolean z2 = false;
        boolean z3 = this.a.a > 0;
        boolean z4 = this.b.a > 0;
        boolean z5 = this.c.a > 0;
        rb rbVar = this.d;
        if (rbVar.a != z3) {
            rbVar.a = z3;
            z2 = true;
        }
        if (rbVar.b != z4) {
            rbVar.b = z4;
        } else {
            z = z2;
        }
        if (rbVar.c == z5) {
            if (z) {
            }
            return ygi.a;
        }
        rbVar.c = z5;
        fh.D(rbVar);
        return ygi.a;
    }
}
