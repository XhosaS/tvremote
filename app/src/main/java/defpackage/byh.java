package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byh {
    public final ClassLoader a;
    public final bxk b;
    public final bxf c;

    public byh(ClassLoader classLoader, bxk bxkVar) {
        this.a = classLoader;
        this.b = bxkVar;
        this.c = new bxf(classLoader);
    }

    private final boolean f() {
        return cag.c("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new agum() { // from class: byf
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                Class clsA;
                byh byhVar = this.a;
                try {
                    clsA = byhVar.b.a();
                } catch (ClassNotFoundException unused) {
                    clsA = null;
                }
                boolean z = false;
                if (clsA != null) {
                    Class clsD = byhVar.d();
                    Method method = clsD.getMethod("addWindowLayoutInfoListener", Activity.class, clsA);
                    Method method2 = clsD.getMethod("removeWindowLayoutInfoListener", clsA);
                    method.getClass();
                    if (Modifier.isPublic(method.getModifiers())) {
                        method2.getClass();
                        if (Modifier.isPublic(method2.getModifiers())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final WindowLayoutComponent a() {
        int iA;
        cag cagVar = cag.a;
        final bxf bxfVar = this.c;
        if (!cagVar.a(new bxd(bxfVar)) || !cag.c("WindowExtensionsProvider#getWindowExtensions is not valid", new agum() { // from class: bxe
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                bxf bxfVar2 = bxfVar;
                Class<?> clsLoadClass = bxfVar2.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class clsA = bxfVar2.a();
                cag cagVar2 = cag.a;
                declaredMethod.getClass();
                boolean zB = cagVar2.b(declaredMethod, clsA);
                boolean z = false;
                if (zB && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) || !cag.c("WindowExtensions#getWindowLayoutComponent is not valid", new agum() { // from class: bya
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
                byh byhVar = this.a;
                Method method = byhVar.c.a().getMethod("getWindowLayoutComponent", null);
                Class clsD = byhVar.d();
                method.getClass();
                boolean z = false;
                if (Modifier.isPublic(method.getModifiers()) && cag.a.b(method, clsD)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) || !cag.c("FoldingFeature class is not valid", new agum() { // from class: byb
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                Class<?> clsLoadClass = this.a.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                cag cagVar2 = cag.a;
                method.getClass();
                agwj agwjVar = agwi.a;
                boolean z = false;
                if (cagVar2.b(method, aguk.a(new agvq(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
                    method2.getClass();
                    if (cagVar2.b(method2, aguk.a(new agvq(Integer.TYPE))) && Modifier.isPublic(method2.getModifiers())) {
                        method3.getClass();
                        if (cagVar2.b(method3, aguk.a(new agvq(Integer.TYPE))) && Modifier.isPublic(method3.getModifiers())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) || (iA = bxl.a.a()) <= 0) {
            return null;
        }
        boolean zE = true;
        if (iA == 1) {
            zE = f();
        } else if (iA < 5) {
            zE = e();
        } else if (!e() || !cag.c("DisplayFoldFeature is not valid", new agum() { // from class: byd
            /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
            @Override // defpackage.agum
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
                /*
                    r7 = this;
                    byh r0 = r7.a
                    java.lang.Class r0 = r0.b()
                    java.lang.String r1 = "getType"
                    r2 = 0
                    java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                    r2 = 1
                    java.lang.Class[] r3 = new java.lang.Class[r2]
                    java.lang.Class r4 = java.lang.Integer.TYPE
                    r5 = 0
                    r3[r5] = r4
                    java.lang.String r4 = "hasProperty"
                    java.lang.reflect.Method r3 = r0.getMethod(r4, r3)
                    java.lang.Class[] r4 = new java.lang.Class[r2]
                    java.lang.Class<int[]> r6 = int[].class
                    r4[r5] = r6
                    java.lang.String r6 = "hasProperties"
                    java.lang.reflect.Method r0 = r0.getMethod(r6, r4)
                    r1.getClass()
                    int r4 = r1.getModifiers()
                    boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
                    if (r4 == 0) goto L69
                    cag r4 = defpackage.cag.a
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    boolean r1 = r4.b(r1, r6)
                    if (r1 == 0) goto L69
                    r3.getClass()
                    int r1 = r3.getModifiers()
                    boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                    if (r1 == 0) goto L69
                    java.lang.Class r1 = java.lang.Boolean.TYPE
                    boolean r1 = r4.b(r3, r1)
                    if (r1 == 0) goto L69
                    r0.getClass()
                    int r1 = r0.getModifiers()
                    boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                    if (r1 == 0) goto L69
                    java.lang.Class r1 = java.lang.Boolean.TYPE
                    boolean r0 = r4.b(r0, r1)
                    if (r0 == 0) goto L69
                    goto L6a
                L69:
                    r2 = r5
                L6a:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.a():java.lang.Object");
            }
        }) || !cag.c("SupportedWindowFeatures is not valid", new agum() { // from class: byc
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, SecurityException {
                byh byhVar = this.a;
                Method method = byhVar.c().getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method.getGenericReturnType();
                genericReturnType.getClass();
                boolean z = false;
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls = (Class) type;
                method.getClass();
                if (Modifier.isPublic(method.getModifiers()) && cag.a.b(method, List.class) && agvy.c(cls, byhVar.b())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) || !cag.c("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new agum() { // from class: bye
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, SecurityException {
                byh byhVar = this.a;
                Method method = byhVar.d().getMethod("getSupportedWindowFeatures", null);
                method.getClass();
                boolean z = false;
                if (Modifier.isPublic(method.getModifiers()) && cag.a.b(method, byhVar.c())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        })) {
            zE = false;
        }
        if (zE) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return null;
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return cag.c(sb.toString(), new agum() { // from class: byg
            @Override // defpackage.agum
            public final Object a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                Class clsD = this.a.d();
                boolean z = false;
                Method method = clsD.getMethod("addWindowLayoutInfoListener", Context.class, bxl$$ExternalSyntheticApiModelOutline0.m85m());
                Method method2 = clsD.getMethod("removeWindowLayoutInfoListener", bxl$$ExternalSyntheticApiModelOutline0.m85m());
                method.getClass();
                if (Modifier.isPublic(method.getModifiers())) {
                    method2.getClass();
                    if (Modifier.isPublic(method2.getModifiers())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
