package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abap {
    static final abak a = abak.a;
    static final abbb b;
    static final abbb c;
    final List d;
    public final abak e;
    private final abbf f;
    private final abcc g;

    static {
        abaj abajVar = abaj.IDENTITY;
        b = abba.DOUBLE;
        c = abba.LAZILY_PARSED_NUMBER;
        try {
            Class.forName("com.google.protobuf.MessageLite");
        } catch (ClassNotFoundException unused) {
        }
    }

    public abap() {
        abbg abbgVar = abbg.a;
        Map map = Collections.EMPTY_MAP;
        abak abakVar = a;
        abaz abazVar = abaz.DEFAULT;
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        abbb abbbVar = b;
        abbb abbbVar2 = c;
        List list4 = Collections.EMPTY_LIST;
        new ThreadLocal();
        new ConcurrentHashMap();
        this.f = new abbf(map);
        this.e = abakVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(abdm.T);
        abbe abbeVar = abci.a;
        arrayList.add(abbbVar == abba.DOUBLE ? abci.a : new abch());
        arrayList.add(abbgVar);
        arrayList.addAll(list3);
        arrayList.add(abdm.z);
        arrayList.add(abdm.l);
        arrayList.add(abdm.f);
        arrayList.add(abdm.h);
        arrayList.add(abdm.j);
        arrayList.add(new abdd(Long.TYPE, Long.class, abdm.s));
        arrayList.add(new abdd(Double.TYPE, Double.class, new abal()));
        arrayList.add(new abdd(Float.TYPE, Float.class, new abam()));
        abbe abbeVar2 = abcg.a;
        arrayList.add(abbbVar2 == abba.LAZILY_PARSED_NUMBER ? abcg.a : new abcf());
        arrayList.add(abdm.n);
        arrayList.add(abdm.p);
        arrayList.add(new abdb(AtomicLong.class, new aban().a()));
        arrayList.add(new abdb(AtomicLongArray.class, new abao().a()));
        arrayList.add(abdm.r);
        arrayList.add(abdm.u);
        arrayList.add(abdm.B);
        arrayList.add(abdm.D);
        arrayList.add(new abdb(BigDecimal.class, abdm.w));
        arrayList.add(new abdb(BigInteger.class, abdm.x));
        arrayList.add(new abdb(abbi.class, abdm.y));
        arrayList.add(abdm.F);
        arrayList.add(abdm.H);
        arrayList.add(abdm.L);
        arrayList.add(abdm.N);
        arrayList.add(abdm.R);
        arrayList.add(abdm.J);
        arrayList.add(abdm.d);
        arrayList.add(abbz.a);
        arrayList.add(abdm.P);
        if (abdv.a) {
            arrayList.add(abdv.c);
            arrayList.add(abdv.b);
            arrayList.add(abdv.d);
        }
        arrayList.add(abbu.a);
        arrayList.add(abdm.b);
        arrayList.add(new abbv());
        arrayList.add(new abce());
        abcc abccVar = new abcc();
        this.g = abccVar;
        arrayList.add(abccVar);
        arrayList.add(abdm.U);
        arrayList.add(new abcj());
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final void a(abar abarVar, abdz abdzVar) {
        int i = abdzVar.f;
        boolean z = abdzVar.c;
        boolean z2 = abdzVar.e;
        abdzVar.c = true;
        abdzVar.e = false;
        if (i == 2) {
            abdzVar.f = 1;
        }
        try {
            try {
                try {
                    ((abcd) abdm.S).b(abdzVar, abarVar);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.12.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new abas(e2);
            }
        } finally {
            abdzVar.f(i);
            abdzVar.c = z;
            abdzVar.e = z2;
        }
    }

    public final String toString() {
        abbf abbfVar = this.f;
        return "{serializeNulls:false,factories:" + String.valueOf(this.d) + ",instanceCreators:" + abbfVar.toString() + "}";
    }
}
