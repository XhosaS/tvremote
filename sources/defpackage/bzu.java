package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzu {
    Object[] a;
    int b;
    bzt c;

    public bzu() {
        this(4);
    }

    private final bzw f(boolean z) {
        bzt bztVar;
        bzt bztVar2;
        if (z && (bztVar2 = this.c) != null) {
            throw bztVar2.a();
        }
        cbc cbcVarH = cbc.h(this.b, this.a, this);
        if (!z || (bztVar = this.c) == null) {
            return cbcVarH;
        }
        throw bztVar.a();
    }

    private final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, bzk.a(length, i2));
        }
    }

    public final bzw a() {
        return f(false);
    }

    public final bzw b() {
        return f(true);
    }

    public final void c(Object obj, Object obj2) {
        g(this.b + 1);
        bit.g(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            g(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void e(Map map) {
        d(map.entrySet());
    }

    public bzu(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
