package j$.util.concurrent;

/* loaded from: classes4.dex */
public final class w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
