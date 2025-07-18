package defpackage;

import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpg extends sbx {
    private final mli a;
    private final mps b;
    private final moc c;
    private final lfn d;
    private final moy e;
    private final moy f;
    private final ntp g;
    private final gag h;

    public mpg(ntp ntpVar, mli mliVar, mps mpsVar, moc mocVar, mjb mjbVar, moz mozVar, lfn lfnVar, gag gagVar) {
        mjbVar.getClass();
        lfnVar.getClass();
        gagVar.getClass();
        this.g = ntpVar;
        this.a = mliVar;
        this.b = mpsVar;
        this.c = mocVar;
        this.d = lfnVar;
        this.h = gagVar;
        this.e = mozVar.a(R.layout.show_grid_view_layout);
        this.f = mozVar.a(R.layout.show_list_view_layout);
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new mpd();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ids, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        Object next;
        gag gagVar = this.h;
        mpb mpbVar = (mpb) obj;
        mpd mpdVar = (mpd) obj2;
        m(gagVar.b);
        int iL = gagVar.l();
        if (!a.r(mpdVar.c, iL)) {
            mpdVar.c = iL;
            mpdVar.G(2);
        }
        boolean zK = ((ieg) mpbVar.b.a()).k();
        if (!yks.e(Boolean.valueOf(mpdVar.a), Boolean.valueOf(zK))) {
            mpdVar.a = zK;
            mpdVar.G(0);
        }
        boolean z = !this.d.cL();
        if (!yks.e(Boolean.valueOf(mpdVar.d), Boolean.valueOf(z))) {
            mpdVar.d = z;
            mpdVar.G(3);
        }
        Iterator it = mpbVar.c.iterator();
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
        moy moyVar = (mpjVar == null || mpjVar.c()) ? this.e : this.f;
        List list = mpbVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            scf scfVar = obj3 instanceof mlc ? (scf) this.a.l(obj3) : obj3 instanceof mpj ? (scf) this.b.l(obj3) : obj3 instanceof mob ? (scf) this.c.l(obj3) : obj3 instanceof kwn ? (scf) moyVar.l(obj3) : null;
            if (scfVar != null) {
                arrayList.add(scfVar);
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
        if (yks.e(mpdVar.b, immutableListCopyOf)) {
            return;
        }
        mpdVar.b = immutableListCopyOf;
        mpdVar.G(1);
    }
}
