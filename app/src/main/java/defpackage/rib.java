package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rib extends ria {
    private volatile boolean a;

    @Override // defpackage.riy
    public final /* synthetic */ Object e() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.riy
    public final /* synthetic */ void eS(Object obj) {
        this.a = ((Boolean) obj).booleanValue();
    }
}
