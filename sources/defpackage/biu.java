package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biu {
    public static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static boolean c(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static ArrayList e(int i) {
        bit.h(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List f(List list) {
        return list instanceof bzs ? ((bzs) list).h() : list instanceof cal ? ((cal) list).a : list instanceof RandomAccess ? new caj(list) : new cal(list);
    }

    public static List g(List list, byb bybVar) {
        return list instanceof RandomAccess ? new can(list, bybVar) : new cap(list, bybVar);
    }

    public static boolean h(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!ii.X(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !ii.X(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static void i(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Object j(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object k(Iterable iterable) {
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return iterable.get(iterable.size() - 1);
    }

    public static Object l(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object m(Iterable iterable) {
        return j(((cbe) iterable).listIterator());
    }

    public static int n(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }
}
