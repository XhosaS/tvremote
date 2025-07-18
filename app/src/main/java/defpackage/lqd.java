package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqd extends lqf {
    final /* synthetic */ String a;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqd(kev kevVar, String str, int i) {
        super(kevVar);
        this.a = str;
        this.k = i;
    }

    @Override // defpackage.kfu
    protected final /* bridge */ /* synthetic */ void b(kdz kdzVar) {
        kjx kjxVarM = ((lpy) kdzVar).M(this, this.a, this.k);
        synchronized (this.c) {
            this.j = kjxVarM;
        }
    }
}
