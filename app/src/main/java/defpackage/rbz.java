package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rbz {
    public final rby a;
    private long b = 1;

    public rbz(rby rbyVar) {
        this.a = rbyVar;
    }

    public final void a(rby rbyVar, long j, ArrayList arrayList) {
        List list;
        if (rbyVar.f == null) {
            list = rbyVar.f == null ? Collections.EMPTY_LIST : rbyVar.f;
        } else {
            list = rbyVar.f;
            rbyVar.f = null;
        }
        if (rbyVar.c() && list.isEmpty()) {
            return;
        }
        ahth ahthVar = ahth.a;
        ahtf ahtfVar = new ahtf();
        int i = rbyVar.g;
        String str = rbyVar.b;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar2 = (ahth) ahtfVar.b;
        str.getClass();
        ahthVar2.b |= 1;
        ahthVar2.c = str;
        long j2 = rbyVar.c;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar3 = (ahth) ahtfVar.b;
        ahthVar3.b |= 512;
        ahthVar3.h = j2;
        long jA = rbyVar.a();
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar4 = (ahth) ahtfVar.b;
        ahthVar4.b |= 1024;
        ahthVar4.i = jA;
        long j3 = rbyVar.e;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar5 = (ahth) ahtfVar.b;
        ahthVar5.b |= 4096;
        ahthVar5.j = j3;
        long j4 = this.b;
        this.b = 1 + j4;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar6 = (ahth) ahtfVar.b;
        ahthVar6.b |= 8;
        ahthVar6.f = j4;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar7 = (ahth) ahtfVar.b;
        ahthVar7.b |= 16;
        ahthVar7.g = j;
        int i2 = rbyVar.h - 1;
        if (i2 == 1) {
            if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtfVar.y();
            }
            ahth ahthVar8 = (ahth) ahtfVar.b;
            ahthVar8.k = 1;
            ahthVar8.b |= 8192;
        } else if (i2 != 3) {
            if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtfVar.y();
            }
            ahth ahthVar9 = (ahth) ahtfVar.b;
            ahthVar9.k = 0;
            ahthVar9.b |= 8192;
        } else {
            if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtfVar.y();
            }
            ahth ahthVar10 = (ahth) ahtfVar.b;
            ahthVar10.k = 4;
            ahthVar10.b |= 8192;
        }
        if (rbyVar.c()) {
            long j5 = ((rby) list.get(list.size() - 1)).d - j2;
            if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtfVar.y();
            }
            ahth ahthVar11 = (ahth) ahtfVar.b;
            ahthVar11.b |= 1024;
            ahthVar11.i = j5;
        }
        arrayList.add((ahth) ahtfVar.v());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((rby) it.next(), ((ahth) ahtfVar.b).f, arrayList);
        }
    }
}
