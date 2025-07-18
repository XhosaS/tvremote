package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ela implements ecw {
    public final /* synthetic */ ekl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ ela(ekl eklVar, String str, long j, int i) {
        this.d = i;
        this.a = eklVar;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        if (this.d != 0) {
            ekm ekmVar = (ekm) obj;
            ekmVar.O();
            long j = this.c;
            ekmVar.P(this.a, this.b, j);
            return;
        }
        ekm ekmVar2 = (ekm) obj;
        ekmVar2.al();
        long j2 = this.c;
        ekmVar2.am(this.a, this.b, j2);
    }
}
