package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruv {
    public float a;
    public byte b;
    public int c;

    public final ruw a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            ruw ruwVar = new ruw(i, this.a);
            float f = ruwVar.a;
            sij.x(f >= 0.0f && f <= 1.0f, "Probability shall be between 0 and 1.");
            return ruwVar;
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
