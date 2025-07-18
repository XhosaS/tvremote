package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk {
    private final int a;

    public bqk() {
        throw null;
    }

    public final int a(View view) {
        Rect rect = vy.a;
        vu vuVar = (vu) view.getLayoutParams();
        View viewFindViewById = view.findViewById(-1);
        if (viewFindViewById == null) {
            viewFindViewById = view;
        }
        if (this.a != 0) {
            int height = (int) (((viewFindViewById == view ? (viewFindViewById.getHeight() - vuVar.b) - vuVar.h : viewFindViewById.getHeight()) * 50.0f) / 100.0f);
            if (view == viewFindViewById) {
                return height;
            }
            Rect rect2 = vy.a;
            rect2.top = height;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return rect2.top - vuVar.b;
        }
        if (view.getLayoutDirection() == 1) {
            int iE = (viewFindViewById == view ? vuVar.e(viewFindViewById) : viewFindViewById.getWidth()) - ((int) (((viewFindViewById == view ? vuVar.e(viewFindViewById) : viewFindViewById.getWidth()) * 50.0f) / 100.0f));
            if (view == viewFindViewById) {
                return iE;
            }
            Rect rect3 = vy.a;
            rect3.right = iE;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
            return rect3.right + vuVar.g;
        }
        int iE2 = (int) (((viewFindViewById == view ? vuVar.e(viewFindViewById) : viewFindViewById.getWidth()) * 50.0f) / 100.0f);
        if (view == viewFindViewById) {
            return iE2;
        }
        Rect rect4 = vy.a;
        rect4.left = iE2;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect4);
        return rect4.left - vuVar.a;
    }

    public final byte[] b(dln dlnVar) {
        Object obj = dlnVar.b;
        int i = dlnVar.a;
        int i2 = this.a;
        if (i == i2) {
            return (byte[]) obj;
        }
        if (i2 % i != 0) {
            throw new IllegalArgumentException(String.format("Fractional upsampling from %dHz to %dHz is not supported", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i2 / i;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length * i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 1;
            if (i6 >= bArr.length) {
                return bArr2;
            }
            byte b = bArr[i4];
            byte b2 = bArr[i6];
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = i5 + 1;
                bArr2[i5] = b;
                i5 += 2;
                bArr2[i8] = b2;
            }
            i4 += 2;
        }
    }

    public bqk(int i) {
        this.a = i;
    }
}
