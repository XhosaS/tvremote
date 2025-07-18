package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cyq;
import defpackage.sqq;
import defpackage.sqs;
import defpackage.sqt;
import defpackage.squ;
import defpackage.suy;
import defpackage.szb;
import defpackage.tac;
import defpackage.tde;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends sqq {
    public boolean e;
    public boolean f;
    public boolean g;
    private final LinkedHashSet h;
    private final int i;
    private Set j;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private final String n() {
        return (this.f ? RadioButton.class : ToggleButton.class).getName();
    }

    private final void o(Set set) {
        Set set2 = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = a(i).getId();
            Integer numValueOf = Integer.valueOf(id);
            boolean zContains = set.contains(numValueOf);
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.e = true;
                ((MaterialButton) viewFindViewById).j(zContains);
                this.e = false;
            }
            if (set2.contains(numValueOf) != set.contains(numValueOf)) {
                boolean zContains2 = set.contains(numValueOf);
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((sqt) it.next()).a(this, id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // defpackage.sqq, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        if (materialButton.u()) {
            materialButton.e.r = true;
        }
        materialButton.g = n();
        k(materialButton.getId(), materialButton.j);
        cww.p(materialButton, new sqs(this));
    }

    @Override // defpackage.sqq
    public final boolean g() {
        return false;
    }

    public final void j(sqt sqtVar) {
        this.h.add(sqtVar);
    }

    public final void k(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: -1");
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z) {
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                return;
            }
            if (this.f && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(numValueOf);
        } else {
            Integer numValueOf2 = Integer.valueOf(i);
            if (!hashSet.contains(numValueOf2)) {
                return;
            }
            if (!this.g || hashSet.size() > 1) {
                hashSet.remove(numValueOf2);
            }
        }
        o(hashSet);
    }

    public final void l(boolean z) {
        if (this.f != z) {
            this.f = z;
            o(new HashSet());
        }
        String strN = n();
        for (int i = 0; i < getChildCount(); i++) {
            a(i).g = strN;
        }
    }

    public final boolean m(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            o(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m(i2)) {
                i++;
            }
        }
        cyqVar.v(cxe.k(1, i, false, true != this.f ? 2 : 1));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.h = new LinkedHashSet();
        this.e = false;
        this.j = new HashSet();
        TypedArray typedArrayA = suy.a(getContext(), attributeSet, squ.d, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        l(typedArrayA.getBoolean(7, false));
        this.i = typedArrayA.getResourceId(2, -1);
        this.g = typedArrayA.getBoolean(4, false);
        if (this.b == null) {
            this.b = tac.b(new szb(0.0f));
        }
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        setImportantForAccessibility(1);
    }
}
