package com.google.android.apps.googletv.app.data.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.iib;
import defpackage.ijj;
import defpackage.ijn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleTvCacheDatabase_Impl extends GoogleTvCacheDatabase {
    private volatile ijj l;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "persistent_cache", "cache_domain");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new iib(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(ijj.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvCacheDatabase
    public final ijj y() {
        ijj ijjVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ijn(this);
            }
            ijjVar = this.l;
        }
        return ijjVar;
    }
}
