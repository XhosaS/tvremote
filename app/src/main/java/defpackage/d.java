package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class d {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = f.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
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
                    c cVar = new c();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, f.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    cVar.p = b(typedArrayObtainStyledAttributes, index, cVar.p);
                                    break;
                                case 2:
                                    cVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.D);
                                    break;
                                case 3:
                                    cVar.o = b(typedArrayObtainStyledAttributes, index, cVar.o);
                                    break;
                                case 4:
                                    cVar.n = b(typedArrayObtainStyledAttributes, index, cVar.n);
                                    break;
                                case 5:
                                    cVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    cVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cVar.x);
                                    break;
                                case 7:
                                    cVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cVar.y);
                                    break;
                                case 8:
                                    cVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.E);
                                    break;
                                case 9:
                                    cVar.n = b(typedArrayObtainStyledAttributes, index, cVar.t);
                                    break;
                                case 10:
                                    cVar.s = b(typedArrayObtainStyledAttributes, index, cVar.s);
                                    break;
                                case 11:
                                    cVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.K);
                                    break;
                                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                    cVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.L);
                                    break;
                                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                    cVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.H);
                                    break;
                                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                    cVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.J);
                                    break;
                                case 15:
                                    cVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.M);
                                    break;
                                case 16:
                                    cVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.I);
                                    break;
                                case 17:
                                    cVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cVar.e);
                                    break;
                                case 18:
                                    cVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, cVar.f);
                                    break;
                                case 19:
                                    cVar.g = typedArrayObtainStyledAttributes.getFloat(index, cVar.g);
                                    break;
                                case 20:
                                    cVar.u = typedArrayObtainStyledAttributes.getFloat(index, cVar.u);
                                    break;
                                case 21:
                                    cVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, cVar.c);
                                    break;
                                case 22:
                                    int i4 = typedArrayObtainStyledAttributes.getInt(index, cVar.G);
                                    cVar.G = i4;
                                    cVar.G = b[i4];
                                    break;
                                case 23:
                                    cVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, cVar.b);
                                    break;
                                case 24:
                                    cVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.A);
                                    break;
                                case 25:
                                    cVar.h = b(typedArrayObtainStyledAttributes, index, cVar.h);
                                    break;
                                case 26:
                                    cVar.i = b(typedArrayObtainStyledAttributes, index, cVar.i);
                                    break;
                                case 27:
                                    cVar.z = typedArrayObtainStyledAttributes.getInt(index, cVar.z);
                                    break;
                                case 28:
                                    cVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.B);
                                    break;
                                case 29:
                                    cVar.j = b(typedArrayObtainStyledAttributes, index, cVar.j);
                                    break;
                                case 30:
                                    cVar.k = b(typedArrayObtainStyledAttributes, index, cVar.k);
                                    break;
                                case 31:
                                    cVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.F);
                                    break;
                                case 32:
                                    cVar.q = b(typedArrayObtainStyledAttributes, index, cVar.q);
                                    break;
                                case 33:
                                    cVar.r = b(typedArrayObtainStyledAttributes, index, cVar.r);
                                    break;
                                case 34:
                                    cVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, cVar.C);
                                    break;
                                case 35:
                                    cVar.m = b(typedArrayObtainStyledAttributes, index, cVar.m);
                                    break;
                                case 36:
                                    cVar.l = b(typedArrayObtainStyledAttributes, index, cVar.l);
                                    break;
                                case 37:
                                    cVar.v = typedArrayObtainStyledAttributes.getFloat(index, cVar.v);
                                    break;
                                case 38:
                                    cVar.d = typedArrayObtainStyledAttributes.getResourceId(index, cVar.d);
                                    break;
                                case 39:
                                    cVar.O = typedArrayObtainStyledAttributes.getFloat(index, cVar.O);
                                    break;
                                case 40:
                                    cVar.N = typedArrayObtainStyledAttributes.getFloat(index, cVar.N);
                                    break;
                                case 41:
                                    cVar.P = typedArrayObtainStyledAttributes.getInt(index, cVar.P);
                                    break;
                                case 42:
                                    cVar.Q = typedArrayObtainStyledAttributes.getInt(index, cVar.Q);
                                    break;
                                case 43:
                                    cVar.R = typedArrayObtainStyledAttributes.getFloat(index, cVar.R);
                                    break;
                                case 44:
                                    cVar.S = true;
                                    cVar.T = typedArrayObtainStyledAttributes.getFloat(index, cVar.T);
                                    break;
                                case 45:
                                    cVar.U = typedArrayObtainStyledAttributes.getFloat(index, cVar.U);
                                    break;
                                case 46:
                                    cVar.V = typedArrayObtainStyledAttributes.getFloat(index, cVar.V);
                                    break;
                                case 47:
                                    cVar.W = typedArrayObtainStyledAttributes.getFloat(index, cVar.W);
                                    break;
                                case 48:
                                    cVar.X = typedArrayObtainStyledAttributes.getFloat(index, cVar.X);
                                    break;
                                case 49:
                                    cVar.Y = typedArrayObtainStyledAttributes.getFloat(index, cVar.Y);
                                    break;
                                case 50:
                                    cVar.Z = typedArrayObtainStyledAttributes.getFloat(index, cVar.Z);
                                    break;
                                case 51:
                                    cVar.aa = typedArrayObtainStyledAttributes.getFloat(index, cVar.aa);
                                    break;
                                case 52:
                                    cVar.ab = typedArrayObtainStyledAttributes.getFloat(index, cVar.ab);
                                    break;
                                case 53:
                                    cVar.ac = typedArrayObtainStyledAttributes.getFloat(index, cVar.ac);
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
                        cVar.a = true;
                    }
                    this.a.put(Integer.valueOf(cVar.d), cVar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
