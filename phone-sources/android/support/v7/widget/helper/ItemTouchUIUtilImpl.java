package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;
import defpackage.cwm;
import defpackage.cww;

/* compiled from: PG */
/* loaded from: classes.dex */
class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                int[] iArr = cww.a;
                float fA = cwm.a(childAt);
                if (fA > f) {
                    f = fA;
                }
            }
        }
        return f;
    }

    @Override // android.support.v7.widget.helper.ItemTouchUIUtil
    public void clearView(View view) {
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            int[] iArr = cww.a;
            cwm.j(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // android.support.v7.widget.helper.ItemTouchUIUtil
    public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int[] iArr = cww.a;
            Float fValueOf = Float.valueOf(cwm.a(view));
            cwm.j(view, findMaxElevation(recyclerView, view) + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // android.support.v7.widget.helper.ItemTouchUIUtil
    public void onSelected(View view) {
    }

    @Override // android.support.v7.widget.helper.ItemTouchUIUtil
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
