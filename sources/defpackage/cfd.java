package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfd extends cfc {
    public static final Map c;
    private final ccx d;

    static {
        EnumMap enumMap = new EnumMap(ccx.class);
        for (ccx ccxVar : ccx.values()) {
            cfd[] cfdVarArr = new cfd[10];
            for (int i = 0; i < 10; i++) {
                cfdVarArr[i] = new cfd(i, ccxVar, ccy.a);
            }
            enumMap.put((EnumMap) ccxVar, (ccx) cfdVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public cfd(int i, ccx ccxVar, ccy ccyVar) {
        super(ccyVar, i);
        ccxVar.getClass();
        this.d = ccxVar;
        if (ccyVar.c()) {
            return;
        }
        int i2 = ccxVar.l;
        i2 = ccyVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        ccyVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.cfc
    public final void a(cfg cfgVar, Object obj) {
        cfgVar.d(obj, this.d, this.b);
    }
}
