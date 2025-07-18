package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhh<K, V> extends bhd<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.b;
        this.b = i + 2;
        return (V) this.a[i + 1];
    }
}
