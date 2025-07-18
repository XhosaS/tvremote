package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class exl extends exw {
    public final long a;
    public final long b;
    public int[] c;
    public epm d;

    public exl(ees eesVar, eey eeyVar, dze dzeVar, int i, long j, long j2, long j3, long j4, long j5) {
        super(eesVar, eeyVar, dzeVar, i, j, j2, j5);
        this.a = j3;
        this.b = j4;
    }

    public final int a(int i) {
        int[] iArr = this.c;
        eci.e(iArr);
        return iArr[i];
    }

    protected final epm b() {
        epm epmVar = this.d;
        eci.e(epmVar);
        return epmVar;
    }
}
