package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eew {
    public static int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    public static void b(int i, int i2, float f, dxt dxtVar) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iCeil = (int) Math.ceil(size / f);
        int iCeil2 = (int) Math.ceil(size2 * f);
        if (mode == 0) {
            mode = 0;
            if (mode2 == 0) {
                dxtVar.a = 0;
                dxtVar.b = 0;
                return;
            }
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (iCeil > size2) {
                dxtVar.a = iCeil2;
                dxtVar.b = size2;
                return;
            } else {
                dxtVar.a = size;
                dxtVar.b = iCeil;
                return;
            }
        }
        if (mode == 1073741824) {
            dxtVar.a = size;
            if (mode2 == 0 || iCeil <= size2) {
                dxtVar.b = iCeil;
                return;
            } else {
                dxtVar.b = size2;
                return;
            }
        }
        if (mode2 == 1073741824) {
            dxtVar.b = size2;
            if (mode == 0 || iCeil2 <= size) {
                dxtVar.a = iCeil2;
                return;
            } else {
                dxtVar.a = size;
                return;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            dxtVar.a = size;
            dxtVar.b = iCeil;
        } else if (mode2 == Integer.MIN_VALUE) {
            dxtVar.a = iCeil2;
            dxtVar.b = size2;
        }
    }
}
