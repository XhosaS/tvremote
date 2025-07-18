package defpackage;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwx {
    public final vsz a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final int[] f;
    public boolean g;
    private final float h;
    private final SparseArray i;
    private final SparseArray j;

    public lwx(vsz vszVar, float f, Collection collection, Collection collection2, Collection collection3, Collection collection4) {
        this.a = vszVar;
        this.h = f;
        this.b = krh.h(collection);
        int size = collection.size();
        this.i = new SparseArray(size);
        this.j = new SparseArray(size);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lwq lwqVar = (lwq) it.next();
            this.i.put(lwqVar.a, lwqVar);
            Iterator it2 = lwqVar.b.iterator();
            while (it2.hasNext()) {
                this.j.put(((Integer) it2.next()).intValue(), lwqVar);
            }
        }
        this.c = krh.h(collection2);
        this.d = krh.h(collection3);
        this.e = krh.h(collection4);
        this.f = new int[collection4.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f;
            if (i >= iArr.length) {
                this.g = true;
                return;
            } else {
                iArr[i] = ((lwh) this.e.get(i)).a;
                i++;
            }
        }
    }

    public final int a(int i) {
        return (int) ((i / this.h) * 1000.0f);
    }

    public final lwq b(int i) {
        return (lwq) this.j.get(i);
    }
}
