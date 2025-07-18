package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhf<K, V> extends bhd<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.b;
        this.b = i + 2;
        return (K) this.a[i];
    }
}
