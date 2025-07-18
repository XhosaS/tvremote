package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agwk {
    public static boolean a(Object obj, int i) {
        if (obj instanceof agoz) {
            if ((obj instanceof agvu ? ((agvu) obj).i() : obj instanceof agum ? 0 : obj instanceof agux ? 1 : obj instanceof agvb ? 2 : obj instanceof agvc ? 3 : obj instanceof agvd ? 4 : obj instanceof agve ? 5 : obj instanceof agvf ? 6 : obj instanceof agvg ? 7 : obj instanceof agvh ? 8 : obj instanceof agvi ? 9 : obj instanceof agun ? 10 : obj instanceof aguo ? 11 : obj instanceof agup ? 12 : obj instanceof aguq ? 13 : obj instanceof agur ? 14 : obj instanceof agus ? 15 : obj instanceof agut ? 16 : obj instanceof aguu ? 17 : obj instanceof aguv ? 18 : obj instanceof aguw ? 19 : obj instanceof aguy ? 20 : obj instanceof aguz ? 21 : obj instanceof agva ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void b(Object obj, int i) {
        if (obj == null || a(obj, i)) {
            return;
        }
        String strB = a.b(i, "kotlin.jvm.functions.Function");
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + strB);
        agvy.d(classCastException, agwk.class.getName());
        throw classCastException;
    }
}
