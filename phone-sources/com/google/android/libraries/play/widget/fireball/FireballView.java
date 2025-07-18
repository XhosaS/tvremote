package com.google.android.libraries.play.widget.fireball;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import defpackage.cwm;
import defpackage.cww;
import defpackage.sea;
import defpackage.seb;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FireballView<N> extends ViewGroup {
    public final sea a;
    private final RecyclerView b;
    private final List c;
    private final int d;

    public FireballView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.b.layout(0, 0, i5, i6);
        List list = this.c;
        if (list.isEmpty()) {
            return;
        }
        ((Rect) list.get(0)).set(0, 0, i5, i6);
        cww.t(this, list);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        RecyclerView recyclerView = this.b;
        measureChild(recyclerView, i, i2);
        setMeasuredDimension(recyclerView.getMeasuredWidthAndState(), recyclerView.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String[] stringArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
            layoutManager.getClass();
            layoutManager.onRestoreInstanceState(bundle.getParcelable("layoutManagerState"));
            sea seaVar = this.a;
            Parcelable parcelable3 = bundle.getParcelable("viewModelState");
            if ((parcelable3 instanceof Bundle) && (stringArray = ((Bundle) parcelable3).getStringArray("expandedIds")) != null) {
                seaVar.e = ImmutableSet.copyOf(stringArray);
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
        layoutManager.getClass();
        Parcelable parcelableOnSaveInstanceState2 = layoutManager.onSaveInstanceState();
        Bundle bundle = new Bundle();
        Set set = this.a.e;
        bundle.putStringArray("expandedIds", (String[]) set.toArray(new String[set.size()]));
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("layoutManagerState", parcelableOnSaveInstanceState2);
        bundle2.putParcelable("viewModelState", bundle);
        bundle2.putParcelable("superState", parcelableOnSaveInstanceState);
        return bundle2;
    }

    @Override // android.view.View
    public final void setFocusableInTouchMode(boolean z) {
        super.setFocusableInTouchMode(z);
        this.b.setFocusableInTouchMode(z);
    }

    public FireballView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.play__fireball__view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tags_recycler_view);
        recyclerView.getClass();
        this.b = recyclerView;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, seb.d, R.attr.fireballViewStyle, 0);
        int[] iArr = {typedArrayObtainStyledAttributes.getColor(4, 0), typedArrayObtainStyledAttributes.getColor(5, 0), typedArrayObtainStyledAttributes.getColor(6, 0), typedArrayObtainStyledAttributes.getColor(7, 0), typedArrayObtainStyledAttributes.getColor(8, 0)};
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i > 0 && i2 >= i) {
            throw new IllegalArgumentException("groupCollapsedLength must be less than groupCollapsibleMinLength!");
        }
        this.c = typedArrayObtainStyledAttributes.getBoolean(0, false) ? ImmutableList.of(new Rect()) : ImmutableList.of();
        int[] iArr2 = cww.a;
        cwm.k(recyclerView, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, resources.getDimensionPixelSize(R.dimen.play__fireball__outline_height));
        this.d = dimensionPixelSize;
        this.a = new sea(recyclerView, typedArrayObtainStyledAttributes.getColor(15, 0), typedArrayObtainStyledAttributes.getColor(17, 0), iArr, typedArrayObtainStyledAttributes.getColor(16, 0), typedArrayObtainStyledAttributes.getColor(10, 0), typedArrayObtainStyledAttributes.getColor(9, 0), dimensionPixelSize, typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.play__fireball__divider_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(14, resources.getDimensionPixelSize(R.dimen.play__fireball__outline_spacing)), i, i2);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        recyclerView.setPadding(dimensionPixelSize2, recyclerView.getPaddingTop(), dimensionPixelSize2, recyclerView.getPaddingBottom());
        typedArrayObtainStyledAttributes.recycle();
    }
}
