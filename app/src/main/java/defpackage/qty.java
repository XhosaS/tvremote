package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class qty {
    public abstract MessageLite a(String str, Object obj);

    public abstract MessageLite b(MessageLite messageLite, MessageLite messageLite2);

    public abstract String c(MessageLite messageLite);

    final List d(Map map) {
        MessageLite messageLiteA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (messageLiteA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(messageLiteA);
            }
        }
        return arrayList;
    }

    final List e(List list, List list2) {
        MessageLite messageLite;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageLite messageLite2 = (MessageLite) it.next();
            String strC = c(messageLite2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    messageLite = null;
                    break;
                }
                messageLite = (MessageLite) it2.next();
                if (strC.equals(c(messageLite))) {
                    break;
                }
            }
            MessageLite messageLiteB = b(messageLite2, messageLite);
            if (messageLiteB != null) {
                arrayList.add(messageLiteB);
            }
        }
        return arrayList;
    }
}
