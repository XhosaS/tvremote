package defpackage;

import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ String A(abxd abxdVar, String str) {
        return "Serializing " + abxdVar.getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public static /* synthetic */ String B(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String C(abxd abxdVar, String str) {
        return "Serializing " + abxdVar.getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public static /* synthetic */ String a(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String b(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String c(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String d(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String e(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String f(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String g(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String h(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String i(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String j(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String k(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String l(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String m(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String n(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String o(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String p(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String q(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String r(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + String.valueOf(obj);
    }

    public static /* synthetic */ String s(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String t(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String u(abxd abxdVar, String str) {
        return "Serializing " + abxdVar.getClass().getName() + str;
    }

    public static /* synthetic */ String w(tt ttVar, Class cls) {
        return "Attempt to inject a Activity wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(ttVar.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String x(Object obj, String str, String str2) {
        return str + obj.getClass().getName() + str2;
    }

    public static /* synthetic */ String y(String str, abxd abxdVar) {
        return "Serializing " + abxdVar.getClass().getName() + str;
    }

    public static /* synthetic */ String z(String str, abxd abxdVar) {
        return "Serializing " + abxdVar.getClass().getName() + str;
    }
}
