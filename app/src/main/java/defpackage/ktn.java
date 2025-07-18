package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class ktn {
    public boolean a;
    public lli b;
    public BitSet c;
    public BitSet d;
    public Map e;
    public Map f;
    final /* synthetic */ ktr g;
    private String h;

    public ktn(ktr ktrVar, String str) {
        this.g = ktrVar;
        this.h = str;
        this.a = true;
        this.c = new BitSet();
        this.d = new BitSet();
        this.e = new we();
        this.f = new we();
    }

    final void a(ktp ktpVar) {
        int iA = ktpVar.a();
        Boolean bool = ktpVar.e;
        if (bool != null) {
            BitSet bitSet = this.d;
            bool.booleanValue();
            bitSet.set(iA, true);
        }
        Boolean bool2 = ktpVar.f;
        if (bool2 != null) {
            this.c.set(iA, bool2.booleanValue());
        }
        if (ktpVar.g != null) {
            Map map = this.e;
            Integer numValueOf = Integer.valueOf(iA);
            Long l = (Long) map.get(numValueOf);
            long jLongValue = ktpVar.g.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.e.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (ktpVar.h != null) {
            Map map2 = this.f;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f.put(numValueOf2, arrayList);
            }
            if (ktpVar.c()) {
                arrayList.clear();
            }
            aeub aeubVar = aeub.a;
            aeubVar.eV();
            ktr ktrVar = this.g;
            String str = this.h;
            lbk lbkVar = ktrVar.y;
            kzf kzfVar = kzg.aF;
            ktx ktxVar = lbkVar.d;
            if (ktxVar.t(str, kzfVar) && ktpVar.b()) {
                arrayList.clear();
            }
            aeubVar.eV();
            if (!ktxVar.t(this.h, kzfVar)) {
                arrayList.add(Long.valueOf(ktpVar.h.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(ktpVar.h.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public ktn(ktr ktrVar, String str, lli lliVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.g = ktrVar;
        this.h = str;
        this.c = bitSet;
        this.d = bitSet2;
        this.e = map;
        this.f = new we();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f.put(num, arrayList);
        }
        this.a = false;
        this.b = lliVar;
    }
}
