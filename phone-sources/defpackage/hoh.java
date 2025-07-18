package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoh implements hob {
    private final /* synthetic */ int a;

    public hoh(int i) {
        this.a = i;
    }

    @Override // defpackage.hob
    public final /* synthetic */ int a(Object obj) {
        return this.a != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // defpackage.hob
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.hob
    public final /* synthetic */ Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }
}
