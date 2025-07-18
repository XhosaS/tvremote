package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahiu extends ahjg {
    public long a = -1;
    public agsw b;

    @Override // defpackage.ahjg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        ahis ahisVar = (ahis) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = ahisVar.b;
        if (j < ahisVar.c) {
            ahisVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.ahjg
    public final /* bridge */ /* synthetic */ agsw[] b(Object obj) {
        boolean z = ahbx.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ahis) obj).f(j);
    }
}
