package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rut {
    public final rus a;
    private long b = 1;

    public rut(rus rusVar) {
        this.a = rusVar;
    }

    public final void a(rus rusVar, long j, ArrayList arrayList) {
        List list;
        if (rusVar.f == null) {
            list = rusVar.f == null ? Collections.EMPTY_LIST : rusVar.f;
        } else {
            list = rusVar.f;
            rusVar.f = null;
        }
        if (rusVar.c() && list.isEmpty()) {
            return;
        }
        vty vtyVar = (vty) yzw.a.m();
        int i = rusVar.g;
        String str = rusVar.b;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar = (yzw) vtyVar.b;
        str.getClass();
        yzwVar.b |= 1;
        yzwVar.c = str;
        long j2 = rusVar.c;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar2 = (yzw) vtyVar.b;
        yzwVar2.b |= 512;
        yzwVar2.h = j2;
        long jA = rusVar.a();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar3 = (yzw) vtyVar.b;
        yzwVar3.b |= 1024;
        yzwVar3.i = jA;
        long j3 = rusVar.e;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar4 = (yzw) vtyVar.b;
        yzwVar4.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        yzwVar4.j = j3;
        long j4 = this.b;
        this.b = 1 + j4;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar5 = (yzw) vtyVar.b;
        yzwVar5.b |= 8;
        yzwVar5.f = j4;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        yzw yzwVar6 = (yzw) vtyVar.b;
        yzwVar6.b |= 16;
        yzwVar6.g = j;
        int i2 = rusVar.h - 1;
        if (i2 == 1) {
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar7 = (yzw) vtyVar.b;
            yzwVar7.k = 1;
            yzwVar7.b |= 8192;
        } else if (i2 != 3) {
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar8 = (yzw) vtyVar.b;
            yzwVar8.k = 0;
            yzwVar8.b |= 8192;
        } else {
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar9 = (yzw) vtyVar.b;
            yzwVar9.k = 4;
            yzwVar9.b |= 8192;
        }
        if (rusVar.c()) {
            long j5 = ((rus) list.get(list.size() - 1)).d - j2;
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            yzw yzwVar10 = (yzw) vtyVar.b;
            yzwVar10.b |= 1024;
            yzwVar10.i = j5;
        }
        arrayList.add((yzw) vtyVar.r());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((rus) it.next(), ((yzw) vtyVar.b).f, arrayList);
        }
    }
}
