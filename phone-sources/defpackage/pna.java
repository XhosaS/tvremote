package defpackage;

import android.net.Uri;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pna implements ufv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pna(TestingToolsBroadcastReceiver testingToolsBroadcastReceiver, String str, uwi uwiVar, int i) {
        this.d = i;
        this.a = testingToolsBroadcastReceiver;
        this.c = str;
        this.b = uwiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, vvj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, ufw] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, ufw] */
    @Override // defpackage.ufv
    public final uhp a() throws IOException {
        skc skcVar;
        uhp uhpVarJ;
        uhp uhpVarB;
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            wip wipVar = (wip) sfy.J(this.b);
            uao uaoVar = (uao) sfy.J(this.c);
            lia liaVar = ((pnb) this.a).a;
            vtw vtwVarN = kff.n(liaVar.b, liaVar.c);
            Long lValueOf = Long.valueOf(wipVar.e);
            Map map = liaVar.d;
            long j = map.containsKey(lValueOf) ? ((lid) map.get(lValueOf)).b : liaVar.f;
            Map map2 = liaVar.e;
            lid lidVarA = lid.a();
            if (!map2.containsKey(lValueOf)) {
                map2.put(lValueOf, lidVarA);
            }
            map.put(lValueOf, lidVarA);
            liaVar.g = false;
            lhz lhzVar = liaVar.a;
            if (!vtwVarN.b.A()) {
                vtwVarN.u();
            }
            wjm wjmVar = (wjm) vtwVarN.b;
            wjm wjmVar2 = wjm.a;
            wipVar.getClass();
            wjmVar.e = wipVar;
            wjmVar.b |= 4;
            long j2 = lidVarA.b;
            if (!vtwVarN.b.A()) {
                vtwVarN.u();
            }
            vuc vucVar = vtwVarN.b;
            wjm wjmVar3 = (wjm) vucVar;
            wjmVar3.b |= 65536;
            wjmVar3.l = j2;
            if (!vucVar.A()) {
                vtwVarN.u();
            }
            wjm wjmVar4 = (wjm) vtwVarN.b;
            wjmVar4.b |= 131072;
            wjmVar4.m = j;
            lhzVar.c((wjm) vtwVarN.r(), uaoVar);
            return uhl.a;
        }
        if (i == 1) {
            pdw pdwVar = (pdw) ((TestingToolsBroadcastReceiver) this.a).o.g((String) this.c);
            ?? r1 = this.b;
            return pdwVar.d(osk.u((uwi) r1), r1);
        }
        if (i != 2) {
            Object obj = this.a;
            slw slwVar = (slw) obj;
            Uri uri = (Uri) sfy.J(slwVar.b);
            skcVar = new skc((Closeable) slwVar.l.r(uri, new skm(false, false)));
            ?? r3 = this.c;
            ?? r5 = this.b;
            try {
                try {
                    uhpVarJ = sfy.C(((slw) obj).c(uri));
                } catch (IOException e) {
                    tst tstVar = ((slw) obj).d;
                    if (tstVar.g()) {
                        uhpVarJ = ufn.j(slw.d(e) ? sfy.B(e) : ((ulp) tstVar.c()).as(e, ((slw) obj).e), trc.c(new pap(obj, uri, 16)), ((slw) obj).c);
                    } else {
                        uhpVarB = sfy.B(e);
                    }
                }
                uhp uhpVarJ2 = ufn.j(uhpVarJ, r5, r3);
                uhpVarB = slw.b(ufn.j(uhpVarJ2, trc.c(new oyy(obj, uhpVarJ, uhpVarJ2, 8, (byte[]) null)), ugk.a), skcVar.a(), ((slw) obj).c);
                skcVar.close();
                return uhpVarB;
            } finally {
            }
        } else {
            Object obj2 = this.a;
            slk slkVar = (slk) obj2;
            Uri uri2 = (Uri) sfy.J(slkVar.b);
            skcVar = new skc((Closeable) slkVar.g.r(uri2, new skm(false, false)));
            ?? r0 = this.c;
            ?? r32 = this.b;
            try {
                uhp uhpVarC = ((slk) obj2).c(uri2, new slh((slk) obj2, i2));
                uhp uhpVarJ3 = ufn.j(uhpVarC, r32, r0);
                uhp uhpVarB2 = slk.b(ufn.j(uhpVarJ3, trc.c(new oyy(obj2, uhpVarC, uhpVarJ3, 7, (byte[]) null)), ugk.a), skcVar.a());
                skcVar.close();
                return uhpVarB2;
            } finally {
            }
        }
    }

    public /* synthetic */ pna(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
