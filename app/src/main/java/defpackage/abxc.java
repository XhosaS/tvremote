package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abxc extends abwk {
    public final MessageLite a;
    public final Object b;
    public final MessageLite c;
    public final abxb d;

    public abxc(MessageLite messageLite, Object obj, MessageLite messageLite2, abxb abxbVar) {
        if (messageLite == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (abxbVar.c == acap.MESSAGE && messageLite2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = messageLite;
        this.b = obj;
        this.c = messageLite2;
        this.d = abxbVar;
    }

    @Override // defpackage.abwk
    public final int a() {
        return this.d.b;
    }

    public final Object b(Object obj) {
        abxb abxbVar = this.d;
        if (!abxbVar.d) {
            return c(obj);
        }
        if (abxbVar.c.s != acaq.ENUM) {
            return obj;
        }
        abzb abzbVar = new abzb(abzb.a, 0, true);
        List list = (List) obj;
        abzbVar.e(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abzbVar.add(c(it.next()));
        }
        abzbVar.b();
        return abzbVar;
    }

    final Object c(Object obj) {
        return this.d.c.s == acaq.ENUM ? acqc.b(((Integer) obj).intValue()) : obj;
    }

    final Object d(Object obj) {
        return this.d.c.s == acaq.ENUM ? Integer.valueOf(((abxf) obj).a()) : obj;
    }
}
