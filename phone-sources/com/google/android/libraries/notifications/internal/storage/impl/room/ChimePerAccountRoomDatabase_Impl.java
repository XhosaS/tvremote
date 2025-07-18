package com.google.android.libraries.notifications.internal.storage.impl.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.qav;
import defpackage.qaw;
import defpackage.qay;
import defpackage.qbc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {
    private volatile qay l;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "chime_thread_states");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new qaw(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(qay.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gex
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.gex
    public final List w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qav());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase
    public final qay y() {
        qay qayVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new qbc(this);
            }
            qayVar = this.l;
        }
        return qayVar;
    }
}
