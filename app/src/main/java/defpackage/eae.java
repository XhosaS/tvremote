package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eae {
    public static final eaf a = new eac();
    public static final eaf b = new ead();
    public static final eaf c = new eab();
    public static final eaf d = new dzw();
    public static final eaf e = new dzv();
    public static final eaf f = new dzy();
    public static final eaf g = new dzx();
    public static final eaf h = new dzz();
    public static final eaf i = new eaa();

    public static float a(View view, boolean z) {
        float x = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof elr) || !(view instanceof emi))) {
            x += z ? view.getX() : view.getY();
            view = (View) view.getParent();
        }
        return x;
    }

    public static View b(Object obj, eaf eafVar) {
        if (obj instanceof View) {
            return (View) obj;
        }
        throw new RuntimeException("Animating '" + eafVar.b() + "' is only supported on Views (got " + String.valueOf(obj) + ")");
    }

    public static View c(Drawable drawable) {
        Object callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    public static List d(elr elrVar) {
        int mountItemCount = elrVar.getMountItemCount();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < mountItemCount; i2++) {
            elv elvVarA = elrVar.a(i2);
            Object obj = elvVarA.a;
            if ((obj instanceof Drawable) && (((dvu) elvVarA.d.b).b.d & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) obj);
            }
        }
        return arrayList;
    }
}
