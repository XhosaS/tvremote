package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements xd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) {
        Window window;
        View viewPeekDecorView;
        View view;
        int i = this.b;
        if (i == 0) {
            if (xaVar != xa.ON_STOP || (window = ((kk) this.a).getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                return;
            }
            viewPeekDecorView.cancelPendingInputEvents();
            return;
        }
        if (i == 1) {
            if (xaVar != xa.ON_STOP || (view = ((q) this.a).L) == null) {
                return;
            }
            view.cancelPendingInputEvents();
            return;
        }
        if (i != 2) {
            Object obj = this.a;
            ((kk) obj).i();
            ((bh) obj).f.c(this);
        } else if (xaVar == xa.ON_DESTROY) {
            kk kkVar = (kk) this.a;
            kkVar.g.b = null;
            if (!kkVar.isChangingConfigurations()) {
                kkVar.K().K();
            }
            kj kjVar = kkVar.n;
            kk kkVar2 = kjVar.b;
            kkVar2.getWindow().getDecorView().removeCallbacks(kjVar);
            kkVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kjVar);
        }
    }

    public /* synthetic */ kg(kk kkVar, int i) {
        this.b = i;
        this.a = kkVar;
    }
}
