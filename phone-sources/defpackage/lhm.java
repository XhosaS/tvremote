package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhm implements ids {
    public final idw a;
    private final Executor b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final iea e;
    private final idf f;
    private final Executor g;
    private final lfn h;
    private final lge i;
    private final izo j;
    private final lqs k;
    private final idt l;
    private final lqs m;
    private final kwy n;

    /* JADX WARN: Type inference failed for: r6v5, types: [iec, ied] */
    public lhm(Context context, ExecutorService executorService, izo izoVar, lqs lqsVar, lqs lqsVar2, lfn lfnVar, iea ieaVar, lyz lyzVar, idf idfVar, idf idfVar2, kwy kwyVar, Executor executor, lge lgeVar) {
        this.c = context;
        this.b = executorService;
        this.k = lqsVar;
        this.m = lqsVar2;
        this.g = executor;
        idt idtVar = new idt(null);
        this.l = idtVar;
        this.h = lfnVar;
        this.f = idfVar;
        this.n = kwyVar;
        ids idsVarD = hjt.d(ieaVar, lyzVar.c(0, 12));
        ?? C = ieb.c(kur.a);
        ids[] idsVarArr = {idsVarD};
        ieb iebVar = (ieb) C;
        iebVar.k(idsVarArr);
        iebVar.q();
        iebVar.i(executorService);
        iebVar.h(ieaVar);
        iebVar.n(idfVar2);
        iea ieaVarA = C.a();
        this.e = ieaVarA;
        ieaVarA.ea(idtVar);
        this.a = new lhk(this);
        this.i = lgeVar;
        this.j = izoVar;
    }

    private static void i(Context context, int i, String str) {
        ksk.j(new fk(context, i, str, 6, (byte[]) null));
    }

    public final int a(ksy ksyVar) {
        if (!e()) {
            return 4;
        }
        kur kurVar = (kur) this.e.a();
        Integer num = (Integer) kurVar.b.get(ksyVar.c);
        if (num == null) {
            return 4;
        }
        return num.intValue();
    }

    public final synchronized void b(ksn ksnVar, ksy ksyVar, String str, ieg iegVar) {
        StringBuilder sb = new StringBuilder();
        String str2 = ksnVar.a;
        sb.append(str2);
        sb.append("/");
        sb.append(ksyVar.c);
        this.d.remove(sb.toString());
        this.j.c(ImmutableList.of(jwq.K(ksyVar)));
        if (iegVar.k() || !((lqu) iegVar.g()).a || this.n.g(str2, ksyVar, 3).k()) {
            this.l.eb();
            i(this.c, R.string.sharing_asset_failed, str);
        }
    }

    public final synchronized void c(ksn ksnVar, ksy ksyVar, String str, ieg iegVar) {
        StringBuilder sb = new StringBuilder();
        String str2 = ksnVar.a;
        sb.append(str2);
        sb.append("/");
        sb.append(ksyVar.c);
        this.d.remove(sb.toString());
        this.j.c(ImmutableList.of(jwq.K(ksyVar)));
        if (iegVar.k() || !((lqx) iegVar.g()).a || this.n.g(str2, ksyVar, 2).k()) {
            this.l.eb();
            i(this.c, R.string.unsharing_asset_failed, str);
        }
    }

    public final synchronized void d(ksn ksnVar, ksy ksyVar, String str, boolean z) {
        if (e()) {
            String str2 = ksnVar.a + "/" + ksyVar.c;
            HashMap map = this.d;
            if (!map.containsKey(str2)) {
                map.put(str2, Boolean.valueOf(z));
                Context context = this.c;
                jwq.U(context, context.getResources().getString(z ? R.string.menu_sharing_asset : R.string.menu_unsharing_asset), 0);
                ImmutableList immutableListA = this.i.a(ksnVar, ksyVar);
                if (z) {
                    mjo.f(new lhl(this, ksnVar, ksyVar, str, 1), new iei(this.k, new lqt(ksnVar, ksyVar, str, immutableListA)), this.g, this.b);
                } else {
                    mjo.f(new lhl(this, ksnVar, ksyVar, str, 0), new iei(this.m, new lqw(ksnVar, ksyVar, str, immutableListA)), this.g, this.b);
                }
                this.l.eb();
            }
        }
    }

    public final boolean e() {
        return this.h.cy();
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.l.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.l.ee(iejVar);
    }

    public final boolean f(ksy ksyVar) {
        return a(ksyVar) == 3;
    }

    public final sei g(ieg iegVar, ksy ksyVar) {
        if (!e() || iegVar.k()) {
            return new sei(4, 0, 2, 2, (Boolean) null);
        }
        int iA = a(ksyVar);
        int iIntValue = 0;
        if (e()) {
            Integer num = (Integer) ((kur) this.e.a()).c.get(ksyVar.c);
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        int i = iIntValue;
        Object objB = this.f.b(iegVar);
        Boolean bool = (Boolean) this.d.get(((ksn) iegVar.g()).a + "/" + ksyVar.c);
        lba lbaVar = (lba) objB;
        lbc lbcVar = lbaVar.d;
        if (lbcVar == null) {
            lbcVar = lbc.a;
        }
        int iAQ = a.aQ(lbcVar.b);
        int i2 = iAQ == 0 ? 1 : iAQ;
        lbb lbbVar = lbaVar.c;
        if (lbbVar == null) {
            lbbVar = lbb.a;
        }
        int iAs = a.as(lbbVar.b);
        return new sei(iA, i, i2, iAs == 0 ? 1 : iAs, bool);
    }
}
