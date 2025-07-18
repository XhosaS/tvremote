package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsb implements Map.Entry {
    private final agsf a;
    private final int b;
    private final int c;

    public agsb(agsf agsfVar, int i) {
        this.a = agsfVar;
        this.b = i;
        this.c = agsfVar.g;
    }

    private final void a() {
        if (this.a.g != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return agvy.c(entry.getKey(), getKey()) && agvy.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.c[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.d;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        agsf agsfVar = this.a;
        agsfVar.e();
        Object[] objArrJ = agsfVar.j();
        int i = this.b;
        Object obj2 = objArrJ[i];
        objArrJ[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
