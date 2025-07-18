package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aap {
    public int a;
    public final bfz b;
    public boolean c;
    public int d;
    public float e;

    public aap(byte[] bArr) {
        this.a = -1;
        this.b = new bfz(new adl[16], 0);
    }

    public static final int a(abj abjVar, boolean z) {
        return z ? ((abk) yfm.W(abjVar.i)).a + 1 : ((abk) yfm.S(r0)).a - 1;
    }

    public static final int b(abj abjVar, boolean z) {
        if (z) {
            abk abkVar = (abk) yfm.W(abjVar.i);
            return (abjVar.m == uv.a ? abkVar.l : abkVar.m) + 1;
        }
        abk abkVar2 = (abk) yfm.S(abjVar.i);
        return (abjVar.m == uv.a ? abkVar2.l : abkVar2.m) - 1;
    }

    public aap() {
        this(null);
    }
}
