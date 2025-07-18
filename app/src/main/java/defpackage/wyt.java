package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyt {
    public final wwq a;

    private wyt(wwq wwqVar) {
        this.a = wwqVar;
    }

    public static wyt b() {
        return new wyt(wum.e());
    }

    public static wyt c() {
        return new wyt(wum.i);
    }

    public static Runnable d(wyt wytVar, Runnable runnable) {
        wwq wwqVar = wytVar.a;
        wwqVar.getClass();
        wyo wyoVar = wyo.a;
        wwqVar.getClass();
        return new wyc(wwqVar, runnable);
    }

    public final wwt a() {
        wwq wwqVar = wum.c().c;
        wum.g(wum.c(), this.a);
        return new wys(wwqVar);
    }

    public final boolean e() {
        return this.a == null;
    }

    public final String toString() {
        wwq wwqVar = this.a;
        return wwqVar == null ? "null ref" : wwqVar.toString();
    }
}
