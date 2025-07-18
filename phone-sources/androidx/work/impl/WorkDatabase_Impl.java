package androidx.work.impl;

import defpackage.gem;
import defpackage.geo;
import defpackage.gfb;
import defpackage.grh;
import defpackage.gri;
import defpackage.grj;
import defpackage.grk;
import defpackage.grl;
import defpackage.grm;
import defpackage.grn;
import defpackage.gro;
import defpackage.grp;
import defpackage.grq;
import defpackage.grr;
import defpackage.gub;
import defpackage.guf;
import defpackage.gui;
import defpackage.guk;
import defpackage.guo;
import defpackage.gus;
import defpackage.gux;
import defpackage.gvg;
import defpackage.yft;
import defpackage.yga;
import defpackage.yhb;
import defpackage.ykl;
import defpackage.ylg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final yft l = new yga(new gem(this, 19));
    private final yft m = new yga(new gem(this, 20));
    private final yft n = new yga(new grq(this, 1));
    private final yft o = new yga(new grq(this, 0));
    private final yft p = new yga(new grq(this, 2));
    private final yft q = new yga(new grq(this, 3));
    private final yft r = new yga(new grq(this, 4));

    @Override // androidx.work.impl.WorkDatabase
    public final guk A() {
        return (guk) this.o.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final guo B() {
        return (guo) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gus C() {
        return (gus) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gux D() {
        return (gux) this.l.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gvg E() {
        return (gvg) this.n.a();
    }

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.gex
    public final /* synthetic */ gfb c() {
        return new grr(this);
    }

    @Override // defpackage.gex
    public final List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new grh());
        arrayList.add(new gri());
        arrayList.add(new grj());
        arrayList.add(new grk());
        arrayList.add(new grl());
        arrayList.add(new grm());
        arrayList.add(new grn());
        arrayList.add(new gro());
        arrayList.add(new grp());
        return arrayList;
    }

    @Override // defpackage.gex
    protected final Map g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = ylg.a;
        ykl yklVar = new ykl(gux.class);
        yhb yhbVar = yhb.a;
        linkedHashMap.put(yklVar, yhbVar);
        linkedHashMap.put(new ykl(gub.class), yhbVar);
        linkedHashMap.put(new ykl(gvg.class), yhbVar);
        linkedHashMap.put(new ykl(guk.class), yhbVar);
        linkedHashMap.put(new ykl(guo.class), yhbVar);
        linkedHashMap.put(new ykl(gus.class), yhbVar);
        linkedHashMap.put(new ykl(guf.class), yhbVar);
        linkedHashMap.put(new ykl(gui.class), yhbVar);
        return linkedHashMap;
    }

    @Override // defpackage.gex
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gub y() {
        return (gub) this.m.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final guf z() {
        return (guf) this.r.a();
    }
}
