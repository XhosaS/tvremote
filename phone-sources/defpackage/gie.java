package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gie implements ghq {
    final /* synthetic */ gif a;

    public gie(gif gifVar) {
        this.a = gifVar;
    }

    @Override // defpackage.ghq
    public final String f() {
        return this.a.g;
    }

    @Override // defpackage.ghq
    public final void g(ghp ghpVar) {
        gif gifVar = this.a;
        int length = gifVar.a.length;
        for (int i = 1; i < length; i++) {
            int i2 = gifVar.a[i];
            if (i2 == 1) {
                ghpVar.c(i, gifVar.b[i]);
            } else if (i2 == 2) {
                ghpVar.b(i, gifVar.c[i]);
            } else if (i2 == 3) {
                String str = gifVar.d[i];
                str.getClass();
                ghpVar.e(i, str);
            } else if (i2 == 4) {
                byte[] bArr = gifVar.e[i];
                bArr.getClass();
                ghpVar.a(i, bArr);
            } else if (i2 == 5) {
                ghpVar.d(i);
            }
        }
    }
}
