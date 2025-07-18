package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fco {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] b = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] c = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public gze j;
    public sro k;

    public static boolean a(obk obkVar) {
        dhq dhqVar = (dhq) obkVar.d;
        if (dhqVar.w() != 1 || dhqVar.C().b != 0) {
            return false;
        }
        dhq dhqVar2 = (dhq) obkVar.c;
        return dhqVar2.w() == 1 && dhqVar2.C().b == 0;
    }
}
