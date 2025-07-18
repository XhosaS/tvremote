package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyf extends tye {
    public static final Map c;
    private final tvq d;

    static {
        EnumMap enumMap = new EnumMap(tvq.class);
        for (tvq tvqVar : tvq.values()) {
            tyf[] tyfVarArr = new tyf[10];
            for (int i = 0; i < 10; i++) {
                tyfVarArr[i] = new tyf(i, tvqVar, tvr.a);
            }
            enumMap.put((EnumMap) tvqVar, (tvq) tyfVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public tyf(int i, tvq tvqVar, tvr tvrVar) {
        super(tvrVar, i);
        tvqVar.getClass();
        this.d = tvqVar;
        if (tvrVar.c()) {
            return;
        }
        int i2 = tvqVar.l;
        i2 = tvrVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        tvrVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.tye
    public final void a(tyi tyiVar, Object obj) throws IOException {
        tyiVar.d(obj, this.d, this.b);
    }
}
