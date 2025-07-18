package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanq extends aanu {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;

    public aanq() {
    }

    @Override // defpackage.aanu
    public final aanv a() {
        if (this.g == 3 && this.h != 0) {
            return new aanr(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aanu
    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.aanu
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    @Override // defpackage.aanu
    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }

    public aanq(aanv aanvVar) {
        aanr aanrVar = (aanr) aanvVar;
        this.a = aanrVar.a;
        this.h = aanrVar.g;
        this.b = aanrVar.b;
        this.c = aanrVar.c;
        this.e = aanrVar.d;
        this.f = aanrVar.e;
        this.d = aanrVar.f;
        this.g = (byte) 3;
    }
}
