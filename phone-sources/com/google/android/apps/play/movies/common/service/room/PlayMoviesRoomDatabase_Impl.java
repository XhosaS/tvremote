package com.google.android.apps.play.movies.common.service.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.loh;
import defpackage.loi;
import defpackage.loj;
import defpackage.lok;
import defpackage.lol;
import defpackage.lom;
import defpackage.lon;
import defpackage.loo;
import defpackage.lop;
import defpackage.lor;
import defpackage.low;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PlayMoviesRoomDatabase_Impl extends PlayMoviesRoomDatabase {
    private volatile lor l;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "search_queries_history", "video_format", "user_configuration", "asset_image", "license", "download", "library", "watchlist", "assets");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new loh(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(lon.class, Collections.EMPTY_LIST);
        map.put(loj.class, Collections.EMPTY_LIST);
        map.put(lop.class, Collections.EMPTY_LIST);
        map.put(lok.class, Collections.EMPTY_LIST);
        map.put(loo.class, Collections.EMPTY_LIST);
        map.put(lom.class, Collections.EMPTY_LIST);
        map.put(lol.class, Collections.EMPTY_LIST);
        map.put(loi.class, Collections.EMPTY_LIST);
        map.put(lor.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.apps.play.movies.common.service.room.PlayMoviesRoomDatabase
    public final lor y() {
        lor lorVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new low(this);
            }
            lorVar = this.l;
        }
        return lorVar;
    }
}
