package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gok implements goj {
    private final /* synthetic */ int d;
    public static final gok c = new gok(1);
    public static final gok b = new gok(0);

    private gok(int i) {
        this.d = i;
    }

    @Override // defpackage.goj
    public final Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutM357m = null;
        if (this.d == 0) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                return new Rect((Rect) objInvoke);
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                Log.w(goi.b, e);
                return c.a(activity);
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
            Log.w(goi.b, e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iM = gli.M(activity);
            if (rect.bottom + iM == point.y) {
                rect.bottom += iM;
            } else if (rect.right + iM == point.x) {
                rect.right += iM;
            } else if (rect.left == iM) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            defaultDisplay.getClass();
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
                Log.w(goi.b, e3);
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
