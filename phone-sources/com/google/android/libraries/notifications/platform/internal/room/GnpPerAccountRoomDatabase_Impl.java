package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.qlr;
import defpackage.qlt;
import defpackage.qlw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GnpPerAccountRoomDatabase_Impl extends GnpPerAccountRoomDatabase {
    private volatile qlr l;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "threads");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new qlw(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(qlr.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gex
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.gex
    public final List w() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase
    public final qlr y() {
        qlr qlrVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new qlt(this);
            }
            qlrVar = this.l;
        }
        return qlrVar;
    }
}
