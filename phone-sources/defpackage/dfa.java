package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfa {
    private static final dff b = new dey(0);
    public final dff a;

    public dfa() {
        dff dffVar;
        dff[] dffVarArr = new dff[2];
        dffVarArr[0] = dey.a;
        dfp dfpVar = dfp.a;
        try {
            dffVar = (dff) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            dffVar = b;
        }
        dffVarArr[1] = dffVar;
        dez dezVar = new dez(dffVarArr);
        Charset charset = dep.a;
        this.a = dezVar;
    }

    public static boolean a(dfe dfeVar) {
        return dfeVar.c() + (-1) != 1;
    }

    public static boolean b(Class cls) {
        dfp dfpVar = dfp.a;
        return dek.class.isAssignableFrom(cls);
    }
}
