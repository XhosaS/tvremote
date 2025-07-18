package com.google.android.libraries.onegoogle.accountmenu.cards.db;

import defpackage.geo;
import defpackage.gfb;
import defpackage.rev;
import defpackage.rew;
import defpackage.rex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardsDatabase_Impl extends CardsDatabase {
    @Override // defpackage.gex
    protected final geo a() {
        return new geo(this, new HashMap(0), new HashMap(0), "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new rew(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(rex.class, Collections.EMPTY_LIST);
        map.put(rev.class, Collections.EMPTY_LIST);
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
}
