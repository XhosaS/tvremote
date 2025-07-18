package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sb implements jw {
    jj a;
    public jm b;
    final /* synthetic */ Toolbar c;

    public sb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.jw
    public final void c(Context context, jj jjVar) {
        jm jmVar;
        jj jjVar2 = this.a;
        if (jjVar2 != null && (jmVar = this.b) != null) {
            jjVar2.r(jmVar);
        }
        this.a = jjVar;
    }

    @Override // defpackage.jw
    public final void e(jv jvVar) {
        throw null;
    }

    @Override // defpackage.jw
    public final boolean g() {
        return false;
    }

    @Override // defpackage.jw
    public final boolean h(ke keVar) {
        return false;
    }

    @Override // defpackage.jw
    public final boolean i(jm jmVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.f;
        if (view instanceof jo) {
            ((jo) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f);
        toolbar.removeView(toolbar.e);
        toolbar.f = null;
        ArrayList arrayList = toolbar.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                jmVar.h(false);
                toolbar.s();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.jw
    public final boolean j(jm jmVar) {
        Toolbar toolbar = this.c;
        toolbar.e();
        ViewParent parent = toolbar.e.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.e);
            }
            toolbar.addView(toolbar.e);
        }
        toolbar.f = jmVar.getActionView();
        this.b = jmVar;
        ViewParent parent2 = toolbar.f.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f);
            }
            sc scVar = new sc();
            scVar.a = (toolbar.k & 112) | 8388611;
            scVar.b = 2;
            toolbar.f.setLayoutParams(scVar);
            toolbar.addView(toolbar.f);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((sc) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.m.add(childAt);
            }
        }
        toolbar.requestLayout();
        jmVar.h(true);
        View view = toolbar.f;
        if (view instanceof jo) {
            ((jo) view).a.onActionViewExpanded();
        }
        toolbar.s();
        return true;
    }

    @Override // defpackage.jw
    public final void l() {
        if (this.b != null) {
            jj jjVar = this.a;
            if (jjVar != null) {
                int size = jjVar.c.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
        }
    }

    @Override // defpackage.jw
    public final void d(jj jjVar, boolean z) {
    }
}
