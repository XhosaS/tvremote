package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctu implements ctn {
    public final String a;
    public final ctj b;
    public final ctj c;
    public final csy d;
    public final boolean e;

    public ctu(String str, ctj ctjVar, ctj ctjVar2, csy csyVar, boolean z) {
        this.a = str;
        this.b = ctjVar;
        this.c = ctjVar2;
        this.d = csyVar;
        this.e = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new cri(cqdVar, cugVar, this);
    }

    public final String toString() {
        ctj ctjVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(ctjVar) + "}";
    }
}
