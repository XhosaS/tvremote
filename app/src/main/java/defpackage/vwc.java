package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwc implements vtv {
    private final wrs a;
    private final agow b;
    private final agow c;

    public vwc(wrs wrsVar, agow agowVar, agow agowVar2) {
        this.a = wrsVar;
        this.b = agowVar;
        this.c = agowVar2;
    }

    @Override // defpackage.vtv
    public final zyd a(zyd zydVar) {
        return d(zydVar, new zvi() { // from class: vvy
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((vtn) obj).c();
            }
        });
    }

    @Override // defpackage.vtv
    public final zyd b(zyd zydVar) {
        return d(zydVar, new zvi() { // from class: vvz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((vtn) obj).b();
            }
        });
    }

    @Override // defpackage.vtv
    public final zyd c(zvh zvhVar) {
        Set set = (Set) ((aejh) this.c).b;
        yzo yzoVarI = yzq.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            yzoVarI.c(new vwb((vtl) it.next()));
        }
        return this.a.a(zvhVar, yzoVarI.f());
    }

    public final zyd d(final zyd zydVar, zvi zviVar) {
        Set set = (Set) ((aejh) this.b).b;
        yzo yzoVarI = yzq.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            yzoVarI.c(new vwa(zviVar, (vtn) it.next()));
        }
        return this.a.a(new zvh() { // from class: vvw
            @Override // defpackage.zvh
            public final zyd a() {
                return zydVar;
            }
        }, yzoVarI.f());
    }
}
