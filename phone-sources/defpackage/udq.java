package defpackage;

import com.google.common.collect.ForwardingMapEntry;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udq extends ForwardingMapEntry {
    final /* synthetic */ Map.Entry a;

    public udq(Map.Entry entry) {
        this.a = entry;
    }

    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new udw((List) this.a.getValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
    public final Map.Entry delegate() {
        return this.a;
    }
}
