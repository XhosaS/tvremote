package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edn {
    public static String a(List list, edk edkVar) {
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex() + 1;
            Object next = listIterator.next();
            ListIterator listIterator2 = list.listIterator(iNextIndex);
            while (listIterator2.hasNext()) {
                Object next2 = listIterator2.next();
                if (edkVar.f(next, next2)) {
                    String simpleName = next != null ? next.getClass().getSimpleName() : "NULL";
                    dsr.b(2, "Detected duplicates in data passed to DataDiffSection. Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception, type: " + simpleName + ", hash: " + System.identityHashCode(next));
                    return "Duplicates are [type:" + simpleName + " hash:" + System.identityHashCode(next) + " position:" + i + "] and [type:" + simpleName + " hash:" + System.identityHashCode(next2) + " position:" + iNextIndex + "]";
                }
                iNextIndex++;
            }
            i++;
        }
        return null;
    }
}
