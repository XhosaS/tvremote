package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcm {
    public static final gcm a;
    public static final gcm b;
    public static final gcm c;
    public static final gcm d;
    public static final gcm e;
    public static final gcm f;
    public final float[] g;
    public final float[] h;
    public final float[] i = {0.24f, 0.52f, 0.24f};
    public final boolean j = true;

    static {
        gcm gcmVar = new gcm();
        a = gcmVar;
        e(gcmVar);
        h(gcmVar);
        gcm gcmVar2 = new gcm();
        b = gcmVar2;
        g(gcmVar2);
        h(gcmVar2);
        gcm gcmVar3 = new gcm();
        c = gcmVar3;
        d(gcmVar3);
        h(gcmVar3);
        gcm gcmVar4 = new gcm();
        d = gcmVar4;
        e(gcmVar4);
        f(gcmVar4);
        gcm gcmVar5 = new gcm();
        e = gcmVar5;
        g(gcmVar5);
        f(gcmVar5);
        gcm gcmVar6 = new gcm();
        f = gcmVar6;
        d(gcmVar6);
        f(gcmVar6);
    }

    public gcm() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        i(fArr);
        i(fArr2);
    }

    private static void d(gcm gcmVar) {
        float[] fArr = gcmVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(gcm gcmVar) {
        float[] fArr = gcmVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(gcm gcmVar) {
        float[] fArr = gcmVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(gcm gcmVar) {
        float[] fArr = gcmVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(gcm gcmVar) {
        float[] fArr = gcmVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
