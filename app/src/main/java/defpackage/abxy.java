package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abxy implements Map.Entry {
    public final Map.Entry a;

    public abxy(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((abya) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof MessageLite)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        abya abyaVar = (abya) this.a.getValue();
        MessageLite messageLite = abyaVar.a;
        abyaVar.b = null;
        abyaVar.a = (MessageLite) obj;
        return messageLite;
    }
}
