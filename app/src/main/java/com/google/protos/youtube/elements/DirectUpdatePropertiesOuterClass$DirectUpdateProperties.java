package com.google.protos.youtube.elements;

import defpackage.abwx;
import defpackage.abxb;
import defpackage.abxc;
import defpackage.abxd;
import defpackage.abyr;
import defpackage.abyy;
import defpackage.abzb;
import defpackage.abzc;
import defpackage.acap;
import defpackage.acvl;
import defpackage.acyd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DirectUpdatePropertiesOuterClass$DirectUpdateProperties extends abxd implements abyr {
    public static final DirectUpdatePropertiesOuterClass$DirectUpdateProperties a;
    public static volatile abyy b;
    public static final abxc c;
    private byte d = 2;

    static {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        a = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        directUpdatePropertiesOuterClass$DirectUpdateProperties.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        c = new abxc(acyd.a, directUpdatePropertiesOuterClass$DirectUpdateProperties, directUpdatePropertiesOuterClass$DirectUpdateProperties, new abxb(null, 402418170, acap.MESSAGE, false, false));
    }

    private DirectUpdatePropertiesOuterClass$DirectUpdateProperties() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        }
        if (i2 == 4) {
            return new acvl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
