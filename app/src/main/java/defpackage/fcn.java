package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcn extends fcq {
    private List g;

    public fcn(gfr gfrVar, Context context, fcu fcuVar, gmd gmdVar, est estVar, gkt gktVar) {
        super(gfrVar, context, fcuVar, gmdVar, estVar, gktVar);
        this.g = new ArrayList();
    }

    private final void d(gqf gqfVar, List list) {
        gfr gfrVar = this.b;
        rqs rqsVarBD = rpm.bD();
        abqb abqbVar = abqb.OK;
        gfrVar.a(rqsVarBD, abqbVar, null, null);
        gmd gmdVar = this.d;
        gmc gmcVar = gmc.o;
        gmdVar.l(gmcVar);
        int[] array = Collection.EL.stream(list).mapToInt(new ToIntFunction() { // from class: fcm
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) obj).intValue();
            }
        }).toArray();
        try {
            Parcel parcelA = gqfVar.a();
            parcelA.writeIntArray(array);
            gqfVar.K(5, parcelA);
            gmdVar.m(gmcVar);
            gfrVar.a(rpm.bC(), abqbVar, null, null);
        } catch (RemoteException | SecurityException unused) {
            this.b.a(rpm.bC(), abqb.UNKNOWN, null, null);
            this.d.a(gmc.o);
        }
    }

    public final void a(List list, boolean z) {
        gfr gfrVar = this.b;
        gfrVar.b(rpm.bE(), null, null);
        gmd gmdVar = this.d;
        gmc gmcVar = gmc.p;
        gmdVar.l(gmcVar);
        gqf gqfVar = this.f;
        if (gqfVar != null) {
            d(gqfVar, list);
            gfrVar.c(rpm.ee(), abqb.OK, null, null);
            gmdVar.a(gmcVar);
        } else {
            this.g = list;
            gmdVar.l(gmc.m);
            gfrVar.a(rpm.bz(), abqb.OK, null, null);
            super.c(z);
        }
    }

    @Override // defpackage.fcq
    public final void b() {
        if (this.f == null || this.g.isEmpty()) {
            return;
        }
        d(this.f, this.g);
        this.g.clear();
    }
}
