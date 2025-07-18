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
class cxx extends cye {
    private static boolean d = false;
    private static Method e;
    private static Class h;
    private static Field i;
    private static Field j;
    final WindowInsets a;
    csr b;
    int c;
    private csr[] k;
    private csr l;
    private cyh m;

    public cxx(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar);
        this.l = null;
        this.a = windowInsets;
    }

    private csr A() {
        cyh cyhVar = this.m;
        return cyhVar != null ? cyhVar.h() : csr.a;
    }

    private csr B(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!d) {
            C();
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
                    return csr.d(rect);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        return null;
    }

    private static void C() throws ClassNotFoundException {
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

    static boolean o(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private csr z(int i2, boolean z) {
        csr csrVarB = csr.a;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0) {
                csrVarB = csr.b(csrVarB, b(i3, z));
            }
        }
        return csrVarB;
    }

    @Override // defpackage.cye
    public csr a(int i2) {
        return z(i2, false);
    }

    protected csr b(int i2, boolean z) {
        csr csrVarH;
        csr csrVar;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    csr[] csrVarArr = this.k;
                    csrVarH = csrVarArr != null ? csrVarArr[cwo.b(8)] : null;
                    if (csrVarH != null) {
                        return csrVarH;
                    }
                    csr csrVarD = d();
                    csr csrVarA = A();
                    int i3 = csrVarD.e;
                    int i4 = csrVarA.e;
                    if (i3 > i4 || ((csrVar = this.b) != null && !csrVar.equals(csr.a) && (i3 = this.b.e) > i4)) {
                        return csr.e(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return x();
                    }
                    if (i2 == 32) {
                        return w();
                    }
                    if (i2 == 64) {
                        return y();
                    }
                    if (i2 == 128) {
                        cyh cyhVar = this.m;
                        cvb cvbVarJ = cyhVar != null ? cyhVar.j() : u();
                        if (cvbVarJ != null) {
                            return csr.e(cvbVarJ.b(), cvbVarJ.d(), cvbVarJ.c(), cvbVarJ.a());
                        }
                    }
                }
            } else {
                if (z) {
                    csr csrVarA2 = A();
                    csr csrVarP = p();
                    return csr.e(Math.max(csrVarA2.b, csrVarP.b), 0, Math.max(csrVarA2.d, csrVarP.d), Math.max(csrVarA2.e, csrVarP.e));
                }
                if ((this.c & 2) == 0) {
                    csr csrVarD2 = d();
                    cyh cyhVar2 = this.m;
                    csrVarH = cyhVar2 != null ? cyhVar2.h() : null;
                    int iMin = csrVarD2.e;
                    if (csrVarH != null) {
                        iMin = Math.min(iMin, csrVarH.e);
                    }
                    return csr.e(csrVarD2.b, 0, csrVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return csr.e(0, Math.max(A().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return csr.e(0, d().c, 0, 0);
            }
        }
        return csr.a;
    }

    @Override // defpackage.cye
    public csr c(int i2) {
        return z(i2, true);
    }

    @Override // defpackage.cye
    public final csr d() {
        if (this.l == null) {
            WindowInsets windowInsets = this.a;
            this.l = csr.e(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.l;
    }

    @Override // defpackage.cye
    public cyh e(int i2, int i3, int i4, int i5) {
        cyh cyhVarO = cyh.o(this.a);
        cxw cxvVar = Build.VERSION.SDK_INT >= 34 ? new cxv(cyhVarO) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVarO) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVarO) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVarO) : new cxr(cyhVarO);
        cxvVar.c(cyh.i(d(), i2, i3, i4, i5));
        cxvVar.b(cyh.i(p(), i2, i3, i4, i5));
        return cxvVar.a();
    }

    @Override // defpackage.cye
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        cxx cxxVar = (cxx) obj;
        return Objects.equals(this.b, cxxVar.b) && o(this.c, cxxVar.c);
    }

    @Override // defpackage.cye
    public void f(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        csr csrVarB = B(view);
        if (csrVarB == null) {
            csrVarB = csr.a;
        }
        i(csrVarB);
    }

    @Override // defpackage.cye
    public void g(cyh cyhVar) {
        cyhVar.s(this.m);
        cyhVar.b.i(this.b);
        cyhVar.t(this.c);
    }

    @Override // defpackage.cye
    public void h(csr[] csrVarArr) {
        this.k = csrVarArr;
    }

    @Override // defpackage.cye
    public void i(csr csrVar) {
        this.b = csrVar;
    }

    @Override // defpackage.cye
    public void j(cyh cyhVar) {
        this.m = cyhVar;
    }

    @Override // defpackage.cye
    public void k(int i2) {
        this.c = i2;
    }

    @Override // defpackage.cye
    public boolean l() {
        return this.a.isRound();
    }

    protected boolean m(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !b(i2, false).equals(csr.a);
    }

    @Override // defpackage.cye
    public boolean n(int i2) {
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0 && !m(i3)) {
                return false;
            }
        }
        return true;
    }

    public cxx(cyh cyhVar, cxx cxxVar) {
        this(cyhVar, new WindowInsets(cxxVar.a));
    }
}
