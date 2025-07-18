package com.google.android.play.drawer;

import android.R;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import defpackage.sqd;

/* compiled from: PG */
/* loaded from: classes2.dex */
class PlayDrawerDownloadSwitchRow extends RelativeLayout implements Checkable, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private TextView a;
    private Switch b;
    private boolean c;
    private int d;
    private final View.OnTouchListener e;

    public PlayDrawerDownloadSwitchRow(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.c;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z != this.c) {
            setChecked(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        toggle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.c) {
            mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.checked});
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(com.google.android.videos.R.id.action_text);
        setOnClickListener(this);
        View viewFindViewById = findViewById(com.google.android.videos.R.id.switch_button);
        if (viewFindViewById != null) {
            Switch r0 = (Switch) viewFindViewById;
            this.b = r0;
            r0.setOnCheckedChangeListener(this);
            this.b.setOnTouchListener(this.e);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(PlayDrawerDownloadSwitchRow.class.getName());
        accessibilityEvent.setChecked(this.c);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CheckBox.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.c != z) {
            this.c = z;
            Switch r0 = this.b;
            if (r0 != null) {
                r0.setChecked(z);
                this.b.refreshDrawableState();
            }
            this.a.setTextColor(z ? 0 : this.d);
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.c);
    }

    public PlayDrawerDownloadSwitchRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new sqd(3);
        this.d = getResources().getColor(com.google.android.videos.R.color.play_fg_primary);
    }
}
