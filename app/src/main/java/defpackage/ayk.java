package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayk {
    private static final Rect a = new Rect();

    public static int a(View view, ayi ayiVar, int i) {
        View viewFindViewById;
        axa axaVar = (axa) view.getLayoutParams();
        int i2 = ayiVar.b;
        if (i2 == 0 || (viewFindViewById = view.findViewById(i2)) == null) {
            viewFindViewById = view;
        }
        int height = ayiVar.d;
        if (i != 0) {
            if (ayiVar.f) {
                float f = ayiVar.e;
                if (f == 0.0f) {
                    height += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    height -= viewFindViewById.getPaddingBottom();
                }
            }
            if (ayiVar.e != -1.0f) {
                height += (int) (((viewFindViewById == view ? (viewFindViewById.getHeight() - axaVar.b) - axaVar.h : viewFindViewById.getHeight()) * ayiVar.e) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = a;
                rect.top = height;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                height = rect.top - axaVar.b;
            }
            return ayiVar.g ? height + viewFindViewById.getBaseline() : height;
        }
        if (view.getLayoutDirection() != 1) {
            if (ayiVar.f) {
                float f2 = ayiVar.e;
                if (f2 == 0.0f) {
                    height += viewFindViewById.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    height -= viewFindViewById.getPaddingRight();
                }
            }
            if (ayiVar.e != -1.0f) {
                height += (int) (((viewFindViewById == view ? axaVar.a(viewFindViewById) : viewFindViewById.getWidth()) * ayiVar.e) / 100.0f);
            }
            if (view == viewFindViewById) {
                return height;
            }
            Rect rect2 = a;
            rect2.left = height;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return rect2.left - axaVar.a;
        }
        int iA = (viewFindViewById == view ? axaVar.a(viewFindViewById) : viewFindViewById.getWidth()) - height;
        if (ayiVar.f) {
            float f3 = ayiVar.e;
            if (f3 == 0.0f) {
                iA -= viewFindViewById.getPaddingRight();
            } else if (f3 == 100.0f) {
                iA += viewFindViewById.getPaddingLeft();
            }
        }
        if (ayiVar.e != -1.0f) {
            iA -= (int) (((viewFindViewById == view ? axaVar.a(viewFindViewById) : viewFindViewById.getWidth()) * ayiVar.e) / 100.0f);
        }
        if (view == viewFindViewById) {
            return iA;
        }
        Rect rect3 = a;
        rect3.right = iA;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return rect3.right + axaVar.g;
    }
}
