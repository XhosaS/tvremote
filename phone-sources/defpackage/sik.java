package defpackage;

import android.net.Uri;
import android.support.v7.appcompat.R;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sik {
    public static ssd A(ssd ssdVar) {
        double d = ssdVar.a;
        boolean z = false;
        if (Math.round(d) >= 90.0d && Math.round(d) <= 111.0d) {
            z = true;
        }
        double d2 = ssdVar.b;
        return (!z || ((double) Math.round(d2)) <= 16.0d || ((double) Math.round(ssdVar.c)) >= 65.0d) ? ssdVar : ssd.a(d, d2, 70.0d);
    }

    public static IOException B(aafi aafiVar, Uri uri, IOException iOException, String str) {
        try {
            sko skoVar = new sko();
            skoVar.b();
            File file = (File) aafiVar.r(uri, skoVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? D(file, iOException, str) : D(file, iOException, str) : file.canWrite() ? D(file, iOException, str) : D(file, iOException, str) : file.canRead() ? file.canWrite() ? D(file, iOException, str) : D(file, iOException, str) : file.canWrite() ? D(file, iOException, str) : D(file, iOException, str) : D(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static IOException C(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException D(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? C(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? C(file, iOException, str) : C(file, iOException, str) : parentFile.canWrite() ? C(file, iOException, str) : C(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? C(file, iOException, str) : C(file, iOException, str) : parentFile.canWrite() ? C(file, iOException, str) : C(file, iOException, str) : C(file, iOException, str);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
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
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            default:
                return 0;
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
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 44;
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
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return 98;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return 99;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return 100;
            case 100:
                return 101;
            case 101:
                return R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return R.styleable.AppCompatTheme_textAppearanceListItem;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSmall;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return 108;
            case 108:
                return 109;
            case 109:
                return R.styleable.AppCompatTheme_textColorAlertDialogListItem;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return R.styleable.AppCompatTheme_textColorSearchUrl;
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                return R.styleable.AppCompatTheme_toolbarStyle;
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return R.styleable.AppCompatTheme_tooltipForegroundColor;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return R.styleable.AppCompatTheme_tooltipFrameBackground;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return R.styleable.AppCompatTheme_viewInflaterClass;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return R.styleable.AppCompatTheme_windowActionBar;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return R.styleable.AppCompatTheme_windowActionBarOverlay;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return R.styleable.AppCompatTheme_windowActionModeOverlay;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return R.styleable.AppCompatTheme_windowFixedHeightMajor;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return R.styleable.AppCompatTheme_windowFixedHeightMinor;
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return R.styleable.AppCompatTheme_windowFixedWidthMajor;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
        }
    }

    public static final void b(sme smeVar, HashMap map) {
        String strA = smeVar.a();
        sij.s(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, smeVar);
    }

    public static final double c(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public static final double[] d(int i) {
        double[] dArrL = srz.l(i);
        return new double[]{dArrL[0], dArrL[1], dArrL[2]};
    }

    public static double e(double d, double d2, double d3) {
        return ((1.0d - d3) * d) + (d3 * d2);
    }

    public static double f(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static int g(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static int h(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    public static double i(double d, double d2) {
        if (d2 < 0.0d) {
            return 0.0d;
        }
        return d2 > d ? d : d2;
    }

    public static int j(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static /* synthetic */ Double s(ssc sscVar) {
        return Double.valueOf(true != ((ssc) obj).b ? 90.0d : 10.0d);
    }

    public static /* synthetic */ Double t(ssc sscVar) {
        z(sscVar);
        return Double.valueOf(true != sscVar.b ? 100.0d : 20.0d);
    }

    public static final ssb u() {
        return new ssb("background", new ssh(4), new ssh(5), true, null, null, null);
    }

    public static final ssb v() {
        return new ssb("inverse_surface", new ssf(17), new ssf(18), false, null, null, null);
    }

    public static final ssb w() {
        return new ssb("surface_bright", new ssh(14), new ssh(15), true, null, null, null);
    }

    public static final ssb x() {
        return new ssb("surface_dim", new ssf(9), new ssf(19), true, null, null, null);
    }

    public static final void y(ssc sscVar) {
        int i = sscVar.d;
    }

    public static void z(ssc sscVar) {
        int i = sscVar.d;
    }

    public final ssb k() {
        return new ssb("error", new ssf(8), new ssf(10), true, new ssi(16), new ssa(3.0d, 4.5d, 7.0d, 7.0d), new opy(this, 9));
    }

    public final ssb l() {
        return new ssb("error_container", new ssg(3), new ssg(4), true, new ssi(16), new ssa(1.0d, 1.0d, 3.0d, 4.5d), new opy(this, 11));
    }

    public final ssb m() {
        return new ssb("primary", new ssg(6), new ssg(7), true, new ssi(16), new ssa(3.0d, 4.5d, 7.0d, 7.0d), new opy(this, 12));
    }

    public final ssb n() {
        return new ssb("primary_container", new ssh(2), new ssh(3), true, new ssi(16), new ssa(1.0d, 1.0d, 3.0d, 4.5d), new opy(this, 15));
    }

    public final ssb o() {
        return new ssb("secondary", new nrc(18), new nrc(19), true, new ssi(16), new ssa(3.0d, 4.5d, 7.0d, 7.0d), new opy(this, 4));
    }

    public final ssb p() {
        int i = 16;
        return new ssb("secondary_container", new ssg(i), new ssg(17), true, new ssi(i), new ssa(1.0d, 1.0d, 3.0d, 4.5d), new opy(this, 14));
    }

    public final ssb q() {
        return new ssb("tertiary", new ssg(9), new ssg(10), true, new ssi(16), new ssa(3.0d, 4.5d, 7.0d, 7.0d), new opy(this, 13));
    }

    public final ssb r() {
        return new ssb("tertiary_container", new ssi(14), new ssi(15), true, new ssi(16), new ssa(1.0d, 1.0d, 3.0d, 4.5d), new ssj(this, 1));
    }
}
