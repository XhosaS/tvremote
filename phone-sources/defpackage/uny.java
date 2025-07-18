package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uny {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;

    public uny() {
    }

    public final unz a() {
        if (this.g == 3 && this.h != 0) {
            return new unz(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
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

    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }

    public uny(unz unzVar) {
        this.a = unzVar.a;
        this.h = unzVar.g;
        this.b = unzVar.b;
        this.c = unzVar.c;
        this.e = unzVar.d;
        this.f = unzVar.e;
        this.d = unzVar.f;
        this.g = (byte) 3;
    }
}
