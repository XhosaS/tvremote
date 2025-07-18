package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class air extends aiy {
    private static boolean d = false;
    private static Method e;
    private static Class h;
    private static Field i;
    private static Field j;
    final WindowInsets a;
    acs b;
    int c;
    private acs[] k;
    private acs l;
    private ajc m;

    public air(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar);
        this.l = null;
        this.a = windowInsets;
    }

    static boolean l(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private acs w(int i2, boolean z) {
        acs acsVarB = acs.a;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i2 & i3) != 0) {
                acsVarB = acs.b(acsVarB, b(i3, z));
            }
        }
        return acsVarB;
    }

    private acs x() {
        ajc ajcVar = this.m;
        return ajcVar != null ? ajcVar.b.m() : acs.a;
    }

    private acs y(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
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
                    return acs.d(rect.left, rect.top, rect.right, rect.bottom);
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

    @Override // defpackage.aiy
    public acs a(int i2) {
        return w(i2, false);
    }

    protected acs b(int i2, boolean z) {
        acs acsVarM;
        acs acsVar;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    acs[] acsVarArr = this.k;
                    acsVarM = acsVarArr != null ? acsVarArr[aiz.a(8)] : null;
                    if (acsVarM != null) {
                        return acsVarM;
                    }
                    acs acsVarD = d();
                    acs acsVarX = x();
                    int i3 = acsVarD.e;
                    int i4 = acsVarX.e;
                    if (i3 > i4 || ((acsVar = this.b) != null && !acsVar.equals(acs.a) && (i3 = this.b.e) > i4)) {
                        return acs.d(0, 0, 0, i3);
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
                        ajc ajcVar = this.m;
                        afy afyVarR = ajcVar != null ? ajcVar.b.r() : r();
                        if (afyVarR != null) {
                            DisplayCutout displayCutout = afyVarR.a;
                            return acs.d(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    acs acsVarX2 = x();
                    acs acsVarM2 = m();
                    return acs.d(Math.max(acsVarX2.b, acsVarM2.b), 0, Math.max(acsVarX2.d, acsVarM2.d), Math.max(acsVarX2.e, acsVarM2.e));
                }
                if ((this.c & 2) == 0) {
                    acs acsVarD2 = d();
                    ajc ajcVar2 = this.m;
                    acsVarM = ajcVar2 != null ? ajcVar2.b.m() : null;
                    int iMin = acsVarD2.e;
                    if (acsVarM != null) {
                        iMin = Math.min(iMin, acsVarM.e);
                    }
                    return acs.d(acsVarD2.b, 0, acsVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return acs.d(0, Math.max(x().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return acs.d(0, d().c, 0, 0);
            }
        }
        return acs.a;
    }

    @Override // defpackage.aiy
    public acs c(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.aiy
    public final acs d() {
        if (this.l == null) {
            WindowInsets windowInsets = this.a;
            this.l = acs.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.l;
    }

    @Override // defpackage.aiy
    public ajc e(int i2, int i3, int i4, int i5) {
        ajc ajcVarG = ajc.g(this.a, null);
        aiq aipVar = Build.VERSION.SDK_INT >= 34 ? new aip(ajcVarG) : Build.VERSION.SDK_INT >= 31 ? new aio(ajcVarG) : Build.VERSION.SDK_INT >= 30 ? new ain(ajcVarG) : Build.VERSION.SDK_INT >= 29 ? new aim(ajcVarG) : new ail(ajcVarG);
        aipVar.c(ajc.f(d(), i2, i3, i4, i5));
        aipVar.b(ajc.f(m(), i2, i3, i4, i5));
        return aipVar.a();
    }

    @Override // defpackage.aiy
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        air airVar = (air) obj;
        return Objects.equals(this.b, airVar.b) && l(this.c, airVar.c);
    }

    @Override // defpackage.aiy
    public void f(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        acs acsVarY = y(view);
        if (acsVarY == null) {
            acsVarY = acs.a;
        }
        h(acsVarY);
    }

    @Override // defpackage.aiy
    public void g(acs[] acsVarArr) {
        this.k = acsVarArr;
    }

    public void h(acs acsVar) {
        this.b = acsVar;
    }

    @Override // defpackage.aiy
    public void i(ajc ajcVar) {
        this.m = ajcVar;
    }

    @Override // defpackage.aiy
    public void j(int i2) {
        this.c = i2;
    }

    @Override // defpackage.aiy
    public boolean k() {
        return this.a.isRound();
    }
}
