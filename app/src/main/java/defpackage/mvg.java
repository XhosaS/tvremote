package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvg implements nzy {
    private final aehf a;
    private final agfx b;

    public mvg(aehf aehfVar, agfx agfxVar) {
        this.a = aehfVar;
        this.b = agfxVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acxv.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        agff agkiVar;
        final acxv acxvVar = (acxv) obj;
        final oaa oaaVar = (oaa) this.a.a();
        if ((acxvVar.c & 1) != 0) {
            CommandOuterClass$Command defaultInstance = acxvVar.d;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            oaaVar.a(defaultInstance, nzxVar).k();
        }
        if ((acxvVar.c & 2) != 0) {
            CommandOuterClass$Command defaultInstance2 = acxvVar.e;
            if (defaultInstance2 == null) {
                defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
            }
            agje agjeVar = new agje(oaaVar.c(defaultInstance2, nzxVar).j(this.b));
            aggz aggzVar = agoh.k;
            agku agkuVar = new agku(agjeVar);
            aggz aggzVar2 = agoh.k;
            agkiVar = new agki(agkuVar, new aggz() { // from class: mvf
                @Override // defpackage.aggz
                public final Object a(Object obj2) {
                    Object obj3 = ((agfn) obj2).b;
                    acxv acxvVar2 = acxvVar;
                    oaa oaaVar2 = oaaVar;
                    nzx nzxVar2 = nzxVar;
                    if (obj3 == null) {
                        if ((acxvVar2.c & 4) == 0) {
                            agff agffVar = agij.a;
                            aggz aggzVar3 = agoh.n;
                            return agffVar;
                        }
                        CommandOuterClass$Command defaultInstance3 = acxvVar2.f;
                        if (defaultInstance3 == null) {
                            defaultInstance3 = CommandOuterClass$Command.getDefaultInstance();
                        }
                        return oaaVar2.c(defaultInstance3, nzxVar2);
                    }
                    if ((acxvVar2.c & 8) == 0) {
                        agff agffVar2 = agij.a;
                        aggz aggzVar4 = agoh.n;
                        return agffVar2;
                    }
                    CommandOuterClass$Command defaultInstance4 = acxvVar2.g;
                    if (defaultInstance4 == null) {
                        defaultInstance4 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    return oaaVar2.c(defaultInstance4, nzxVar2);
                }
            });
        } else {
            agkiVar = agij.a;
        }
        aggz aggzVar3 = agoh.n;
        return agkiVar;
    }
}
