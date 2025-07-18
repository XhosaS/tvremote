package defpackage;

import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzx implements xrw {
    final /* synthetic */ Object a;
    final /* synthetic */ xrx b;
    private final /* synthetic */ int c;

    public /* synthetic */ xzx(xzw xzwVar, xzv xzvVar, int i) {
        this.c = i;
        this.b = xzwVar;
        this.a = xzvVar;
    }

    @Override // defpackage.xrw
    public final void a(xql xqlVar) {
        xrv xzzVar;
        xqk xqkVar;
        if (this.c == 0) {
            xqk xqkVar2 = xqlVar.a;
            if (xqkVar2 == xqk.SHUTDOWN) {
                return;
            }
            xrx xrxVar = this.b;
            xqk xqkVar3 = xqk.TRANSIENT_FAILURE;
            if (xqkVar2 == xqkVar3 || xqkVar2 == xqk.IDLE) {
                ((yab) xrxVar).f.e();
            }
            yab yabVar = (yab) xrxVar;
            if (yabVar.g == xqkVar3) {
                if (xqkVar2 == xqk.CONNECTING) {
                    return;
                }
                if (xqkVar2 == xqk.IDLE) {
                    xrxVar.c();
                    return;
                }
            }
            Object obj = this.a;
            int iOrdinal = xqkVar2.ordinal();
            if (iOrdinal == 0) {
                xzzVar = new xzz(xrr.a);
            } else if (iOrdinal == 1) {
                xzzVar = new xzz(xrr.c((xru) obj));
            } else if (iOrdinal == 2) {
                xzzVar = new xzz(xrr.b(xqlVar.b));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(xqkVar2.toString()));
                }
                xzzVar = new yaa(yabVar, (xru) obj);
            }
            yabVar.e(xqkVar2, xzzVar);
            return;
        }
        Object obj2 = this.a;
        xzv xzvVar = (xzv) obj2;
        xru xruVar = xzvVar.a;
        xrx xrxVar2 = this.b;
        SocketAddress socketAddressJ = xzw.j(xruVar);
        xzw xzwVar = (xzw) xrxVar2;
        Map map = xzwVar.h;
        if (obj2 == map.get(socketAddressJ) && (xqkVar = xqlVar.a) != xqk.SHUTDOWN) {
            xqk xqkVar4 = xqk.IDLE;
            if (xqkVar == xqkVar4 && xzvVar.b == xqk.READY) {
                xzwVar.g.e();
            }
            xzvVar.b(xqkVar);
            xqk xqkVar5 = xzwVar.l;
            xqk xqkVar6 = xqk.TRANSIENT_FAILURE;
            if (xqkVar5 == xqkVar6 || xzwVar.m == xqkVar6) {
                if (xqkVar == xqk.CONNECTING) {
                    return;
                }
                if (xqkVar == xqkVar4) {
                    xrxVar2.c();
                    return;
                }
            }
            int iOrdinal2 = xqkVar.ordinal();
            if (iOrdinal2 == 0) {
                xqk xqkVar7 = xqk.CONNECTING;
                xzwVar.l = xqkVar7;
                xzwVar.g(xqkVar7, new xzt(xrr.a));
                return;
            }
            if (iOrdinal2 == 1) {
                ulo uloVar = xzwVar.q;
                if (uloVar != null) {
                    uloVar.r();
                    xzwVar.q = null;
                }
                xzwVar.o = null;
                xzwVar.e();
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    xru xruVar2 = ((xzv) it.next()).a;
                    if (!xruVar2.equals(xruVar)) {
                        xruVar2.b();
                    }
                }
                map.clear();
                xqk xqkVar8 = xqk.READY;
                xzvVar.b(xqkVar8);
                map.put(xzw.j(xruVar), obj2);
                xzwVar.i.g(xzw.j(xruVar));
                xzwVar.l = xqkVar8;
                xzwVar.h(xzvVar);
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(xqkVar.toString()));
                }
                xzwVar.i.c();
                xzwVar.l = xqkVar4;
                xzwVar.g(xqkVar4, new xzu(xzwVar, xzwVar));
                return;
            }
            xzr xzrVar = xzwVar.i;
            if (xzrVar.f() && map.get(xzrVar.b()) == obj2) {
                if (xzrVar.e()) {
                    xzwVar.e();
                    xrxVar2.c();
                } else if (map.size() >= xzrVar.a()) {
                    xzwVar.f();
                } else {
                    xzrVar.c();
                    xrxVar2.c();
                }
            }
            if (map.size() >= xzrVar.a()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    if (!((xzv) it2.next()).c) {
                        return;
                    }
                }
                xzwVar.l = xqkVar6;
                xzwVar.g(xqkVar6, new xzt(xrr.b(xqlVar.b)));
                int i = xzwVar.j + 1;
                xzwVar.j = i;
                if (i >= xzrVar.a() || xzwVar.k) {
                    xzwVar.k = false;
                    xzwVar.j = 0;
                    xzwVar.g.e();
                }
            }
        }
    }

    public xzx(yab yabVar, xru xruVar, int i) {
        this.c = i;
        this.a = xruVar;
        this.b = yabVar;
    }
}
