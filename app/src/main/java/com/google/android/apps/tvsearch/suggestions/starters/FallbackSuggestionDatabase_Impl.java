package com.google.android.apps.tvsearch.suggestions.starters;

import defpackage.blh;
import defpackage.bmv;
import defpackage.ixt;
import defpackage.ixz;
import defpackage.iyc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FallbackSuggestionDatabase_Impl extends FallbackSuggestionDatabase {
    private volatile ixt l;

    @Override // defpackage.bmn
    protected final blh a() {
        return new blh(this, new HashMap(0), new HashMap(0), "fallback_suggestion_table");
    }

    @Override // defpackage.bmn
    protected final /* synthetic */ bmv c() {
        return new iyc(this);
    }

    @Override // defpackage.bmn
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(ixt.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.bmn
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.bmn
    public final List v() {
        return new ArrayList();
    }

    @Override // com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase
    public final ixt x() {
        ixt ixtVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ixz(this);
            }
            ixtVar = this.l;
        }
        return ixtVar;
    }
}
