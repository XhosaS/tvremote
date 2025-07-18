package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyl implements zxe {
    final /* synthetic */ wwq a;
    final /* synthetic */ zxe b;

    public wyl(wwq wwqVar, zxe zxeVar) {
        this.a = wwqVar;
        this.b = zxeVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }
}
