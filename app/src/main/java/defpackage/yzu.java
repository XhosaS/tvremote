package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yzu extends yzo {
    private final Comparator e;

    public yzu(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.yzo, defpackage.yxw, defpackage.yxx
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.yzo
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final yzw f() {
        zcq zcqVar;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.e;
        if (i == 0) {
            zcqVar = yzw.A(comparator);
        } else {
            zbw.b(objArrCopyOf, i);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (comparator.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < (objArrCopyOf.length >> 1)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zcqVar = new zcq(yyk.h(objArrCopyOf, i2), comparator);
        }
        this.b = zcqVar.e.size();
        this.c = true;
        return zcqVar;
    }

    public final void l(Object obj) {
        super.c(obj);
    }

    public final void m(Object... objArr) {
        super.h(objArr);
    }
}
