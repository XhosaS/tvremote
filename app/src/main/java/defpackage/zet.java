package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zet extends zew {
    final /* synthetic */ zew a;
    final /* synthetic */ zew b;

    public zet(zew zewVar, zew zewVar2) {
        this.a = zewVar;
        this.b = zewVar2;
    }

    @Override // defpackage.zew
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
