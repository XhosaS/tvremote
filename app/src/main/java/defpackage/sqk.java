package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqk implements sqn {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl");
    public final sgo b;
    public final sdp c;
    public final sfd d;
    public final ruo e;
    public agpk f;
    public final String g;
    public rsp h;
    public final ahaz i = new ahaz();
    public final ahaz j;
    private final ahbt k;
    private final sjp l;
    private final agpc m;
    private final agpc n;
    private final yqt o;
    private final yqt p;
    private final zyd q;
    private final sds r;

    public sqk(sgo sgoVar, sdp sdpVar, sfd sfdVar, ruo ruoVar, ahbt ahbtVar, final ety etyVar, final eua euaVar) {
        this.b = sgoVar;
        this.c = sdpVar;
        this.d = sfdVar;
        this.e = ruoVar;
        this.k = ahbtVar;
        this.l = new sjp(ahbtVar);
        ahaz ahazVar = new ahaz();
        this.j = ahazVar;
        this.g = szx.a(sdpVar);
        agpn agpnVar = new agpn(new agum() { // from class: sqf
            @Override // defpackage.agum
            public final Object a() {
                return ypv.a;
            }
        });
        this.m = agpnVar;
        this.n = new agpn(new agum() { // from class: sqg
            @Override // defpackage.agum
            public final Object a() {
                sqk sqkVar = this.a;
                ruo ruoVar2 = sqkVar.e;
                rul rulVar = ruoVar2.k;
                if (rulVar == null) {
                    rulVar = rul.a;
                }
                int iA = ruk.a(rulVar.c);
                if (iA == 0) {
                    iA = 1;
                }
                int i = iA - 2;
                if (i == -1 || i == 0) {
                    return null;
                }
                return i != 1 ? euaVar.a(sqkVar.b, ruoVar2) : etyVar.a(sqkVar.b, ruoVar2);
            }
        });
        this.o = k(scs.class);
        this.p = k(scn.class);
        this.q = ahkr.a(ahazVar);
        this.r = sdpVar.b();
    }

    private final yqt k(Class cls) {
        Object next;
        sfd sfdVar = this.d;
        List listD = agqq.d(sfdVar.d, sfdVar.c);
        ArrayList arrayList = new ArrayList(agqq.i(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(sci.a(((yqt) it.next()).f(), cls));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((yqt) next).g()) {
                break;
            }
        }
        yqt yqtVar = (yqt) next;
        return yqtVar == null ? ypv.a : yqtVar;
    }

    @Override // defpackage.sqc
    public final int a() {
        i(rxh.FAILED_TO_OPEN_AUDIO_SOURCE);
        sfd sfdVar = this.d;
        sax saxVar = (sax) sfdVar.d.f();
        if (saxVar != null) {
            return saxVar.b.get();
        }
        sbl sblVar = (sbl) sfdVar.c.f();
        if (sblVar != null) {
            return sblVar.l.c;
        }
        throw new IllegalStateException("Source was expected to be opened by this time");
    }

    @Override // defpackage.sqc
    public final ruo b() {
        return this.e;
    }

    @Override // defpackage.sqc
    public final sds c() {
        return this.r;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ slb d() {
        return null;
    }

    public final sos e() {
        return (sos) this.n.a();
    }

    @Override // defpackage.sqc
    public final zyd g(rxn rxnVar) {
        return this.l.a(new sqh(this, rxnVar, null));
    }

    @Override // defpackage.sqc
    public final zyd h() {
        return this.q;
    }

    public final void i(rxh rxhVar) {
        Object objA;
        try {
            objA = (rxj) this.i.A();
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (true == (objA instanceof agpj)) {
            objA = null;
        }
        rxj rxjVar = (rxj) objA;
        if (rxjVar == null || rxjVar.b != 1) {
            throw new sln(skc.a.d(rxhVar));
        }
    }

    public final ruv j(int i) {
        sfd sfdVar = this.d;
        sax saxVar = (sax) sfdVar.d.f();
        if (saxVar == null) {
            saxVar = null;
        }
        yqt yqtVar = sfdVar.c;
        yqt yqtVarH = yqt.h(saxVar);
        yqt yqtVarA = sbn.a((scc) yqtVar.f());
        yqt yqtVarH2 = yqt.h(this.h);
        yqt yqtVarB = i == 4 ? scw.a(this.o).b(new yqi() { // from class: sqd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                scs scsVar = (scs) obj;
                scsVar.getClass();
                return scsVar.a();
            }
        }) : this.o.b(new yqi() { // from class: sqe
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                scs scsVar = (scs) obj;
                scsVar.getClass();
                return scsVar.a();
            }
        });
        zyd zydVar = (zyd) scq.a(this.p, this.e).a();
        rxj rxjVar = rxj.a;
        rxi rxiVar = new rxi();
        rwz.c(i, rxiVar);
        return new sjz(yqtVarH, yqtVarH2, yqtVarA, yqtVarB, zydVar, rwz.a(rxiVar));
    }

    @Override // defpackage.sqc
    public final zyd n(sqb sqbVar) {
        return this.l.a(new sqj(this, sqbVar, null));
    }

    @Override // defpackage.sqc
    public final zyd p(sqb sqbVar) {
        return this.l.a(new sqi(this, sqbVar, null));
    }

    @Override // defpackage.sqn
    public final /* synthetic */ sqn f() {
        return this;
    }
}
