package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ae {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = af.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(101, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    ad adVar = new ad();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, af.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    adVar.p = b(typedArrayObtainStyledAttributes, index, adVar.p);
                                    break;
                                case 2:
                                    adVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.D);
                                    break;
                                case 3:
                                    adVar.o = b(typedArrayObtainStyledAttributes, index, adVar.o);
                                    break;
                                case 4:
                                    adVar.n = b(typedArrayObtainStyledAttributes, index, adVar.n);
                                    break;
                                case 5:
                                    adVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    adVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, adVar.x);
                                    break;
                                case 7:
                                    adVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, adVar.y);
                                    break;
                                case 8:
                                    adVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.E);
                                    break;
                                case 9:
                                    adVar.n = b(typedArrayObtainStyledAttributes, index, adVar.t);
                                    break;
                                case 10:
                                    adVar.s = b(typedArrayObtainStyledAttributes, index, adVar.s);
                                    break;
                                case 11:
                                    adVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.K);
                                    break;
                                case 12:
                                    adVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.L);
                                    break;
                                case 13:
                                    adVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.H);
                                    break;
                                case 14:
                                    adVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.J);
                                    break;
                                case 15:
                                    adVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.M);
                                    break;
                                case 16:
                                    adVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.I);
                                    break;
                                case 17:
                                    adVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, adVar.e);
                                    break;
                                case 18:
                                    adVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, adVar.f);
                                    break;
                                case 19:
                                    adVar.g = typedArrayObtainStyledAttributes.getFloat(index, adVar.g);
                                    break;
                                case 20:
                                    adVar.u = typedArrayObtainStyledAttributes.getFloat(index, adVar.u);
                                    break;
                                case 21:
                                    adVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, adVar.c);
                                    break;
                                case 22:
                                    int i4 = typedArrayObtainStyledAttributes.getInt(index, adVar.G);
                                    adVar.G = i4;
                                    adVar.G = b[i4];
                                    break;
                                case 23:
                                    adVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, adVar.b);
                                    break;
                                case 24:
                                    adVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.A);
                                    break;
                                case 25:
                                    adVar.h = b(typedArrayObtainStyledAttributes, index, adVar.h);
                                    break;
                                case 26:
                                    adVar.i = b(typedArrayObtainStyledAttributes, index, adVar.i);
                                    break;
                                case 27:
                                    adVar.z = typedArrayObtainStyledAttributes.getInt(index, adVar.z);
                                    break;
                                case 28:
                                    adVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.B);
                                    break;
                                case 29:
                                    adVar.j = b(typedArrayObtainStyledAttributes, index, adVar.j);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    adVar.k = b(typedArrayObtainStyledAttributes, index, adVar.k);
                                    break;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    adVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.F);
                                    break;
                                case 32:
                                    adVar.q = b(typedArrayObtainStyledAttributes, index, adVar.q);
                                    break;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    adVar.r = b(typedArrayObtainStyledAttributes, index, adVar.r);
                                    break;
                                case 34:
                                    adVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, adVar.C);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                    adVar.m = b(typedArrayObtainStyledAttributes, index, adVar.m);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    adVar.l = b(typedArrayObtainStyledAttributes, index, adVar.l);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    adVar.v = typedArrayObtainStyledAttributes.getFloat(index, adVar.v);
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    adVar.d = typedArrayObtainStyledAttributes.getResourceId(index, adVar.d);
                                    break;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    adVar.O = typedArrayObtainStyledAttributes.getFloat(index, adVar.O);
                                    break;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    adVar.N = typedArrayObtainStyledAttributes.getFloat(index, adVar.N);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    adVar.P = typedArrayObtainStyledAttributes.getInt(index, adVar.P);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    adVar.Q = typedArrayObtainStyledAttributes.getInt(index, adVar.Q);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    adVar.R = typedArrayObtainStyledAttributes.getFloat(index, adVar.R);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    adVar.S = true;
                                    adVar.T = typedArrayObtainStyledAttributes.getFloat(index, adVar.T);
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    adVar.U = typedArrayObtainStyledAttributes.getFloat(index, adVar.U);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    adVar.V = typedArrayObtainStyledAttributes.getFloat(index, adVar.V);
                                    break;
                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    adVar.W = typedArrayObtainStyledAttributes.getFloat(index, adVar.W);
                                    break;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    adVar.X = typedArrayObtainStyledAttributes.getFloat(index, adVar.X);
                                    break;
                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    adVar.Y = typedArrayObtainStyledAttributes.getFloat(index, adVar.Y);
                                    break;
                                case 50:
                                    adVar.Z = typedArrayObtainStyledAttributes.getFloat(index, adVar.Z);
                                    break;
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    adVar.aa = typedArrayObtainStyledAttributes.getFloat(index, adVar.aa);
                                    break;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    adVar.ab = typedArrayObtainStyledAttributes.getFloat(index, adVar.ab);
                                    break;
                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    adVar.ac = typedArrayObtainStyledAttributes.getFloat(index, adVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        adVar.a = true;
                    }
                    this.a.put(Integer.valueOf(adVar.d), adVar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
