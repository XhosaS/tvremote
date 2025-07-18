package com.google.android.apps.play.movies.common.view.tagging;

import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cww;
import defpackage.ljl;
import defpackage.lwo;
import defpackage.lwq;
import defpackage.lwu;
import defpackage.mgg;
import defpackage.mgh;
import defpackage.mgl;
import defpackage.mgm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TagsView extends FrameLayout {
    public int a;
    public int b;
    public List c;
    private final List d;

    public TagsView(Context context) {
        this(context, null, 0);
    }

    private final void c() {
        this.d.clear();
        removeAllViews();
    }

    public final void a() {
        c();
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        mgg mggVar;
        c();
        List list = this.c;
        if (list == null || list.isEmpty() || this.a == 0 || this.b == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        rectF.offset((this.a - getWidth()) / 2.0f, (this.b - getHeight()) / 2.0f);
        int i = 0;
        int i2 = 0;
        while (true) {
            mggVar = null;
            if (i2 >= this.c.size()) {
                break;
            }
            lwu lwuVar = (lwu) this.c.get(i2);
            lwq lwqVar = lwuVar.a;
            lwo lwoVar = lwuVar.c;
            if (lwoVar != null) {
                mgh mghVar = new mgh(getContext());
                String str = lwqVar.c;
                if (!TextUtils.isEmpty(str)) {
                    mggVar = new mgg(getContext());
                    RectF rectF2 = mggVar.e;
                    lwoVar.b(rectF2);
                    float fMeasureText = mggVar.a.measureText(str);
                    rectF2.top = rectF2.bottom + mggVar.b;
                    rectF2.bottom = rectF2.top + mggVar.c;
                    rectF2.left = rectF2.centerX() - (fMeasureText / 2.0f);
                    rectF2.right = rectF2.left + fMeasureText;
                    mggVar.f = str;
                    mggVar.g = rectF2.bottom;
                    mggVar.h = mghVar;
                    float f = -mggVar.d;
                    rectF2.inset(f, f);
                    mggVar.d(rectF2, rectF);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        mgg mggVar2 = (mgg) arrayList.get(i3);
                        if (RectF.intersects(mggVar.l, mggVar2.l)) {
                            mggVar.b(mggVar2);
                            mggVar2.b(mggVar);
                        }
                    }
                    arrayList.add(mggVar);
                }
                mghVar.d = lwuVar;
                mghVar.e = mggVar;
                RectF rectF3 = mghVar.c;
                lwoVar.b(rectF3);
                float f2 = -(mghVar.b + mghVar.a);
                rectF3.inset(f2, f2);
                mghVar.d(rectF3, rectF);
                this.d.add(mghVar);
            }
            i2++;
        }
        List list2 = this.d;
        mgm mgmVar = mgl.i;
        Collections.sort(list2, mgmVar);
        int size = list2.size() - 1;
        for (int i4 = size; i4 >= 0; i4--) {
            addView((mgh) list2.get(i4), size - i4);
        }
        Collections.sort(list2, mgl.k);
        int i5 = 0;
        View view = null;
        while (i5 < list2.size()) {
            View view2 = (View) list2.get(i5);
            if (view != null) {
                view.setNextFocusDownId(view2.getId());
                view2.setNextFocusUpId(view.getId());
            }
            i5++;
            view = view2;
        }
        Collections.sort(list2, mgl.j);
        int i6 = 0;
        while (i < list2.size()) {
            mgl mglVar = (mgl) list2.get(i);
            if (mggVar != null) {
                mggVar.setNextFocusRightId(mglVar.getId());
                mglVar.setNextFocusLeftId(mggVar.getId());
            }
            i6++;
            mglVar.c(i6);
            i++;
            mggVar = mglVar;
        }
        list2.addAll(arrayList);
        Collections.sort(list2, mgmVar);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.c != null) {
            post(new ljl(this, 18, null));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public TagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList();
        int[] iArr = cww.a;
        setLayoutDirection(0);
    }
}
