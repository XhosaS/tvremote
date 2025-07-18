package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bfx implements cht {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bfx(bcu bcuVar, String str, bav bavVar, int i) {
        this.d = i;
        this.b = bcuVar;
        this.c = str;
        this.a = bavVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v0, types: [cja, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v13, types: [cht, java.lang.Object] */
    @Override // defpackage.cht
    public final cja a(Object obj) {
        String string;
        int i = this.d;
        if (i == 0) {
            ?? r0 = this.b;
            ?? r1 = this.c;
            boolean zEquals = qm.P(r0).equals(qm.P(r1));
            Object obj2 = this.a;
            if (zEquals) {
                return qm.K(obj);
            }
            cht chtVarB = bxr.b(new awf(obj2, r1, 5));
            bfz bfzVar = (bfz) obj2;
            cja cjaVarI = chk.i(r1, chtVarB, bfzVar.c);
            synchronized (bfzVar.e) {
            }
            return cjaVarI;
        }
        if (i != 1) {
            if (i == 2) {
                ?? r10 = this.c;
                return ((bgc) this.a).e.d(this.b, r10);
            }
            return ((bgc) ((byj) this.a).a).e.d(this.b, this.c);
        }
        List listQ = (List) obj;
        bcu bcuVar = (bcu) this.b;
        if (!bcuVar.e) {
            listQ = bzs.q("");
        }
        int i2 = bzs.d;
        bzo bzoVar = new bzo();
        Iterator it = listQ.iterator();
        while (true) {
            Object obj3 = this.a;
            if (!it.hasNext()) {
                return qm.G(bzoVar.f()).a(new bdb(0), ((bav) obj3).b());
            }
            Object obj4 = this.c;
            String str = (String) it.next();
            byj byjVar = bde.a;
            if (byjVar == null || !byjVar.h((String) obj4, str)) {
                bav bavVar = (bav) obj3;
                bdl bdlVar = new bdl(bavVar, (String) obj4, str, bcuVar.c);
                if (bcuVar.d) {
                    Context context = bavVar.d;
                    string = tj.g(context).getString(bcuVar.a, "");
                } else {
                    string = str;
                }
                cja cjaVarA = bdlVar.a(string);
                bzoVar.g(chk.i(chk.i(cit.x(cjaVarA), new avs(bdlVar, 4), bavVar.b()), new bdd(bavVar, cjaVarA, bcuVar, str, 1), bavVar.b()));
            }
        }
    }

    public /* synthetic */ bfx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
