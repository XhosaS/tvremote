package defpackage;

import j$.util.DesugarCollections;
import java.text.ParseException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xza {
    static final xpx a = new xpx("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final ybc f;
    final xxd g;

    public xza(Map map, boolean z, int i, int i2) throws NumberFormatException, ParseException {
        boolean z2;
        long j;
        ybc ybcVar;
        xxd xxdVar;
        this.b = xxv.d(map, "timeout");
        this.c = xxv.a(map, "waitForReady");
        Integer numC = xxv.c(map, "maxResponseMessageBytes");
        this.d = numC;
        if (numC != null) {
            sij.s(numC.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numC);
        }
        Integer numC2 = xxv.c(map, "maxRequestMessageBytes");
        this.e = numC2;
        if (numC2 != null) {
            sij.s(numC2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numC2);
        }
        Map mapI = z ? xxv.i(map, "retryPolicy") : null;
        if (mapI == null) {
            j = 0;
            ybcVar = null;
            z2 = true;
        } else {
            Integer numC3 = xxv.c(mapI, "maxAttempts");
            numC3.getClass();
            int iIntValue = numC3.intValue();
            sij.q(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            Long lD = xxv.d(mapI, "initialBackoff");
            lD.getClass();
            long jLongValue = lD.longValue();
            sij.r(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lD2 = xxv.d(mapI, "maxBackoff");
            lD2.getClass();
            z2 = true;
            long jLongValue2 = lD2.longValue();
            sij.r(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dB = xxv.b(mapI, "backoffMultiplier");
            dB.getClass();
            double dDoubleValue = dB.doubleValue();
            j = 0;
            sij.s(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dB);
            Long lD3 = xxv.d(mapI, "perAttemptRecvTimeout");
            sij.s(lD3 == null || lD3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lD3);
            Set setA = ybn.a(mapI, "retryableStatusCodes");
            sij.j(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            sij.j(!setA.contains(xth.OK), "%s must not contain OK", "retryableStatusCodes");
            sij.o((lD3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            ybcVar = new ybc(iMin, jLongValue, jLongValue2, dDoubleValue, lD3, setA);
        }
        this.f = ybcVar;
        Map mapI2 = z ? xxv.i(map, "hedgingPolicy") : null;
        if (mapI2 == null) {
            xxdVar = null;
        } else {
            Integer numC4 = xxv.c(mapI2, "maxAttempts");
            numC4.getClass();
            int iIntValue2 = numC4.intValue();
            sij.q(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, i2);
            Long lD4 = xxv.d(mapI2, "hedgingDelay");
            lD4.getClass();
            long jLongValue3 = lD4.longValue();
            sij.r(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setA2 = ybn.a(mapI2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(xth.class));
            } else {
                sij.j(!setA2.contains(xth.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            xxdVar = new xxd(iMin2, jLongValue3, setA2);
        }
        this.g = xxdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xza)) {
            return false;
        }
        xza xzaVar = (xza) obj;
        return a.Q(this.b, xzaVar.b) && a.Q(this.c, xzaVar.c) && a.Q(this.d, xzaVar.d) && a.Q(this.e, xzaVar.e) && a.Q(this.f, xzaVar.f) && a.Q(this.g, xzaVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("timeoutNanos", this.b);
        tssVarH.b("waitForReady", this.c);
        tssVarH.b("maxInboundMessageSize", this.d);
        tssVarH.b("maxOutboundMessageSize", this.e);
        tssVarH.b("retryPolicy", this.f);
        tssVarH.b("hedgingPolicy", this.g);
        return tssVarH.toString();
    }
}
