package com.google.android.libraries.social.populous.storage.room;

import defpackage.geo;
import defpackage.gfb;
import defpackage.sij;
import defpackage.sik;
import defpackage.sil;
import defpackage.sim;
import defpackage.sin;
import defpackage.sio;
import defpackage.sip;
import defpackage.siq;
import defpackage.sir;
import defpackage.sis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RoomDatabaseManager_Impl extends RoomDatabaseManager {
    @Override // defpackage.gex
    protected final geo a() {
        HashMap map = new HashMap(2);
        map.put("ContextualCandidateTokens", "ContextualCandidateTokens_content");
        map.put("Tokens", "Tokens_content");
        return new geo(this, map, new HashMap(0), "CacheInfo", "Contacts", "ContextualCandidateContexts", "ContextualCandidates", "ContextualCandidateInfo", "ContextualCandidateTokens", "RpcCache", "Tokens");
    }

    @Override // defpackage.gex
    protected final /* synthetic */ gfb c() {
        return new siq(this);
    }

    @Override // defpackage.gex
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(sik.class, Collections.EMPTY_LIST);
        map.put(sis.class, Collections.EMPTY_LIST);
        map.put(sij.class, Collections.EMPTY_LIST);
        map.put(sir.class, Collections.EMPTY_LIST);
        map.put(sip.class, Collections.EMPTY_LIST);
        map.put(sim.class, Collections.EMPTY_LIST);
        map.put(sil.class, Collections.EMPTY_LIST);
        map.put(sin.class, Collections.EMPTY_LIST);
        map.put(sio.class, Collections.EMPTY_LIST);
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
