package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drm {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean b(dtn dtnVar, dtn dtnVar2) {
        if (dtnVar == dtnVar2) {
            return true;
        }
        if (dtnVar == null || dtnVar2 == null) {
            return false;
        }
        return dtnVar.a(dtnVar2);
    }
}
