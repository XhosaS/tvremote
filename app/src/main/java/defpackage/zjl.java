package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjl extends zjm implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public zjl(int i) {
        this.a = i;
    }

    @Override // defpackage.zjm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.zjm
    public final int b() {
        return 32;
    }

    @Override // defpackage.zjm
    public final boolean c(zjm zjmVar) {
        return this.a == zjmVar.a();
    }

    @Override // defpackage.zjm
    public final byte[] d() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
