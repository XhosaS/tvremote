package com.google.android.apps.googletv.app.presentation.views.tagfilter;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import defpackage.cwm;
import defpackage.cww;
import defpackage.kke;
import defpackage.kkg;
import defpackage.sea;
import defpackage.ykn;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FireballView<N> extends ViewGroup {
    private final RecyclerView a;
    private final List b;
    private final int c;
    private final sea d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FireballView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public final void a(kke kkeVar) {
        this.d.b.add(kkeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kkv r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView.b(kkv, java.util.List):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.a.layout(0, 0, i5, i6);
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        ((Rect) list.get(0)).set(0, 0, i5, i6);
        cww.t(this, list);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        RecyclerView recyclerView = this.a;
        measureChild(recyclerView, i, i2);
        setMeasuredDimension(recyclerView.getMeasuredWidthAndState(), recyclerView.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String[] stringArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            RecyclerView.LayoutManager layoutManager = this.a.getLayoutManager();
            layoutManager.getClass();
            Parcelable parcelable3 = bundle.getParcelable("layoutManagerState");
            parcelable3.getClass();
            layoutManager.onRestoreInstanceState(parcelable3);
            sea seaVar = this.d;
            Parcelable parcelable4 = bundle.getParcelable("viewModelState");
            if ((parcelable4 instanceof Bundle) && (stringArray = ((Bundle) parcelable4).getStringArray("expandedIds")) != null) {
                ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(stringArray);
                immutableSetCopyOf.getClass();
                seaVar.e = immutableSetCopyOf;
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView recyclerView = this.a;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        Parcelable parcelableOnSaveInstanceState2 = layoutManager.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putStringArray("expandedIds", (String[]) this.d.e.toArray(new String[0]));
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("layoutManagerState", parcelableOnSaveInstanceState2);
        bundle2.putParcelable("viewModelState", bundle);
        bundle2.putParcelable("superState", parcelableOnSaveInstanceState);
        return bundle2;
    }

    @Override // android.view.View
    public final void setFocusableInTouchMode(boolean z) {
        super.setFocusableInTouchMode(z);
        this.a.setFocusableInTouchMode(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FireballView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gtv__fireball__view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tags_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.a = recyclerView;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kkg.b, R.attr.fireballViewStyle, 0);
        typedArrayObtainStyledAttributes.getClass();
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i > 0 && i2 >= i) {
            throw new IllegalArgumentException("groupCollapsedLength must be less than groupCollapsibleMinLength!");
        }
        ImmutableList immutableListOf = typedArrayObtainStyledAttributes.getBoolean(0, false) ? ImmutableList.of(new Rect()) : ImmutableList.of();
        immutableListOf.getClass();
        this.b = immutableListOf;
        int[] iArr = cww.a;
        cwm.k(recyclerView, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, resources.getDimensionPixelSize(R.dimen.gtv__fireball__outline_height));
        this.c = dimensionPixelSize;
        int color = typedArrayObtainStyledAttributes.getColor(10, 0);
        typedArrayObtainStyledAttributes.getColor(9, 0);
        this.d = new sea(recyclerView, color, dimensionPixelSize, typedArrayObtainStyledAttributes.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.gtv__fireball__divider_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(14, resources.getDimensionPixelSize(R.dimen.gtv__fireball__outline_spacing)), i, i2);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        recyclerView.setPadding(dimensionPixelSize2, recyclerView.getPaddingTop(), dimensionPixelSize2, recyclerView.getPaddingBottom());
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ FireballView(Context context, AttributeSet attributeSet, int i, ykn yknVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
