package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srp {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public srp(sev sevVar, List list, int i) {
        this.c = new ArrayList();
        this.b = sevVar;
        this.d = list;
        this.a = i;
    }

    public final int a() {
        return (this.a * 4) + 16;
    }

    public final sfa b(int i) {
        sev sevVar = (sev) this.b;
        if (sevVar.j) {
            i |= 8;
        }
        if (sevVar.i) {
            i |= 16;
        }
        sez sezVar = new sez();
        sezVar.i(sevVar.a);
        sezVar.j(sevVar.b);
        sezVar.c(sevVar.c);
        sezVar.f(sevVar.d);
        sezVar.e(sevVar.e);
        sezVar.h(sevVar.f);
        sezVar.d(this.a);
        sezVar.g(i);
        return sezVar.a();
    }

    public final String c() {
        return ((sev) this.b).f;
    }

    public final String d() {
        return ((sev) this.b).a;
    }

    public final String e() {
        return ((sev) this.b).g;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public srp(Map map) {
        this.c = new ArrayList();
        this.a = map.size();
        int iE = 0;
        this.d = new srn(false, new String[0]);
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            Collections.sort(list, srq.b);
            this.c.add(new yyh((zuw) entry.getKey(), list));
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            iE += ((yyh) it.next()).e();
        }
        this.b = new srl((short) 2, (short) 12, ((srn) this.d).a + 12 + iE);
    }

    public srp(List list) {
        this.a = ((srk) list.get(list.size() - 1)).c + 1;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Short.valueOf(((srk) it.next()).c));
        }
        this.c = new int[this.a];
        short s = 0;
        while (true) {
            int i = this.a;
            if (s < i) {
                if (hashSet.contains(Short.valueOf(s))) {
                    ((int[]) this.c)[s] = 1073741824;
                }
                s = (short) (s + 1);
            } else {
                this.b = new srl((short) 514, (short) 16, a());
                this.d = new sro(list, hashSet, i);
                return;
            }
        }
    }
}
