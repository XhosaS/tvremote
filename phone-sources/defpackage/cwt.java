package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwt {
    public static cuy a(View view, cuy cuyVar) {
        ContentInfo contentInfoD = cuyVar.a.d();
        contentInfoD.getClass();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? cuyVar : new cuy(new cuv(contentInfoPerformReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return czu.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return czu.b(edgeEffect, f, f2);
        }
        czt.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect e(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? czu.c(context, attributeSet) : new EdgeEffect(context);
    }

    public static Object f(ded dedVar, dfh dfhVar, int i) {
        return (cws) dedVar.c.get(new dec(dfhVar, i));
    }

    public static def g(Object obj) {
        return ((dej) obj).extensions;
    }

    public static def h(Object obj) {
        throw null;
    }

    public static final void i(Object obj) {
        g(obj).d();
    }

    public static int j(byte b) {
        return b & 63;
    }

    public static void k(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean l(byte b) {
        return b > -65;
    }

    public static boolean m(byte b) {
        return b >= 0;
    }

    public static String n(dol dolVar) {
        StringBuilder sb = new StringBuilder(dolVar.c());
        for (int i = 0; i < dolVar.c(); i++) {
            byte bA = dolVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Object o(Object obj, Object obj2) {
        dpv dpvVarA = (dpv) obj;
        dpv dpvVar = (dpv) obj2;
        if (!dpvVar.isEmpty()) {
            if (!dpvVarA.b) {
                dpvVarA = dpvVarA.a();
            }
            dpvVarA.b();
            if (!dpvVar.isEmpty()) {
                dpvVarA.putAll(dpvVar);
            }
        }
        return dpvVarA;
    }

    public static final Object p() {
        return dpv.a.a();
    }

    public static final iom q(Object obj) {
        throw null;
    }
}
