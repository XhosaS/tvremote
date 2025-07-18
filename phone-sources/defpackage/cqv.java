package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqv<V extends View> {
    public cqv() {
    }

    public static View A(bko bkoVar) {
        cmv cmvVar = fh.I(bkoVar.q).j;
        View view = cmvVar != null ? cmvVar.c : null;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static boolean B(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static Rect C(bmh bmhVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        bmy bmyVarB = bmhVar.b();
        if (bmyVarB == null) {
            return null;
        }
        int i = iArr[0];
        int i2 = ((int) bmyVarB.b) + i;
        int i3 = iArr2[0];
        int i4 = iArr[1];
        int i5 = ((int) bmyVarB.c) + i4;
        int i6 = iArr2[1];
        return new Rect(i2 - i3, i5 - i6, (((int) bmyVarB.d) + i) - i3, (((int) bmyVarB.e) + i4) - i6);
    }

    public static void t(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            edn ednVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                break;
                            } else {
                                cqn cqnVar = new cqn();
                                int attributeCount = xml.getAttributeCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= attributeCount) {
                                        break;
                                    } else {
                                        String attributeName = xml.getAttributeName(i2);
                                        String attributeValue = xml.getAttributeValue(i2);
                                        if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                            int i3 = -1;
                                            int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                            if (identifier != -1) {
                                                i3 = identifier;
                                            } else if (attributeValue.length() > 1) {
                                                i3 = Integer.parseInt(attributeValue.substring(1));
                                            } else {
                                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                            }
                                            cqnVar.i(context, xml);
                                            sparseArray2.put(i3, cqnVar);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                edn ednVar2 = new edn(context, xml);
                                sparseArray.put(ednVar2.a, ednVar2);
                                ednVar = ednVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                cqg cqgVar = new cqg(context, xml);
                                if (ednVar != null) {
                                    ((ArrayList) ednVar.b).add(cqgVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.cf(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.cf(i, "Error parsing resource: "), e2);
        }
    }

    public static int u(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static int v(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static uhp w(coo cooVar) {
        com comVar = new com();
        coq coqVar = new coq(comVar);
        comVar.b = coqVar;
        comVar.a = cooVar.getClass();
        try {
            comVar.a = cooVar.a(comVar);
            return coqVar;
        } catch (Exception e) {
            coqVar.a(e);
            return coqVar;
        }
    }

    public static void x(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(defpackage.yjk r18, defpackage.cns r19, defpackage.yjz r20, defpackage.bao r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqv.y(yjk, cns, yjz, bao, int, int):void");
    }

    public static /* synthetic */ void z(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1090521195);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = xn.e;
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            int i4 = (((((i2 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar2);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            yjzVar.a(baoVarD, Integer.valueOf((i4 >> 6) & 14));
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cne(bkpVar, yjzVar, i, 0);
        }
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean j(View view) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(View view, Rect rect) {
        return false;
    }

    public cqv(Context context, AttributeSet attributeSet) {
    }

    public cqv(byte[] bArr) {
    }

    public void c() {
    }

    public void b(cqx cqxVar) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void q(View view, Parcelable parcelable) {
    }

    public void a(View view, int i, int i2) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }
}
