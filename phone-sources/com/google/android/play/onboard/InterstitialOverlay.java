package com.google.android.play.onboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.thu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterstitialOverlay extends FrameLayout {
    public static final int[] a = {R.color.play_onboard_accent_color_a, R.color.play_onboard_accent_color_b, R.color.play_onboard_accent_color_c, R.color.play_onboard_accent_color_d};
    private List b;
    private int[] c;
    private final Random d;

    public InterstitialOverlay(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() throws Resources.NotFoundException {
        int i;
        super.onAttachedToWindow();
        if (this.b == null) {
            String string = getResources().getString(R.string.play_onboard_interstitial_grid_cell);
            ArrayList<View> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this);
            while (true) {
                i = 0;
                if (arrayList2.isEmpty()) {
                    break;
                }
                View view = (View) arrayList2.remove(0);
                if (string.equals(view.getTag())) {
                    arrayList.add(view);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    while (i < childCount) {
                        arrayList2.add(viewGroup.getChildAt(i));
                        i++;
                    }
                }
            }
            if (this.c == null) {
                Context context = getContext();
                int[] iArr = a;
                int[] iArr2 = new int[4];
                Resources resources = context.getResources();
                while (i < 4) {
                    iArr2[i] = resources.getColor(iArr[i]);
                    i++;
                }
                this.c = iArr2;
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            for (View view2 : arrayList) {
                int[] iArr3 = this.c;
                Random random = this.d;
                int length = iArr3.length;
                thu thuVar = new thu(iArr3[random.nextInt(4)], random.nextInt(800));
                view2.setBackground(thuVar);
                arrayList3.add(thuVar);
            }
            this.b = arrayList3;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((thu) it.next()).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((thu) it.next()).stop();
        }
        super.onDetachedFromWindow();
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Random();
    }
}
