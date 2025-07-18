package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwb implements cwh {
    public static final cwb a = new cwb();
    private static final cwk b = cwk.a("c", "v", "i", "o");

    private cwb() {
    }

    @Override // defpackage.cwh
    public final /* bridge */ /* synthetic */ Object a(cwm cwmVar, float f) {
        if (cwmVar.q() == 1) {
            cwmVar.h();
        }
        cwmVar.i();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zP = false;
        while (cwmVar.o()) {
            int iC = cwmVar.c(b);
            if (iC == 0) {
                zP = cwmVar.p();
            } else if (iC == 1) {
                listD = cvo.d(cwmVar, f);
            } else if (iC == 2) {
                listD2 = cvo.d(cwmVar, f);
            } else if (iC != 3) {
                cwmVar.m();
                cwmVar.n();
            } else {
                listD3 = cvo.d(cwmVar, f);
            }
        }
        cwmVar.k();
        if (cwmVar.q() == 2) {
            cwmVar.j();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new ctx(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new cso(cwt.b((PointF) listD.get(i2), (PointF) listD3.get(i2)), cwt.b(pointF2, (PointF) listD2.get(i)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new cso(cwt.b((PointF) listD.get(i3), (PointF) listD3.get(i3)), cwt.b(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new ctx(pointF, zP, arrayList);
    }
}
