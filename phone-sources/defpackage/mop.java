package defpackage;

import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mop extends sbx {
    private final mli a;
    private final mps b;
    private final moc c;
    private final mjb d;
    private final lfn e;
    private final moi f;
    private final moi g;
    private final mta h;
    private final ntp i;
    private final gag j;
    private final ntp k;

    public mop(ntp ntpVar, ntp ntpVar2, mli mliVar, mps mpsVar, moc mocVar, mjb mjbVar, mta mtaVar, lfn lfnVar, gag gagVar) {
        mjbVar.getClass();
        lfnVar.getClass();
        gagVar.getClass();
        this.i = ntpVar;
        this.k = ntpVar2;
        this.a = mliVar;
        this.b = mpsVar;
        this.c = mocVar;
        this.d = mjbVar;
        this.h = mtaVar;
        this.e = lfnVar;
        this.j = gagVar;
        this.f = mtaVar.a(R.layout.movie_grid_view_layout);
        this.g = mtaVar.a(R.layout.movie_list_view_layout);
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new mom();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ids, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        Object next;
        mok mokVar = (mok) obj;
        mom momVar = (mom) obj2;
        m(this.d.a);
        gag gagVar = this.j;
        int iL = gagVar.l();
        if (!a.r(momVar.c, iL)) {
            momVar.c = iL;
            momVar.G(2);
        }
        m(gagVar.b);
        boolean zIsEmpty = mokVar.b.isEmpty();
        if (!yks.e(Boolean.valueOf(momVar.a), Boolean.valueOf(zIsEmpty))) {
            momVar.a = zIsEmpty;
            momVar.G(0);
        }
        boolean z = !this.e.cL();
        if (!yks.e(Boolean.valueOf(momVar.d), Boolean.valueOf(z))) {
            momVar.d = z;
            momVar.G(3);
        }
        Iterator it = mokVar.b.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next instanceof mpj) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        mpj mpjVar = next instanceof mpj ? (mpj) next : null;
        moi moiVar = (mpjVar == null || mpjVar.c()) ? this.f : this.g;
        List list = mokVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            scf mkzVar = obj3 instanceof mlc ? (scf) this.a.l(obj3) : obj3 instanceof mpj ? (scf) this.b.l(obj3) : obj3 instanceof mob ? (scf) this.c.l(obj3) : obj3 instanceof kvf ? (scf) moiVar.l(obj3) : obj3 instanceof mor ? new mkz() : null;
            if (mkzVar != null) {
                arrayList.add(mkzVar);
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
        if (yks.e(momVar.b, immutableListCopyOf)) {
            return;
        }
        momVar.b = immutableListCopyOf;
        momVar.G(1);
    }
}
