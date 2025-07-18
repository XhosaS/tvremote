package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bif implements bie {
    private final yjv a;
    private final ki b;
    private ki c;

    public bif(Map map, yjv yjvVar) {
        this.a = yjvVar;
        ki kiVar = null;
        if (map != null && !map.isEmpty()) {
            kiVar = new ki(map.size());
            for (Map.Entry entry : map.entrySet()) {
                kiVar.j(entry.getKey(), entry.getValue());
            }
        }
        this.b = kiVar;
    }

    @Override // defpackage.bie
    public final Object a(String str) {
        ki kiVar = this.b;
        List list = kiVar != null ? (List) kiVar.g(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            List listSubList = list.subList(1, list.size());
            int iF = kiVar.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = kiVar.c;
            Object obj = objArr[iF];
            kiVar.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // defpackage.bie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bif.b():java.util.Map");
    }

    @Override // defpackage.bie
    public final boolean e(Object obj) {
        return ((Boolean) this.a.a(obj)).booleanValue();
    }

    @Override // defpackage.bie
    public final gmz f(String str, yjk yjkVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ykr.b(str.charAt(i))) {
                ki kiVar = this.c;
                if (kiVar == null) {
                    long[] jArr = kj.a;
                    kiVar = new ki((byte[]) null);
                    this.c = kiVar;
                }
                Object objA = kiVar.a(str);
                if (objA == null) {
                    objA = new ArrayList();
                    kiVar.j(str, objA);
                }
                ((List) objA).add(yjkVar);
                return new gmz(kiVar, str, yjkVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
