package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tto<T> implements ttm<T> {
    private static final ttm a = new eik(15);
    private volatile ttm b;
    private Object c;
    private final kww d = new kww();

    public tto(ttm ttmVar) {
        this.b = ttmVar;
    }

    @Override // defpackage.ttm
    public final T get() {
        ttm ttmVar = this.b;
        ttm ttmVar2 = a;
        if (ttmVar != ttmVar2) {
            synchronized (this.d) {
                if (this.b != ttmVar2) {
                    T t = (T) this.b.get();
                    this.c = t;
                    this.b = ttmVar2;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return a.cw(obj, "Suppliers.memoize(", ")");
    }
}
