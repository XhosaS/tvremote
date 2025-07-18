package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhu extends bgu implements Map, bgg {
    public static final bhu d = new bhu(bhc.a, 0);

    public bhu(bhc bhcVar, int i) {
        super(bhcVar, i);
    }

    @Override // defpackage.bgu, defpackage.ygq, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof bbb) {
            return super.containsKey((bbb) obj);
        }
        return false;
    }

    @Override // defpackage.ygq, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof bec) {
            return super.containsValue((bec) obj);
        }
        return false;
    }

    public final Object f(bbb bbbVar) {
        return bcm.h(this, bbbVar);
    }

    public final bhu g(bbb bbbVar, bec becVar) {
        etc etcVarM = this.b.m(bbbVar.hashCode(), bbbVar, becVar, 0);
        if (etcVarM == null) {
            return this;
        }
        int i = this.c;
        return new bhu((bhc) etcVarM.b, i + etcVarM.a);
    }

    @Override // defpackage.bgu, defpackage.ygq, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof bbb) {
            return (bec) super.get((bbb) obj);
        }
        return null;
    }

    @Override // defpackage.ygq, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof bbb) ? obj2 : (bec) Map.CC.$default$getOrDefault(this, (bbb) obj, (bec) obj2);
    }
}
