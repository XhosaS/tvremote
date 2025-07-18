package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sol<V extends View> extends cqv<V> {
    private som a;
    private int b;

    public sol() {
        this.b = 0;
    }

    public final int P() {
        som somVar = this.a;
        if (somVar != null) {
            return somVar.b;
        }
        return 0;
    }

    public final boolean Q(int i) {
        som somVar = this.a;
        if (somVar != null) {
            return somVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void ew(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.f(view, i);
    }

    @Override // defpackage.cqv
    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        ew(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new som(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    public sol(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
