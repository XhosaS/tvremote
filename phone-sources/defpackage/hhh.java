package defpackage;

import android.content.res.TypedArray;
import java.security.Key;
import java.security.spec.KeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hhh {
    static /* synthetic */ String a(hhg hhgVar, String str) {
        return str + a.ag(hhgVar.p()) + " at path " + hhgVar.d();
    }

    public static /* synthetic */ String b(ggw ggwVar, ggw ggwVar2, String str) {
        return str + gez.B(ggwVar2) + "\n Found:\n" + gez.B(ggwVar);
    }

    public static /* synthetic */ String c(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String d(String str, TypedArray typedArray, String str2) {
        return typedArray.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String e(KeySpec keySpec, String str) {
        return str + String.valueOf(keySpec.getClass()) + ".";
    }

    public static /* synthetic */ String f(Key key, String str) {
        return str + String.valueOf(key.getClass()) + ".";
    }
}
