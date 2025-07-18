package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.leanback.widget.VerticalGridView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxa extends VerticalGridView implements duj, egf {
    private dtf ag;
    private eib ah;

    public uxa(Context context) {
        super(context);
    }

    @Override // defpackage.duj
    public final void a(List list) {
        uwu.c(this, list);
    }

    @Override // defpackage.egf
    public final void b(eib eibVar) {
        this.ah = eibVar;
    }

    @Override // defpackage.egf
    public final void c() {
        this.ah = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        eib eibVar = this.ah;
        if (eibVar != null) {
            eibVar.a.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.ag;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.duh
    public dtf getDispatchTouchListener() {
        return this.ag;
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.ag = dtfVar;
    }
}
