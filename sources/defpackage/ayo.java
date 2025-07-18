package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayo {
    public float a;
    public byte b;
    public int c;

    public final ayp a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            ayp aypVar = new ayp(i, this.a);
            float f = aypVar.a;
            bdq.k(f >= 0.0f && f <= 1.0f, "Probability shall be between 0 and 1.");
            return aypVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = true != z ? 2 : 3;
    }
}
