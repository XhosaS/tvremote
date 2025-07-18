package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yyn {
    Object[] a;
    int b;
    yym c;

    public yyn() {
        throw null;
    }

    public final yyr a(boolean z) {
        yym yymVar;
        yym yymVar2;
        if (z && (yymVar2 = this.c) != null) {
            throw yymVar2.a();
        }
        zcl zclVarA = zcl.a(this.b, this.a, this);
        if (!z || (yymVar = this.c) == null) {
            return zclVarA;
        }
        throw yymVar.a();
    }

    public final void b(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, yxx.e(length, i2));
        }
    }

    public final void c(Object obj, Object obj2) {
        b(this.b + 1);
        ywl.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void d(Map.Entry entry) {
        c(entry.getKey(), entry.getValue());
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            b(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((Map.Entry) it.next());
        }
    }

    public final void f(Map map) {
        e(map.entrySet());
    }

    public yyn(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
