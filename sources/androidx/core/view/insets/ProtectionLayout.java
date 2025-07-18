package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.tv.remote.service.R;
import defpackage.ki;
import defpackage.tc;
import defpackage.tg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private tc c;

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }

    private final void a() {
        tg tgVar;
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof tg) {
            tgVar = (tg) tag;
        } else {
            tgVar = new tg(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, tgVar);
        }
        this.c = new tc(tgVar, list);
        getChildCount();
        if (this.c.a() <= 0) {
            return;
        }
        this.c.c();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            if (this.c.a() > 0) {
                this.c.c();
                throw null;
            }
            tc tcVar = this.c;
            if (!tcVar.d) {
                tcVar.d = true;
                tcVar.b.b.remove(tcVar);
                ArrayList arrayList = tcVar.a;
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
            tc tcVar = this.c;
            int childCount = getChildCount() - (tcVar != null ? tcVar.a() : 0);
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
        if (tag instanceof tg) {
            tg tgVar = (tg) tag;
            if (tgVar.b.isEmpty()) {
                tgVar.a.post(new ki(tgVar, 4));
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
