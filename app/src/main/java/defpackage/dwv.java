package defpackage;

import com.facebook.yoga.YogaNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwv {
    public static volatile dwu a;
    public static final enu b;

    static {
        enw enwVar = new enw();
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(enwVar.a, true);
        b = enwVar;
    }
}
