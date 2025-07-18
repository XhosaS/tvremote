package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.gm.dialogs.MaxDimensionsLinearLayout;
import com.google.android.videos.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydl {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ydl(Context context, qpl qplVar, kwy kwyVar) {
        this.d = context;
        this.b = qplVar;
        this.c = kwyVar;
    }

    public static int e(Activity activity, Configuration configuration, int i) {
        return configuration != null ? qtl.x(activity.getResources().getDisplayMetrics(), configuration.screenHeightDp) : i;
    }

    public static int f(Activity activity, Configuration configuration, int i) {
        return configuration != null ? qtl.x(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp) : i;
    }

    public static final int j(Activity activity, boolean z, int i) throws Resources.NotFoundException {
        int i2;
        WindowInsets rootWindowInsets;
        int stableInsetBottom;
        if (z) {
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_bottom_sheet_top_margin);
            if (qtl.H()) {
                stableInsetBottom = activity.getWindowManager().getCurrentWindowMetrics().getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout()).bottom;
            } else {
                View viewFindViewById = activity.findViewById(android.R.id.content);
                stableInsetBottom = (viewFindViewById == null || (rootWindowInsets = viewFindViewById.getRootWindowInsets()) == null) ? 0 : rootWindowInsets.getStableInsetBottom();
            }
            i2 = dimensionPixelOffset + stableInsetBottom;
        } else {
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            i2 = dimensionPixelOffset2 + dimensionPixelOffset2;
        }
        return i - i2;
    }

    public static final uyc k(uyr uyrVar) {
        int i = uyrVar.c;
        if (i == 2) {
            return (uyc) uyrVar.d;
        }
        if (i != 6) {
            throw new IllegalArgumentException("PromoUi can't be built using a DialogBuilder.");
        }
        uyc uycVar = ((uyo) uyrVar.d).d;
        return uycVar == null ? uyc.a : uycVar;
    }

    public static final FrameLayout l(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2, 1));
        return frameLayout;
    }

    private static void o(boolean z, LinearLayout linearLayout, int i) {
        int i2 = 0;
        while (i2 < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i2);
            boolean z2 = i2 == linearLayout.getChildCount() + (-1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.setMarginEnd((z || z2) ? 0 : i);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = (!z || z2) ? 0 : i;
            i2++;
        }
    }

    private static void p(LinearLayout linearLayout, int i) {
        o(true, linearLayout, i);
    }

    private static void q(View view, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    private static final boolean r(uyc uycVar) {
        int iBm;
        return ((uycVar.b & 256) == 0 || (iBm = a.bm(uycVar.m)) == 0 || iBm != 3) ? false : true;
    }

    private static final void s(ViewGroup viewGroup, boolean z) {
        NestedScrollView nestedScrollView = (NestedScrollView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gm_dialog_scrollview, viewGroup, false);
        nestedScrollView.setScrollbarFadingEnabled(true);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        if (z) {
            View viewFindViewById = viewGroup.findViewById(R.id.gm_dialog_image);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.gm_dialog_content);
            View viewFindViewById2 = viewGroup.findViewById(R.id.gm_dialog_button_pane);
            viewFindViewById2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
            viewGroup2.removeView(viewFindViewById2);
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
            viewGroup.removeView(viewFindViewById);
            viewGroup.removeView(viewGroup2);
            linearLayout.addView(viewFindViewById);
            linearLayout.addView(viewGroup2);
            viewGroup.addView(viewFindViewById2);
        } else {
            View viewFindViewById3 = viewGroup.findViewById(R.id.gm_dialog_title);
            View viewFindViewById4 = viewGroup.findViewById(R.id.gm_dialog_body);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.removeView(viewFindViewById4);
            linearLayout.addView(viewFindViewById3);
            linearLayout.addView(viewFindViewById4);
        }
        nestedScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(nestedScrollView, 0, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    public final void a(boolean z, ydi ydiVar, zgk zgkVar, boolean z2) {
        zgkVar.getClass();
        int iB = ydiVar.b();
        boolean zD = ydiVar.d();
        int i = (int) zgkVar.b;
        if (zD || iB < i) {
            if (!zD && iB > 0) {
                ydiVar.c(zgkVar, iB, false);
            }
            ydiVar.a.eW(zgkVar, (int) zgkVar.b);
            ydiVar.d = z | ydiVar.d;
        } else {
            ydiVar.c(zgkVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yeb] */
    public final void b() {
        try {
            this.c.c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ydj] */
    public final void c() {
        ?? r0 = this.b;
        ydi[] ydiVarArrR = r0.r();
        Collections.shuffle(Arrays.asList(ydiVarArrR));
        int length = ydiVarArrR.length;
        int i = ((ydi) this.d).b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                ydi ydiVar = ydiVarArrR[i3];
                int iMin = Math.min(i, Math.min(ydiVar.a(), iCeil));
                if (iMin > 0) {
                    ydiVar.c += iMin;
                    i -= iMin;
                }
                if (ydiVar.a() > 0) {
                    ydiVarArrR[i2] = ydiVar;
                    i2++;
                }
            }
            length = i2;
        }
        ydk ydkVar = new ydk();
        for (ydi ydiVar2 : r0.r()) {
            ydiVar2.e(ydiVar2.c, ydkVar);
            ydiVar2.c = 0;
        }
        if (ydkVar.a()) {
            b();
        }
    }

    public final void d(ydi ydiVar, int i) {
        if (ydiVar == null) {
            ((ydi) this.d).f(i);
            c();
            return;
        }
        ydiVar.f(i);
        ydk ydkVar = new ydk();
        ydiVar.e(ydiVar.b(), ydkVar);
        if (ydkVar.a()) {
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6 A[Catch: pgf -> 0x0314, TryCatch #1 {pgf -> 0x0314, blocks: (B:49:0x00e8, B:50:0x00f0, B:52:0x00f8, B:54:0x0104, B:61:0x0123, B:86:0x01b4, B:88:0x01c6, B:89:0x01ca, B:59:0x0114, B:65:0x0131, B:71:0x015c, B:70:0x0141, B:72:0x0168, B:74:0x0172, B:75:0x0174, B:77:0x017a, B:79:0x018a, B:80:0x018c, B:82:0x01a6, B:84:0x01aa, B:85:0x01ac, B:81:0x019a, B:91:0x01d5, B:93:0x01ea, B:94:0x01ec, B:96:0x01f3, B:98:0x0206, B:100:0x020e, B:101:0x0210, B:105:0x021c, B:108:0x022d, B:115:0x025a, B:119:0x0262, B:121:0x0273, B:122:0x0285, B:124:0x028f, B:125:0x0291, B:127:0x0295, B:128:0x0297, B:130:0x02a2, B:131:0x02a4, B:133:0x02af, B:134:0x02b1, B:136:0x02bc, B:140:0x02d0, B:142:0x02d5, B:143:0x02db, B:145:0x02e5, B:146:0x02e7, B:148:0x02ec, B:113:0x0237, B:114:0x0251, B:97:0x01fd), top: B:158:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca A[Catch: pgf -> 0x0314, TryCatch #1 {pgf -> 0x0314, blocks: (B:49:0x00e8, B:50:0x00f0, B:52:0x00f8, B:54:0x0104, B:61:0x0123, B:86:0x01b4, B:88:0x01c6, B:89:0x01ca, B:59:0x0114, B:65:0x0131, B:71:0x015c, B:70:0x0141, B:72:0x0168, B:74:0x0172, B:75:0x0174, B:77:0x017a, B:79:0x018a, B:80:0x018c, B:82:0x01a6, B:84:0x01aa, B:85:0x01ac, B:81:0x019a, B:91:0x01d5, B:93:0x01ea, B:94:0x01ec, B:96:0x01f3, B:98:0x0206, B:100:0x020e, B:101:0x0210, B:105:0x021c, B:108:0x022d, B:115:0x025a, B:119:0x0262, B:121:0x0273, B:122:0x0285, B:124:0x028f, B:125:0x0291, B:127:0x0295, B:128:0x0297, B:130:0x02a2, B:131:0x02a4, B:133:0x02af, B:134:0x02b1, B:136:0x02bc, B:140:0x02d0, B:142:0x02d5, B:143:0x02db, B:145:0x02e5, B:146:0x02e7, B:148:0x02ec, B:113:0x0237, B:114:0x0251, B:97:0x01fd), top: B:158:0x00e8 }] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, qpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View g(android.app.Activity r20, defpackage.uyr r21, defpackage.uyv r22, defpackage.uyc r23, java.util.List r24) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.g(android.app.Activity, uyr, uyv, uyc, java.util.List):android.view.View");
    }

    public final void h(Dialog dialog, uyc uycVar, Activity activity, View view, int i, int i2) throws Resources.NotFoundException {
        int iMin;
        int i3;
        int iBm;
        boolean zR = r(uycVar);
        MaxDimensionsLinearLayout maxDimensionsLinearLayout = (MaxDimensionsLinearLayout) view.findViewById(R.id.gm_dialog_container);
        boolean z = dialog instanceof sqg;
        int iJ = j(activity, z, i2);
        maxDimensionsLinearLayout.a = iJ;
        maxDimensionsLinearLayout.requestLayout();
        float f = i;
        if (z) {
            iMin = (int) (Math.min((int) (f / r3), 640) * activity.getResources().getDisplayMetrics().density);
        } else {
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            displayMetrics.getClass();
            float f2 = f / displayMetrics.density;
            int i4 = (f2 < 600.0f ? 1 : f2 < 840.0f ? 2 : 3) - 1;
            int dimensionPixelOffset = i4 != 1 ? i4 != 2 ? activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_compact) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_expanded) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_medium);
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            iMin = Math.min(dimensionPixelOffset, i - (dimensionPixelOffset2 + dimensionPixelOffset2));
        }
        if (z) {
            maxDimensionsLinearLayout.b = iMin;
            maxDimensionsLinearLayout.requestLayout();
        } else if (dialog.getWindow() != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = iMin;
            layoutParams.height = -2;
            dialog.getWindow().setAttributes(layoutParams);
        }
        int dimensionPixelOffset3 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_content_side_padding);
        int i5 = iMin - (dimensionPixelOffset3 + dimensionPixelOffset3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gm_dialog_content);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        if (linearLayout.getChildCount() > 1 && linearLayout.getOrientation() == 0) {
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(iJ, 0));
            if (linearLayout.getMeasuredWidth() > i5) {
                linearLayout.setOrientation(1);
                int childCount = linearLayout.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i6 = 0; i6 < childCount; i6++) {
                    viewArr[i6] = linearLayout.getChildAt(0);
                    linearLayout.removeViewAt(0);
                }
                for (int i7 = 0; i7 < childCount; i7++) {
                    linearLayout.addView(viewArr[i7], 0);
                }
                p(linearLayout, this.a);
                q(linearLayout, 1);
            }
        }
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iJ, 0));
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (!zR) {
            if ((uycVar.b & 256) == 0 || (iBm = a.bm(uycVar.m)) == 0 || iBm != 2) {
                i3 = 0;
            } else {
                int dimensionPixelOffset4 = ((Context) this.d).getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_icon_padding);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelOffset4, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                i3 = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin + dimensionPixelOffset4;
            }
            if (measuredHeight + i3 > iJ) {
                s(viewGroup, false);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(iJ, 0));
        int measuredHeight2 = linearLayout2.getMeasuredHeight();
        ImageView imageView = (ImageView) view.findViewById(R.id.gm_dialog_image);
        int i8 = iJ - measuredHeight;
        int dimensionPixelOffset5 = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_large_image_min_height);
        if (i8 >= dimensionPixelOffset5) {
            imageView.setMaxHeight(i8);
        } else {
            imageView.setMaxHeight(Math.max(dimensionPixelOffset5, (int) ((iJ - measuredHeight2) * 0.5d)));
            s(maxDimensionsLinearLayout, true);
        }
    }

    public final void i(final Activity activity, final Dialog dialog, final Configuration configuration, final uyc uycVar, final View view) throws Resources.NotFoundException {
        final View viewFindViewById = activity.findViewById(android.R.id.content);
        int height = viewFindViewById.getHeight();
        int width = viewFindViewById.getWidth();
        if (height == 0) {
            viewFindViewById.post(new Runnable() { // from class: pgq
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    Activity activity2 = activity;
                    Configuration configuration2 = configuration;
                    View view2 = viewFindViewById;
                    this.g.h(dialog, uycVar, activity2, view, ydl.f(activity2, configuration2, view2.getWidth()), ydl.e(activity2, configuration2, view2.getHeight()));
                }
            });
        } else {
            h(dialog, uycVar, activity, view, f(activity, configuration, width), e(activity, configuration, height));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    public final gcl m() {
        Object obj = this.d;
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth() * bitmap.getHeight();
        double dSqrt = width > 12544 ? Math.sqrt(12544.0d / width) : -1.0d;
        int i = 0;
        Object objCreateScaledBitmap = dSqrt <= 0.0d ? obj : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
        Bitmap bitmap2 = (Bitmap) objCreateScaledBitmap;
        int width2 = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int[] iArr = new int[width2 * height];
        bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height);
        int i2 = this.a;
        ?? r5 = this.c;
        gcj gcjVar = new gcj(iArr, i2, r5.isEmpty() ? null : (gez[]) r5.toArray(new gez[r5.size()]));
        if (objCreateScaledBitmap != obj) {
            bitmap2.recycle();
        }
        gcl gclVar = new gcl(gcjVar.c, this.b);
        List list = gclVar.b;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            gcm gcmVar = (gcm) list.get(i3);
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = i; i4 < 3; i4++) {
                float f3 = gcmVar.i[i4];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                for (int i5 = i; i5 < 3; i5++) {
                    float[] fArr = gcmVar.i;
                    float f4 = fArr[i5];
                    if (f4 > 0.0f) {
                        fArr[i5] = f4 / f2;
                    }
                }
            }
            ko koVar = gclVar.c;
            List list2 = gclVar.a;
            int size2 = list2.size();
            int i6 = i;
            float f5 = 0.0f;
            gck gckVar = null;
            while (i6 < size2) {
                int i7 = i;
                gck gckVar2 = (gck) list2.get(i6);
                float[] fArrA = gckVar2.a();
                float f6 = fArrA[1];
                float f7 = f;
                float[] fArr2 = gcmVar.g;
                if (f6 >= fArr2[i7] && f6 <= fArr2[2]) {
                    float f8 = fArrA[2];
                    float[] fArr3 = gcmVar.h;
                    if (f8 >= fArr3[i7] && f8 <= fArr3[2] && !gclVar.d.get(gckVar2.a)) {
                        float[] fArrA2 = gckVar2.a();
                        gck gckVar3 = gclVar.e;
                        float fC = (gcmVar.c() > f7 ? gcmVar.c() * (1.0f - Math.abs(fArrA2[1] - fArr2[1])) : f7) + (gcmVar.a() > f7 ? gcmVar.a() * (1.0f - Math.abs(fArrA2[2] - fArr3[1])) : f7) + (gcmVar.b() > f7 ? gcmVar.b() * (gckVar2.b / (gckVar3 != null ? gckVar3.b : 1)) : f7);
                        if (gckVar == null || fC > f5) {
                            gckVar = gckVar2;
                            f5 = fC;
                        }
                    }
                }
                i6++;
                i = i7;
                f = f7;
            }
            int i8 = i;
            if (gckVar != null) {
                boolean z = gcmVar.j;
                gclVar.d.append(gckVar.a, true);
            } else {
                gckVar = null;
            }
            koVar.put(gcmVar, gckVar);
            i3++;
            i = i8;
        }
        gclVar.d.clear();
        return gclVar;
    }

    public final void n() {
        this.a = 1;
    }

    public ydl(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = 16;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(gcl.f);
        this.d = bitmap;
        arrayList.add(gcm.a);
        arrayList.add(gcm.b);
        arrayList.add(gcm.c);
        arrayList.add(gcm.d);
        arrayList.add(gcm.e);
        arrayList.add(gcm.f);
    }

    public ydl(ydj ydjVar, yeb yebVar) {
        this.b = ydjVar;
        yebVar.getClass();
        this.c = yebVar;
        this.a = 65535;
        this.d = new ydi(this, 0, 65535, null);
    }
}
