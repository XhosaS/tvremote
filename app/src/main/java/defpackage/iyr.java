package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyr implements fas {
    public final joc a;
    private final ixj b;
    private final iyj c;
    private final iyu d;
    private final izq e;

    public iyr(ixj ixjVar, joc jocVar, iyj iyjVar, iyu iyuVar, izq izqVar) {
        ixjVar.getClass();
        jocVar.getClass();
        iyjVar.getClass();
        this.b = ixjVar;
        this.a = jocVar;
        this.c = iyjVar;
        this.d = iyuVar;
        this.e = izqVar;
    }

    public final void a(iyd iydVar) {
        xds xdsVar;
        byte bByteValue;
        this.b.f();
        joc jocVar = this.a;
        synchronized (jocVar.b) {
            xdsVar = jocVar.c;
            if (xdsVar == null) {
                byte[] bArr = jocVar.d;
                if (bArr != null) {
                    try {
                        abxd abxdVarH = abxd.h(xds.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
                        if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                            if (bByteValue != 0) {
                                boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                abxdVarH.cM(2, true != zL ? null : abxdVarH);
                                if (zL) {
                                }
                            }
                            throw new abzz().a();
                        }
                        xdsVar = (xds) abxdVarH;
                        jocVar.c = xdsVar;
                        jocVar.d = null;
                    } catch (abxv e) {
                        ((zdv) ((zdv) ((zdv) joc.a.c()).p(e)).q("com/google/android/apps/tvsearch/voice/shared/DisplayContextParamsHolder", "getDisplayContextParams", 70, "DisplayContextParamsHolder.java")).u("Could not parse DisplayContextParams proto.");
                        jocVar.d = null;
                    }
                } else {
                    xdsVar = null;
                }
            }
        }
        iyu iyuVar = this.d;
        izq izqVar = this.e;
        iyj iyjVar = this.c;
        Optional optionalOfNullable = Optional.ofNullable(xdsVar);
        xtv xtvVar = xtv.OPA_TV_VOICEPLATE_SUGGESTIONS;
        Duration duration = iro.a;
        iyjVar.c(izqVar, iyuVar, iydVar, optionalOfNullable, xtvVar, iro.a);
    }
}
