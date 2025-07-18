package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bht extends bgw implements Map, java.util.Map, yll {
    private bhu f;

    public bht(bhu bhuVar) {
        super(bhuVar);
        this.f = bhuVar;
    }

    @Override // defpackage.bgw, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof bbb) {
            return super.containsKey((bbb) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof bec) {
            return super.containsValue((bec) obj);
        }
        return false;
    }

    @Override // defpackage.bgw
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final bhu b() {
        bhc bhcVar = this.a;
        bhu bhuVar = this.f;
        if (bhcVar != bhuVar.b) {
            this.e = new a();
            bhuVar = new bhu(bhcVar, this.d);
        }
        this.f = bhuVar;
        return bhuVar;
    }

    @Override // defpackage.bgw, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof bbb) {
            return (bec) super.get((bbb) obj);
        }
        return null;
    }

    @Override // defpackage.bgw, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof bbb) ? obj2 : (bec) Map.CC.$default$getOrDefault(this, (bbb) obj, (bec) obj2);
    }

    @Override // defpackage.bgw, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof bbb) {
            return (bec) super.remove((bbb) obj);
        }
        return null;
    }
}
