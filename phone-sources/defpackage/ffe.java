package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffe implements fdp {
    private fdr f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private ffd o;
    private ffi p;
    private final edi a = new edi(4);
    private final edi b = new edi(9);
    private final edi c = new edi(11);
    private final edi d = new edi();
    private final fff e = new fff();
    private int g = 1;

    private final edi h(fdq fdqVar) {
        edi ediVar = this.d;
        if (this.l > ediVar.b()) {
            int iB = ediVar.b();
            ediVar.I(new byte[Math.max(iB + iB, this.l)], 0);
        } else {
            ediVar.K(0);
        }
        ediVar.J(this.l);
        fdqVar.j(ediVar.a, 0, this.l);
        return ediVar;
    }

    private final void i() {
        if (this.n) {
            return;
        }
        this.f.r(new fee(-9223372036854775807L));
        this.n = true;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        edi ediVar = this.a;
        fdqVar.i(ediVar.a, 0, 3);
        ediVar.K(0);
        if (ediVar.l() != 4607062) {
            return false;
        }
        fdqVar.i(ediVar.a, 0, 2);
        ediVar.K(0);
        if ((ediVar.n() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        fdqVar.i(ediVar.a, 0, 4);
        ediVar.K(0);
        int iE = ediVar.e();
        fdqVar.k();
        fdqVar.g(iE);
        fdqVar.i(ediVar.a, 0, 4);
        ediVar.K(0);
        return ediVar.e() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r17, defpackage.rsj r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.f = fdrVar;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
