package com.google.android.libraries.mediahome.providers.video.database;

import defpackage.geo;
import defpackage.gfb;
import defpackage.psf;
import defpackage.psl;
import defpackage.psv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Database_Impl extends Database {
    private volatile psl l;

    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "channels", "preview_programs", "watch_next_programs");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new psf(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(psl.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.libraries.mediahome.providers.video.database.Database
    public final psl z() {
        psl pslVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new psv(this);
            }
            pslVar = this.l;
        }
        return pslVar;
    }
}
