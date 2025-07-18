package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ypf implements zxe {
    private final afkf a;

    public ypf(afkf afkfVar) {
        this.a = afkfVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        afkf afkfVar = this.a;
        if ((th instanceof yoy) && ((yoy) th).a()) {
            afkfVar.a.a(Status.l.withDescription("Credentials failed to obtain metadata").c(th));
        } else {
            afkfVar.a.a(Status.g.withDescription("Failed computing credential metadata").c(th));
        }
    }

    @Override // defpackage.zxe
    public final /* synthetic */ void b(Object obj) {
        afih afihVar;
        Map map = ((ypg) obj).b;
        afkf afkfVar = this.a;
        try {
            afki afkiVar = afkfVar.b;
            synchronized (afkiVar) {
                Map map2 = afkiVar.f;
                if (map2 == null || map2 != map) {
                    afih afihVar2 = new afih();
                    for (String str : ((yyr) map).keySet()) {
                        if (str.endsWith("-bin")) {
                            afhy afhyVar = afih.f;
                            int i = afid.c;
                            afic aficVar = new afic(str, afhyVar);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                afihVar2.e(aficVar, zkl.d.j((String) it.next()));
                            }
                        } else {
                            afib afibVar = afih.b;
                            int i2 = afid.c;
                            afia afiaVar = new afia(str, afibVar);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                afihVar2.e(afiaVar, (String) it2.next());
                            }
                        }
                    }
                    afkiVar.e = afihVar2;
                    afkiVar.f = map;
                }
                afihVar = afkiVar.e;
            }
            afei afeiVar = afkfVar.a;
            afvl afvlVar = (afvl) afeiVar;
            yqw.M(!afvlVar.i, "apply() or fail() already called");
            afihVar.getClass();
            afih afihVar3 = afvlVar.c;
            afihVar3.d(afihVar);
            affp affpVarA = afvlVar.e.a();
            try {
                afoe afoeVarB = ((afvl) afeiVar).a.b(((afvl) afeiVar).b, afihVar3, ((afvl) afeiVar).d, ((afvl) afeiVar).f);
                afvlVar.e.f(affpVarA);
                afvlVar.b(afoeVarB);
            } catch (Throwable th) {
                afvlVar.e.f(affpVarA);
                throw th;
            }
        } catch (Throwable th2) {
            afkfVar.a.a(Status.g.withDescription("Failed to convert credential metadata").c(th2));
        }
    }
}
