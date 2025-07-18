package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class rv extends sc {
    private static boolean d = false;
    private static Method e;
    private static Class h;
    private static Field i;
    private static Field j;
    final WindowInsets a;
    nt b;
    int c;
    private nt[] k;
    private nt l;
    private sf m;

    public rv(sf sfVar, WindowInsets windowInsets) {
        super(sfVar);
        this.l = null;
        this.a = windowInsets;
    }

    static boolean l(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private nt w(int i2, boolean z) {
        nt ntVarB = nt.a;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0) {
                ntVarB = nt.b(ntVarB, b(i3, z));
            }
        }
        return ntVarB;
    }

    private nt x() {
        sf sfVar = this.m;
        return sfVar != null ? sfVar.h() : nt.a;
    }

    private nt y(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!d) {
            z();
        }
        Method method = e;
        if (method != null && h != null && i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) i.get(j.get(objInvoke));
                if (rect != null) {
                    return nt.d(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        return null;
    }

    private static void z() throws ClassNotFoundException {
        try {
            e = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            h = cls;
            i = cls.getDeclaredField("mVisibleInsets");
            j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            i.setAccessible(true);
            j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
        }
        d = true;
    }

    @Override // defpackage.sc
    public nt a(int i2) {
        return w(i2, false);
    }

    protected nt b(int i2, boolean z) {
        nt ntVarH;
        nt ntVar;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    nt[] ntVarArr = this.k;
                    ntVarH = ntVarArr != null ? ntVarArr[qo.c(8)] : null;
                    if (ntVarH != null) {
                        return ntVarH;
                    }
                    nt ntVarD = d();
                    nt ntVarX = x();
                    int i3 = ntVarD.e;
                    int i4 = ntVarX.e;
                    if (i3 > i4 || ((ntVar = this.b) != null && !ntVar.equals(nt.a) && (i3 = this.b.e) > i4)) {
                        return nt.d(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return u();
                    }
                    if (i2 == 32) {
                        return t();
                    }
                    if (i2 == 64) {
                        return v();
                    }
                    if (i2 == 128) {
                        sf sfVar = this.m;
                        po poVarR = sfVar != null ? sfVar.b.r() : r();
                        if (poVarR != null) {
                            return nt.d(Build.VERSION.SDK_INT >= 28 ? poVarR.a.getSafeInsetLeft() : 0, Build.VERSION.SDK_INT >= 28 ? poVarR.a.getSafeInsetTop() : 0, Build.VERSION.SDK_INT >= 28 ? poVarR.a.getSafeInsetRight() : 0, Build.VERSION.SDK_INT >= 28 ? poVarR.a.getSafeInsetBottom() : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    nt ntVarX2 = x();
                    nt ntVarM = m();
                    return nt.d(Math.max(ntVarX2.b, ntVarM.b), 0, Math.max(ntVarX2.d, ntVarM.d), Math.max(ntVarX2.e, ntVarM.e));
                }
                if ((this.c & 2) == 0) {
                    nt ntVarD2 = d();
                    sf sfVar2 = this.m;
                    ntVarH = sfVar2 != null ? sfVar2.h() : null;
                    int iMin = ntVarD2.e;
                    if (ntVarH != null) {
                        iMin = Math.min(iMin, ntVarH.e);
                    }
                    return nt.d(ntVarD2.b, 0, ntVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return nt.d(0, Math.max(x().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return nt.d(0, d().c, 0, 0);
            }
        }
        return nt.a;
    }

    @Override // defpackage.sc
    public nt c(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.sc
    public final nt d() {
        if (this.l == null) {
            WindowInsets windowInsets = this.a;
            this.l = nt.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.l;
    }

    @Override // defpackage.sc
    public sf e(int i2, int i3, int i4, int i5) {
        sf sfVarN = sf.n(this.a);
        ru rtVar = Build.VERSION.SDK_INT >= 34 ? new rt(sfVarN) : Build.VERSION.SDK_INT >= 31 ? new rs(sfVarN) : Build.VERSION.SDK_INT >= 30 ? new rr(sfVarN) : Build.VERSION.SDK_INT >= 29 ? new rq(sfVarN) : new rp(sfVarN);
        rtVar.c(sf.i(d(), i2, i3, i4, i5));
        rtVar.b(sf.i(m(), i2, i3, i4, i5));
        return rtVar.a();
    }

    @Override // defpackage.sc
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return Objects.equals(this.b, rvVar.b) && l(this.c, rvVar.c);
    }

    @Override // defpackage.sc
    public void f(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        nt ntVarY = y(view);
        if (ntVarY == null) {
            ntVarY = nt.a;
        }
        h(ntVarY);
    }

    @Override // defpackage.sc
    public void g(nt[] ntVarArr) {
        this.k = ntVarArr;
    }

    public void h(nt ntVar) {
        this.b = ntVar;
    }

    @Override // defpackage.sc
    public void i(sf sfVar) {
        this.m = sfVar;
    }

    @Override // defpackage.sc
    public void j(int i2) {
        this.c = i2;
    }

    @Override // defpackage.sc
    public boolean k() {
        return this.a.isRound();
    }
}
