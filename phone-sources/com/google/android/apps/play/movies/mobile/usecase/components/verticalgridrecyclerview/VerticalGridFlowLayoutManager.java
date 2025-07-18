package com.google.android.apps.play.movies.mobile.usecase.components.verticalgridrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;
import defpackage.mui;
import defpackage.otd;
import defpackage.otj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VerticalGridFlowLayoutManager extends FlowLayoutManager {
    private static final TypedValue b = new TypedValue();
    private static final ThreadLocal c = new ThreadLocal();
    private final VerticalGridRecyclerView d;

    public VerticalGridFlowLayoutManager(VerticalGridRecyclerView verticalGridRecyclerView) {
        this.d = verticalGridRecyclerView;
    }

    @Override // com.google.android.libraries.flowlayoutmanager.FlowLayoutManager
    /* renamed from: a */
    public final otj generateLayoutParams(Context context, AttributeSet attributeSet) {
        TypedValue typedValue;
        context.getClass();
        attributeSet.getClass();
        otj otjVar = new otj(context, attributeSet);
        VerticalGridRecyclerView verticalGridRecyclerView = this.d;
        otjVar.f = verticalGridRecyclerView.a;
        otjVar.c = verticalGridRecyclerView.b;
        otjVar.d = verticalGridRecyclerView.c;
        otjVar.l = verticalGridRecyclerView.d;
        otjVar.m = verticalGridRecyclerView.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mui.b, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                typedArrayObtainStyledAttributes.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    typedValue = b;
                } else {
                    ThreadLocal threadLocal = c;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue2 = new TypedValue();
                        threadLocal.set(typedValue2);
                    }
                    typedValue = typedValue2;
                }
                typedArrayObtainStyledAttributes.getValue(0, typedValue);
                int i = typedValue.type;
                if (i != 4) {
                    if (i != 16 && i != 17) {
                        throw new IllegalArgumentException("Unexpected value type " + ((Object) typedValue.coerceToString()) + " found for spanSize");
                    }
                    int i2 = typedValue.data;
                    if (i2 == -2) {
                        otjVar.a = otd.a(otjVar.f);
                        otjVar.v = 8;
                    } else if (i2 == -1) {
                        if (!otd.d(-1)) {
                            throw new IllegalArgumentException("Int length -1 out of range");
                        }
                        otjVar.a = -1;
                    }
                } else {
                    if (typedValue.getFloat() <= 0.0f) {
                        throw new IllegalArgumentException("spanSize must be a valid positive number");
                    }
                    if (typedValue.getFloat() > verticalGridRecyclerView.a) {
                        throw new IllegalArgumentException("spanSize must be less than recyclerview spanCount value " + otjVar.f);
                    }
                    otjVar.a = otd.b(typedArrayObtainStyledAttributes, "spanSize", 0, true);
                }
            }
            return otjVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.google.android.libraries.flowlayoutmanager.FlowLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return generateLayoutParams(context, attributeSet);
    }
}
