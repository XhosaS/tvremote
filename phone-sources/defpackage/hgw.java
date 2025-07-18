package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgw implements hhc {
    public static final hgw a = new hgw();
    private static final ghd b = ghd.d("c", "v", "i", "o");

    private hgw() {
    }

    @Override // defpackage.hhc
    public final /* bridge */ /* synthetic */ Object a(hhf hhfVar, float f) {
        if (hhfVar.p() == 1) {
            hhfVar.g();
        }
        hhfVar.h();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zO = false;
        while (hhfVar.n()) {
            int iQ = hhfVar.q(b);
            if (iQ == 0) {
                zO = hhfVar.o();
            } else if (iQ == 1) {
                listD = hgm.d(hhfVar, f);
            } else if (iQ == 2) {
                listD2 = hgm.d(hhfVar, f);
            } else if (iQ != 3) {
                hhfVar.l();
                hhfVar.m();
            } else {
                listD3 = hgm.d(hhfVar, f);
            }
        }
        hhfVar.j();
        if (hhfVar.p() == 2) {
            hhfVar.i();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new hfd(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new hdz(hhm.c((PointF) listD.get(i2), (PointF) listD3.get(i2)), hhm.c(pointF2, (PointF) listD2.get(i)), pointF2));
        }
        if (zO) {
            PointF pointF3 = (PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new hdz(hhm.c((PointF) listD.get(i3), (PointF) listD3.get(i3)), hhm.c(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new hfd(pointF, zO, arrayList);
    }
}
