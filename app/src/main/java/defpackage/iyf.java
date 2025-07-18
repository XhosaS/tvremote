package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyf implements zxe {
    final ixj a;

    public iyf(ixj ixjVar) {
        this.a = ixjVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getMessage();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        xui xuiVar = (xui) obj;
        xuc xucVar = xuiVar.b;
        if (xucVar == null) {
            xucVar = xuc.a;
        }
        if (xucVar.b == 1) {
            this.a.h(xuiVar);
        }
    }
}
