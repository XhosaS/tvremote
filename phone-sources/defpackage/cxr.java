package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxr extends cxw {
    private static Field a = null;
    private static boolean c = false;
    private static Constructor d = null;
    private static boolean e = false;
    private WindowInsets f;
    private csr g;

    public cxr() {
        this.f = i();
    }

    private static WindowInsets i() {
        if (!c) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            c = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            e = true;
        }
        Constructor constructor = d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.cxw
    public cyh a() {
        h();
        cyh cyhVarO = cyh.o(this.f);
        cyhVarO.r(this.b);
        cyhVarO.b.s(this.g);
        return cyhVarO;
    }

    @Override // defpackage.cxw
    public void b(csr csrVar) {
        this.g = csrVar;
    }

    @Override // defpackage.cxw
    public void c(csr csrVar) {
        WindowInsets windowInsets = this.f;
        if (windowInsets != null) {
            this.f = windowInsets.replaceSystemWindowInsets(csrVar.b, csrVar.c, csrVar.d, csrVar.e);
        }
    }

    public cxr(cyh cyhVar) {
        super(cyhVar);
        this.f = cyhVar.e();
    }
}
