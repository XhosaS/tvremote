package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cue implements ctn {
    public final csy a;
    public final csy b;
    public final csy c;
    public final boolean d;
    public final int e;

    public cue(int i, csy csyVar, csy csyVar2, csy csyVar3, boolean z) {
        this.e = i;
        this.a = csyVar;
        this.b = csyVar2;
        this.c = csyVar3;
        this.d = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new crn(cugVar, this);
    }

    public final String toString() {
        csy csyVar = this.c;
        csy csyVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(csyVar2) + ", offset: " + String.valueOf(csyVar) + "}";
    }
}
