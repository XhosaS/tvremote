package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ail extends aiq {
    private static Field a = null;
    private static boolean c = false;
    private static Constructor d = null;
    private static boolean e = false;
    private WindowInsets f;
    private acs g;

    public ail() {
        this.f = i();
    }

    private static WindowInsets i() {
        if (!c) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
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
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            e = true;
        }
        Constructor constructor = d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.aiq
    public ajc a() {
        h();
        ajc ajcVarG = ajc.g(this.f, null);
        aiy aiyVar = ajcVarG.b;
        aiyVar.g(this.b);
        aiyVar.p(this.g);
        return ajcVarG;
    }

    @Override // defpackage.aiq
    public void b(acs acsVar) {
        this.g = acsVar;
    }

    @Override // defpackage.aiq
    public void c(acs acsVar) {
        WindowInsets windowInsets = this.f;
        if (windowInsets != null) {
            this.f = windowInsets.replaceSystemWindowInsets(acsVar.b, acsVar.c, acsVar.d, acsVar.e);
        }
    }

    public ail(ajc ajcVar) {
        super(ajcVar);
        this.f = ajcVar.e();
    }
}
