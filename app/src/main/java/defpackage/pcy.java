package defpackage;

import android.util.Log;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcy extends pby {
    public final pas a;
    private final pbb b;

    public pcy(pbb pbbVar, pas pasVar) {
        this.b = pbbVar;
        this.a = pasVar;
    }

    public static void c(pbv pbvVar) {
        yqw.M(true, "View is not instrumented.");
        Set set = pbvVar.b.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Interaction: ".concat(pbvVar.toString()));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pcl) it.next()).f();
            }
        }
        yqw.ai(pbvVar.c(), "VE is not impressed: %s {attached=%s}", pbvVar, Boolean.valueOf(((pft) pbvVar.c).e));
    }

    @Override // defpackage.pby
    public final zpk a(pbv pbvVar) {
        c(pbvVar);
        zpk zpkVar = pbvVar.a().d;
        return zpkVar == null ? zpk.a : zpkVar;
    }

    @Override // defpackage.pby
    public final void b(final pbx pbxVar, final pbv pbvVar) {
        this.b.c(new pba() { // from class: pcx
            @Override // defpackage.pba
            public final List a() {
                pbv pbvVar2 = pbvVar;
                zpn zpnVarA = pal.a();
                pcy.c(pbvVar2);
                yqw.R(((pft) pbvVar2.c).f == 1, "VE is not visible: %s", pbvVar2);
                ArrayList arrayList = new ArrayList();
                pco.a(pbvVar2, arrayList);
                return yyk.o(new pdj(zpnVarA, arrayList, pbxVar, Instant.now().toEpochMilli()));
            }
        });
    }
}
