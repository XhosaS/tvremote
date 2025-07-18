package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fml implements eeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fml(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eeg
    public final void a(long j, edi ediVar) {
        int i = this.b;
        if (i == 0) {
            fki.aa(j, ediVar, (fel[]) ((iom) this.a).c);
        } else if (i != 1) {
            fki.ab(j, ediVar, (fel[]) ((isy) this.a).d);
        } else {
            fki.aa(j, ediVar, ((fhw) this.a).a);
        }
    }
}
