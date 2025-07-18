package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ehc extends RecyclerView implements egf {
    private eib ad;

    public ehc(Context context) {
        super(context, null, 0);
    }

    @Override // defpackage.egf
    public final void b(eib eibVar) {
        this.ad = eibVar;
    }

    @Override // defpackage.egf
    public final void c() {
        this.ad = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        eib eibVar = this.ad;
        if (eibVar != null) {
            eibVar.a.C();
        }
    }
}
