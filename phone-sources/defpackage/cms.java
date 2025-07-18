package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms implements bvt {
    final /* synthetic */ cmv a;
    final /* synthetic */ bys b;

    public cms(cmv cmvVar, bys bysVar) {
        this.a = cmvVar;
        this.b = bysVar;
    }

    private final int f(int i) {
        cmv cmvVar = this.a;
        cmvVar.measure(cmv.h(0, i, cmvVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return cmvVar.getMeasuredHeight();
    }

    private final int g(int i) {
        cmv cmvVar = this.a;
        cmvVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), cmv.h(0, i, cmvVar.getLayoutParams().height));
        return cmvVar.getMeasuredWidth();
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        return f(i);
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        return g(i);
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        cmv cmvVar = this.a;
        if (cmvVar.getChildCount() == 0) {
            return bvvVar.cz(clv.d(j), clv.c(j), yhc.a, ccu.h);
        }
        if (clv.d(j) != 0) {
            cmvVar.getChildAt(0).setMinimumWidth(clv.d(j));
        }
        if (clv.c(j) != 0) {
            cmvVar.getChildAt(0).setMinimumHeight(clv.c(j));
        }
        cmvVar.measure(cmv.h(clv.d(j), clv.b(j), cmvVar.getLayoutParams().width), cmv.h(clv.c(j), clv.a(j), cmvVar.getLayoutParams().height));
        return bvvVar.cz(cmvVar.getMeasuredWidth(), cmvVar.getMeasuredHeight(), yhc.a, new lz(cmvVar, this.b, 18, null));
    }
}
