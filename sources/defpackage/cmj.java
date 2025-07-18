package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmj implements Map.Entry {
    public final Map.Entry a;

    public cmj(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((cml) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof cmz)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        cml cmlVar = (cml) this.a.getValue();
        cmz cmzVar = cmlVar.a;
        cmlVar.b = null;
        cmlVar.a = (cmz) obj;
        return cmzVar;
    }
}
