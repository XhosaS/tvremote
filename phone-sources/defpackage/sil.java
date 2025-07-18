package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sil {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            default:
                return 0;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 31;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 32;
            case 32:
                return 33;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 34;
            case 34:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 36;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 37;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 38;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 39;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 40;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 41;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 43;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 45;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 46;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 47;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 48;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 49;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 50;
            case 50:
                return 51;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 52;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 53;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 54;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return 55;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return 56;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return 57;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return 58;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return 59;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return 60;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return 61;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return 62;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return 63;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return 64;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return 65;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return 66;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return 67;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return 68;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return 69;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return 70;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return 71;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return 72;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return 73;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return 74;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return 75;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return 76;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return 77;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return 78;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return 79;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return 80;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return 81;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return 82;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return 83;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return 84;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return 85;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return 86;
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return 87;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return 88;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return 89;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return 90;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return 91;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return 92;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return 93;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return 94;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return 95;
            case 95:
                return 96;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return 97;
        }
    }

    public static Uri b(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static uhp c(uhp uhpVar) {
        return ufn.i(uhpVar, new tsm(null), ugk.a);
    }

    public static float d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static boolean e(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static float f(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float g(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static Rect h(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static ViewGroup j(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlay k(View view) {
        ViewGroup viewGroupJ = j(view);
        if (viewGroupJ != null) {
            return viewGroupJ.getOverlay();
        }
        return null;
    }

    public static InputMethodManager l(View view) {
        return (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
    }

    public static void m(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void n(View view, svd svdVar) {
        svb svbVar = new svb(svdVar, new sve(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()));
        int[] iArr = cww.a;
        cwm.l(view, svbVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new svc());
        }
    }

    public static void o(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean p(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static boolean q() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu");
    }

    public static void r(float f, float[] fArr) {
        float f2 = f + f;
        if (f <= 0.5f) {
            fArr[0] = 1.0f - f2;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = f2 - 1.0f;
        }
    }
}
