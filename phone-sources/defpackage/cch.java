package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cch implements ccg {
    private final /* synthetic */ int c;
    public static final cch b = new cch(1);
    public static final cch a = new cch(0);

    private cch(int i) {
        this.c = i;
    }

    @Override // defpackage.ccg
    public final Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutM357m = null;
        if (this.c == 0) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                return new Rect((Rect) objInvoke);
            } catch (Exception e) {
                if ((e instanceof NoSuchFieldException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                    return b.a(activity);
                }
                throw e;
            }
        }
        Rect rect = new Rect();
        Configuration configuration2 = activity.getResources().getConfiguration();
        try {
            Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(configuration2);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke2 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            } else {
                Object objInvoke3 = obj2.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj2, null);
                objInvoke3.getClass();
                rect.set((Rect) objInvoke3);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iB = ccf.b(activity);
            if (rect.bottom + iB == point.y) {
                rect.bottom += iB;
            } else if (rect.right + iB == point.x) {
                rect.right += iB;
            } else if (rect.left == iB) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField3 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField3.setAccessible(true);
                Object obj3 = declaredField3.get(objNewInstance);
                if (eo$$ExternalSyntheticApiModelOutline0.m368m(obj3)) {
                    displayCutoutM357m = eo$$ExternalSyntheticApiModelOutline0.m357m(obj3);
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                    throw e3;
                }
            }
            if (displayCutoutM357m != null) {
                if (rect.left == displayCutoutM357m.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM357m.getSafeInsetRight()) {
                    rect.right += displayCutoutM357m.getSafeInsetRight();
                }
                if (rect.top == displayCutoutM357m.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM357m.getSafeInsetBottom()) {
                    rect.bottom += displayCutoutM357m.getSafeInsetBottom();
                }
            }
        }
        return rect;
    }
}
