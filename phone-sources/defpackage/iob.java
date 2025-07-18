package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iob {
    public static final fus a = new fus((char[]) null);

    public static final gez a(ihz ihzVar, String str) {
        if (ihzVar instanceof ihx) {
            return new gbl(new Exception("Loading should have been filtered out"));
        }
        if (ihzVar instanceof iht) {
            wom womVar = (wom) ((iht) ihzVar).a;
            vun vunVar = womVar.c;
            vunVar.getClass();
            return new gbn(vunVar, str, yks.e(womVar.e, "") ? null : womVar.e);
        }
        if (ihzVar instanceof ihu) {
            return new gbl(((ihu) ihzVar).a);
        }
        if (ihzVar instanceof ihv) {
            return new gbl(new Exception(((ihv) ihzVar).a));
        }
        if (ihzVar instanceof ihy) {
            return new gbn(yhb.a, str, null);
        }
        if (ihzVar == null) {
            return new gbn(yhb.a, str, null);
        }
        throw new yfu();
    }
}
