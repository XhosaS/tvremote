package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcl extends fcq {
    private final ghp g;
    private final ghr h;
    private final List i;

    public fcl(gfr gfrVar, Context context, fcu fcuVar, gmd gmdVar, est estVar, ghp ghpVar, gkt gktVar, ghr ghrVar) {
        super(gfrVar, context, fcuVar, gmdVar, estVar, gktVar);
        this.i = new ArrayList();
        this.g = ghpVar;
        this.h = ghrVar;
    }

    private final fcr d(gqf gqfVar) {
        String strB;
        boolean z;
        String strB2;
        String strB3;
        String strB4 = "";
        this.b.a(rpm.bB(), abqb.OK, null, null);
        this.d.l(gmc.n);
        boolean z2 = false;
        try {
            z = true;
            Parcel parcelB = gqfVar.b(1, gqfVar.a());
            String string = parcelB.readString();
            parcelB.recycle();
            strB = yqv.b(string);
        } catch (RemoteException | NullPointerException | SecurityException unused) {
            strB = "";
            z = false;
        }
        try {
            Parcel parcelB2 = gqfVar.b(3, gqfVar.a());
            String string2 = parcelB2.readString();
            parcelB2.recycle();
            strB2 = yqv.b(string2);
        } catch (RemoteException | SecurityException unused2) {
            strB2 = "";
            z = false;
        }
        try {
            Parcel parcelB3 = gqfVar.b(2, gqfVar.a());
            String string3 = parcelB3.readString();
            parcelB3.recycle();
            strB3 = yqv.b(string3);
        } catch (RemoteException | SecurityException unused3) {
            strB3 = "";
            z = false;
        }
        try {
            Parcel parcelB4 = gqfVar.b(4, gqfVar.a());
            String string4 = parcelB4.readString();
            parcelB4.recycle();
            strB4 = yqv.b(string4);
            z2 = z;
        } catch (RemoteException | SecurityException unused4) {
        }
        if (z2) {
            this.b.a(rpm.bA(), abqb.OK, null, null);
            this.d.m(gmc.n);
            this.g.a(strB3, strB.isEmpty());
            this.h.o(strB.isEmpty());
        } else {
            this.b.a(rpm.bA(), abqb.UNKNOWN, null, null);
            this.d.a(gmc.n);
        }
        return new fcj(strB, strB2, strB3, strB4);
    }

    public final zyd a(boolean z) {
        gfr gfrVar = this.b;
        gfrVar.b(rpm.bE(), null, null);
        gmd gmdVar = this.d;
        gmc gmcVar = gmc.p;
        gmdVar.l(gmcVar);
        zyu zyuVar = new zyu();
        gqf gqfVar = this.f;
        if (gqfVar != null) {
            zyuVar.p(d(gqfVar));
            gfrVar.c(rpm.ee(), abqb.OK, null, null);
            gmdVar.a(gmcVar);
            return zyuVar;
        }
        gmdVar.l(gmc.m);
        gfrVar.a(rpm.bz(), abqb.OK, null, null);
        List list = this.i;
        list.add(zyuVar);
        if (!super.c(z)) {
            list.remove(zyuVar);
            zyuVar.p(null);
        }
        return zyuVar;
    }

    @Override // defpackage.fcq
    public final void b() {
        gqf gqfVar = this.f;
        fcr fcrVarD = gqfVar == null ? null : d(gqfVar);
        List list = this.i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zyu) it.next()).p(fcrVarD);
        }
        list.clear();
    }
}
