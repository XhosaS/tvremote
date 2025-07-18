package androidx.work.impl;

import defpackage.agpc;
import defpackage.agpn;
import defpackage.agrd;
import defpackage.agum;
import defpackage.agvq;
import defpackage.agwi;
import defpackage.agwj;
import defpackage.blh;
import defpackage.bmv;
import defpackage.ceu;
import defpackage.cev;
import defpackage.cew;
import defpackage.cex;
import defpackage.cey;
import defpackage.cez;
import defpackage.cfa;
import defpackage.cfb;
import defpackage.cfc;
import defpackage.cfl;
import defpackage.cjo;
import defpackage.cjv;
import defpackage.cka;
import defpackage.ckg;
import defpackage.ckr;
import defpackage.ckw;
import defpackage.cle;
import defpackage.cmm;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final agpc l = new agpn(new agum() { // from class: cfd
        @Override // defpackage.agum
        public final Object a() {
            return new cmj(this.a);
        }
    });
    private final agpc m = new agpn(new agum() { // from class: cfe
        @Override // defpackage.agum
        public final Object a() {
            return new cjt(this.a);
        }
    });
    private final agpc n = new agpn(new agum() { // from class: cff
        @Override // defpackage.agum
        public final Object a() {
            return new cmr(this.a);
        }
    });
    private final agpc o = new agpn(new agum() { // from class: cfg
        @Override // defpackage.agum
        public final Object a() {
            return new ckn(this.a);
        }
    });
    private final agpc p = new agpn(new agum() { // from class: cfh
        @Override // defpackage.agum
        public final Object a() {
            return new ckv(this.a);
        }
    });
    private final agpc q = new agpn(new agum() { // from class: cfi
        @Override // defpackage.agum
        public final Object a() {
            return new ckz(this.a);
        }
    });
    private final agpc r = new agpn(new agum() { // from class: cfj
        @Override // defpackage.agum
        public final Object a() {
            return new cjz(this.a);
        }
    });
    private final agpc s = new agpn(new agum() { // from class: cfk
        @Override // defpackage.agum
        public final Object a() {
            return new cke(this.a);
        }
    });

    @Override // androidx.work.impl.WorkDatabase
    public final ckg A() {
        return (ckg) this.o.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ckr B() {
        return (ckr) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ckw C() {
        return (ckw) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cle D() {
        return (cle) this.l.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cmm E() {
        return (cmm) this.n.a();
    }

    @Override // defpackage.bmn
    protected final blh a() {
        return new blh(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.bmn
    public final /* synthetic */ bmv c() {
        return new cfl(this);
    }

    @Override // defpackage.bmn
    public final List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ceu());
        arrayList.add(new cev());
        arrayList.add(new cew());
        arrayList.add(new cex());
        arrayList.add(new cey());
        arrayList.add(new cez());
        arrayList.add(new cfa());
        arrayList.add(new cfb());
        arrayList.add(new cfc());
        return arrayList;
    }

    @Override // defpackage.bmn
    protected final Map g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        agwj agwjVar = agwi.a;
        agvq agvqVar = new agvq(cle.class);
        agrd agrdVar = agrd.a;
        linkedHashMap.put(agvqVar, agrdVar);
        linkedHashMap.put(new agvq(cjo.class), agrdVar);
        linkedHashMap.put(new agvq(cmm.class), agrdVar);
        linkedHashMap.put(new agvq(ckg.class), agrdVar);
        linkedHashMap.put(new agvq(ckr.class), agrdVar);
        linkedHashMap.put(new agvq(ckw.class), agrdVar);
        linkedHashMap.put(new agvq(cjv.class), agrdVar);
        linkedHashMap.put(new agvq(cka.class), agrdVar);
        return linkedHashMap;
    }

    @Override // defpackage.bmn
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cjo x() {
        return (cjo) this.m.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cjv y() {
        return (cjv) this.r.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cka z() {
        return (cka) this.s.a();
    }
}
