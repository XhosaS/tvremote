package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.qly;
import defpackage.qlz;
import defpackage.qma;
import defpackage.qmb;
import defpackage.qmc;
import defpackage.qmd;
import defpackage.qme;
import defpackage.qmf;
import defpackage.qnt;
import defpackage.qnw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GnpRoomDatabase_Impl extends GnpRoomDatabase {
    private volatile qnt m;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "gnp_accounts");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new qmf(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(qnt.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gex
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.gex
    public final List w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qly());
        arrayList.add(new qlz());
        arrayList.add(new qma());
        arrayList.add(new qmb());
        arrayList.add(new qmc());
        arrayList.add(new qmd());
        arrayList.add(new qme());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase
    public final qnt y() {
        qnt qntVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new qnw(this);
            }
            qntVar = this.m;
        }
        return qntVar;
    }
}
