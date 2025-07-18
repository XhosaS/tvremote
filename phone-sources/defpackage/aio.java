package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aio {
    public bfz a;
    public bfz b;

    public aio() {
        this(null);
    }

    public final int a() {
        return this.a.b;
    }

    public final void b(ain ainVar, int i, int i2, int i3) {
        int i4;
        bfz bfzVar = this.b;
        if (bfzVar.b == 0) {
            i4 = 0;
        } else {
            ain ainVar2 = (ain) bfzVar.c();
            i4 = ainVar2.b - ainVar2.d;
        }
        if (ainVar == null) {
            int i5 = i - i4;
            ainVar = new ain(i, i2 + i3, i5, (i2 - i) + i5);
        } else {
            if (ainVar.a > i) {
                ainVar.a = i;
                ainVar.c = i;
            }
            int i6 = ainVar.b;
            if (i2 > i6) {
                ainVar.d = i2 - (i6 - ainVar.d);
            } else {
                i2 = i6;
            }
            ainVar.b = i2 + i3;
        }
        this.b.o(ainVar);
    }

    public final void c() {
        this.a.h();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        bfz bfzVar = this.a;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ain ainVar = (ain) objArr[i2];
            sb.append("(" + ainVar.c + ',' + ainVar.d + ")->(" + ainVar.a + ',' + ainVar.b + ')');
            if (i2 < a() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public /* synthetic */ aio(byte[] bArr) {
        this.a = new bfz(new ain[16], 0);
        this.b = new bfz(new ain[16], 0);
    }
}
