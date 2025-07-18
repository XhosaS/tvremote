package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayq extends pq implements awr {
    ayp d;
    public azn e;
    aws f;
    public aym g;
    private azd i;
    public ArrayList h = new ArrayList();
    private final azc j = new ayl(this);

    @Override // defpackage.pq
    public final int a() {
        azd azdVar = this.i;
        if (azdVar != null) {
            return azdVar.a();
        }
        return 0;
    }

    @Override // defpackage.pq
    public final int b(int i) {
        azn aznVar = this.e;
        if (aznVar == null) {
            aznVar = this.i.f;
        }
        azm azmVarA = aznVar.a(this.i.b(i));
        int iIndexOf = this.h.indexOf(azmVarA);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        this.h.add(azmVarA);
        int iIndexOf2 = this.h.indexOf(azmVarA);
        m(azmVarA, iIndexOf2);
        return iIndexOf2;
    }

    @Override // defpackage.pq
    public final long c(int i) {
        return -1L;
    }

    @Override // defpackage.pq
    public final qv d(ViewGroup viewGroup, int i) {
        azk azkVarQ;
        View view;
        azm azmVar = (azm) this.h.get(i);
        ayp aypVar = this.d;
        if (aypVar != null) {
            Context context = viewGroup.getContext();
            baq baqVar = ((ayr) aypVar).a;
            if (!baqVar.e) {
                throw new IllegalArgumentException();
            }
            bap bapVar = new bap(context, baqVar.a, baqVar.b, baqVar.g, baqVar.h, baqVar.f);
            azkVarQ = azmVar.q(viewGroup);
            View view2 = azkVarQ.g;
            if (!bapVar.a || bapVar.b != null) {
                throw new IllegalStateException();
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
                layoutParams.width = layoutParams.width == -1 ? -1 : -2;
                layoutParams.height = layoutParams.height == -1 ? -1 : -2;
                bapVar.setLayoutParams(layoutParams);
                bapVar.addView(view2, layoutParams2);
            } else {
                bapVar.addView(view2);
            }
            if (bapVar.c && bapVar.d != 3) {
                azq.a(bapVar, bapVar.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
            }
            bapVar.b = view2;
            view = bapVar;
        } else {
            azkVarQ = azmVar.q(viewGroup);
            view = azkVarQ.g;
        }
        ayo ayoVar = new ayo(azmVar, view, azkVarQ);
        p(ayoVar);
        aym aymVar = this.g;
        if (aymVar != null) {
            atx atxVar = ((att) aymVar).a;
            VerticalGridView verticalGridView = atxVar.b;
            if (verticalGridView != null) {
                verticalGridView.setClipChildren(false);
            }
            azw azwVarY = ((azx) ayoVar.s).y(ayoVar.t);
            if (azwVarY instanceof ayx) {
                ayx ayxVar = (ayx) azwVarY;
                HorizontalGridView horizontalGridView = ayxVar.a;
                qk qkVar = atxVar.ap;
                if (qkVar == null) {
                    atxVar.ap = horizontalGridView.getRecycledViewPool();
                } else {
                    horizontalGridView.e.m(qkVar);
                }
                ayq ayqVar = ayxVar.b;
                ArrayList arrayList = atxVar.aq;
                if (arrayList == null) {
                    atxVar.aq = ayqVar.h;
                } else {
                    ayqVar.h = arrayList;
                }
            }
            atxVar.ak = true;
            ayoVar.v = new atw(ayoVar);
            atx.aI(ayoVar, false, true);
        }
        View view3 = ayoVar.t.g;
        View.OnFocusChangeListener onFocusChangeListener = view3.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof ayn) {
            View.OnFocusChangeListener onFocusChangeListener2 = ((ayn) onFocusChangeListener).a;
            view3.setOnFocusChangeListener(null);
        }
        return ayoVar;
    }

    @Override // defpackage.awr
    public final awq e(int i) {
        return (awq) this.h.get(i);
    }

    @Override // defpackage.pq
    public final void f(qv qvVar, int i) {
        ayo ayoVar = (ayo) qvVar;
        ayoVar.u = this.i.b(i);
        ayoVar.s.s(ayoVar.t, ayoVar.u);
        o(ayoVar);
    }

    @Override // defpackage.pq
    public final void i(qv qvVar) {
        ayo ayoVar = (ayo) qvVar;
        azm azmVar = ayoVar.s;
        azk azkVar = ayoVar.t;
        azmVar.w(azkVar);
        q(ayoVar);
        aym aymVar = this.g;
        if (aymVar != null) {
            atx atxVar = ((att) aymVar).a;
            ayo ayoVar2 = atxVar.ai;
            if (ayoVar2 == ayoVar) {
                atx.aI(ayoVar2, false, true);
                atxVar.ai = null;
            }
            azw azwVarY = ((azx) azmVar).y(azkVar);
            azwVarY.r = null;
            azwVarY.s = null;
        }
    }

    @Override // defpackage.pq
    public final void j(qv qvVar) {
        ayo ayoVar = (ayo) qvVar;
        ayoVar.s.u(ayoVar.t);
        r(ayoVar);
        if (this.g != null) {
            atx.aI(ayoVar, false, true);
        }
        ayoVar.u = null;
    }

    @Override // defpackage.pq
    public final void l(qv qvVar) {
        j(qvVar);
    }

    public final void s(azd azdVar) {
        azd azdVar2 = this.i;
        if (azdVar == azdVar2) {
            return;
        }
        if (azdVar2 != null) {
            azdVar2.e.unregisterObserver(this.j);
        }
        this.i = azdVar;
        if (azdVar == null) {
            this.a.a();
            return;
        }
        azdVar.e.registerObserver(this.j);
        if (this.b) {
            k(false);
        }
        this.a.a();
    }

    @Override // defpackage.pq
    public final void u(qv qvVar, int i, List list) {
        ayo ayoVar = (ayo) qvVar;
        ayoVar.u = this.i.b(i);
        ayoVar.s.t(ayoVar.t, ayoVar.u, list);
        o(ayoVar);
    }

    @Override // defpackage.pq
    public final void v(qv qvVar) {
        ayo ayoVar = (ayo) qvVar;
        n(ayoVar);
        aym aymVar = this.g;
        if (aymVar != null) {
            atx atxVar = ((att) aymVar).a;
            atx.aH(ayoVar, atxVar.aj);
            azx azxVar = (azx) ayoVar.s;
            azw azwVarY = azxVar.y(ayoVar.t);
            azxVar.m(azwVarY, atxVar.al);
            azwVarY.r = atxVar.an;
            azwVarY.s = atxVar.ao;
            azxVar.e(azwVarY, atxVar.am);
        }
        ayoVar.s.v(ayoVar.t);
    }

    protected void n(ayo ayoVar) {
    }

    protected void o(ayo ayoVar) {
    }

    protected void p(ayo ayoVar) {
    }

    protected void q(ayo ayoVar) {
    }

    protected void r(ayo ayoVar) {
    }

    protected void m(azm azmVar, int i) {
    }
}
