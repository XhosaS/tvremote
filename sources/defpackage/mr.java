package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mr extends ViewGroup.MarginLayoutParams {
    public mo a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    private boolean q;

    public mr() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public final void a() {
        this.o = false;
    }

    public final void b(mo moVar) {
        mo moVar2 = this.a;
        if (moVar2 != moVar) {
            if (moVar2 != null) {
                moVar2.d();
            }
            this.a = moVar;
            this.b = true;
            if (moVar != null) {
                moVar.c(this);
            }
        }
    }

    public final void c(int i, boolean z) {
        if (i != 0) {
            this.q = z;
        } else {
            this.n = z;
        }
    }

    public final boolean d(int i) {
        return i != 0 ? this.q : this.n;
    }

    public mr(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        mo moVar;
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mm.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            int i = CoordinatorLayout.h;
            if (TextUtils.isEmpty(string)) {
                moVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = String.valueOf(context.getPackageName()).concat(String.valueOf(string));
                } else if (string.indexOf(46) < 0) {
                    String str = CoordinatorLayout.a;
                    if (!TextUtils.isEmpty(str)) {
                        string = str + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.c;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.b);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    moVar = (mo) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(string)), e);
                }
            }
            this.a = moVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        mo moVar2 = this.a;
        if (moVar2 != null) {
            moVar2.c(this);
        }
    }

    public mr(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public mr(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public mr(mr mrVar) {
        super((ViewGroup.MarginLayoutParams) mrVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}
