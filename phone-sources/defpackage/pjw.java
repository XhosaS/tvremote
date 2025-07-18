package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjw {
    public final pjy a;

    public pjw(pjy pjyVar) {
        this.a = pjyVar;
    }

    public static pjv a(boolean z) {
        vvd vvdVar = ple.c;
        vtw vtwVarM = udh.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        int i = true != z ? 3 : 2;
        udh udhVar = (udh) vtwVarM.b;
        udhVar.c = i - 1;
        udhVar.b |= 1;
        return new pjv(vvdVar, (udh) vtwVarM.r());
    }

    public static pjw b() {
        return new ntp(4).u();
    }

    public static pjw c() {
        return new ntp(32).u();
    }

    public final int d() {
        int iAz = sfy.az(this.a.c);
        if (iAz == 0) {
            return 1;
        }
        return iAz;
    }

    public final String toString() {
        String str;
        String string = super.toString();
        switch (d()) {
            case 1:
                str = "UNASSIGNED_USER_ACTION_ID";
                break;
            case 2:
                str = "AUTOMATED";
                break;
            case 3:
                str = "USER";
                break;
            case 4:
                str = "GENERIC_CLICK";
                break;
            case 5:
                str = "TAP";
                break;
            case 6:
                str = "KEYBOARD_ENTER";
                break;
            case 7:
                str = "MOUSE_CLICK";
                break;
            case 8:
                str = "LEFT_CLICK";
                break;
            case 9:
                str = "RIGHT_CLICK";
                break;
            case 10:
                str = "HOVER";
                break;
            case 11:
                str = "INTO_BOUNDING_BOX";
                break;
            case 12:
                str = "OUT_OF_BOUNDING_BOX";
                break;
            case 13:
                str = "PINCH";
                break;
            case 14:
                str = "PINCH_OPEN";
                break;
            case 15:
                str = "PINCH_CLOSED";
                break;
            case 16:
                str = "INPUT_TEXT";
                break;
            case 17:
                str = "INPUT_KEYBOARD";
                break;
            case 18:
                str = "INPUT_VOICE";
                break;
            case 19:
                str = "RESIZE_BROWSER";
                break;
            case 20:
                str = "ROTATE_SCREEN";
                break;
            case 21:
                str = "DIRECTIONAL_MOVEMENT";
                break;
            case 22:
                str = "SWIPE";
                break;
            case 23:
                str = "SCROLL_BAR";
                break;
            case 24:
                str = "MOUSE_WHEEL";
                break;
            case 25:
                str = "ARROW_KEYS";
                break;
            case 26:
                str = "NAVIGATE";
                break;
            case 27:
                str = "BACK_BUTTON";
                break;
            case 28:
                str = "UNKNOWN_ACTION";
                break;
            case 29:
                str = "HEAD_MOVEMENT";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                str = "SHAKE";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                str = "DRAG";
                break;
            case 32:
                str = "LONG_PRESS";
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                str = "KEY_PRESS";
                break;
            case 34:
                str = "ACTION_BY_TIMER";
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                str = "DOUBLE_CLICK";
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                str = "DOUBLE_TAP";
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                str = "ROLL";
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                str = "DROP";
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                str = "FORCE_TOUCH";
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                str = "MULTI_KEY_PRESS";
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                str = "TWO_FINGER_DRAG";
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                str = "ENTER_PROXIMITY";
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            default:
                str = "null";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                str = "CAUSAL_USER_ACTION";
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                str = "CAUSAL_AUTOMATED";
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                str = "INPUT_STYLUS";
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                str = "TWO_FINGER_DRAG_UP";
                break;
            case 50:
                str = "TWO_FINGER_DRAG_DOWN";
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                str = "BROWSER_ACTION";
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                str = "VIDEO_STATS";
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                str = "DRAW_CIRCLE";
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                str = "DRAW_STRIKETHROUGH";
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                str = "SNAP";
                break;
        }
        return string + " " + str + " " + String.valueOf(this.a);
    }
}
