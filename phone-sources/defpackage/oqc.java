package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqc {
    public static final /* synthetic */ int a = 0;
    private static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(oqe.U, 105485385);
        map.put(oqe.P, 105485385);
        map.put(oqe.V, 105485385);
    }

    public final opt a(Context context, ExecutorService executorService) {
        opt opvVar;
        opo opoVar = opo.a;
        unc uncVar = opo.b;
        if (uncVar == null) {
            synchronized (opoVar) {
                uncVar = opo.b;
                if (uncVar == null) {
                    smf smfVar = smf.a;
                    HashMap map = new HashMap();
                    aafi aafiVar = new aafi(yfm.p(new sjr(new upc(context.getApplicationContext()))));
                    sik.b(sly.a, map);
                    unc uncVar2 = new unc(executorService, aafiVar, smfVar, map);
                    opo.b = uncVar2;
                    uncVar = uncVar2;
                }
            }
        }
        ops opsVar = opt.a;
        opt optVar = ops.b;
        if (optVar != null) {
            return optVar;
        }
        synchronized (opsVar) {
            opvVar = ops.b;
            if (opvVar == null) {
                opq opqVar = opr.d;
                opr oppVar = opq.b;
                if (oppVar == null) {
                    synchronized (opqVar) {
                        oppVar = opq.b;
                        if (oppVar == null) {
                            oppVar = new opp(context, uncVar, executorService);
                            opq.b = oppVar;
                        }
                    }
                }
                Context context2 = ((opp) oppVar).a;
                Pattern pattern = sjt.a;
                sjs sjsVar = new sjs(context2);
                sjsVar.d("androidatgoogle_widgets");
                sjsVar.e("WidgetInstallations.pb");
                Uri uriA = sjsVar.a();
                sln slnVarA = slo.a();
                slnVarA.d(uriA);
                slnVarA.c(wcx.a);
                for (slq slqVar : ((opp) oppVar).b) {
                    if (slnVarA.b == null) {
                        if (slnVarA.c == null) {
                            slnVarA.b = ImmutableList.builder();
                        } else {
                            slnVarA.b = ImmutableList.builder();
                            slnVarA.b.addAll((Iterable) slnVarA.c);
                            slnVarA.c = null;
                        }
                    }
                    slnVarA.b.add((ImmutableList.Builder) slqVar);
                }
                smc smcVarC = ((opp) oppVar).c.c(slnVarA.a());
                smcVarC.getClass();
                opvVar = new opv(smcVarC);
                ops.b = opvVar;
            }
        }
        return opvVar;
    }

    public final void b(oqe oqeVar, Context context, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        String str = oqeVar.ad;
        wcv wcvVar = (wcv) vtwVar.b;
        wcv wcvVar2 = wcv.a;
        str.getClass();
        wcvVar.b |= 2;
        wcvVar.d = str;
        HashMap map = b;
        if (map.containsKey(oqeVar)) {
            ConcurrentHashMap concurrentHashMap = opz.a;
            oqd oqdVarJ = osk.j(context, ((Number) yfm.g(map, oqeVar)).intValue());
            vuc vucVarR = vtwVar.r();
            vucVarR.getClass();
            oqdVarJ.a((wcv) vucVarR);
            return;
        }
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(opz.a, -1, new opy(new kij(context, 17), 0));
        objComputeIfAbsent.getClass();
        vuc vucVarR2 = vtwVar.r();
        vucVarR2.getClass();
        ((oqd) objComputeIfAbsent).a((wcv) vucVarR2);
    }
}
