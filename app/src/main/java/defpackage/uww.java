package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.leanback.widget.HorizontalGridView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uww extends HorizontalGridView implements duj, egf {
    private dtf ai;
    private eib aj;

    public uww(Context context) {
        super(context);
    }

    @Override // defpackage.duj
    public final void a(List list) {
        uwu.c(this, list);
    }

    @Override // defpackage.egf
    public final void b(eib eibVar) {
        this.aj = eibVar;
    }

    @Override // defpackage.egf
    public final void c() {
        this.aj = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        eib eibVar = this.aj;
        if (eibVar != null) {
            eibVar.a.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.ai;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.duh
    public dtf getDispatchTouchListener() {
        return this.ai;
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.ai = dtfVar;
    }
}
