package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpu {
    private static final dpy b = new dps(0);
    public final dpy a;

    public dpu() {
        dpy dpyVar;
        dpy[] dpyVarArr = new dpy[2];
        dpyVarArr[0] = dps.a;
        dqh dqhVar = dqh.a;
        try {
            dpyVar = (dpy) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            dpyVar = b;
        }
        dpyVarArr[1] = dpyVar;
        dpt dptVar = new dpt(dpyVarArr);
        byte[] bArr = dpk.b;
        this.a = dptVar;
    }

    public static boolean a(dpx dpxVar) {
        return dpxVar.c() + (-1) != 1;
    }

    public static boolean b(Class cls) {
        dqh dqhVar = dqh.a;
        return dpf.class.isAssignableFrom(cls);
    }
}
