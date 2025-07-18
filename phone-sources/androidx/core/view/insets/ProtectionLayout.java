package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.caw;
import defpackage.czm;
import defpackage.czq;
import defpackage.fqv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private fqv c;

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }

    private final void a() {
        czq czqVar;
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof czq) {
            czqVar = (czq) tag;
        } else {
            czqVar = new czq(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, czqVar);
        }
        this.c = new fqv(czqVar, list);
        getChildCount();
        if (this.c.d() <= 0) {
            return;
        }
        this.c.e();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.d(), this.c.d());
            if (this.c.d() > 0) {
                this.c.e();
                throw null;
            }
            fqv fqvVar = this.c;
            if (!fqvVar.c) {
                fqvVar.c = true;
                ((czq) fqvVar.d).b.remove(fqvVar);
                ArrayList arrayList = (ArrayList) fqvVar.a;
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
            fqv fqvVar = this.c;
            int childCount = getChildCount() - (fqvVar != null ? fqvVar.d() : 0);
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
        if (tag instanceof czq) {
            czq czqVar = (czq) tag;
            if (czqVar.b.isEmpty()) {
                czqVar.a.post(new caw(czqVar, 10));
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

    public ProtectionLayout(Context context, List<czm> list) {
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
