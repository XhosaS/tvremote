package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kd {
    public static final Object[] a = new Object[0];
    public static final kc b = new kc(0);

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            kv.c(a.cn(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            kv.a(a.cn(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            kv.c(a.cd(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            kv.c("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final kc c(Object obj, Object obj2) {
        kc kcVar = new kc(2);
        kcVar.p(obj);
        kcVar.p(obj2);
        return kcVar;
    }
}
