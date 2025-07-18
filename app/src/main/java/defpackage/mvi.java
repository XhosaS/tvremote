package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvi implements nzy {
    private final aehf a;

    public mvi(aehf aehfVar) {
        this.a = aehfVar;
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acxx.b;
    }

    @Override // defpackage.nzy
    public final /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        acxx acxxVar = (acxx) obj;
        final oaa oaaVar = (oaa) this.a.a();
        if (acxxVar.c.size() <= 0) {
            agff agffVar = agij.a;
            aggz aggzVar = agoh.n;
            return agffVar;
        }
        agis agisVar = new agis(agfl.a(acxxVar.c).b(new aggz() { // from class: mvh
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                return oaaVar.c((CommandOuterClass$Command) obj2, nzxVar);
            }
        }));
        aggz aggzVar2 = agoh.n;
        return agisVar;
    }
}
