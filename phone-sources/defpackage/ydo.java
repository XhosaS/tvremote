package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydo {
    public boolean a;
    public Object b;
    public Object c;

    public ydo() {
    }

    public final void a(ydn... ydnVarArr) {
        String[] strArr = new String[ydnVarArr.length];
        for (int i = 0; i < ydnVarArr.length; i++) {
            strArr[i] = ydnVarArr[i].bb;
        }
        this.b = strArr;
    }

    public final void b() {
        this.a = true;
    }

    public final void c(ydy... ydyVarArr) {
        String[] strArr = new String[ydyVarArr.length];
        for (int i = 0; i < ydyVarArr.length; i++) {
            strArr[i] = ydyVarArr[i].f;
        }
        this.c = strArr;
    }

    public final void d() {
        this.c = null;
        this.a = false;
        this.b = null;
    }

    public ydo(byte[] bArr, byte[] bArr2) {
        d();
    }

    public ydo(ydp ydpVar) {
        boolean z = ydpVar.b;
        this.b = ydpVar.c;
        this.c = ydpVar.d;
        this.a = ydpVar.e;
    }
}
