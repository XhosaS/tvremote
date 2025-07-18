package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kb {
    public static final pa b = new pa(20);
    public int a;
    public pv c;
    public pv d;

    private kb() {
    }

    public static kb a() {
        kb kbVar = (kb) b.a();
        return kbVar == null ? new kb() : kbVar;
    }

    public static void b(kb kbVar) {
        kbVar.a = 0;
        kbVar.c = null;
        kbVar.d = null;
        b.b(kbVar);
    }
}
