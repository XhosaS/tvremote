package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aari implements aaro {
    private final String a;
    private final aarj b;

    public aari(Set set, aarj aarjVar) {
        this.a = b(set);
        this.b = aarjVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aark aarkVar = (aark) it.next();
            sb.append(aarkVar.a());
            sb.append('/');
            sb.append(aarkVar.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.aaro
    public final String a() {
        aarj aarjVar = this.b;
        if (aarjVar.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(aarjVar.a());
    }
}
