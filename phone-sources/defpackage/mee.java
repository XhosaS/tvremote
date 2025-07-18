package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mee implements Serializable {
    public final int a;
    public final byte[] b;
    public int c;

    public mee(int i) {
        this.a = i;
        this.c = i;
        this.b = new byte[i];
    }

    private Object writeReplace() {
        med medVar = new med();
        int i = this.c;
        medVar.a = new byte[i];
        System.arraycopy(this.b, 0, medVar.a, 0, i);
        return medVar;
    }

    public final void a(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.b.length) {
            z = true;
        }
        a.ab(z);
        this.c = i;
    }

    public mee(byte[] bArr) {
        int length = bArr.length;
        this.a = length;
        this.c = length;
        this.b = bArr;
    }
}
