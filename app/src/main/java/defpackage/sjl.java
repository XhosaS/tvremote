package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjl {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry");
    private final sje b;
    private final smw c;
    private final sxq d;
    private final srx e;
    private final List f;
    private final slj g;

    public sjl(slj sljVar, sje sjeVar, smw smwVar, sxq sxqVar, srx srxVar) {
        sljVar.getClass();
        smwVar.getClass();
        this.g = sljVar;
        this.b = sjeVar;
        this.c = smwVar;
        this.d = sxqVar;
        this.e = srxVar;
        this.f = new ArrayList();
    }

    public final synchronized sjh a(rvc rvcVar) {
        sji sjiVar;
        int iA = this.g.a();
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        ((zdv) zeoVarB.o(zerVar, "ALT.ClientsRegy").q("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "activateAudioClient", 59, "ClientsRegistry.kt")).B("#audio# activating audio client(token(%d), %s)", iA, sjm.a(rvcVar));
        this.c.h(iA, rvcVar);
        ((zdv) zdyVar.b().o(zerVar, "ALT.ClientsRegy").q("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "enforceConcurrencyStateOnNewAudioClient", 81, "ClientsRegistry.kt")).D("#audio# enforcing concurrency state on a new client(%s, token(%d))", sjm.a(rvcVar), iA);
        ArrayList arrayList = new ArrayList();
        List list = this.f;
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                sji sjiVar2 = (sji) next;
                rva rvaVarB = rva.b(rvcVar.d);
                if (rvaVarB == null) {
                    rvaVarB = rva.DEFAULT;
                }
                rvaVarB.getClass();
                rva rvaVarB2 = rva.b(sjiVar2.b.d);
                if (rvaVarB2 == null) {
                    rvaVarB2 = rva.DEFAULT;
                }
                rvaVarB2.getClass();
                int iOrdinal = rvaVarB.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    throw new agpg();
                                }
                                if (rvaVarB2 != rva.AMBIENT) {
                                    arrayList.add(next);
                                }
                            } else if (rvaVarB2 != rva.AMBIENT) {
                                arrayList.add(next);
                            }
                        } else if (rvaVarB2 != rva.AMBIENT) {
                            arrayList.add(next);
                        }
                    } else if (rvaVarB2 == rva.AMBIENT) {
                        arrayList.add(next);
                    }
                } else if (rvaVarB2 != rva.AMBIENT) {
                    arrayList.add(next);
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c(((sji) it2.next()).a);
                }
                ahaz ahazVar = new ahaz();
                sje sjeVar = this.b;
                zyd zydVarA = ahkr.a(ahazVar);
                sjw sjwVar = (sjw) sjeVar.a.a();
                sjwVar.getClass();
                ((sjc) sjeVar.b.a()).getClass();
                sjd sjdVar = new sjd(iA, zydVarA, sjwVar);
                if (iA != -1) {
                    z = false;
                }
                sjiVar = new sji(sjdVar, iA, rvcVar, ahazVar, z);
                this.d.b(sjg.b(sjiVar));
                list.add(sjiVar);
            }
        }
        return sjiVar;
    }

    public final synchronized sjh b(Integer num) {
        Object next;
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((sji) next).a == num.intValue()) {
                break;
            }
        }
        sji sjiVar = (sji) next;
        if (sjiVar != null) {
            return sjiVar;
        }
        int iIntValue = num.intValue();
        rvc rvcVar = rvc.a;
        return new sjj(iIntValue, ruu.a(new rvb()));
    }

    public final synchronized void c(final int i) {
        Object next;
        List list = this.f;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((sji) next).a == i) {
                    break;
                }
            }
        }
        sji sjiVar = (sji) next;
        if (sjiVar == null) {
            this.c.C(i);
            return;
        }
        agqx.l(list, new agux() { // from class: sjk
            @Override // defpackage.agux
            public final Object a(Object obj) {
                sji sjiVar2 = (sji) obj;
                sjiVar2.getClass();
                return Boolean.valueOf(sjiVar2.a != i);
            }
        });
        zdv zdvVar = (zdv) a.b().o(zfi.a, "ALT.ClientsRegy").q("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "markDeactivated", 123, "ClientsRegistry.kt");
        rvc rvcVar = sjiVar.b;
        sgo sgoVar = rvcVar.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        int i2 = sjiVar.a;
        sgoVar.getClass();
        zdvVar.F("#audio# deactivating(%s) %s", "DEACTIVATED_NEW_CLIENT", "client(token(" + i2 + "), " + szx.d(sgoVar) + ")");
        this.c.D(i2, rvcVar);
        ahaz ahazVar = sjiVar.c;
        rvi rviVar = rvi.a;
        rvh rvhVar = new rvh();
        if ((rvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvhVar.y();
        }
        rvi rviVar2 = (rvi) rvhVar.b;
        rviVar2.c = 5;
        rviVar2.b |= 1;
        abxd abxdVarV = rvhVar.v();
        abxdVarV.getClass();
        ahazVar.N((rvi) abxdVarV);
        this.d.a(sjg.b(sjiVar), rwk.DISCONNECT_REASON_NEW_CLIENT_ACTIVATING);
        this.e.b(sjg.a(sjiVar), rxn.NEW_CLIENT_ACTIVATING);
    }
}
