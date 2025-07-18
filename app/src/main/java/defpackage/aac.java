package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aac {
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
        int[] iArr = aag.a;
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
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
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
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
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
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
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
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
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
    static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void h(zr zrVar, String str) throws NumberFormatException {
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
        zrVar.I = str;
        zrVar.J = fAbs;
        zrVar.K = i2;
    }

    private final zx k(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        String str;
        String str2;
        int i;
        zx zxVar = new zx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? aag.c : aag.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            zw zwVar = new zw();
            zxVar.g = zwVar;
            zz zzVar = zxVar.c;
            zzVar.b = false;
            zy zyVar = zxVar.d;
            zyVar.c = false;
            aaa aaaVar = zxVar.b;
            aaaVar.a = false;
            aab aabVar = zxVar.e;
            aabVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (c.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.K));
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
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
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
                        zwVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zyVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zyVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zyVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, zyVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, zyVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, zyVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, zyVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, aaaVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, zyVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(27, typedArrayObtainStyledAttributes.getInt(index, zyVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 28:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 34:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, zyVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 38:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, zxVar.a);
                        zxVar.a = resourceId;
                        zwVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 39:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, zyVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 40:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, zyVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 41:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(41, typedArrayObtainStyledAttributes.getInt(index, zyVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 42:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(42, typedArrayObtainStyledAttributes.getInt(index, zyVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 43:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, aaaVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 44:
                        str2 = str3;
                        i = indexCount;
                        zwVar.d(44, true);
                        zwVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, aabVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 45:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, aabVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 46:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, aabVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 47:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, aabVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, aabVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 49:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, aabVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 50:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, aabVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, aabVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, aabVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, aabVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(54, typedArrayObtainStyledAttributes.getInt(index, zyVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(55, typedArrayObtainStyledAttributes.getInt(index, zyVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, aabVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 63:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, zyVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 64:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(64, a(typedArrayObtainStyledAttributes, index, zzVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            zwVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            zwVar.c(65, yi.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, zzVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, aaaVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(72, typedArrayObtainStyledAttributes.getInt(index, zyVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        zwVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        zwVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, zyVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(76, typedArrayObtainStyledAttributes.getInt(index, zzVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        zwVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(78, typedArrayObtainStyledAttributes.getInt(index, aaaVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, zzVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 80:
                        str2 = str3;
                        i = indexCount;
                        zwVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, zyVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        zwVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, zyVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, zzVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(83, a(typedArrayObtainStyledAttributes, index, aabVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        zwVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, zzVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        zwVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, zzVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 86:
                        i = indexCount;
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            zzVar.n = resourceId2;
                            zwVar.b(89, resourceId2);
                            if (zzVar.n != -1) {
                                zwVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            zzVar.m = typedArrayObtainStyledAttributes.getString(index);
                            zwVar.c(90, zzVar.m);
                            if (zzVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                zzVar.n = resourceId3;
                                zwVar.b(89, resourceId3);
                                zwVar.b(88, -2);
                            } else {
                                zwVar.b(88, -1);
                            }
                        } else {
                            zwVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, zzVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 87:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + b.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        zwVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        zwVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, zyVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        g(zwVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i = indexCount;
                        g(zwVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        zwVar.b(97, typedArrayObtainStyledAttributes.getInt(index, zyVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            zxVar.a = typedArrayObtainStyledAttributes.getResourceId(index, zxVar.a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        zwVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, zyVar.i));
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
                    zxVar.c.b = true;
                    zxVar.d.c = true;
                    zxVar.b.a = true;
                    zxVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        zy zyVar2 = zxVar.d;
                        zyVar2.r = a(typedArrayObtainStyledAttributes, index2, zyVar2.r);
                        break;
                    case 2:
                        str = str4;
                        zy zyVar3 = zxVar.d;
                        zyVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar3.K);
                        break;
                    case 3:
                        str = str4;
                        zy zyVar4 = zxVar.d;
                        zyVar4.q = a(typedArrayObtainStyledAttributes, index2, zyVar4.q);
                        break;
                    case 4:
                        str = str4;
                        zy zyVar5 = zxVar.d;
                        zyVar5.p = a(typedArrayObtainStyledAttributes, index2, zyVar5.p);
                        break;
                    case 5:
                        str = str4;
                        zxVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        zy zyVar6 = zxVar.d;
                        zyVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zyVar6.E);
                        break;
                    case 7:
                        str = str4;
                        zy zyVar7 = zxVar.d;
                        zyVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zyVar7.F);
                        break;
                    case 8:
                        str = str4;
                        zy zyVar8 = zxVar.d;
                        zyVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar8.L);
                        break;
                    case 9:
                        str = str4;
                        zy zyVar9 = zxVar.d;
                        zyVar9.x = a(typedArrayObtainStyledAttributes, index2, zyVar9.x);
                        break;
                    case 10:
                        str = str4;
                        zy zyVar10 = zxVar.d;
                        zyVar10.w = a(typedArrayObtainStyledAttributes, index2, zyVar10.w);
                        break;
                    case 11:
                        str = str4;
                        zy zyVar11 = zxVar.d;
                        zyVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar11.R);
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        str = str4;
                        zy zyVar12 = zxVar.d;
                        zyVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar12.S);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        str = str4;
                        zy zyVar13 = zxVar.d;
                        zyVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar13.O);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str = str4;
                        zy zyVar14 = zxVar.d;
                        zyVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        zy zyVar15 = zxVar.d;
                        zyVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar15.T);
                        break;
                    case 16:
                        str = str4;
                        zy zyVar16 = zxVar.d;
                        zyVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar16.P);
                        break;
                    case 17:
                        str = str4;
                        zy zyVar17 = zxVar.d;
                        zyVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zyVar17.f);
                        break;
                    case 18:
                        str = str4;
                        zy zyVar18 = zxVar.d;
                        zyVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, zyVar18.g);
                        break;
                    case 19:
                        str = str4;
                        zy zyVar19 = zxVar.d;
                        zyVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, zyVar19.h);
                        break;
                    case 20:
                        str = str4;
                        zy zyVar20 = zxVar.d;
                        zyVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, zyVar20.y);
                        break;
                    case 21:
                        str = str4;
                        zy zyVar21 = zxVar.d;
                        zyVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, zyVar21.e);
                        break;
                    case 22:
                        str = str4;
                        aaa aaaVar2 = zxVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, aaaVar2.b);
                        aaaVar2.b = i5;
                        aaaVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        zy zyVar22 = zxVar.d;
                        zyVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, zyVar22.d);
                        break;
                    case 24:
                        str = str4;
                        zy zyVar23 = zxVar.d;
                        zyVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar23.H);
                        break;
                    case 25:
                        str = str4;
                        zy zyVar24 = zxVar.d;
                        zyVar24.j = a(typedArrayObtainStyledAttributes, index2, zyVar24.j);
                        break;
                    case 26:
                        str = str4;
                        zy zyVar25 = zxVar.d;
                        zyVar25.k = a(typedArrayObtainStyledAttributes, index2, zyVar25.k);
                        break;
                    case 27:
                        str = str4;
                        zy zyVar26 = zxVar.d;
                        zyVar26.G = typedArrayObtainStyledAttributes.getInt(index2, zyVar26.G);
                        break;
                    case 28:
                        str = str4;
                        zy zyVar27 = zxVar.d;
                        zyVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar27.I);
                        break;
                    case 29:
                        str = str4;
                        zy zyVar28 = zxVar.d;
                        zyVar28.l = a(typedArrayObtainStyledAttributes, index2, zyVar28.l);
                        break;
                    case 30:
                        str = str4;
                        zy zyVar29 = zxVar.d;
                        zyVar29.m = a(typedArrayObtainStyledAttributes, index2, zyVar29.m);
                        break;
                    case 31:
                        str = str4;
                        zy zyVar30 = zxVar.d;
                        zyVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar30.M);
                        break;
                    case 32:
                        str = str4;
                        zy zyVar31 = zxVar.d;
                        zyVar31.u = a(typedArrayObtainStyledAttributes, index2, zyVar31.u);
                        break;
                    case 33:
                        str = str4;
                        zy zyVar32 = zxVar.d;
                        zyVar32.v = a(typedArrayObtainStyledAttributes, index2, zyVar32.v);
                        break;
                    case 34:
                        str = str4;
                        zy zyVar33 = zxVar.d;
                        zyVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar33.J);
                        break;
                    case 35:
                        str = str4;
                        zy zyVar34 = zxVar.d;
                        zyVar34.o = a(typedArrayObtainStyledAttributes, index2, zyVar34.o);
                        break;
                    case 36:
                        str = str4;
                        zy zyVar35 = zxVar.d;
                        zyVar35.n = a(typedArrayObtainStyledAttributes, index2, zyVar35.n);
                        break;
                    case 37:
                        str = str4;
                        zy zyVar36 = zxVar.d;
                        zyVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, zyVar36.z);
                        break;
                    case 38:
                        str = str4;
                        zxVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, zxVar.a);
                        break;
                    case 39:
                        str = str4;
                        zy zyVar37 = zxVar.d;
                        zyVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, zyVar37.W);
                        break;
                    case 40:
                        str = str4;
                        zy zyVar38 = zxVar.d;
                        zyVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, zyVar38.V);
                        break;
                    case 41:
                        str = str4;
                        zy zyVar39 = zxVar.d;
                        zyVar39.X = typedArrayObtainStyledAttributes.getInt(index2, zyVar39.X);
                        break;
                    case 42:
                        str = str4;
                        zy zyVar40 = zxVar.d;
                        zyVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, zyVar40.Y);
                        break;
                    case 43:
                        str = str4;
                        aaa aaaVar3 = zxVar.b;
                        aaaVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, aaaVar3.d);
                        break;
                    case 44:
                        str = str4;
                        aab aabVar2 = zxVar.e;
                        aabVar2.n = true;
                        aabVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, aabVar2.o);
                        break;
                    case 45:
                        str = str4;
                        aab aabVar3 = zxVar.e;
                        aabVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, aabVar3.d);
                        break;
                    case 46:
                        str = str4;
                        aab aabVar4 = zxVar.e;
                        aabVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, aabVar4.e);
                        break;
                    case 47:
                        str = str4;
                        aab aabVar5 = zxVar.e;
                        aabVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, aabVar5.f);
                        break;
                    case 48:
                        str = str4;
                        aab aabVar6 = zxVar.e;
                        aabVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, aabVar6.g);
                        break;
                    case 49:
                        str = str4;
                        aab aabVar7 = zxVar.e;
                        aabVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, aabVar7.h);
                        break;
                    case 50:
                        str = str4;
                        aab aabVar8 = zxVar.e;
                        aabVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, aabVar8.i);
                        break;
                    case 51:
                        str = str4;
                        aab aabVar9 = zxVar.e;
                        aabVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, aabVar9.k);
                        break;
                    case 52:
                        str = str4;
                        aab aabVar10 = zxVar.e;
                        aabVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, aabVar10.l);
                        break;
                    case 53:
                        str = str4;
                        aab aabVar11 = zxVar.e;
                        aabVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, aabVar11.m);
                        break;
                    case 54:
                        str = str4;
                        zy zyVar41 = zxVar.d;
                        zyVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, zyVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        zy zyVar42 = zxVar.d;
                        zyVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, zyVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        zy zyVar43 = zxVar.d;
                        zyVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        zy zyVar44 = zxVar.d;
                        zyVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        zy zyVar45 = zxVar.d;
                        zyVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        zy zyVar46 = zxVar.d;
                        zyVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        aab aabVar12 = zxVar.e;
                        aabVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, aabVar12.c);
                        break;
                    case 61:
                        str = str4;
                        zy zyVar47 = zxVar.d;
                        zyVar47.B = a(typedArrayObtainStyledAttributes, index2, zyVar47.B);
                        break;
                    case 62:
                        str = str4;
                        zy zyVar48 = zxVar.d;
                        zyVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar48.C);
                        break;
                    case 63:
                        str = str4;
                        zy zyVar49 = zxVar.d;
                        zyVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, zyVar49.D);
                        break;
                    case 64:
                        str = str4;
                        zz zzVar2 = zxVar.c;
                        zzVar2.c = a(typedArrayObtainStyledAttributes, index2, zzVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            zxVar.c.e = yi.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            zxVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        str = str4;
                        zxVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        zz zzVar3 = zxVar.c;
                        zzVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, zzVar3.j);
                        break;
                    case 68:
                        str = str4;
                        aaa aaaVar4 = zxVar.b;
                        aaaVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, aaaVar4.e);
                        break;
                    case 69:
                        str = str4;
                        zxVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        zxVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        zy zyVar50 = zxVar.d;
                        zyVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, zyVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        zy zyVar51 = zxVar.d;
                        zyVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        zxVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        zy zyVar52 = zxVar.d;
                        zyVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, zyVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        zz zzVar4 = zxVar.c;
                        zzVar4.f = typedArrayObtainStyledAttributes.getInt(index2, zzVar4.f);
                        break;
                    case 77:
                        str = str4;
                        zxVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        aaa aaaVar5 = zxVar.b;
                        aaaVar5.c = typedArrayObtainStyledAttributes.getInt(index2, aaaVar5.c);
                        break;
                    case 79:
                        str = str4;
                        zz zzVar5 = zxVar.c;
                        zzVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, zzVar5.h);
                        break;
                    case 80:
                        str = str4;
                        zy zyVar53 = zxVar.d;
                        zyVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, zyVar53.an);
                        break;
                    case 81:
                        str = str4;
                        zy zyVar54 = zxVar.d;
                        zyVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, zyVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        zz zzVar6 = zxVar.c;
                        zzVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, zzVar6.d);
                        break;
                    case 83:
                        str = str4;
                        aab aabVar13 = zxVar.e;
                        aabVar13.j = a(typedArrayObtainStyledAttributes, index2, aabVar13.j);
                        break;
                    case 84:
                        str = str4;
                        zz zzVar7 = zxVar.c;
                        zzVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, zzVar7.l);
                        break;
                    case 85:
                        str = str4;
                        zz zzVar8 = zxVar.c;
                        zzVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, zzVar8.k);
                        break;
                    case 86:
                        str = str4;
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            zxVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            zz zzVar9 = zxVar.c;
                            zzVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (zzVar9.m.indexOf("/") > 0) {
                                zzVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, zxVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        zy zyVar55 = zxVar.d;
                        zyVar55.s = a(typedArrayObtainStyledAttributes, index2, zyVar55.s);
                        str = str4;
                        break;
                    case 92:
                        zy zyVar56 = zxVar.d;
                        zyVar56.t = a(typedArrayObtainStyledAttributes, index2, zyVar56.t);
                        str = str4;
                        break;
                    case 93:
                        zy zyVar57 = zxVar.d;
                        zyVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar57.N);
                        str = str4;
                        break;
                    case 94:
                        zy zyVar58 = zxVar.d;
                        zyVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, zyVar58.U);
                        str = str4;
                        break;
                    case 95:
                        g(zxVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case 96:
                        g(zxVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        zy zyVar59 = zxVar.d;
                        zyVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, zyVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            zy zyVar60 = zxVar.d;
            if (zyVar60.al != null) {
                zyVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return zxVar;
    }

    private final String l(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top";
    }

    private final int[] m(View view, String str) throws IllegalAccessException, IllegalArgumentException {
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
                iIntValue = aaf.class.getField(strTrim).getInt(null);
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

    public final void b(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        i(constraintLayout);
        constraintLayout.f = null;
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        aac aacVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = aacVar.e;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            zr zrVar = (zr) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new zx());
            }
            zx zxVar = (zx) map3.get(numValueOf);
            if (zxVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = aacVar.d;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    zo zoVar = (zo) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new zo(zoVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
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
                            map5.put(str, new zo(zoVar, cls.getMethod(a.j(str, "getMap"), null).invoke(childAt, null)));
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
                zxVar.f = map5;
                zxVar.a = id;
                int i4 = zrVar.e;
                zy zyVar = zxVar.d;
                zyVar.j = i4;
                zyVar.k = zrVar.f;
                zyVar.l = zrVar.g;
                zyVar.m = zrVar.h;
                zyVar.n = zrVar.i;
                zyVar.o = zrVar.j;
                zyVar.p = zrVar.k;
                zyVar.q = zrVar.l;
                zyVar.r = zrVar.m;
                zyVar.s = zrVar.n;
                zyVar.t = zrVar.o;
                zyVar.u = zrVar.s;
                zyVar.v = zrVar.t;
                zyVar.w = zrVar.u;
                zyVar.x = zrVar.v;
                zyVar.y = zrVar.G;
                zyVar.z = zrVar.H;
                zyVar.A = zrVar.I;
                zyVar.B = zrVar.p;
                zyVar.C = zrVar.q;
                zyVar.D = zrVar.r;
                zyVar.E = zrVar.X;
                zyVar.F = zrVar.Y;
                zyVar.G = zrVar.Z;
                zyVar.h = zrVar.c;
                zyVar.f = zrVar.a;
                zyVar.g = zrVar.b;
                zyVar.d = zrVar.width;
                zyVar.e = zrVar.height;
                zyVar.H = zrVar.leftMargin;
                zyVar.I = zrVar.rightMargin;
                zyVar.J = zrVar.topMargin;
                zyVar.K = zrVar.bottomMargin;
                zyVar.N = zrVar.D;
                zyVar.V = zrVar.M;
                zyVar.W = zrVar.L;
                zyVar.Y = zrVar.O;
                zyVar.X = zrVar.N;
                zyVar.an = zrVar.aa;
                zyVar.ao = zrVar.ab;
                zyVar.Z = zrVar.P;
                zyVar.aa = zrVar.Q;
                zyVar.ab = zrVar.T;
                zyVar.ac = zrVar.U;
                zyVar.ad = zrVar.R;
                zyVar.ae = zrVar.S;
                zyVar.af = zrVar.V;
                zyVar.ag = zrVar.W;
                zyVar.am = zrVar.ac;
                zyVar.P = zrVar.x;
                zyVar.R = zrVar.z;
                zyVar.O = zrVar.w;
                zyVar.Q = zrVar.y;
                zyVar.T = zrVar.A;
                zyVar.S = zrVar.B;
                zyVar.U = zrVar.C;
                zyVar.aq = zrVar.ad;
                zyVar.L = zrVar.getMarginEnd();
                zyVar.M = zrVar.getMarginStart();
                aaa aaaVar = zxVar.b;
                aaaVar.b = childAt.getVisibility();
                aaaVar.d = childAt.getAlpha();
                aab aabVar = zxVar.e;
                aabVar.c = childAt.getRotation();
                aabVar.d = childAt.getRotationX();
                aabVar.e = childAt.getRotationY();
                aabVar.f = childAt.getScaleX();
                aabVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    aabVar.h = pivotX;
                    aabVar.i = pivotY;
                }
                aabVar.k = childAt.getTranslationX();
                aabVar.l = childAt.getTranslationY();
                aabVar.m = childAt.getTranslationZ();
                if (aabVar.n) {
                    aabVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    zyVar.ap = barrier.getAllowsGoneWidget();
                    zyVar.ak = barrier.getReferencedIds();
                    zyVar.ah = barrier.getType();
                    zyVar.ai = barrier.getMargin();
                }
            }
            i2++;
            aacVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void d(Context context, int i) {
        c((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void e(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    zx zxVarK = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        zxVarK.d.b = true;
                    }
                    this.e.put(Integer.valueOf(zxVarK.a), zxVarK);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.b(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.b(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x072d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x072d, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.f(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void i(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String resourceEntryName;
        HashSet hashSet;
        HashMap map;
        int i;
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
                        zx zxVar = (zx) map4.get(numValueOf);
                        if (zxVar != null) {
                            if (childAt instanceof Barrier) {
                                zy zyVar = zxVar.d;
                                zyVar.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(zyVar.ah);
                                barrier.setMargin(zyVar.ai);
                                barrier.a.b = zyVar.ap;
                                int[] iArr = zyVar.ak;
                                if (iArr != null) {
                                    barrier.i(iArr);
                                } else {
                                    String str = zyVar.al;
                                    if (str != null) {
                                        zyVar.ak = m(barrier, str);
                                        barrier.i(zyVar.ak);
                                    }
                                }
                            }
                            zr zrVar = (zr) childAt.getLayoutParams();
                            zrVar.a();
                            zxVar.a(zrVar);
                            HashMap map5 = zxVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map5.keySet()) {
                                zo zoVar = (zo) map5.get(str2);
                                HashSet hashSet3 = hashSet2;
                                if (zoVar.a) {
                                    map2 = map3;
                                    strConcat = str2;
                                } else {
                                    map2 = map3;
                                    strConcat = "set".concat(String.valueOf(str2));
                                }
                                try {
                                    i3 = zoVar.h;
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
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(zoVar.c));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(zoVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(zoVar.g));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Method method = cls.getMethod(strConcat, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(zoVar.g);
                                        method.invoke(childAt, colorDrawable);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        cls.getMethod(strConcat, CharSequence.class).invoke(childAt, zoVar.e);
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Boolean.TYPE).invoke(childAt, Boolean.valueOf(zoVar.f));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(zoVar.d));
                                        hashSet2 = hashSet3;
                                        map3 = map2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(zoVar.c));
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
                            childAt.setLayoutParams(zrVar);
                            aaa aaaVar = zxVar.b;
                            if (aaaVar.c == 0) {
                                childAt.setVisibility(aaaVar.b);
                            }
                            childAt.setAlpha(aaaVar.d);
                            aab aabVar = zxVar.e;
                            childAt.setRotation(aabVar.c);
                            childAt.setRotationX(aabVar.d);
                            childAt.setRotationY(aabVar.e);
                            childAt.setScaleX(aabVar.f);
                            childAt.setScaleY(aabVar.g);
                            if (aabVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aabVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    float left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    float f = top;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((left / 2.0f) - left2);
                                        childAt.setPivotY((f / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(aabVar.h)) {
                                    childAt.setPivotX(aabVar.h);
                                }
                                if (!Float.isNaN(aabVar.i)) {
                                    childAt.setPivotY(aabVar.i);
                                }
                            }
                            childAt.setTranslationX(aabVar.k);
                            childAt.setTranslationY(aabVar.l);
                            childAt.setTranslationZ(aabVar.m);
                            if (aabVar.n) {
                                childAt.setElevation(aabVar.o);
                            }
                        } else {
                            hashSet = hashSet2;
                            map = map3;
                            i = i5;
                        }
                    } else {
                        hashSet = hashSet2;
                        map = map3;
                        i = i5;
                        Log.v("ConstraintSet", a.b(id, "WARNING NO CONSTRAINTS for view "));
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
            zx zxVar2 = (zx) this.e.get(num);
            if (zxVar2 != null) {
                zy zyVar2 = zxVar2.d;
                if (zyVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = zyVar2.ak;
                    if (iArr2 != null) {
                        barrier2.i(iArr2);
                    } else {
                        String str3 = zyVar2.al;
                        if (str3 != null) {
                            zyVar2.ak = m(barrier2, str3);
                            barrier2.i(zyVar2.ak);
                        }
                    }
                    barrier2.setType(zyVar2.ah);
                    barrier2.setMargin(zyVar2.ai);
                    zr zrVar2 = new zr(-2, -2);
                    barrier2.j();
                    zxVar2.a(zrVar2);
                    constraintLayout.addView(barrier2, zrVar2);
                }
                if (zyVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    zr zrVar3 = new zr(-2, -2);
                    zxVar2.a(zrVar3);
                    constraintLayout.addView(guideline, zrVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof zp) {
                ((zp) childAt2).f(constraintLayout);
            }
        }
    }

    public final void j(int i, int i2, int i3, int i4) {
        zy zyVar;
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new zx());
        }
        zx zxVar = (zx) map.get(numValueOf);
        if (zxVar == null) {
            return;
        }
        if (i2 == 3) {
            if (i3 == 3) {
                zyVar = zxVar.d;
                zyVar.n = 0;
                zyVar.o = -1;
            } else {
                if (i3 != 4) {
                    throw new IllegalArgumentException("right to " + l(i3) + " undefined");
                }
                zyVar = zxVar.d;
                zyVar.o = 0;
                zyVar.n = -1;
            }
            zyVar.r = -1;
            zyVar.s = -1;
            zyVar.t = -1;
            zxVar.d.J = i4;
            return;
        }
        if (i2 == 4) {
            if (i3 == 4) {
                zy zyVar2 = zxVar.d;
                zyVar2.q = 0;
                zyVar2.p = -1;
                zyVar2.r = -1;
                zyVar2.s = -1;
                zyVar2.t = -1;
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException("right to " + l(i3) + " undefined");
                }
                zy zyVar3 = zxVar.d;
                zyVar3.p = 0;
                zyVar3.q = -1;
                zyVar3.r = -1;
                zyVar3.s = -1;
                zyVar3.t = -1;
            }
            zxVar.d.K = i4;
            return;
        }
        if (i2 == 5) {
            if (i3 == 5) {
                zy zyVar4 = zxVar.d;
                zyVar4.r = 0;
                zyVar4.q = -1;
                zyVar4.p = -1;
                zyVar4.n = -1;
                zyVar4.o = -1;
                return;
            }
            if (i3 == 3) {
                zy zyVar5 = zxVar.d;
                zyVar5.s = 0;
                zyVar5.q = -1;
                zyVar5.p = -1;
                zyVar5.n = -1;
                zyVar5.o = -1;
                return;
            }
            if (i3 != 4) {
                throw new IllegalArgumentException("right to " + l(i3) + " undefined");
            }
            zy zyVar6 = zxVar.d;
            zyVar6.t = 0;
            zyVar6.q = -1;
            zyVar6.p = -1;
            zyVar6.n = -1;
            zyVar6.o = -1;
            return;
        }
        if (i2 != 6) {
            if (i3 == 7) {
                zy zyVar7 = zxVar.d;
                zyVar7.x = 0;
                zyVar7.w = -1;
            } else {
                if (i3 != 6) {
                    throw new IllegalArgumentException("right to " + l(i3) + " undefined");
                }
                zy zyVar8 = zxVar.d;
                zyVar8.w = 0;
                zyVar8.x = -1;
            }
            zxVar.d.L = i4;
            return;
        }
        if (i3 == 6) {
            zy zyVar9 = zxVar.d;
            zyVar9.v = 0;
            zyVar9.u = -1;
        } else {
            if (i3 != 7) {
                throw new IllegalArgumentException("right to " + l(i3) + " undefined");
            }
            zy zyVar10 = zxVar.d;
            zyVar10.u = 0;
            zyVar10.v = -1;
        }
        zxVar.d.M = i4;
    }
}
