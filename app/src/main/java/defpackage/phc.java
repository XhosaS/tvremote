package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phc extends Exception {
    public final phb a;
    public final int b;
    public final int c;

    public phc(pha phaVar) {
        super(phaVar.b, phaVar.c);
        this.a = phaVar.a;
        this.c = phaVar.d;
        this.b = 0;
    }

    public static pha a() {
        pha phaVar = new pha();
        phaVar.d = 2;
        return phaVar;
    }
}
