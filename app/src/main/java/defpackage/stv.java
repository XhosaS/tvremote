package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stv extends agtu implements agvb {
    final /* synthetic */ stw a;
    final /* synthetic */ stz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stv(stw stwVar, stz stzVar, agsw agswVar) {
        super(2, agswVar);
        this.a = stwVar;
        this.b = stzVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        stz stzVar = this.b;
        int iA = ssv.a(stzVar.e);
        if (iA == 0) {
            iA = 1;
        }
        if (iA != 2) {
            ((zdv) stw.a.b().o(zfi.a, "ALT.MicStateReporter").q("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpcomingUpdates", 374, "MicStateReporterImpl.kt")).x("#audio# skip upcoming update(id(%s)), not supported", stzVar.d);
        } else {
            stw stwVar = this.a;
            List list = stwVar.c;
            if ((list instanceof Collection) && list.isEmpty()) {
                stwVar.c = agqq.u(stwVar.c, stzVar);
                stwVar.a();
                stn stnVar = stn.a;
                sto.a(new stm());
                stwVar.c();
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (agvy.c(((stz) it.next()).d, stzVar.d)) {
                        ((zdv) stw.a.b().o(zfi.a, "ALT.MicStateReporter").q("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpcomingUpdates", 380, "MicStateReporterImpl.kt")).x("#audio# skip upcoming update(id(%s)), already exists", stzVar.d);
                        break;
                    }
                }
                stwVar.c = agqq.u(stwVar.c, stzVar);
                stwVar.a();
                stn stnVar2 = stn.a;
                sto.a(new stm());
                stwVar.c();
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new stv(this.a, this.b, agswVar);
    }
}
