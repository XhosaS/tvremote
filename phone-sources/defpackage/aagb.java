package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aagb extends aabs {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String a;
    private final int g;
    private final int h;

    public aagb(String str, String str2, int i, int i2) {
        super(str);
        this.a = str2;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.aabs
    public final int a(long j) {
        return this.g;
    }

    @Override // defpackage.aabs
    public final int b(long j) {
        return this.h;
    }

    @Override // defpackage.aabs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aagb) {
            aagb aagbVar = (aagb) obj;
            if (this.e.equals(aagbVar.e) && this.h == aagbVar.h && this.g == aagbVar.g) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aabs
    public final String g(long j) {
        return this.a;
    }

    @Override // defpackage.aabs
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aabs
    public final int hashCode() {
        return this.e.hashCode() + (this.h * 37) + (this.g * 31);
    }

    @Override // defpackage.aabs
    public final int i(long j) {
        return this.g;
    }

    @Override // defpackage.aabs
    public final long d(long j) {
        return j;
    }

    @Override // defpackage.aabs
    public final long e(long j) {
        return j;
    }
}
