package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vib {
    public final agow a;
    public final vhq b;
    public final ujk c;
    public final agow d;
    public final int e;
    public final Executor f;
    private final zwv g = new zwv();

    public vib(agow agowVar, vhq vhqVar, ujk ujkVar, agow agowVar2, int i, Executor executor) {
        this.a = agowVar;
        this.b = vhqVar;
        this.c = ujkVar;
        this.d = agowVar2;
        this.e = i;
        this.f = executor;
    }

    final zyd a() {
        final long epochMilli = Instant.now().toEpochMilli();
        return this.g.b(wyo.b(new zvh() { // from class: vhv
            @Override // defpackage.zvh
            public final zyd a() {
                final vib vibVar = this.a;
                agow agowVar = vibVar.a;
                boolean zIsEmpty = yzq.o(((vie) agowVar.a()).a().values()).isEmpty();
                final long j = epochMilli;
                if (zIsEmpty) {
                    return vibVar.b(j);
                }
                vie vieVar = (vie) agowVar.a();
                yyr yyrVarA = vieVar.a();
                final ArrayList arrayList = new ArrayList();
                zdl it = yyrVarA.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    final String str = (String) entry.getKey();
                    final vhr vhrVar = (vhr) entry.getValue();
                    arrayList.add(zuz.g(vhrVar.a(), wyo.a(new yqi() { // from class: vid
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            yyk yykVar = (yyk) obj;
                            int size = yykVar.size();
                            for (int i = 0; i < size; i++) {
                                vhr vhrVar2 = vhrVar;
                                String str2 = str;
                                vhg vhgVar = (vhg) yykVar.get(i);
                                yqw.aj(str2.equals(vhgVar.j), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", vhrVar2, str2, vhgVar.j);
                            }
                            return yykVar;
                        }
                    }), vieVar.a));
                }
                zwx zwxVarU = zwx.u(zxn.c(arrayList).a(wyo.i(new Callable() { // from class: vic
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i = yyk.e;
                        yyf yyfVar = new yyf(4);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            yyfVar.h((Iterable) zxn.o((zyd) it2.next()));
                        }
                        return yyfVar.f();
                    }
                }), vieVar.a));
                zvi zviVarC = wyo.c(new zvi() { // from class: vhy
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return vibVar.b.j((yyk) obj);
                    }
                });
                Executor executor = vibVar.f;
                return zuz.h(zuz.h(zwxVarU, zviVarC, executor), wyo.c(new zvi() { // from class: vhz
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return vibVar.b(j);
                    }
                }), executor);
            }
        }), this.f);
    }

    public final zyd b(final long j) {
        return this.c.a(new yqi() { // from class: vhw
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                vii viiVar = (vii) obj;
                int i = viiVar.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0 && viiVar.d > j2) {
                    return viiVar;
                }
                vih vihVar = new vih();
                vihVar.B(viiVar);
                if ((vihVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vihVar.y();
                }
                vib vibVar = this.a;
                vii viiVar2 = (vii) vihVar.b;
                viiVar2.b |= 1;
                viiVar2.c = j2;
                if ((vihVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vihVar.y();
                }
                int i3 = vibVar.e;
                vii viiVar3 = (vii) vihVar.b;
                viiVar3.b |= 4;
                viiVar3.e = i3;
                if ((vihVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vihVar.y();
                }
                vii viiVar4 = (vii) vihVar.b;
                viiVar4.b &= -3;
                viiVar4.d = 0L;
                return (vii) vihVar.v();
            }
        }, zwk.a);
    }
}
