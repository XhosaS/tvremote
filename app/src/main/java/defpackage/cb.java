package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cb extends FrameLayout {
    public boolean a;
    private final List b;
    private final List c;
    private View.OnApplyWindowInsetsListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(Context context, AttributeSet attributeSet, de deVar) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        bq bqVarC = deVar.b.c(id);
        if (classAttribute != null && bqVarC == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            cd cdVarE = deVar.e();
            context.getClassLoader();
            bq bqVarB = cdVarE.b(classAttribute);
            bqVarB.getClass();
            bqVarB.G = id;
            bqVarB.H = id;
            bqVarB.I = string;
            bqVarB.C = deVar;
            bqVarB.D = deVar.n;
            bqVarB.P = true;
            ab abVar = new ab(deVar);
            abVar.s = true;
            bqVarB.Q = this;
            bqVarB.y = true;
            abVar.f(getId(), bqVarB, string, 1);
            abVar.p();
            abVar.a.D(abVar, true);
        }
        for (dm dmVar : deVar.b.g()) {
            bq bqVar = dmVar.b;
            if (bqVar.H == getId() && (view = bqVar.R) != null && view.getParent() == null) {
                bqVar.Q = this;
                dmVar.a();
                dmVar.d();
            }
        }
    }

    private final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (de.d(view) == null) {
            throw new IllegalStateException(a.c(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ajc ajcVarE;
        windowInsets.getClass();
        ajc ajcVarG = ajc.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            ajcVarE = ajc.g(windowInsetsOnApplyWindowInsets, null);
        } else {
            ajcVarE = ahj.e(this, ajcVarG);
        }
        ajcVarE.getClass();
        if (!ajcVarE.b.q()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ahj.r(getChildAt(i), ajcVarE);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.a) {
            List list = this.b;
            if (!list.isEmpty() && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    public final bq getFragment() {
        bw bwVar;
        de deVarEg;
        bq bqVarC = de.c(this);
        if (bqVarC == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    bwVar = null;
                    break;
                }
                if (context instanceof bw) {
                    bwVar = (bw) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (bwVar == null) {
                throw new IllegalStateException(a.c(this, "View ", " is not within a subclass of FragmentActivity."));
            }
            deVarEg = bwVar.a.a.e;
        } else {
            if (!bqVarC.ao()) {
                throw new IllegalStateException(a.f(this, bqVarC, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
            }
            deVarEg = bqVarC.eg();
        }
        return deVarEg.b.c(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
