package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chr extends agtu implements agvb {
    int a;
    final /* synthetic */ caq b;
    final /* synthetic */ chs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chr(caq caqVar, chs chsVar, agsw agswVar) {
        super(2, agswVar);
        this.b = caqVar;
        this.c = chsVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chr) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        final agum agumVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            final ahge ahgeVar = (ahge) this.d;
            Object obj2 = this.b.b.b;
            if (obj2 == null) {
                ahgeVar.b.u(null);
                return agpu.a;
            }
            chs chsVar = this.c;
            final ahdl ahdlVarE = ahal.e(ahgeVar, null, 0, new chq(chsVar, ahgeVar, null), 3);
            final agux aguxVar = new agux() { // from class: cho
                @Override // defpackage.agux
                public final Object a(Object obj3) {
                    ahdlVarE.s(null);
                    ahgeVar.i((chl) obj3);
                    return agpu.a;
                }
            };
            if (Build.VERSION.SDK_INT >= 30) {
                chx chxVar = chx.a;
                final ConnectivityManager connectivityManager = chsVar.a;
                synchronized (chx.b) {
                    Map map = chx.c;
                    boolean zIsEmpty = map.isEmpty();
                    map.put(aguxVar, obj2);
                    if (zIsEmpty) {
                        cbx.c().a(cif.a, "NetworkRequestConstraintController register shared callback");
                        connectivityManager.registerDefaultNetworkCallback(chx.a);
                    }
                }
                agumVar = new agum() { // from class: chw
                    @Override // defpackage.agum
                    public final Object a() {
                        agux aguxVar2 = aguxVar;
                        ConnectivityManager connectivityManager2 = connectivityManager;
                        synchronized (chx.b) {
                            Map map2 = chx.c;
                            map2.remove(aguxVar2);
                            if (map2.isEmpty()) {
                                cbx.c().a(cif.a, "NetworkRequestConstraintController unregister shared callback");
                                connectivityManager2.unregisterNetworkCallback(chx.a);
                            }
                        }
                        return agpu.a;
                    }
                };
            } else {
                chs chsVar2 = this.c;
                final chn chnVar = new chn(aguxVar);
                final agwe agweVar = new agwe();
                final ConnectivityManager connectivityManager2 = chsVar2.a;
                try {
                    cbx.c().a(cif.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback((NetworkRequest) obj2, chnVar);
                    agweVar.a = true;
                } catch (RuntimeException e) {
                    String name = e.getClass().getName();
                    name.getClass();
                    if (!name.endsWith("TooManyRequestsException")) {
                        throw e;
                    }
                    cbx.c().b(cif.a, "NetworkRequestConstraintController couldn't register callback", e);
                    aguxVar.a(new chk(7));
                }
                agumVar = new agum() { // from class: chm
                    @Override // defpackage.agum
                    public final Object a() {
                        if (agweVar.a) {
                            chn chnVar2 = chnVar;
                            ConnectivityManager connectivityManager3 = connectivityManager2;
                            cbx.c().a(cif.a, "NetworkRequestConstraintController unregister callback");
                            connectivityManager3.unregisterNetworkCallback(chnVar2);
                        }
                        return agpu.a;
                    }
                };
            }
            agum agumVar2 = new agum() { // from class: chp
                @Override // defpackage.agum
                public final Object a() {
                    agumVar.a();
                    return agpu.a;
                }
            };
            this.a = 1;
            if (ahgd.a(ahgeVar, agumVar2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        chr chrVar = new chr(this.b, this.c, agswVar);
        chrVar.d = obj;
        return chrVar;
    }
}
