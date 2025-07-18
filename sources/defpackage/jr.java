package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jr implements eg {
    du a;
    public dw b;
    final /* synthetic */ Toolbar c;

    public jr(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.eg
    public final void b(Context context, du duVar) {
        dw dwVar;
        du duVar2 = this.a;
        if (duVar2 != null && (dwVar = this.b) != null) {
            duVar2.t(dwVar);
        }
        this.a = duVar;
    }

    @Override // defpackage.eg
    public final void d(ef efVar) {
        throw null;
    }

    @Override // defpackage.eg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eg
    public final boolean f(en enVar) {
        return false;
    }

    @Override // defpackage.eg
    public final boolean g(dw dwVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.i;
        if (view instanceof dy) {
            ((dy) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                dwVar.h(false);
                toolbar.t();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.eg
    public final boolean h(dw dwVar) {
        Toolbar toolbar = this.c;
        if (toolbar.h == null) {
            toolbar.h = new fo(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.h.setImageDrawable(toolbar.f);
            toolbar.h.setContentDescription(toolbar.g);
            js jsVar = new js();
            jsVar.a = (toolbar.n & 112) | 8388611;
            jsVar.b = 2;
            toolbar.h.setLayoutParams(jsVar);
            toolbar.h.setOnClickListener(new er(toolbar, 2));
        }
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        toolbar.i = dwVar.getActionView();
        this.b = dwVar;
        ViewParent parent2 = toolbar.i.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            js jsVar2 = new js();
            jsVar2.a = 8388611 | (toolbar.n & 112);
            jsVar2.b = 2;
            toolbar.i.setLayoutParams(jsVar2);
            toolbar.addView(toolbar.i);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((js) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.r.add(childAt);
            }
        }
        toolbar.requestLayout();
        dwVar.h(true);
        View view = toolbar.i;
        if (view instanceof dy) {
            ((dy) view).a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.eg
    public final void i() {
        if (this.b != null) {
            du duVar = this.a;
            if (duVar != null) {
                int size = duVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.eg
    public final void c(du duVar, boolean z) {
    }
}
