package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class y extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
