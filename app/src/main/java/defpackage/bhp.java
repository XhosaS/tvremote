package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhp {
    public static final bhp a;
    public static final bhp b;
    public static final bhp c;
    public static final bhp d;
    public static final bhp e;
    public static final bhp f;
    final float[] g;
    final float[] h;
    final float[] i = {0.24f, 0.52f, 0.24f};
    final boolean j = true;

    static {
        bhp bhpVar = new bhp();
        a = bhpVar;
        b(bhpVar);
        e(bhpVar);
        bhp bhpVar2 = new bhp();
        b = bhpVar2;
        d(bhpVar2);
        e(bhpVar2);
        bhp bhpVar3 = new bhp();
        c = bhpVar3;
        a(bhpVar3);
        e(bhpVar3);
        bhp bhpVar4 = new bhp();
        d = bhpVar4;
        b(bhpVar4);
        c(bhpVar4);
        bhp bhpVar5 = new bhp();
        e = bhpVar5;
        d(bhpVar5);
        c(bhpVar5);
        bhp bhpVar6 = new bhp();
        f = bhpVar6;
        a(bhpVar6);
        c(bhpVar6);
    }

    public bhp() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        f(fArr);
        f(fArr2);
    }

    private static void a(bhp bhpVar) {
        float[] fArr = bhpVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void b(bhp bhpVar) {
        float[] fArr = bhpVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void c(bhp bhpVar) {
        float[] fArr = bhpVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void d(bhp bhpVar) {
        float[] fArr = bhpVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void e(bhp bhpVar) {
        float[] fArr = bhpVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void f(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
