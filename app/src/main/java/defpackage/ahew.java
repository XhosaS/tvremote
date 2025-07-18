package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahew {
    public static final Object a(agsw agswVar) {
        Object obj;
        agte agteVarFr = agswVar.fr();
        ahdp.e(agteVarFr);
        agsw agswVarC = agth.c(agswVar);
        ahld ahldVar = agswVarC instanceof ahld ? (ahld) agswVarC : null;
        if (ahldVar == null) {
            obj = agpu.a;
        } else {
            if (ahle.c(ahldVar.a, agteVarFr)) {
                ahldVar.a(agteVarFr, agpu.a);
            } else {
                ahev ahevVar = new ahev();
                agte agteVarPlus = agteVarFr.plus(ahevVar);
                agpu agpuVar = agpu.a;
                ahldVar.a(agteVarPlus, agpuVar);
                if (ahevVar.b) {
                    boolean z = ahbx.a;
                    ahcr ahcrVarA = ahel.a.a();
                    if (ahcrVarA.p()) {
                        obj = agpu.a;
                    } else {
                        if (ahcrVarA.o()) {
                            ahldVar.c = agpuVar;
                            ahldVar.e = 1;
                            ahcrVarA.m(ahldVar);
                            obj = agtg.a;
                        } else {
                            ahcrVarA.n(true);
                            try {
                                ahldVar.run();
                                do {
                                } while (ahcrVarA.q());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = agpu.a;
                        }
                    }
                }
            }
            obj = agtg.a;
        }
        agtg agtgVar = agtg.a;
        if (obj == agtgVar) {
            agswVar.getClass();
        }
        return obj == agtgVar ? obj : agpu.a;
    }
}
