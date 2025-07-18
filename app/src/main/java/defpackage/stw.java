package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stw implements sud {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl");
    public final sjp b;
    public List c;
    public List d;
    public final slj e;
    private final Context f;
    private final ahbt g;
    private final szv h;
    private final List i;

    static {
        agqq.d(1999, 4, 3, 2);
    }

    public stw(smx smxVar, slj sljVar, Context context, Executor executor, ahbt ahbtVar, agte agteVar, szw szwVar) {
        smxVar.getClass();
        sljVar.getClass();
        context.getClass();
        executor.getClass();
        ahbtVar.getClass();
        agteVar.getClass();
        this.e = sljVar;
        this.f = context;
        this.g = ahbtVar;
        this.b = new sjp(ahbtVar);
        this.h = szwVar.a();
        agrd agrdVar = agrd.a;
        this.c = agrdVar;
        this.d = agrdVar;
        this.i = agrdVar;
    }

    public final stl a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            stz stzVar = (stz) it.next();
            ssx ssxVar = ssx.a;
            ssw sswVar = new ssw();
            int iA = std.a(stzVar.c);
            if (iA == 0) {
                iA = 1;
            }
            stb.b(iA, sswVar);
            int iA2 = ssv.a(stzVar.e);
            int i = iA2 != 0 ? iA2 : 1;
            if ((sswVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                sswVar.y();
            }
            ssx ssxVar2 = (ssx) sswVar.b;
            ssxVar2.d = Integer.valueOf(i - 1);
            ssxVar2.c = 3;
            arrayList.add(stb.a(sswVar));
        }
        for (sub subVar : this.d) {
            ssx ssxVar3 = ssx.a;
            ssw sswVar2 = new ssw();
            int iA3 = std.a(subVar.e);
            if (iA3 == 0) {
                iA3 = 1;
            }
            stb.b(iA3, sswVar2);
            if ((subVar.b & 4) != 0) {
                int i2 = subVar.g;
                if ((sswVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    sswVar2.y();
                }
                ssx ssxVar4 = (ssx) sswVar2.b;
                ssxVar4.b |= 2;
                ssxVar4.f = i2;
            }
            rxj rxjVar = subVar.c == 2 ? (rxj) subVar.d : rxj.a;
            rxjVar.getClass();
            if ((sswVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                sswVar2.y();
            }
            ssx ssxVar5 = (ssx) sswVar2.b;
            ssxVar5.d = rxjVar;
            ssxVar5.c = 2;
            arrayList.add(stb.a(sswVar2));
        }
        agqq.k(arrayList, this.i);
        stl stlVar = stl.a;
        stk stkVar = new stk();
        DesugarCollections.unmodifiableList(((stl) stkVar.b).b).getClass();
        if ((stkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            stkVar.y();
        }
        stl stlVar2 = (stl) stkVar.b;
        abxs abxsVar = stlVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            stlVar2.b = abxsVar.d(size + size);
        }
        abus.m(arrayList, stlVar2.b);
        abxd abxdVarV = stkVar.v();
        abxdVarV.getClass();
        return (stl) abxdVarV;
    }

    @Override // defpackage.sud
    public final void b(sub subVar) {
        zer zerVar = zfi.a;
        if ((subVar.b & 2) == 0) {
            ((zdv) a.d().o(zerVar, "ALT.MicStateReporter").q("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "updateState", 150, "MicStateReporterImpl.kt")).u("#audio# skip partial update as no updateId present");
        } else {
            this.b.b(new stu(this, subVar, null));
        }
    }

    public final void c() {
        zer zerVar = zfi.a;
        this.h.a(new agux() { // from class: stt
            @Override // defpackage.agux
            public final Object a(Object obj) {
                zdy zdyVar = stw.a;
                ((stj) obj).a();
                return agpu.a;
            }
        });
    }
}
