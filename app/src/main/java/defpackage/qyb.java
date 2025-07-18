package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyb extends qyg implements qsn, quz {
    public final Context a;
    public final qyq b;
    public final ArrayMap c;
    public final Executor d;
    public final qux e;
    public final agow f;
    public final qyh g;
    public final agow h;
    private final qsx i;
    private final qxr j;
    private final qya k;

    public qyb(quy quyVar, Context context, qsx qsxVar, aehf aehfVar, qxr qxrVar, agow agowVar, agow agowVar2, Executor executor, qyr qyrVar, agow agowVar3, qyh qyhVar, agow agowVar4) {
        ArrayMap arrayMap = new ArrayMap();
        this.c = arrayMap;
        yqw.L(true);
        this.d = executor;
        this.e = quyVar.a(executor, aehfVar, agowVar2);
        this.a = context;
        this.i = qsxVar;
        this.f = agowVar;
        this.j = qxrVar;
        qya qyaVar = new qya(context, arrayMap, agowVar3);
        this.k = qyaVar;
        aehf aehfVarB = aejf.b(((aejm) qyrVar.a).a);
        aehfVarB.getClass();
        ((zyh) qyrVar.b.a()).getClass();
        this.b = new qyq(aehfVarB, qyaVar);
        this.g = qyhVar;
        this.h = agowVar4;
    }

    public static quq a(ahvh ahvhVar, qyd qydVar) {
        qup qupVarN = quq.n();
        ahvw ahvwVar = ahvw.a;
        ahvv ahvvVar = new ahvv();
        if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvvVar.y();
        }
        ahvw ahvwVar2 = (ahvw) ahvvVar.b;
        ahvhVar.getClass();
        ahvwVar2.l = ahvhVar;
        ahvwVar2.b |= 1024;
        qupVarN.f((ahvw) ahvvVar.v());
        quh quhVar = (quh) qupVarN;
        quhVar.c = null;
        qyj qyjVar = ((qxs) qydVar).a;
        quhVar.d = "Activity";
        quhVar.a = ((qxv) qyjVar).a.a;
        qupVarN.c(true);
        return qupVarN.a();
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        ArrayMap arrayMap = this.c;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.quz
    public final void k() {
        qsz qszVar = this.i.a;
        qszVar.a(this.b);
        qszVar.a(this.j);
    }

    @Override // defpackage.qsn
    public final /* synthetic */ void j(qpi qpiVar) {
    }
}
