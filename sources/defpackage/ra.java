package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ra implements cva {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ra(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cva
    public final Iterator a() {
        int i = this.b;
        if (i == 0) {
            return new qb(new ra(this.a, 1).a(), qz.a);
        }
        if (i == 1) {
            return new cdt((ViewGroup) this.a, 1);
        }
        cvb cvbVar = new cvb();
        cvbVar.a = ((ctd) this.a).e(cvbVar, cvbVar);
        return cvbVar;
    }
}
