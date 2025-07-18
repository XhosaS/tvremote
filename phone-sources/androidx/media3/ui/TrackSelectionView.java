package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.dxc;
import defpackage.fsq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView a;
    public final CheckedTextView b;
    public final List c;
    public final Map d;
    public boolean e;
    private final int f;
    private final LayoutInflater g;
    private final fsq h;

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.g = layoutInflaterFrom;
        fsq fsqVar = new fsq(this, 4, null);
        this.h = fsqVar;
        new dxc(getResources());
        this.c = new ArrayList();
        this.d = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.google.android.videos.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(fsqVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.google.android.videos.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.google.android.videos.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(fsqVar);
        addView(checkedTextView2);
    }
}
