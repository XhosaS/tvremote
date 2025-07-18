package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgz {
    public final afeh a = afeh.a;
    public Object[][] b = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    private List c;

    public final afhb a() {
        return new afhb(this.c, this.a, this.b);
    }

    public final void b(afha afhaVar, Object obj) {
        int length = 0;
        while (true) {
            Object[][] objArr = this.b;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (afhaVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = this.b;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.b = objArr3;
            length = objArr3.length - 1;
        }
        this.b[length] = new Object[]{afhaVar, obj};
    }

    public final void c(List list) {
        yqw.B(!list.isEmpty(), "addrs is empty");
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
