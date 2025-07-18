package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbq implements sbo {
    public final yow a;
    public final Map b;

    public sbq() {
        this(null);
    }

    @Override // defpackage.sbo
    public final boolean v(sbn sbnVar) {
        ygi ygiVar;
        try {
            yjv yjvVar = (yjv) this.b.get(sbnVar.getClass());
            if (yjvVar != null) {
                yjvVar.a(sbnVar);
                ygiVar = ygi.a;
            } else {
                ygiVar = null;
            }
        } catch (sbp unused) {
        }
        return ygiVar != null;
    }

    public /* synthetic */ sbq(byte[] bArr) {
        this.a = yoz.m();
        this.b = new LinkedHashMap();
    }
}
