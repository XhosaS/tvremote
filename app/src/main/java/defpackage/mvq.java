package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvq implements nzy {
    private final aehf a;

    public mvq(aehf aehfVar) {
        this.a = aehfVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acym.b;
    }

    @Override // defpackage.nzy
    public final /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        acym acymVar = (acym) obj;
        final oaa oaaVar = (oaa) this.a.a();
        if (acymVar.c.size() > 0) {
            agig agigVar = new agig(agfl.a(acymVar.c).b(new aggz() { // from class: mvp
                @Override // defpackage.aggz
                public final Object a(Object obj2) {
                    return oaaVar.c((CommandOuterClass$Command) obj2, nzxVar);
                }
            }));
            aggz aggzVar = agoh.n;
            return agigVar;
        }
        agff agffVar = agij.a;
        aggz aggzVar2 = agoh.n;
        return agffVar;
    }
}
