package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zz {
    public int a;
    public adl b;
    public boolean c;
    public int d;
    public float e;

    public zz(byte[] bArr) {
        this.a = -1;
    }

    public static final int b(aai aaiVar, boolean z) {
        return z ? ((aaj) yfm.W(aaiVar.i)).a + 1 : ((aaj) yfm.S(r0)).a - 1;
    }

    public final void a() {
        this.a = -1;
        adl adlVar = this.b;
        if (adlVar != null) {
            adlVar.a();
        }
        this.b = null;
    }

    public zz() {
        this(null);
    }
}
