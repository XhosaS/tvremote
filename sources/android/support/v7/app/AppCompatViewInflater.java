package android.support.v7.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ff;
import defpackage.fh;
import defpackage.fi;
import defpackage.ft;
import defpackage.gm;
import defpackage.mi;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] f = new Object[2];
    private static final Class[] g = {Context.class, AttributeSet.class};
    public static final int[] a = {R.attr.onClick};
    public static final int[] b = {R.attr.accessibilityHeading};
    public static final int[] c = {R.attr.accessibilityPaneTitle};
    public static final int[] d = {R.attr.screenReaderFocusable};
    public static final String[] e = {"android.widget.", "android.view.", "android.webkit."};
    private static final mi h = new mi();

    public ff a(Context context, AttributeSet attributeSet) {
        return new ff(context, attributeSet);
    }

    public fh b(Context context, AttributeSet attributeSet) {
        return new fh(context, attributeSet);
    }

    public fi c(Context context, AttributeSet attributeSet) {
        return new fi(context, attributeSet);
    }

    public ft d(Context context, AttributeSet attributeSet) {
        return new ft(context, attributeSet);
    }

    public gm e(Context context, AttributeSet attributeSet) {
        return new gm(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        mi miVar = h;
        Constructor constructor = (Constructor) miVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(g);
            miVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f);
    }
}
