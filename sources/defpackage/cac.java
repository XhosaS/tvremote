package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cac extends bzz {
    private final Comparator d;

    public cac(Comparator comparator) {
        comparator.getClass();
        this.d = comparator;
    }

    @Override // defpackage.bzz, defpackage.bzk
    public final /* synthetic */ void d(Object obj) {
        super.d(obj);
    }

    @Override // defpackage.bzz
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final cae f() {
        cbe cbeVar;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            cbeVar = cae.y(comparator);
        } else {
            bjz.i(objArrCopyOf, i);
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
            cbeVar = new cbe(bzs.l(objArrCopyOf, i2), comparator);
        }
        this.b = cbeVar.size();
        this.c = true;
        return cbeVar;
    }

    public final void j(Object obj) {
        super.d(obj);
    }
}
