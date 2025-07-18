package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.text.ParseException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afuy {
    static final afel a = new afel("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final afyg f;
    final afrr g;

    public afuy(Map map, boolean z) throws NumberFormatException, ParseException {
        boolean z2;
        long j;
        afyg afygVar;
        afrr afrrVar;
        this.b = afsx.d(map, "timeout");
        this.c = afsx.a(map, "waitForReady");
        Integer numC = afsx.c(map, "maxResponseMessageBytes");
        this.d = numC;
        if (numC != null) {
            yqw.F(numC.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numC);
        }
        Integer numC2 = afsx.c(map, "maxRequestMessageBytes");
        this.e = numC2;
        if (numC2 != null) {
            yqw.F(numC2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numC2);
        }
        Map mapI = z ? afsx.i(map, "retryPolicy") : null;
        if (mapI == null) {
            j = 0;
            afygVar = null;
            z2 = true;
        } else {
            Integer numC3 = afsx.c(mapI, "maxAttempts");
            numC3.getClass();
            int iIntValue = numC3.intValue();
            yqw.D(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, 5);
            Long lD = afsx.d(mapI, "initialBackoff");
            lD.getClass();
            long jLongValue = lD.longValue();
            yqw.E(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lD2 = afsx.d(mapI, "maxBackoff");
            lD2.getClass();
            z2 = true;
            long jLongValue2 = lD2.longValue();
            yqw.E(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dB = afsx.b(mapI, "backoffMultiplier");
            dB.getClass();
            double dDoubleValue = dB.doubleValue();
            j = 0;
            yqw.F(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dB);
            Long lD3 = afsx.d(mapI, "perAttemptRecvTimeout");
            yqw.F(lD3 == null || lD3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lD3);
            Set setA = afzq.a(mapI, "retryableStatusCodes");
            yry.a(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            yry.a(!setA.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            yqw.B((lD3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            afygVar = new afyg(iMin, jLongValue, jLongValue2, dDoubleValue, lD3, setA);
        }
        this.f = afygVar;
        Map mapI2 = z ? afsx.i(map, "hedgingPolicy") : null;
        if (mapI2 == null) {
            afrrVar = null;
        } else {
            Integer numC4 = afsx.c(mapI2, "maxAttempts");
            numC4.getClass();
            int iIntValue2 = numC4.intValue();
            yqw.D(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            Long lD4 = afsx.d(mapI2, "hedgingDelay");
            lD4.getClass();
            long jLongValue3 = lD4.longValue();
            yqw.E(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setA2 = afzq.a(mapI2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                yry.a(!setA2.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            afrrVar = new afrr(iMin2, jLongValue3, setA2);
        }
        this.g = afrrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afuy)) {
            return false;
        }
        afuy afuyVar = (afuy) obj;
        return yqs.a(this.b, afuyVar.b) && yqs.a(this.c, afuyVar.c) && yqs.a(this.d, afuyVar.d) && yqs.a(this.e, afuyVar.e) && yqs.a(this.f, afuyVar.f) && yqs.a(this.g, afuyVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("timeoutNanos", this.b);
        yqqVarB.b("waitForReady", this.c);
        yqqVarB.b("maxInboundMessageSize", this.d);
        yqqVarB.b("maxOutboundMessageSize", this.e);
        yqqVarB.b("retryPolicy", this.f);
        yqqVarB.b("hedgingPolicy", this.g);
        return yqqVarB.toString();
    }
}
