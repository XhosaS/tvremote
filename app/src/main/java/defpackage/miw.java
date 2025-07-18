package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class miw implements mik {
    private final int[] a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public miw(aeft aeftVar) {
        yzo yzoVar = new yzo();
        aefs aefsVar = new aefs();
        int i = 0;
        for (int i2 = 0; i2 < aeftVar.i(); i2++) {
            aeftVar.j(aefsVar, i2);
            int iH = aefsVar.h();
            if (iH != 0) {
                yzoVar.c(Integer.valueOf(iH));
            }
            int i3 = aefsVar.i();
            if (i3 == 1) {
                Map map = this.c;
                Integer numValueOf = Integer.valueOf(iH);
                if (!map.containsKey(numValueOf)) {
                    this.c.put(numValueOf, aefsVar.f(6));
                }
            } else if (i3 == 2) {
                Map map2 = this.d;
                Integer numValueOf2 = Integer.valueOf(iH);
                List list = (List) map2.get(numValueOf2);
                if (list != null) {
                    list.add(aefsVar.f(6));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aefsVar.f(6));
                    this.d.put(numValueOf2, arrayList);
                }
            }
        }
        yzq yzqVarF = yzoVar.f();
        int[] iArr = new int[yzqVarF.size()];
        zdl it = yzqVarF.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.a = iArr;
    }

    @Override // defpackage.mik
    public final mil a(mii miiVar) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(miiVar.a);
        mil milVarB = miiVar.b((mil) map.get(numValueOf));
        if (milVarB != null) {
            return milVarB;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.c.get(numValueOf);
        if (byteBuffer == null) {
            return null;
        }
        mil milVarA = miiVar.b.a(byteBuffer);
        map.put(numValueOf, milVarA);
        return milVarA;
    }

    @Override // defpackage.mik
    public final boolean b(mii miiVar) {
        return this.c.containsKey(Integer.valueOf(miiVar.a));
    }

    @Override // defpackage.mil
    public final int c() {
        throw null;
    }

    @Override // defpackage.mil
    public final yyk d(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            throw new IllegalArgumentException(getClass().getSimpleName() + ": field number " + i + " is a previously retrieved extension.");
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.c.get(numValueOf);
        if (byteBuffer != null) {
            return yyk.o(byteBuffer);
        }
        List list = (List) this.d.get(numValueOf);
        if (list != null) {
            return yyk.j(list);
        }
        int i2 = yyk.e;
        return zcg.b;
    }

    @Override // defpackage.mil
    public final byte[] e() {
        throw null;
    }

    @Override // defpackage.mil
    public final int[] f() {
        return this.a;
    }
}
