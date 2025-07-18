package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zim extends zik {
    public static final Map c;
    private final zfl d;

    static {
        EnumMap enumMap = new EnumMap(zfl.class);
        for (zfl zflVar : zfl.values()) {
            zim[] zimVarArr = new zim[10];
            for (int i = 0; i < 10; i++) {
                zimVarArr[i] = new zim(i, zflVar, zfm.a);
            }
            enumMap.put((EnumMap) zflVar, (zfl) zimVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public zim(int i, zfl zflVar, zfm zfmVar) {
        super(zfmVar, i);
        zflVar.getClass();
        this.d = zflVar;
        if (zfmVar.c()) {
            return;
        }
        int i2 = zflVar.l;
        i2 = zfmVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        zfmVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.zik
    public final void a(zil zilVar, Object obj) {
        zilVar.b(obj, this.d, this.b);
    }
}
