package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctm implements ctn {
    public final String a;
    public final ctj b;
    public final ctc c;
    public final boolean d;
    public final boolean e;

    public ctm(String str, ctj ctjVar, ctc ctcVar, boolean z, boolean z2) {
        this.a = str;
        this.b = ctjVar;
        this.c = ctcVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new cqz(cqdVar, cugVar, this);
    }
}
