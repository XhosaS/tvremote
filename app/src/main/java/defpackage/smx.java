package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smx {
    private final yxl a = new yxl(20);

    public final synchronized void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    public final synchronized boolean b(int i) {
        return this.a.contains(Integer.valueOf(i));
    }
}
