package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqn {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = cqr.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMinor, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMajor, 67);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarStyle, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(R.styleable.AppCompatTheme_tooltipForegroundColor, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMinor, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(R.styleable.AppCompatTheme_viewInflaterClass, 82);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMajor, 83);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionModeOverlay, 84);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBarOverlay, 85);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBar, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 83);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItem, 84);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqn.j(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void k(cqe cqeVar, String str) throws NumberFormatException {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i2 = i;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f > 0.0f && f2 > 0.0f) {
                        fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
                i2 = i;
            }
        }
        cqeVar.I = str;
        cqeVar.J = fAbs;
        cqeVar.K = i2;
    }

    private static final int[] o(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object objD;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = cqq.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) view.getParent()).d(strTrim)) != null && (objD instanceof Integer)) ? ((Integer) objD).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final cqi p(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        String str;
        String str2;
        int i;
        cqi cqiVar = new cqi();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? cqr.c : cqr.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            cqh cqhVar = new cqh();
            cqiVar.g = cqhVar;
            cqk cqkVar = cqiVar.c;
            cqkVar.b = false;
            cqj cqjVar = cqiVar.d;
            cqjVar.c = false;
            cql cqlVar = cqiVar.b;
            cqlVar.a = false;
            cqm cqmVar = cqiVar.e;
            cqmVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (c.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.K));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case 32:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    default:
                        str2 = str3;
                        i = indexCount;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + b.get(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cqjVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cqjVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 12:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 13:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 14:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cqjVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cqjVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, cqjVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, cqlVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, cqjVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(27, typedArrayObtainStyledAttributes.getInt(index, cqjVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 28:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 34:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, cqiVar.a);
                        cqiVar.a = resourceId;
                        cqhVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(41, typedArrayObtainStyledAttributes.getInt(index, cqjVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(42, typedArrayObtainStyledAttributes.getInt(index, cqjVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, cqlVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.d(44, true);
                        cqhVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, cqmVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, cqmVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, cqmVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, cqmVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 50:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, cqmVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(54, typedArrayObtainStyledAttributes.getInt(index, cqjVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(55, typedArrayObtainStyledAttributes.getInt(index, cqjVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, cqmVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, cqjVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(64, a(typedArrayObtainStyledAttributes, index, cqkVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            cqhVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            cqhVar.c(65, coz.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, cqkVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, cqlVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(72, typedArrayObtainStyledAttributes.getInt(index, cqjVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, cqjVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(76, typedArrayObtainStyledAttributes.getInt(index, cqkVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(78, typedArrayObtainStyledAttributes.getInt(index, cqlVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, cqkVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, cqjVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, cqjVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, cqkVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(83, a(typedArrayObtainStyledAttributes, index, cqmVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, cqkVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        str2 = str3;
                        i = indexCount;
                        cqhVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, cqkVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        i = indexCount;
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            cqkVar.n = resourceId2;
                            cqhVar.b(89, resourceId2);
                            if (cqkVar.n != -1) {
                                cqhVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            cqkVar.m = typedArrayObtainStyledAttributes.getString(index);
                            cqhVar.c(90, cqkVar.m);
                            if (cqkVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cqkVar.n = resourceId3;
                                cqhVar.b(89, resourceId3);
                                cqhVar.b(88, -2);
                            } else {
                                cqhVar.b(88, -1);
                            }
                        } else {
                            cqhVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, cqkVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + b.get(index));
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                        i = indexCount;
                        cqhVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.N));
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        i = indexCount;
                        cqhVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cqjVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        j(cqhVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        i = indexCount;
                        j(cqhVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        i = indexCount;
                        cqhVar.b(97, typedArrayObtainStyledAttributes.getInt(index, cqjVar.aq));
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            cqiVar.a = typedArrayObtainStyledAttributes.getResourceId(index, cqiVar.a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        cqhVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, cqjVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            String str4 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    cqiVar.c.b = true;
                    cqiVar.d.c = true;
                    cqiVar.b.a = true;
                    cqiVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        cqj cqjVar2 = cqiVar.d;
                        cqjVar2.r = a(typedArrayObtainStyledAttributes, index2, cqjVar2.r);
                        break;
                    case 2:
                        str = str4;
                        cqj cqjVar3 = cqiVar.d;
                        cqjVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar3.K);
                        break;
                    case 3:
                        str = str4;
                        cqj cqjVar4 = cqiVar.d;
                        cqjVar4.q = a(typedArrayObtainStyledAttributes, index2, cqjVar4.q);
                        break;
                    case 4:
                        str = str4;
                        cqj cqjVar5 = cqiVar.d;
                        cqjVar5.p = a(typedArrayObtainStyledAttributes, index2, cqjVar5.p);
                        break;
                    case 5:
                        str = str4;
                        cqiVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        cqj cqjVar6 = cqiVar.d;
                        cqjVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, cqjVar6.E);
                        break;
                    case 7:
                        str = str4;
                        cqj cqjVar7 = cqiVar.d;
                        cqjVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, cqjVar7.F);
                        break;
                    case 8:
                        str = str4;
                        cqj cqjVar8 = cqiVar.d;
                        cqjVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar8.L);
                        break;
                    case 9:
                        str = str4;
                        cqj cqjVar9 = cqiVar.d;
                        cqjVar9.x = a(typedArrayObtainStyledAttributes, index2, cqjVar9.x);
                        break;
                    case 10:
                        str = str4;
                        cqj cqjVar10 = cqiVar.d;
                        cqjVar10.w = a(typedArrayObtainStyledAttributes, index2, cqjVar10.w);
                        break;
                    case 11:
                        str = str4;
                        cqj cqjVar11 = cqiVar.d;
                        cqjVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar11.R);
                        break;
                    case 12:
                        str = str4;
                        cqj cqjVar12 = cqiVar.d;
                        cqjVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar12.S);
                        break;
                    case 13:
                        str = str4;
                        cqj cqjVar13 = cqiVar.d;
                        cqjVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar13.O);
                        break;
                    case 14:
                        str = str4;
                        cqj cqjVar14 = cqiVar.d;
                        cqjVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        cqj cqjVar15 = cqiVar.d;
                        cqjVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar15.T);
                        break;
                    case 16:
                        str = str4;
                        cqj cqjVar16 = cqiVar.d;
                        cqjVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar16.P);
                        break;
                    case 17:
                        str = str4;
                        cqj cqjVar17 = cqiVar.d;
                        cqjVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, cqjVar17.f);
                        break;
                    case 18:
                        str = str4;
                        cqj cqjVar18 = cqiVar.d;
                        cqjVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, cqjVar18.g);
                        break;
                    case 19:
                        str = str4;
                        cqj cqjVar19 = cqiVar.d;
                        cqjVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar19.h);
                        break;
                    case 20:
                        str = str4;
                        cqj cqjVar20 = cqiVar.d;
                        cqjVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar20.y);
                        break;
                    case 21:
                        str = str4;
                        cqj cqjVar21 = cqiVar.d;
                        cqjVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, cqjVar21.e);
                        break;
                    case 22:
                        str = str4;
                        cql cqlVar2 = cqiVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, cqlVar2.b);
                        cqlVar2.b = i5;
                        cqlVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        cqj cqjVar22 = cqiVar.d;
                        cqjVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, cqjVar22.d);
                        break;
                    case 24:
                        str = str4;
                        cqj cqjVar23 = cqiVar.d;
                        cqjVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar23.H);
                        break;
                    case 25:
                        str = str4;
                        cqj cqjVar24 = cqiVar.d;
                        cqjVar24.j = a(typedArrayObtainStyledAttributes, index2, cqjVar24.j);
                        break;
                    case 26:
                        str = str4;
                        cqj cqjVar25 = cqiVar.d;
                        cqjVar25.k = a(typedArrayObtainStyledAttributes, index2, cqjVar25.k);
                        break;
                    case 27:
                        str = str4;
                        cqj cqjVar26 = cqiVar.d;
                        cqjVar26.G = typedArrayObtainStyledAttributes.getInt(index2, cqjVar26.G);
                        break;
                    case 28:
                        str = str4;
                        cqj cqjVar27 = cqiVar.d;
                        cqjVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar27.I);
                        break;
                    case 29:
                        str = str4;
                        cqj cqjVar28 = cqiVar.d;
                        cqjVar28.l = a(typedArrayObtainStyledAttributes, index2, cqjVar28.l);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        str = str4;
                        cqj cqjVar29 = cqiVar.d;
                        cqjVar29.m = a(typedArrayObtainStyledAttributes, index2, cqjVar29.m);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        str = str4;
                        cqj cqjVar30 = cqiVar.d;
                        cqjVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar30.M);
                        break;
                    case 32:
                        str = str4;
                        cqj cqjVar31 = cqiVar.d;
                        cqjVar31.u = a(typedArrayObtainStyledAttributes, index2, cqjVar31.u);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        str = str4;
                        cqj cqjVar32 = cqiVar.d;
                        cqjVar32.v = a(typedArrayObtainStyledAttributes, index2, cqjVar32.v);
                        break;
                    case 34:
                        str = str4;
                        cqj cqjVar33 = cqiVar.d;
                        cqjVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar33.J);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        str = str4;
                        cqj cqjVar34 = cqiVar.d;
                        cqjVar34.o = a(typedArrayObtainStyledAttributes, index2, cqjVar34.o);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        str = str4;
                        cqj cqjVar35 = cqiVar.d;
                        cqjVar35.n = a(typedArrayObtainStyledAttributes, index2, cqjVar35.n);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        str = str4;
                        cqj cqjVar36 = cqiVar.d;
                        cqjVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar36.z);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        str = str4;
                        cqiVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, cqiVar.a);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        str = str4;
                        cqj cqjVar37 = cqiVar.d;
                        cqjVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar37.W);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        str = str4;
                        cqj cqjVar38 = cqiVar.d;
                        cqjVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar38.V);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        str = str4;
                        cqj cqjVar39 = cqiVar.d;
                        cqjVar39.X = typedArrayObtainStyledAttributes.getInt(index2, cqjVar39.X);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        str = str4;
                        cqj cqjVar40 = cqiVar.d;
                        cqjVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, cqjVar40.Y);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        str = str4;
                        cql cqlVar3 = cqiVar.b;
                        cqlVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, cqlVar3.d);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        str = str4;
                        cqm cqmVar2 = cqiVar.e;
                        cqmVar2.n = true;
                        cqmVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar2.o);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        str = str4;
                        cqm cqmVar3 = cqiVar.e;
                        cqmVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, cqmVar3.d);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        str = str4;
                        cqm cqmVar4 = cqiVar.e;
                        cqmVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, cqmVar4.e);
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        str = str4;
                        cqm cqmVar5 = cqiVar.e;
                        cqmVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, cqmVar5.f);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        str = str4;
                        cqm cqmVar6 = cqiVar.e;
                        cqmVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, cqmVar6.g);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        str = str4;
                        cqm cqmVar7 = cqiVar.e;
                        cqmVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar7.h);
                        break;
                    case 50:
                        str = str4;
                        cqm cqmVar8 = cqiVar.e;
                        cqmVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar8.i);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        str = str4;
                        cqm cqmVar9 = cqiVar.e;
                        cqmVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar9.k);
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        str = str4;
                        cqm cqmVar10 = cqiVar.e;
                        cqmVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar10.l);
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        str = str4;
                        cqm cqmVar11 = cqiVar.e;
                        cqmVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, cqmVar11.m);
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        str = str4;
                        cqj cqjVar41 = cqiVar.d;
                        cqjVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, cqjVar41.Z);
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        str = str4;
                        cqj cqjVar42 = cqiVar.d;
                        cqjVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, cqjVar42.aa);
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        str = str4;
                        cqj cqjVar43 = cqiVar.d;
                        cqjVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar43.ab);
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        str = str4;
                        cqj cqjVar44 = cqiVar.d;
                        cqjVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar44.ac);
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        str = str4;
                        cqj cqjVar45 = cqiVar.d;
                        cqjVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar45.ad);
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        str = str4;
                        cqj cqjVar46 = cqiVar.d;
                        cqjVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar46.ae);
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        str = str4;
                        cqm cqmVar12 = cqiVar.e;
                        cqmVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, cqmVar12.c);
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        str = str4;
                        cqj cqjVar47 = cqiVar.d;
                        cqjVar47.B = a(typedArrayObtainStyledAttributes, index2, cqjVar47.B);
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        str = str4;
                        cqj cqjVar48 = cqiVar.d;
                        cqjVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar48.C);
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        str = str4;
                        cqj cqjVar49 = cqiVar.d;
                        cqjVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, cqjVar49.D);
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        str = str4;
                        cqk cqkVar2 = cqiVar.c;
                        cqkVar2.c = a(typedArrayObtainStyledAttributes, index2, cqkVar2.c);
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            cqiVar.c.e = coz.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            cqiVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        str = str4;
                        cqiVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        str = str4;
                        cqk cqkVar3 = cqiVar.c;
                        cqkVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, cqkVar3.j);
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        str = str4;
                        cql cqlVar4 = cqiVar.b;
                        cqlVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, cqlVar4.e);
                        break;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        str = str4;
                        cqiVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        str = str4;
                        cqiVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        str = str4;
                        cqj cqjVar50 = cqiVar.d;
                        cqjVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, cqjVar50.ah);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        str = str4;
                        cqj cqjVar51 = cqiVar.d;
                        cqjVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar51.ai);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        str = str4;
                        cqiVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        str = str4;
                        cqj cqjVar52 = cqiVar.d;
                        cqjVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, cqjVar52.ap);
                        break;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        str = str4;
                        cqk cqkVar4 = cqiVar.c;
                        cqkVar4.f = typedArrayObtainStyledAttributes.getInt(index2, cqkVar4.f);
                        break;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        str = str4;
                        cqiVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        str = str4;
                        cql cqlVar5 = cqiVar.b;
                        cqlVar5.c = typedArrayObtainStyledAttributes.getInt(index2, cqlVar5.c);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        str = str4;
                        cqk cqkVar5 = cqiVar.c;
                        cqkVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, cqkVar5.h);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        str = str4;
                        cqj cqjVar53 = cqiVar.d;
                        cqjVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, cqjVar53.an);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        str = str4;
                        cqj cqjVar54 = cqiVar.d;
                        cqjVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, cqjVar54.ao);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        str = str4;
                        cqk cqkVar6 = cqiVar.c;
                        cqkVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, cqkVar6.d);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        str = str4;
                        cqm cqmVar13 = cqiVar.e;
                        cqmVar13.j = a(typedArrayObtainStyledAttributes, index2, cqmVar13.j);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        str = str4;
                        cqk cqkVar7 = cqiVar.c;
                        cqkVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, cqkVar7.l);
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        str = str4;
                        cqk cqkVar8 = cqiVar.c;
                        cqkVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, cqkVar8.k);
                        break;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        str = str4;
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            cqiVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            cqk cqkVar9 = cqiVar.c;
                            cqkVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (cqkVar9.m.indexOf("/") > 0) {
                                cqkVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, cqiVar.c.n);
                        }
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        cqj cqjVar55 = cqiVar.d;
                        cqjVar55.s = a(typedArrayObtainStyledAttributes, index2, cqjVar55.s);
                        str = str4;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                        cqj cqjVar56 = cqiVar.d;
                        cqjVar56.t = a(typedArrayObtainStyledAttributes, index2, cqjVar56.t);
                        str = str4;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                        cqj cqjVar57 = cqiVar.d;
                        cqjVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar57.N);
                        str = str4;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        cqj cqjVar58 = cqiVar.d;
                        cqjVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, cqjVar58.U);
                        str = str4;
                        break;
                    case 95:
                        j(cqiVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        j(cqiVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        cqj cqjVar59 = cqiVar.d;
                        cqjVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, cqjVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            cqj cqjVar60 = cqiVar.d;
            if (cqjVar60.al != null) {
                cqjVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return cqiVar;
    }

    private static final String q(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top";
    }

    public final cqi b(int i) {
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new cqi());
        }
        return (cqi) map.get(numValueOf);
    }

    public final void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l(constraintLayout);
        constraintLayout.h = null;
        constraintLayout.requestLayout();
    }

    public final void d(int i, int i2) {
        cqi cqiVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (cqiVar = (cqi) map.get(numValueOf)) == null) {
            return;
        }
        cqj cqjVar = cqiVar.d;
        if (i2 != 3) {
            cqjVar.p = -1;
            cqjVar.q = -1;
            cqjVar.K = 0;
            cqjVar.R = Integer.MIN_VALUE;
            return;
        }
        cqjVar.o = -1;
        cqjVar.n = -1;
        cqjVar.J = 0;
        cqjVar.P = Integer.MIN_VALUE;
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        cqn cqnVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = cqnVar.e;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            cqe cqeVar = (cqe) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new cqi());
            }
            cqi cqiVar = (cqi) map3.get(numValueOf);
            if (cqiVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = cqnVar.d;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    cqb cqbVar = (cqb) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new cqb(cqbVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new cqb(cqbVar, cls.getMethod(a.cr(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                cqiVar.f = map5;
                cqiVar.a = id;
                int i4 = cqeVar.e;
                cqj cqjVar = cqiVar.d;
                cqjVar.j = i4;
                cqjVar.k = cqeVar.f;
                cqjVar.l = cqeVar.g;
                cqjVar.m = cqeVar.h;
                cqjVar.n = cqeVar.i;
                cqjVar.o = cqeVar.j;
                cqjVar.p = cqeVar.k;
                cqjVar.q = cqeVar.l;
                cqjVar.r = cqeVar.m;
                cqjVar.s = cqeVar.n;
                cqjVar.t = cqeVar.o;
                cqjVar.u = cqeVar.s;
                cqjVar.v = cqeVar.t;
                cqjVar.w = cqeVar.u;
                cqjVar.x = cqeVar.v;
                cqjVar.y = cqeVar.G;
                cqjVar.z = cqeVar.H;
                cqjVar.A = cqeVar.I;
                cqjVar.B = cqeVar.p;
                cqjVar.C = cqeVar.q;
                cqjVar.D = cqeVar.r;
                cqjVar.E = cqeVar.X;
                cqjVar.F = cqeVar.Y;
                cqjVar.G = cqeVar.Z;
                cqjVar.h = cqeVar.c;
                cqjVar.f = cqeVar.a;
                cqjVar.g = cqeVar.b;
                cqjVar.d = cqeVar.width;
                cqjVar.e = cqeVar.height;
                cqjVar.H = cqeVar.leftMargin;
                cqjVar.I = cqeVar.rightMargin;
                cqjVar.J = cqeVar.topMargin;
                cqjVar.K = cqeVar.bottomMargin;
                cqjVar.N = cqeVar.D;
                cqjVar.V = cqeVar.M;
                cqjVar.W = cqeVar.L;
                cqjVar.Y = cqeVar.O;
                cqjVar.X = cqeVar.N;
                cqjVar.an = cqeVar.aa;
                cqjVar.ao = cqeVar.ab;
                cqjVar.Z = cqeVar.P;
                cqjVar.aa = cqeVar.Q;
                cqjVar.ab = cqeVar.T;
                cqjVar.ac = cqeVar.U;
                cqjVar.ad = cqeVar.R;
                cqjVar.ae = cqeVar.S;
                cqjVar.af = cqeVar.V;
                cqjVar.ag = cqeVar.W;
                cqjVar.am = cqeVar.ac;
                cqjVar.P = cqeVar.x;
                cqjVar.R = cqeVar.z;
                cqjVar.O = cqeVar.w;
                cqjVar.Q = cqeVar.y;
                cqjVar.T = cqeVar.A;
                cqjVar.S = cqeVar.B;
                cqjVar.U = cqeVar.C;
                cqjVar.aq = cqeVar.ad;
                cqjVar.L = cqeVar.getMarginEnd();
                cqjVar.M = cqeVar.getMarginStart();
                cql cqlVar = cqiVar.b;
                cqlVar.b = childAt.getVisibility();
                cqlVar.d = childAt.getAlpha();
                cqm cqmVar = cqiVar.e;
                cqmVar.c = childAt.getRotation();
                cqmVar.d = childAt.getRotationX();
                cqmVar.e = childAt.getRotationY();
                cqmVar.f = childAt.getScaleX();
                cqmVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    cqmVar.h = pivotX;
                    cqmVar.i = pivotY;
                }
                cqmVar.k = childAt.getTranslationX();
                cqmVar.l = childAt.getTranslationY();
                cqmVar.m = childAt.getTranslationZ();
                if (cqmVar.n) {
                    cqmVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    cqjVar.ap = barrier.b.b;
                    cqjVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    cqjVar.ah = barrier.a;
                    cqjVar.ai = barrier.b.c;
                }
            }
            i2++;
            cqnVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void f(Context context, int i) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void g(int i, int i2, int i3, int i4) {
        cqj cqjVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new cqi());
        }
        cqi cqiVar = (cqi) map.get(numValueOf);
        if (cqiVar == null) {
            return;
        }
        if (i2 != 3) {
            cqjVar = cqiVar.d;
            if (i4 == 4) {
                cqjVar.q = i3;
                cqjVar.p = -1;
            } else {
                cqjVar.p = i3;
                cqjVar.q = -1;
            }
        } else {
            cqjVar = cqiVar.d;
            if (i4 == 3) {
                cqjVar.n = i3;
                cqjVar.o = -1;
            } else {
                cqjVar.o = i3;
                cqjVar.n = -1;
            }
        }
        cqjVar.r = -1;
        cqjVar.s = -1;
        cqjVar.t = -1;
    }

    public final void h(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    cqi cqiVarP = p(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        cqiVarP.d.b = true;
                    }
                    this.e.put(Integer.valueOf(cqiVarP.a), cqiVarP);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.cf(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.cf(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqn.i(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void l(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String resourceEntryName;
        HashSet hashSet;
        HashMap map;
        int i;
        char c2;
        HashMap map2;
        String strConcat;
        int i2;
        int i3;
        int i4;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = this.e;
        HashSet hashSet2 = new HashSet(map3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap map4 = this.e;
                    if (map4.containsKey(numValueOf)) {
                        hashSet2.remove(numValueOf);
                        cqi cqiVar = (cqi) map4.get(numValueOf);
                        if (cqiVar != null) {
                            if (childAt instanceof Barrier) {
                                cqj cqjVar = cqiVar.d;
                                cqjVar.aj = 1;
                                c2 = 0;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = cqjVar.ah;
                                barrier.b(cqjVar.ai);
                                barrier.b.b = cqjVar.ap;
                                int[] iArr = cqjVar.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str = cqjVar.al;
                                    if (str != null) {
                                        cqjVar.ak = o(barrier, str);
                                        barrier.j(cqjVar.ak);
                                    }
                                }
                            } else {
                                c2 = 0;
                            }
                            cqe cqeVar = (cqe) childAt.getLayoutParams();
                            cqeVar.a();
                            cqiVar.a(cqeVar);
                            HashMap map5 = cqiVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map5.keySet()) {
                                cqb cqbVar = (cqb) map5.get(str2);
                                HashSet hashSet3 = hashSet2;
                                if (cqbVar.a) {
                                    map2 = map3;
                                    strConcat = str2;
                                } else {
                                    map2 = map3;
                                    strConcat = "set".concat(String.valueOf(str2));
                                }
                                try {
                                    i3 = cqbVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        Class<?>[] clsArr = new Class[1];
                                        clsArr[c2] = Integer.TYPE;
                                        Method method = cls.getMethod(strConcat, clsArr);
                                        Integer numValueOf2 = Integer.valueOf(cqbVar.c);
                                        Object[] objArr = new Object[1];
                                        objArr[c2] = numValueOf2;
                                        method.invoke(childAt, objArr);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        Class<?>[] clsArr2 = new Class[1];
                                        clsArr2[c2] = Float.TYPE;
                                        Method method2 = cls.getMethod(strConcat, clsArr2);
                                        Float fValueOf = Float.valueOf(cqbVar.d);
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c2] = fValueOf;
                                        method2.invoke(childAt, objArr2);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        Class<?>[] clsArr3 = new Class[1];
                                        clsArr3[c2] = Integer.TYPE;
                                        Method method3 = cls.getMethod(strConcat, clsArr3);
                                        Integer numValueOf3 = Integer.valueOf(cqbVar.g);
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c2] = numValueOf3;
                                        method3.invoke(childAt, objArr3);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Class<?>[] clsArr4 = new Class[1];
                                        clsArr4[c2] = Drawable.class;
                                        Method method4 = cls.getMethod(strConcat, clsArr4);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(cqbVar.g);
                                        Object[] objArr4 = new Object[1];
                                        objArr4[c2] = colorDrawable;
                                        method4.invoke(childAt, objArr4);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        Class<?>[] clsArr5 = new Class[1];
                                        clsArr5[c2] = CharSequence.class;
                                        Method method5 = cls.getMethod(strConcat, clsArr5);
                                        String str3 = cqbVar.e;
                                        Object[] objArr5 = new Object[1];
                                        objArr5[c2] = str3;
                                        method5.invoke(childAt, objArr5);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        Class<?>[] clsArr6 = new Class[1];
                                        clsArr6[c2] = Boolean.TYPE;
                                        Method method6 = cls.getMethod(strConcat, clsArr6);
                                        Boolean boolValueOf = Boolean.valueOf(cqbVar.f);
                                        Object[] objArr6 = new Object[1];
                                        objArr6[c2] = boolValueOf;
                                        method6.invoke(childAt, objArr6);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        Class<?>[] clsArr7 = new Class[1];
                                        clsArr7[c2] = Float.TYPE;
                                        Method method7 = cls.getMethod(strConcat, clsArr7);
                                        Float fValueOf2 = Float.valueOf(cqbVar.d);
                                        Object[] objArr7 = new Object[1];
                                        objArr7[c2] = fValueOf2;
                                        method7.invoke(childAt, objArr7);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            Class<?>[] clsArr8 = new Class[1];
                                            clsArr8[c2] = Integer.TYPE;
                                            Method method8 = cls.getMethod(strConcat, clsArr8);
                                            Integer numValueOf4 = Integer.valueOf(cqbVar.c);
                                            Object[] objArr8 = new Object[1];
                                            objArr8[c2] = numValueOf4;
                                            method8.invoke(childAt, objArr8);
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            map3 = map2;
                                            i5 = i2;
                                        }
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                    default:
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        break;
                                }
                            }
                            hashSet = hashSet2;
                            map = map3;
                            i = i5;
                            childAt.setLayoutParams(cqeVar);
                            cql cqlVar = cqiVar.b;
                            if (cqlVar.c == 0) {
                                childAt.setVisibility(cqlVar.b);
                            }
                            childAt.setAlpha(cqlVar.d);
                            cqm cqmVar = cqiVar.e;
                            childAt.setRotation(cqmVar.c);
                            childAt.setRotationX(cqmVar.d);
                            childAt.setRotationY(cqmVar.e);
                            childAt.setScaleX(cqmVar.f);
                            childAt.setScaleY(cqmVar.g);
                            if (cqmVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(cqmVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(cqmVar.h)) {
                                    childAt.setPivotX(cqmVar.h);
                                }
                                if (!Float.isNaN(cqmVar.i)) {
                                    childAt.setPivotY(cqmVar.i);
                                }
                            }
                            childAt.setTranslationX(cqmVar.k);
                            childAt.setTranslationY(cqmVar.l);
                            childAt.setTranslationZ(cqmVar.m);
                            if (cqmVar.n) {
                                childAt.setElevation(cqmVar.o);
                            }
                        }
                    }
                }
                i5 = i + 1;
                hashSet2 = hashSet;
                map3 = map;
            }
            hashSet = hashSet2;
            map = map3;
            i = i5;
            i5 = i + 1;
            hashSet2 = hashSet;
            map3 = map;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            cqi cqiVar2 = (cqi) this.e.get(num);
            if (cqiVar2 != null) {
                cqj cqjVar2 = cqiVar2.d;
                if (cqjVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = cqjVar2.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str4 = cqjVar2.al;
                        if (str4 != null) {
                            cqjVar2.ak = o(barrier2, str4);
                            barrier2.j(cqjVar2.ak);
                        }
                    }
                    barrier2.a = cqjVar2.ah;
                    barrier2.b(cqjVar2.ai);
                    cqe cqeVar2 = new cqe();
                    barrier2.k();
                    cqiVar2.a(cqeVar2);
                    constraintLayout.addView(barrier2, cqeVar2);
                }
                if (cqjVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    cqe cqeVar3 = new cqe();
                    cqiVar2.a(cqeVar3);
                    constraintLayout.addView(guideline, cqeVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof cqc) {
                ((cqc) childAt2).g(constraintLayout);
            }
        }
    }

    public final void m(int i, int i2, int i3, int i4) {
        cqj cqjVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new cqi());
        }
        cqi cqiVar = (cqi) map.get(numValueOf);
        if (cqiVar == null) {
            return;
        }
        if (i2 == 3) {
            if (i4 == 3) {
                cqjVar = cqiVar.d;
                cqjVar.n = i3;
                cqjVar.o = -1;
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                cqjVar = cqiVar.d;
                cqjVar.o = i3;
                cqjVar.n = -1;
            }
            cqjVar.r = -1;
            cqjVar.s = -1;
            cqjVar.t = -1;
            cqiVar.d.J = 0;
            return;
        }
        if (i2 == 4) {
            if (i4 == 4) {
                cqj cqjVar2 = cqiVar.d;
                cqjVar2.q = i3;
                cqjVar2.p = -1;
                cqjVar2.r = -1;
                cqjVar2.s = -1;
                cqjVar2.t = -1;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                cqj cqjVar3 = cqiVar.d;
                cqjVar3.p = i3;
                cqjVar3.q = -1;
                cqjVar3.r = -1;
                cqjVar3.s = -1;
                cqjVar3.t = -1;
            }
            cqiVar.d.K = 0;
            return;
        }
        if (i2 == 5) {
            if (i4 == 5) {
                cqj cqjVar4 = cqiVar.d;
                cqjVar4.r = i3;
                cqjVar4.q = -1;
                cqjVar4.p = -1;
                cqjVar4.n = -1;
                cqjVar4.o = -1;
                return;
            }
            if (i4 == 3) {
                cqj cqjVar5 = cqiVar.d;
                cqjVar5.s = i3;
                cqjVar5.q = -1;
                cqjVar5.p = -1;
                cqjVar5.n = -1;
                cqjVar5.o = -1;
                return;
            }
            if (i4 != 4) {
                throw new IllegalArgumentException("right to " + q(i4) + " undefined");
            }
            cqj cqjVar6 = cqiVar.d;
            cqjVar6.t = i3;
            cqjVar6.q = -1;
            cqjVar6.p = -1;
            cqjVar6.n = -1;
            cqjVar6.o = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                cqj cqjVar7 = cqiVar.d;
                cqjVar7.x = i3;
                cqjVar7.w = -1;
            } else {
                if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                cqj cqjVar8 = cqiVar.d;
                cqjVar8.w = i3;
                cqjVar8.x = -1;
            }
            cqiVar.d.L = 0;
            return;
        }
        if (i4 == 6) {
            cqj cqjVar9 = cqiVar.d;
            cqjVar9.v = i3;
            cqjVar9.u = -1;
        } else {
            if (i4 != 7) {
                throw new IllegalArgumentException("right to " + q(i4) + " undefined");
            }
            cqj cqjVar10 = cqiVar.d;
            cqjVar10.u = i3;
            cqjVar10.v = -1;
        }
        cqiVar.d.M = 0;
    }

    public final void n(int i) {
        b(com.google.android.videos.R.id.player_toolbar).b.b = i;
    }
}
