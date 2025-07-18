package com.google.protos.assistant.portable.geller;

import defpackage.abwx;
import defpackage.abxd;
import defpackage.abyr;
import defpackage.abyy;
import defpackage.abzc;
import defpackage.acch;
import defpackage.accj;
import defpackage.accl;
import defpackage.accn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GellerDeleteParams extends abxd implements abyr {
    public static final GellerDeleteParams a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        GellerDeleteParams gellerDeleteParams = new GellerDeleteParams();
        a = gellerDeleteParams;
        gellerDeleteParams.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(GellerDeleteParams.class, gellerDeleteParams);
    }

    private GellerDeleteParams() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004:\u0000\u0005ဈ\u0000\u0006<\u0000", new Object[]{"d", "c", "b", accj.class, accn.class, "e", accl.class});
        }
        if (i2 == 3) {
            return new GellerDeleteParams();
        }
        if (i2 == 4) {
            return new acch();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (GellerDeleteParams.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
