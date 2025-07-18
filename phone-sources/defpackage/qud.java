package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qud extends FrameLayout implements rji {
    private boolean a;
    private boolean b;

    public qud(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        if (this.a) {
            rjgVar.c(this, a());
            this.b = true;
        }
    }

    public final void c(rjg rjgVar, pjs pjsVar) {
        if (this.a) {
            rjgVar.d(this, a(), pjsVar);
            this.b = true;
        }
    }

    public final void d() {
        this.a = true;
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        if (this.a && this.b) {
            rjgVar.e(this);
            this.b = false;
        }
    }
}
