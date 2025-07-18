package android.support.v7.app;

import android.R;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ld;
import defpackage.lg;
import defpackage.ly;
import defpackage.wx;
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
    private static final wx h = new wx(0);

    public ld a(Context context, AttributeSet attributeSet) {
        return new ld(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public lg c(Context context, AttributeSet attributeSet) {
        return new lg(context, attributeSet);
    }

    public ly d(Context context, AttributeSet attributeSet) {
        return new ly(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        wx wxVar = h;
        Constructor constructor = (Constructor) wxVar.get(str);
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
            wxVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f);
    }
}
