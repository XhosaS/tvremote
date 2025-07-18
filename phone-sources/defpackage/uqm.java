package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqm {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final double e;
    public final ImmutableList f;

    public uqm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqm) {
            uqm uqmVar = (uqm) obj;
            if (this.a == uqmVar.a && this.b == uqmVar.b) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(uqmVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(uqmVar.d)) {
                        if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(uqmVar.e) && this.f.equals(uqmVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
        double d = this.e;
        return (((iFloatToIntBits * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "GrpcRetryConfig{enabled=" + this.a + ", maxAttempts=" + this.b + ", initialBackoffSeconds=" + this.c + ", maxBackoffSeconds=" + this.d + ", backoffMultiplier=" + this.e + ", retryableStatusCodes=" + String.valueOf(this.f) + "}";
    }

    public uqm(boolean z, int i, float f, float f2, double d, ImmutableList immutableList) {
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = d;
        this.f = immutableList;
    }
}
