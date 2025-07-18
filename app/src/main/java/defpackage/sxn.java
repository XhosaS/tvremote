package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxn {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry");
    public static final rva[] b;
    public final List c;
    public final sly d;
    private final smw e;
    private final swx f;
    private final srx g;
    private final Executor h;
    private final zwv i;
    private final List j;
    private final slj k;

    static {
        new sxo(rxh.FAILED_OPENING_DUE_TO_INACTIVE_CLIENT, 101, rwk.DISCONNECT_REASON_INACTIVE_CLIENT, 3, "the associated audio client is already inactive");
        new sxo(rxh.FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION, 114, rwk.DISCONNECT_REASON_INACTIVE_PARENT, 11, "the associated route parent is already inactive");
        new sxo(rxh.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING, 119, rwk.DISCONNECT_REASON_ROUTE_NOT_MAPPED, 9, "the target audio route is unknown (handover failed?)");
        new sxo(rxh.FAILED_OPENING_CONCURRENCY_CONFLICT, 602, rwk.DISCONNECT_REASON_CONCURRENCY_CONFLICT, 9, "ambient route cannot connect due to a conflict with another active session");
        b = new rva[]{rva.DEFAULT, rva.CONVERSATIONAL, rva.CONVERSATIONAL_TURN_BY_TURN, rva.CAPTURE_OUTPUT};
    }

    public sxn(skf skfVar, smw smwVar, slj sljVar, swx swxVar, srx srxVar, sss sssVar, sly slyVar, Executor executor, zwv zwvVar) {
        skfVar.getClass();
        smwVar.getClass();
        sljVar.getClass();
        slyVar.getClass();
        executor.getClass();
        zwvVar.getClass();
        this.e = smwVar;
        this.k = sljVar;
        this.f = swxVar;
        this.g = srxVar;
        this.d = slyVar;
        this.h = executor;
        this.i = zwvVar;
        this.c = new ArrayList();
        this.j = new ArrayList();
        sssVar.b(new agux() { // from class: sxj
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Object next;
                String str;
                ssl sslVar = (ssl) obj;
                sslVar.getClass();
                boolean z = sslVar instanceof ssj;
                sxn sxnVar = this.a;
                if (z) {
                    ssj ssjVar = (ssj) sslVar;
                    List list = sxnVar.c;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (ssjVar.a == ((sxg) next).c) {
                            break;
                        }
                    }
                    sxg sxgVar = (sxg) next;
                    if (sxgVar != null) {
                        zdv zdvVar = (zdv) sxn.a.b().o(zfi.a, "ALT.AudioRoutesRegy").q("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "enforceConcurrencyStateOnAudioSourcePreStart", 149, "AudioRoutesRegistry.kt");
                        int i = ssjVar.a;
                        ssm ssmVar = ssjVar.b;
                        String str2 = "Event.PreStart(route=" + i + ", session=" + ssmVar.a + ")";
                        sxb sxbVar = sxgVar.e;
                        zdvVar.F("#audio# enforcing routes concurrency state on %s of %s", str2, sxbVar.a());
                        List listD = agqq.d(Arrays.copyOf(sxn.b, 4));
                        rva rvaVarB = rva.b(sxbVar.b.d);
                        if (rvaVarB == null) {
                            rvaVarB = rva.DEFAULT;
                        }
                        if (listD.contains(rvaVarB) && ((sjv) sxgVar.h).b.b != 6 && ssjVar.c.c != 1999) {
                            sly slyVar2 = sxnVar.d;
                            rvf rvfVar = ssmVar.b;
                            saa saaVar = rvfVar.c == 13 ? (saa) rvfVar.d : null;
                            if (saaVar == null || (str = saaVar.c) == null) {
                                str = "";
                            }
                            if (!slyVar2.a(Uri.parse(str))) {
                                ArrayList<sxg> arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    rva rvaVarB2 = rva.b(((sxg) obj2).e.b.d);
                                    if (rvaVarB2 == null) {
                                        rvaVarB2 = rva.DEFAULT;
                                    }
                                    if (rvaVarB2 == rva.AMBIENT) {
                                        arrayList.add(obj2);
                                    }
                                }
                                for (sxg sxgVar2 : arrayList) {
                                    sxnVar.c(sxgVar2.e, sxgVar2.c, rwk.DISCONNECT_REASON_CONCURRENCY_CONFLICT);
                                }
                            }
                        }
                    }
                } else {
                    if (!(sslVar instanceof ssk)) {
                        throw new agpg();
                    }
                    ssk sskVar = (ssk) sslVar;
                    List list2 = sxnVar.c;
                    Iterator it2 = list2.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (sskVar.a == ((sxg) it2.next()).c) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        sxg sxgVar3 = (sxg) list2.get(i2);
                        zdv zdvVar2 = (zdv) sxn.a.b().o(zfi.a, "ALT.AudioRoutesRegy").q("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "updateRouteStateOnAudioSourceStartedEvent", 599, "AudioRoutesRegistry.kt");
                        String str3 = "Event.Started(route=" + sskVar.a + ")";
                        sxb sxbVar2 = sxgVar3.e;
                        zdvVar2.F("#audio# update route state on %s of %s", str3, sxbVar2.a());
                        swv swvVar = sxgVar3.a;
                        ruy ruyVar = sxgVar3.b;
                        int i3 = sxgVar3.c;
                        Integer num = sxgVar3.d;
                        list2.set(i2, new sxg(swvVar, ruyVar, i3, sxbVar2, sxgVar3.f, sxgVar3.g, sxgVar3.h, false, false));
                    }
                }
                return agpu.a;
            }
        });
    }

    private final sxi e(rwk rwkVar) {
        ski skiVar = new ski();
        sjs sjsVarB = sjs.b();
        sxb sxbVar = new sxb(null);
        rvt rvtVar = rvt.a;
        return new sxi(skiVar, sjsVarB, sxbVar, rwx.a(new rvs()));
    }

    public final synchronized void a(sxb sxbVar, rwk rwkVar) {
        ArrayList<sxg> arrayList = new ArrayList();
        for (Object obj : this.c) {
            if (((sxg) obj).e.a == sxbVar.a) {
                arrayList.add(obj);
            }
        }
        for (sxg sxgVar : arrayList) {
            c(sxgVar.e, sxgVar.c, rwkVar);
        }
        List list = this.j;
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        agqx.l(list, new agux() { // from class: sxm
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                zdy zdyVar = sxn.a;
                ((sxc) obj2).getClass();
                List list2 = arrayList2;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
                return true;
            }
        });
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            rwkVar.name();
            throw null;
        }
    }

    public final synchronized void b(sxb sxbVar) {
        int iA = this.k.a();
        ((zdv) a.b().o(zfi.a, "ALT.AudioRoutesRegy").q("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "initDefaultAudioClientRoute$java_com_google_android_libraries_search_audio_routing_registry_audio_routes_registry", 182, "AudioRoutesRegistry.kt")).B("#audio# initializing the default route(%d) for %s", iA, sxbVar.a());
        rvp rvpVar = rvp.a;
        rvo rvoVar = new rvo();
        rza rzaVar = rza.a;
        ryz ryzVar = new ryz();
        if ((ryzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryzVar.y();
        }
        int i = sxbVar.a;
        rza rzaVar2 = (rza) ryzVar.b;
        rzaVar2.b |= 1;
        rzaVar2.c = i;
        abxd abxdVarV = ryzVar.v();
        abxdVarV.getClass();
        rza rzaVar3 = (rza) abxdVarV;
        if ((rvoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvoVar.y();
        }
        rvp rvpVar2 = (rvp) rvoVar.b;
        rvpVar2.c = rzaVar3;
        rvpVar2.b |= 1;
        rzx rzxVar = rzx.a;
        rzw rzwVar = new rzw();
        if ((rzwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rzwVar.y();
        }
        rzx rzxVar2 = (rzx) rzwVar.b;
        rzxVar2.b |= 1;
        rzxVar2.c = iA;
        abxd abxdVarV2 = rzwVar.v();
        abxdVarV2.getClass();
        rzx rzxVar3 = (rzx) abxdVarV2;
        if ((rvoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvoVar.y();
        }
        rvp rvpVar3 = (rvp) rvoVar.b;
        rvpVar3.d = rzxVar3;
        rvpVar3.b |= 2;
        abxd abxdVarV3 = rvoVar.v();
        abxdVarV3.getClass();
        swz swzVar = new swz(ypv.a);
        swx swxVar = this.f;
        zyd zydVar = ((sjv) swzVar.a()).a;
        ((sjw) swxVar.a.a()).getClass();
        sww swwVar = new sww(zydVar);
        rzx rzxVar4 = ((rvp) abxdVarV3).d;
        if (rzxVar4 == null) {
            rzxVar4 = rzx.a;
        }
        int i2 = rzxVar4.c;
        rvt rvtVar = rvt.a;
        rvs rvsVar = new rvs();
        rvw rvwVar = ((sjv) swzVar.a()).b;
        if ((Integer.MIN_VALUE & rvsVar.b.memoizedSerializedSize) == 0) {
            rvsVar.y();
        }
        rvt rvtVar2 = (rvt) rvsVar.b;
        rvtVar2.c = rvwVar;
        rvtVar2.b |= 1;
        rvt rvtVarA = rwx.a(rvsVar);
        boolean z = true;
        sjs sjsVarA = swzVar.a();
        if (i2 != -1) {
            z = false;
        }
        sxg sxgVar = new sxg(swzVar, swwVar, i2, sxbVar, rvtVarA, z, sjsVarA, true, true);
        this.e.q(sxgVar);
        this.c.add(sxgVar);
    }

    public final synchronized void c(sxb sxbVar, final int i, final rwk rwkVar) {
        Object next;
        rwkVar.getClass();
        if (!sxbVar.c) {
            List list = this.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                sxg sxgVar = (sxg) next;
                if (sxgVar.e.a == sxbVar.a && sxgVar.c == i) {
                    break;
                }
            }
            final sxg sxgVar2 = (sxg) next;
            if (sxgVar2 != null) {
                agqx.l(list, new agux() { // from class: sxl
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        sxg sxgVar3 = (sxg) obj;
                        zdy zdyVar = sxn.a;
                        sxgVar3.getClass();
                        return Boolean.valueOf(sxgVar3.c != i);
                    }
                });
                zdv zdvVar = (zdv) a.b().o(zfi.a, "ALT.AudioRoutesRegy").q("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "markDisconnected", 572, "AudioRoutesRegistry.kt");
                rvw rvwVar = ((sjv) sxgVar2.h).b;
                String strName = rwkVar.name();
                String str = "route(token(" + sxgVar2.c + "), " + szx.c(rvwVar) + ")";
                sxb sxbVar2 = sxgVar2.e;
                zdvVar.I("#audio# disconnecting(%s) audio %s for %s", strName, str, sxbVar2.a());
                this.g.c(sxd.a(sxgVar2), skc.a.e(rwkVar));
                this.e.p(sxbVar2);
                vqi.c(this.i.b(wyo.b(new zvh() { // from class: sxk
                    @Override // defpackage.zvh
                    public final zyd a() {
                        zdy zdyVar = sxn.a;
                        return sxgVar2.a.b(rwkVar);
                    }
                }), this.h), "Disconnecting the audio route failed", new Object[0]);
            }
        }
    }

    public final synchronized sxe d(sxb sxbVar) {
        Object next;
        if (sxbVar.c) {
            return sxi.h(e(rwk.DISCONNECT_REASON_INACTIVE_CLIENT), sxbVar);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sxbVar.a == ((sxg) next).e.a) {
                break;
            }
        }
        sxg sxgVar = (sxg) next;
        if (sxgVar != null) {
            return sxgVar;
        }
        return sxi.h(e(rwk.DISCONNECT_REASON_AUDIO_ROUTE_LOST), sxbVar);
    }
}
