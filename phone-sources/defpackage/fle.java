package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fle implements fix {
    private final List a;
    private final long[] b;
    private final long[] c;

    public fle(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            fkx fkxVar = (fkx) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = fkxVar.a;
            jArr[i2 + 1] = fkxVar.b;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.fix
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.fix
    public final int b(long j) {
        long[] jArr = this.c;
        int iAx = edt.ax(jArr, j, false);
        if (iAx < jArr.length) {
            return iAx;
        }
        return -1;
    }

    @Override // defpackage.fix
    public final long c(int i) {
        a.H(i >= 0);
        long[] jArr = this.c;
        a.H(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.fix
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                fkx fkxVar = (fkx) list.get(i);
                Object obj = fkxVar.c;
                if (((eca) obj).y == -3.4028235E38f) {
                    arrayList2.add(fkxVar);
                } else {
                    arrayList.add(obj);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new fab(4));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ebz ebzVar = new ebz((eca) ((fkx) arrayList2.get(i3)).c);
            ebzVar.d((-1) - i3, 1);
            arrayList.add(ebzVar.a());
        }
        return arrayList;
    }
}
