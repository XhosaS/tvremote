package com.google.android.apps.googletv.app.data.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.ijd;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.ijq;
import defpackage.ijy;
import defpackage.ike;
import defpackage.ikf;
import defpackage.ikh;
import defpackage.ikj;
import defpackage.ikm;
import defpackage.ikp;
import defpackage.ikq;
import defpackage.iks;
import defpackage.ikt;
import defpackage.ikx;
import defpackage.ilc;
import defpackage.ilf;
import defpackage.ili;
import defpackage.ilk;
import defpackage.ilo;
import defpackage.ils;
import defpackage.ilu;
import defpackage.ilx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleTvDatabase_Impl extends GoogleTvDatabase {
    private volatile ijq m;
    private volatile ilf n;
    private volatile ilu o;
    private volatile ikx p;
    private volatile ilo q;
    private volatile ilk r;
    private volatile ikt s;
    private volatile ijy t;
    private volatile ikm u;
    private volatile ikf v;
    private volatile ikh w;
    private volatile ikj x;
    private volatile ikq y;

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikf A() {
        ikf ikfVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new ikf(this);
            }
            ikfVar = this.v;
        }
        return ikfVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikh B() {
        ikh ikhVar;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            if (this.w == null) {
                this.w = new ikh(this);
            }
            ikhVar = this.w;
        }
        return ikhVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikj C() {
        ikj ikjVar;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            if (this.x == null) {
                this.x = new ikj(this);
            }
            ikjVar = this.x;
        }
        return ikjVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikm D() {
        ikm ikmVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new ikp(this);
            }
            ikmVar = this.u;
        }
        return ikmVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikq E() {
        ikq ikqVar;
        if (this.y != null) {
            return this.y;
        }
        synchronized (this) {
            if (this.y == null) {
                this.y = new ikq(this);
            }
            ikqVar = this.y;
        }
        return ikqVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikt F() {
        ikt iktVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new ikt(this);
            }
            iktVar = this.s;
        }
        return iktVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ikx G() {
        ikx ikxVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new ilc(this);
            }
            ikxVar = this.p;
        }
        return ikxVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ilf H() {
        ilf ilfVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new ili(this);
            }
            ilfVar = this.n;
        }
        return ilfVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ilk I() {
        ilk ilkVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new ilk(this);
            }
            ilkVar = this.r;
        }
        return ilkVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ilo J() {
        ilo iloVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new ils(this);
            }
            iloVar = this.q;
        }
        return iloVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ilu K() {
        ilu iluVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new ilx(this);
            }
            iluVar = this.o;
        }
        return iluVar;
    }

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "destinations", "filter_and_sort_options", "library_config", "user_entity_state", "watch_actions", "search_history", "offline_tvm", "media_library_item", "media_library_item_tag", "media_library_item_metadata", "media_library_item_page_data", "media_library_item_rental", "last_watched_item");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new ijd(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(ijp.class, Collections.EMPTY_LIST);
        map.put(ijq.class, Collections.EMPTY_LIST);
        map.put(ilf.class, Collections.EMPTY_LIST);
        map.put(ilu.class, Collections.EMPTY_LIST);
        map.put(ikx.class, Collections.EMPTY_LIST);
        map.put(ilo.class, Collections.EMPTY_LIST);
        map.put(ilk.class, Collections.EMPTY_LIST);
        long j = ikt.a;
        map.put(ikt.class, Collections.EMPTY_LIST);
        map.put(iks.class, Collections.EMPTY_LIST);
        map.put(ijo.class, Collections.EMPTY_LIST);
        map.put(ijy.class, Collections.EMPTY_LIST);
        map.put(ikm.class, Collections.EMPTY_LIST);
        map.put(ikf.class, Collections.EMPTY_LIST);
        map.put(ikh.class, Collections.EMPTY_LIST);
        map.put(ikj.class, Collections.EMPTY_LIST);
        map.put(ikq.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ijq y() {
        ijq ijqVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ijq(this);
            }
            ijqVar = this.m;
        }
        return ijqVar;
    }

    @Override // com.google.android.apps.googletv.app.data.room.GoogleTvDatabase
    public final ijy z() {
        ijy ijyVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new ike(this);
            }
            ijyVar = this.t;
        }
        return ijyVar;
    }
}
