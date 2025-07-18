package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyb extends yyp {
    private final transient EnumMap a;

    public yyb(EnumMap enumMap) {
        this.a = enumMap;
        yqw.A(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.yyp
    public final zdl a() {
        return new zbf(this.a.entrySet().iterator());
    }

    @Override // defpackage.yyr
    public final zdl b() {
        return zar.d(this.a.keySet().iterator());
    }

    @Override // defpackage.yyr, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yyr, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yyb) {
            obj = ((yyb) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.yyr, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yyp, defpackage.yyr
    public Object writeReplace() {
        return new yya(this.a);
    }

    @Override // defpackage.yyr
    public final void c() {
    }
}
