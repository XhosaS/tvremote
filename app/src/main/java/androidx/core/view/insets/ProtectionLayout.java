package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.katniss.R;
import defpackage.akk;
import defpackage.akp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private akk c;

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }

    private final void a() {
        akp akpVar;
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof akp) {
            akpVar = (akp) tag;
        } else {
            akpVar = new akp(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, akpVar);
        }
        this.c = new akk(akpVar, list);
        getChildCount();
        if (this.c.a.size() <= 0) {
            return;
        }
        this.c.c();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a.size(), this.c.a.size());
            if (this.c.a.size() > 0) {
                this.c.c();
                throw null;
            }
            akk akkVar = this.c;
            if (!akkVar.d) {
                akkVar.d = true;
                akkVar.b.b.remove(akkVar);
                ArrayList arrayList = akkVar.a;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    throw null;
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            akk akkVar = this.c;
            int childCount = getChildCount() - (akkVar != null ? akkVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof akp) {
            final akp akpVar = (akp) tag;
            if (akpVar.b.isEmpty()) {
                akpVar.a.post(new Runnable() { // from class: akm
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = akpVar.a;
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(view);
                        }
                    }
                });
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }

    public ProtectionLayout(Context context, List list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
