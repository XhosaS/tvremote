package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tm implements pn {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public tm(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.pn
    public final float a() {
        float fA;
        if (this.b != 0) {
            RecyclerView recyclerView = (RecyclerView) this.a;
            if (recyclerView.m.W()) {
                fA = recyclerView.F;
            } else {
                if (!recyclerView.m.V()) {
                    return 0.0f;
                }
                fA = recyclerView.E;
            }
        } else {
            fA = ((NestedScrollView) this.a).a();
        }
        return -fA;
    }

    @Override // defpackage.pn
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView) this.a).W();
        } else {
            ((NestedScrollView) this.a).a.abortAnimation();
        }
    }

    @Override // defpackage.pn
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b == 0) {
            if (f == 0.0f) {
                return false;
            }
            b();
            ((NestedScrollView) this.a).j((int) f);
            return true;
        }
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.m.W()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.m.V()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.W();
        return recyclerView.Z(i, i2, 0, Integer.MAX_VALUE);
    }
}
