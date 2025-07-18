package defpackage;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scz extends gaz implements scy {
    private static final ulp e = new ulp((Object) new pep(19), (byte[]) null);
    private final sdc a;
    private final Integer b;
    private gbb c;
    private final Map d;

    public scz(sdc sdcVar, Integer num) {
        sdcVar.getClass();
        this.a = sdcVar;
        this.b = num;
        this.d = new LinkedHashMap();
    }

    private final void d() {
        gbb gbzVar = this.c;
        gbb gbbVar = null;
        if (gbzVar == null) {
            yks.c("currentList");
            gbzVar = null;
        }
        if (!gbzVar.f()) {
            gbzVar = new gbz(gbzVar);
        }
        Map map = this.d;
        List listAn = yfm.an(gbzVar);
        map.clear();
        int i = 0;
        for (Object obj : listAn) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            map.put(Long.valueOf(((scf) obj).E), Integer.valueOf(i));
            i = i2;
        }
        Integer num = this.b;
        if (num != null) {
            gbb gbbVar2 = this.c;
            if (gbbVar2 == null) {
                yks.c("currentList");
                gbbVar2 = null;
            }
            gbbVar2.e();
            gbb gbbVar3 = this.c;
            if (gbbVar3 == null) {
                yks.c("currentList");
            } else {
                gbbVar = gbbVar3;
            }
            if (!((sbw) gbbVar.e()).a()) {
                listAn.add(new scw(num.intValue()));
            }
        }
        this.a.b(listAn);
    }

    @Override // defpackage.scy
    public final void a(List list) {
        c();
        gbb gbbVar = (gbb) list;
        this.c = gbbVar;
        if (gbbVar == null) {
            yks.c("currentList");
            gbbVar = null;
        }
        fyh fyhVar = new fyh(9);
        List list2 = gbbVar.i;
        yfm.L(list2, fyhVar);
        list2.add(new WeakReference(this));
        d();
    }

    @Override // defpackage.scy
    public final void b(scf scfVar) {
        Integer num = (Integer) this.d.get(Long.valueOf(scfVar.E));
        if (num != null) {
            int iIntValue = num.intValue();
            gbb gbbVar = this.c;
            gbb gbbVar2 = null;
            if (gbbVar == null) {
                yks.c("currentList");
                gbbVar = null;
            }
            if (iIntValue < gbbVar.d()) {
                gbb gbbVar3 = this.c;
                if (gbbVar3 == null) {
                    yks.c("currentList");
                } else {
                    gbbVar2 = gbbVar3;
                }
                int iIntValue2 = num.intValue();
                if (iIntValue2 >= 0 && iIntValue2 < gbbVar2.d()) {
                    gbc gbcVar = gbbVar2.h;
                    gbcVar.g = ykn.l(iIntValue2 - gbcVar.b, 0, gbcVar.f - 1);
                    gbbVar2.b(iIntValue2);
                } else {
                    throw new IndexOutOfBoundsException("Index: " + iIntValue2 + ", Size: " + gbbVar2.d());
                }
            }
        }
    }

    @Override // defpackage.scy
    public final void c() {
        gbb gbbVar = this.c;
        if (gbbVar != null) {
            yfm.L(gbbVar.i, new fyq(this, 8));
        }
    }

    @Override // defpackage.gaz
    public final void e() {
        d();
    }

    @Override // defpackage.gaz
    public final void f() {
        d();
    }
}
